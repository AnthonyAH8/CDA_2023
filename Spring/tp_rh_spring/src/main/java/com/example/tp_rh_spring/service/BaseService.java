package com.example.tp_rh_spring.service;

import java.util.List;

public interface BaseService <TPost, TGet>{
    TGet findById(int id);
    List<TGet> findAll();
    TGet create(TPost post);

    TGet update(int id, TPost post);
    boolean delete(int id);
}
