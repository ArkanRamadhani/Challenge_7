package com.CH7.Transactional7.repo;

import com.CH7.Transactional7.entity.Rekening;

import org.springframework.data.repository.CrudRepository;

public interface RekeningRepo extends CrudRepository<Rekening, Long> {

    Rekening findByNorek(String norek);
}