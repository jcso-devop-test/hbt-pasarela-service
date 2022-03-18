package com.hbt.pasarela.servicios.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Configuration
@Slf4j
public class FeignRequestConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {

        ServletRequestAttributes attributes = (ServletRequestAttributes)
                RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("TokenTemplate: " + request.getHeader(HttpHeaders.AUTHORIZATION));

        requestTemplate.header(HttpHeaders.AUTHORIZATION,
                request.getHeader(HttpHeaders.AUTHORIZATION));


    }
}
