package com.szhw.webproj.config;

import com.szhw.webproj.config.interseptor.UserLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author HJF
 * @date 2018/11/23 20:17
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    UserLoginInterceptor userLoginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userLoginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/", "index.html", "/css/**", "/js/**", "/layUI/**", "/image/**", "/login");
    }

    /**
     * 解决跨域时出现问题，添加跨域mapping为所有url
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

}
