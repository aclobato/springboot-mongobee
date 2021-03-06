package com.example.demobd.config;

import com.example.demobd.properties.MongoConfiguration;
import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongobeeConfiguration {

    @Bean
    public Mongobee mongobee(MongoTemplate mongoTemplate, MongoConfiguration mongoConfiguration) {
        Mongobee mongobee = new Mongobee(mongoConfiguration.getUri());
        mongobee.setMongoTemplate(mongoTemplate);
        mongobee.setChangeLogsScanPackage("com.example.demobd.db.migrations");
        mongobee.setEnabled(true);
        return mongobee;
    }
}
