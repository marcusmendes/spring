package com.example.reservationservice;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
class ReservationHandler {
    private final ReservationRepository repository;

    public ReservationHandler(ReservationRepository repository) {
        this.repository = repository;
    }

    Mono<ServerResponse> byId(ServerRequest request) {
        String id = request.pathVariable("id");
        Mono<Reservation> result = repository.findById(id);
        return ServerResponse.ok().body(result, Reservation.class);
    }
}
