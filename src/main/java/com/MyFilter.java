package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain fc)
			throws IOException, ServletException {
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>the line added by demo filter before processing the request</h1>");
		
		fc.doFilter(req, resp);
		out.println("<h1>this line added after processing the request</h1>");
		
	}
	@Override
	public void destroy() {
		
	}

}
