package com.example.batch.repository;

import com.example.batch.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TrainRepository extends JpaRepository<Train, Long> {

}
