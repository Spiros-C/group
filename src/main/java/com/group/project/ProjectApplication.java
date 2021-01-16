package com.group.project;

import com.group.project.configuration.JPAConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(JPAConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.group.project"})
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
