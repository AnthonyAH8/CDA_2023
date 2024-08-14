package com.example.exercice_microservice_1_order.domain.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductService<T, V> {
    private String uri= "http://localhost:8080/order/user/";
    private RestTemplate restTemplate;
    private HttpHeaders headers;

    public ProductService() {
        restTemplate = new RestTemplate();
        headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
    }

    public T get(String uri, Class<T> tClass) {
        try {
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<T> response = restTemplate.exchange(uri, HttpMethod.GET, entity, tClass);
            return response.getBody();
        }catch (Exception e) {
            throw new RuntimeException("Erreur dans la requête get", e);
        }

    }

    public T post(String uri, Class<T> tClass, V vClass) {
        try {
            HttpEntity<V> entity = new HttpEntity<>(vClass, headers);
            ResponseEntity<T> response = restTemplate.exchange(uri, HttpMethod.POST, entity, tClass);
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Erreur dans la requête post", e);
        }

    }
}
