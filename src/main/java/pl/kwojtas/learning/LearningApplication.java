package pl.kwojtas.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {
        System.out.println("DUPA");
        System.out.println("Utworzenie brancha deva");
        SpringApplication.run(LearningApplication.class, args);
    }

}
