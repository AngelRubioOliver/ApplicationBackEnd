//package com.tascaAndreu.tascaAndreu.infrastructure.adapters;
//import com.hexagonal.tasks.domain.models.AdditionalUserInfo;
//import com.hexagonal.tasks.domain.ports.Out.ExternalServicePort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ExternalServiceAdapter implements ExternalServicePort {
//
//    private final RestTemplate restTemplate;
//
//    public ExternalServiceAdapter() {
//        restTemplate = new RestTemplate();
//    }
//
//    @Override
//    public AdditionalUserInfo getAdditionalUserInfo(Long userId) {
//        // Cambiamos la URL para apuntar a la API local
//        String apiUrl = "http://localhost:8080/users/" + userId;
//
//        // Hacemos la petición a la API local
//        ResponseEntity<JsonPlaceholderUser> response = restTemplate.getForEntity(apiUrl, JsonPlaceholderUser.class);
//        JsonPlaceholderUser user = response.getBody();
//
//        if (user == null) {
//            return null;
//        }
//
//        // Convertimos la respuesta en un objeto de dominio
//        return new AdditionalUserInfo(user.getId(), user.getName(), user.getEmail(), user.getCreatedAt());
//    }
//
//    private static class JsonPlaceholderUser {
//        private Long id;
//        private String name;
//        private String email;
//        private String createdAt;
//
//        public Long getId() {
//            return id;
//        }
//        public String getName() {
//            return name;
//        }
//        public String getEmail() {
//            return email;
//        }
//        public String getCreatedAt() {
//            return createdAt;
//        }
//    }
//}
