package com.example.demobd.db.migrations;

import com.example.demobd.model.User;
import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;


@Slf4j
@ChangeLog(order = "001")
public class InitialSetup {

    @ChangeSet(order = "001", author = "test", id = "user initial setup")
    public void setupUsers(MongoTemplate mongoTemplate) {
        log.info("setupUsers");
        User adminUser = new User();
        adminUser.setName("Admin");

        mongoTemplate.save(adminUser);
    }
}
