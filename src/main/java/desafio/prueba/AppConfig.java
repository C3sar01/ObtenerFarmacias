package desafio.prueba;

import desafio.prueba.services.FarmaciaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfig {

    @Value("${farmacias.url}")
    private String apiUrl;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public FarmaciaService farmaciaService() {
        return new FarmaciaService(restTemplate());
    }

    @Bean
    public WebClient.Builder getWebClientBuilder() {
        return WebClient.builder().baseUrl(apiUrl);
    }
}

