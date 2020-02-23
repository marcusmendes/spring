package com.example.reservationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class ReservationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationServiceApplication.class, args);
    }

    @Bean
    RouterFunction<ServerResponse> routes(ReservationHandler handler) {
        return route(GET("/reservations/{id}"), handler::byId);
    }
}

//@Repository
////class ReservationRepository {
////
////    private final ReactiveMongoTemplate reactiveMongoTemplate;
////
////    ReservationRepository(ReactiveMongoTemplate reactiveMongoTemplate) {
////        this.reactiveMongoTemplate = reactiveMongoTemplate;
////    }
////
////    public Flux<Reservation> findAll() {
////        return this.reactiveMongoTemplate.findAll(Reservation.class);
////    }
////}

