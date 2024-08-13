package com.example.exercice_systeme_reservation.infrastructure.port;


import com.example.exercice_systeme_reservation.domain.entity.Reservation;
import com.example.exercice_systeme_reservation.domain.shared.dto.ReservationDTO;
import com.example.exercice_systeme_reservation.domain.shared.port.ReservationPort;
import com.example.exercice_systeme_reservation.infrastructure.entity.ReservationEntity;
import com.example.exercice_systeme_reservation.infrastructure.repository.ReservationRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReservationPortImpl implements ReservationPort {

    private ReservationRepository reservationRepository;

    public ReservationPortImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public ReservationDTO saveReservation(ReservationDTO reservationDTO) {
        ReservationEntity reservationEntity = ReservationEntity.builder()
                .date(reservationDTO.getDate()).eventType(reservationDTO.getEvent()).build();
        reservationRepository.save(reservationEntity);

        return reservationDTO;
    }

    @Override
    public void deleteReservation(ReservationDTO reservationDTO) {

    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        List<ReservationDTO> reservationDTOs = reservationRepository.findAll()
                .stream()
                .map(reservationEntity -> {
                    return new ReservationDTO(
                            reservationEntity.getDate(),
                            reservationEntity.getVisitor(),
                            reservationEntity.getEventType()
                    );
                })
                .toList();

        return reservationDTOs;
    }


    @Override
    public ReservationDTO getReservationById(Long id) {
        return null;
    }

}
