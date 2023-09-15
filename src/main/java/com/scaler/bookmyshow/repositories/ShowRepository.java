package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.Models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
}