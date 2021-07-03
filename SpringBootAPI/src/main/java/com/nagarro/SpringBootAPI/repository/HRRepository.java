package com.nagarro.SpringBootAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.SpringBootAPI.model.HRManager;

public interface HRRepository extends JpaRepository<HRManager, String> {

}
