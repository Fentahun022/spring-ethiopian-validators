package com.validator.spring_ethiopian_validators.config;



import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class ValidationAutoConfiguration {

    @Bean
    public MessageSource validationMessageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages", "messages_am");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}