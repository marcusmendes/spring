package com.example.reservationservice;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

interface ReservationRepository extends ReactiveMongoRepository<Reservation, String> {

    Flux<Reservation> findByReservationName(String name);
}
