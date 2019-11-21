package com.ag.springbootandobjectify.repository;

import com.googlecode.objectify.ObjectifyFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = {"/*"})
public class ObjectifyFilterServlet extends ObjectifyFilter {

}
