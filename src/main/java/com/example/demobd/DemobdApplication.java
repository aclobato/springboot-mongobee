package com.example.demobd;

import com.github.mongobee.Mongobee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class DemobdApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemobdApplication.class, args);
	}
}
