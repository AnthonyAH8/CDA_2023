package com.example.exercice_systeme_reservation.domain.service;

import com.example.exercice_systeme_reservation.domain.entity.Reservation;
import com.example.exercice_systeme_reservation.domain.shared.dto.ReservationDTO;
import com.example.exercice_systeme_reservation.domain.shared.port.ReservationPort;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {
    private final ReservationPort reservationPort;

    public ReservationService(ReservationPort reservationPort) {
        this.reservationPort = reservationPort;
    }

    public ReservationDTO saveReservation(ReservationDTO reservationDTO) {
        ReservationDTO result = new ReservationDTO(reservationDTO.getDate(), reservationDTO.getVisitor(), reservationDTO.getEvent());
        reservationPort.saveReservation(result);
        return result;
    }

    public List<ReservationDTO> getAllReservations() {
        List<ReservationDTO> results = new ArrayList<>(reservationPort.getAllReservations());
        return results;
    }
}
