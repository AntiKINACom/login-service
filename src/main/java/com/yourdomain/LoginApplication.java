package com.yourdomain;

import com.yourdomain.model.Student;
import com.yourdomain.model.AppUser;
import com.yourdomain.repository.StudentRepository;
import com.yourdomain.repository.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.yourdomain.model")
@EnableJpaRepositories("com.yourdomain.repository")
@ComponentScan("com.yourdomain")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // Exclude SecurityAutoConfiguration.class to avoid problems caused by SecurityAutoConfiguration
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AppUserRepository userRepository,
            StudentRepository studentRepository) {
        return args -> {
            AppUser root = new AppUser("root", "admin@gmail.com", "secret");
            Student student1 = new Student("abcd", "james.bond@gmail.com", "JamesBond123", 1, "James Bond");
            Student student2 = new Student("efgh", "jane.doe@outlook.com", "JaneDoe456", 2, "Jane Doe");

            userRepository.save(root);
            studentRepository.save(student1);
            studentRepository.save(student2);

            System.out.println(studentRepository.findById(1L));
        };
    }
}
