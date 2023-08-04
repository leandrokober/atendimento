package com.assistencia.helpdesk.atendimento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ModelMapper {

    @Configuration
    public static class ModelMapperConfig {

        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();

        }
    }
}