package com.example.exercice_systeme_reservation.domain.shared.port;

import com.example.exercice_systeme_reservation.domain.shared.dto.ReservationDTO;

import java.util.List;

public interface ReservationPort {
    ReservationDTO saveReservation(ReservationDTO reservationDTO);
    void deleteReservation(ReservationDTO reservationDTO);
    List<ReservationDTO> getAllReservations();
    ReservationDTO getReservationById(Long id);
}
