package com.david.house.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterBeanConfig {
    // 将方法返回对象包装成 bean
    /*
    * 1. 构造 filter
    * 2. 配置拦截urlPattern
    * 3. 利用 FilterRegistrationBean 进行包装
    * */
    @Bean
    public FilterRegistrationBean logFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urls = new ArrayList<>();
        urls.add("*");
        filterRegistrationBean.setUrlPatterns(urls);
        return filterRegistrationBean;
    }
}
