package com.linkr.flywaydb.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: <br>
 * < TODO >
 *
 * @author linkr
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

    @Value("${spring.datasource.locations}")
    private String locations;


    /**
     * repair
     * migrate
     * version: 5.0.3 写法
     *
     * @return
     */
    @Bean
    Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setBaselineOnMigrate(true);
        flyway.setDataSource(datasourceUrl, databaseUsername, databasePassword);
        String[] locationList = locations.split(",");
        flyway.setLocations(locationList);
        System.out.println(" ****** repair ****** ");
        flyway.repair();
        System.out.println(" ****** migrate ****** ");
        flyway.migrate();
        return flyway;
    }

}