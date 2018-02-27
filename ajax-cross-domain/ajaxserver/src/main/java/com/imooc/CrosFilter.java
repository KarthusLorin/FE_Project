package com.imooc;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CrosFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;

        res.addHeader("Access-Control-Allow-Origin", "http://localhost:8081");
        res.addHeader("Access-Control-Allow-Methods", "GET");

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
