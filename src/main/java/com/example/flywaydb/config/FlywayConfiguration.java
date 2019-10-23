package com.example.flywaydb.config;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: <br>
 * < TODO >
 *
 * @author qacboy
 * @create 2019-10-23
 * @since TODO
 */
@Configuration
public class FlywayConfiguration {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;
    @Value("${spring.datasource.username}")
    private String databaseUsername;
    @Value("${spring.datasource.password}")
    private String databasePassword;

    // 脚本存放路径
    // @Value("${flyway.locations}")
    // private String locations;


    /**
     * version: 6.0.7 写法
     */
    @Bean
    Flyway flyway() {
        ClassicConfiguration classicConfiguration = new ClassicConfiguration();
        classicConfiguration.setDataSource(datasourceUrl, databaseUsername, databasePassword);
        classicConfiguration.setBaselineOnMigrate(true);
        classicConfiguration.getSqlMigrationPrefix();
        // classicConfiguration.setLocations(locations);
        Flyway flyway = new Flyway(classicConfiguration);
        System.out.println(" ****** repair ****** ");
        flyway.repair();
        System.out.println(" ****** migrate ****** ");
        flyway.migrate();
        return flyway;
    }

    /**
     * repair
     * migrate
     * version: 5.0.3 写法
     * @return
     */
/*
    @Bean(initMethod = "migrate")
    @Bean
    Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(true);
        flyway.setDataSource(datasourceUrl, databaseUsername, databasePassword);
        // flyway.setLocations(locations);
        System.out.println(" ****** repair");
        flyway.repair();
        System.out.println(" ****** migrate");
        flyway.migrate();
        return flyway;
    }*/

}