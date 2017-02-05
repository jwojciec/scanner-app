package pl.jwojciechowski.beans;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3;

@Component
public class S3ListCamelBean {
    private AmazonS3 amazonS3;

    public S3ListCamelBean() {
    }

    @Autowired
    public S3ListCamelBean(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    public List<String> getFiles() {
        return amazonS3.listBuckets().stream()
            .map(bucket -> bucket.getName())
            .collect(Collectors.toList());
    }
}
