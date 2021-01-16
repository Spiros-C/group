package com.group.project.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.group.project.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    
//https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa

}
