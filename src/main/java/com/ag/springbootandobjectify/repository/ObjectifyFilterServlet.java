package com.ag.springbootandobjectify.repository;

import com.googlecode.objectify.ObjectifyFilter;

import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = {"/*"})
public class ObjectifyFilterServlet extends ObjectifyFilter {
}
