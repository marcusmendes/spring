package com.example.reservationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
class ReservationRestController {
    private final ReservationRepository repository;

    public ReservationRestController(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/reservations")
    Flux<Reservation> all() {
        return this.repository.findAll();
    }
}
