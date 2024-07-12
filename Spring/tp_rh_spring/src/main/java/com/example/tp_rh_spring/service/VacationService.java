package com.example.tp_rh_spring.service;

import com.example.tp_rh_spring.dto.vacation.VacationDtoGet;
import com.example.tp_rh_spring.dto.vacation.VacationDtoPost;

import java.util.List;

public class VacationService implements BaseService<VacationDtoPost, VacationDtoGet> {
    @Override
    public VacationDtoGet findById(int id) {
        return null;
    }

    @Override
    public List<VacationDtoGet> findAll() {
        return List.of();
    }

    @Override
    public VacationDtoGet create(VacationDtoPost vacationDtoPost) {
        return null;
    }

    @Override
    public VacationDtoGet update(int id, VacationDtoPost vacationDtoPost) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
