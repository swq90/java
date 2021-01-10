package com.example.testJunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class TestJunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJunitApplication.class, args);
    }

//    @Bean
//    public DataSource dataSource() {
//        final EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
//        embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2);
//        return embeddedDatabaseBuilder.build();
//    }
}
