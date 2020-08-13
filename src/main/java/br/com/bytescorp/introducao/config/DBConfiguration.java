package br.com.bytescorp.introducao.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String developmentDataBaseConnection(){
        System.out.println("Conexão para DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Conexao com Banco de Dados H2";
    }

    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("Conexão para PROD - Mysql");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Conexao com Banco de Dados MySql";
    }
}
