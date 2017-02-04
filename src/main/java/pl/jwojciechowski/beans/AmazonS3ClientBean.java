package pl.jwojciechowski.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.services.s3.AmazonS3Client;

@Configuration
public class AmazonS3ClientBean {
    @Bean
    public AmazonS3Client getAmazonS3Client() {
        return new AmazonS3Client();
    }
}
