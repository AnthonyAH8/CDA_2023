package com.example.exercice_systeme_reservation.infrastructure.repository;

import com.example.exercice_systeme_reservation.infrastructure.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {
}
