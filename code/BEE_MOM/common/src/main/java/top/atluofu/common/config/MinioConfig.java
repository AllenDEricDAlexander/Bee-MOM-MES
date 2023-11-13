package top.atluofu.common.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MinioConfig
 * @description: MinioConfig
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-14:23
 * @Version: 1.0
 */
@Configuration
public class MinioConfig {

    @Value("${minio.endpoint}")
    private String url;
    @Value("${minio.accessKey}")
    private String accessKey;
    @Value("${minio.secretKey}")
    private String secretKey;

    @Bean
    public MinioClient getMinioClient() {
        return MinioClient.builder().endpoint(url)
                .credentials(accessKey, secretKey).build();
    }

}