package com.david.house.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

// 原始filter --》 包装成 java bean: 1: xml 2: java config
public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 容器启动的时候执行
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //方法拦截的时候执行
        logger.info("Request--comming");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        //容器销毁的时候执行
    }
}
