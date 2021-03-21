package ru.geekbrains.lesson3.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//показывает, где будут контроллеры
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //указать, где происходит конигурация
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //показывает где контроллеры начинают работать
        return new String[]{"/"};
    }
}
