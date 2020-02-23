package com.example.reservationservice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

//@Component
//class Initializer implements ApplicationRunner {
//
//    private final ReservationRepository repository;
//
//    public Initializer(ReservationRepository repository) {
//        this.repository = repository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Flux.just("A", "B", "C")
//                .map(name -> new Reservation(null, name))
//                .flatMap(r -> repository.save(r))
//                .subscribe(r -> System.out.println("reservation" + r.toString()));
//    }
//}
