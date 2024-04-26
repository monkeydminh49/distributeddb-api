package org.e01.distributedsql.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class OpenAPIConfig {
    @Value("http://26.232.196.121:8080")
    private String prodUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        Server devServer = new Server();
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("nguyendangminh49@gmail.com");
        contact.setName("Nguyen Dang Minh");
        contact.setUrl("https://www.facebook.com/minhdunk/");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Teaching Method Research API by MinhDunk")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage demo.")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(prodServer, devServer));
    }
}
