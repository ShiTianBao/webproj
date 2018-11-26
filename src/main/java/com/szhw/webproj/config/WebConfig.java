package com.szhw.webproj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author HJF
 * @date 2018/11/23 20:17
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    /**
     * 解决跨域时出现问题，添加跨域mapping为所有url
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}
