package desafio.prueba.services;

import desafio.prueba.models.Farmacia;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FarmaciaService {

    @Value("${farmacias.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public FarmaciaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    //Se consulta la api
    public Farmacia[] getFarmacias(String comuna) {
        String url = apiUrl + "?comuna={comuna}";
        ResponseEntity<Farmacia[]> response = restTemplate.getForEntity(url, Farmacia[].class, comuna);
        return response.getBody();
    }
}











