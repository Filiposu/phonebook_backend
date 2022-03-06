package az.phonebook.backend;

import static org.springframework.boot.SpringApplication.run;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class PhonebookBackendApplication {

    public static void main(String[] args) {
        run(PhonebookBackendApplication.class);

    }

}
