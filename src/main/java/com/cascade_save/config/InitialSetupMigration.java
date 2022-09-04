package com.cascade_save.config;

import com.cascade_save.domain.User;

import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

@ChangeUnit(id = "users-initialization", order = "001")
public class InitialSetupMigration {

    private final MongoTemplate template;

    public InitialSetupMigration(MongoTemplate template) {
        this.template = template;
    }

    @Execution
    public void changeSet() {
        User user = createUsers();
        template.save(user);
    }

    @RollbackExecution
    public void rollback() {
    }

    public User createUsers() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        return user;
    }
}