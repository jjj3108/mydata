package mdata.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class myfilter implements Filter{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		logger.info("DOFILTER");
		int i = 1;
		int k = 2;
		return;
	}
	
	@Override
	public void destroy() {
	}

}
