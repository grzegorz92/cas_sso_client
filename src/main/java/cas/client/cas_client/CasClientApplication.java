package cas.client.cas_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
public class CasClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientApplication.class, args);
    }
}
