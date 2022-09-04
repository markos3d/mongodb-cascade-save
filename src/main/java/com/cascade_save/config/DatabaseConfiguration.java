package com.cascade_save.config;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cascade_save.event.UserCascadeSaveMongoEventListener;

@Configuration
@EnableMongoRepositories("com.cascade_save.repository")
@Import(value = MongoAutoConfiguration.class)
public class DatabaseConfiguration {

    @Bean
    public UserCascadeSaveMongoEventListener userCascadingMongoEventListener() {
        return new UserCascadeSaveMongoEventListener();
    }

}