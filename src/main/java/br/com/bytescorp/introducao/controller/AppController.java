package br.com.bytescorp.introducao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @Value("${DB_CLASS_DRIVE:VAZIO}")
    private String driverClass;

    @GetMapping("/appmessage/")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/variavelambiente/")
    public String getDriverClass() {
        return "Valor do driver-class: " + driverClass;
    }
}
