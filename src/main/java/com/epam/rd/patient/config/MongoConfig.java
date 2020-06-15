package com.epam.rd.patient.config;



import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.epam.rd.patient")
public class MongoConfig {

    @Bean
    public MongoClient mongo() {
        return new MongoClient("localhost");
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "medicine");
    }

  /*  @Value("medicine")
    private String mongoDatabase;

    @Value("mongodb://medicineUser:medicinePassword@localhost:27017/medicine")
    private String mongoUri;


    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(mongoUri))
                .build());
    }

    @Bean
    public MongoDbFactory mongoDbFactory(com.mongodb.client.MongoClient mongoClient) {
        return new SimpleMongoClientDbFactory(mongoClient, mongoDatabase);
    }

    @Bean
    public MongoTemplate mongoTemplate(com.mongodb.client.MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, mongoDatabase);
    }*/

}
