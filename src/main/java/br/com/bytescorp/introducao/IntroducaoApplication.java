package br.com.bytescorp.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.Serializable;

@SpringBootApplication
public class IntroducaoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);
    }

}
