# Use the official maven/Java 8 image to create a build artifact.
# 1) Starts from the Gradle image
FROM gradle:jdk8-alpine as builder
# ! Builder should contain
	# a) Linux shell and some tools – I prefer Alpine Linux
	# b) JDK (version) – for the javac compiler
	# c) Gradle (version) – Java build tool
	# d) Project dependencies (Gradle local repository)

ENV APP_HOME=/home/gradle/src

# 2) Copies the Java source code inside the container
COPY --chown=gradle:gradle . $APP_HOME
WORKDIR $APP_HOME
# ! Chaine all commands into one RUN to bust the cache easily
# 3) Compiles the code and runs unit tests (with Gradle build)
# 4) Discards the Gradle image with all the compiled classes/unit test results etc.
RUN gradle build --no-daemon

# 5) Starts again from the JRE (We only need a JRE because the application is already built) image and copies only the JAR file created before
FROM openjdk:8-jre-slim

# Copy the jar to the production image from the builder stage.
COPY --from=builder /home/gradle/src/build/libs/spring-boot-and-objectify-*.jar /spring-boot-and-objectify.jar

# Run the web service on container startup.
CMD ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap","-Djava.security.egd=file:/dev/./urandom","-Dserver.port=${PORT}","-jar","/spring-boot-and-objectify.jar"]
