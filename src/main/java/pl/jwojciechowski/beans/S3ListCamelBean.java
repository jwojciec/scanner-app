package pl.jwojciechowski.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3Client;

@Component
public class S3ListCamelBean {
    private AmazonS3Client amazonS3Client;

    public S3ListCamelBean() {
    }

    @Autowired
    public S3ListCamelBean(AmazonS3Client amazonS3Client) {
        this.amazonS3Client = amazonS3Client;
    }

    public List<String> getFiles() {
        return amazonS3Client.listBuckets().stream()
            .map(bucket -> bucket.getName())
            .collect(Collectors.toList());
    }
}
