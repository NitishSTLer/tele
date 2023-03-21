package com.telecom.repository;

import com.telecom.entities.BroadBand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BroadBandRepo extends JpaRepository<BroadBand, Long> {
}
