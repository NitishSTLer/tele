package com.telecom.repository;

import com.telecom.entities.PlanSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanSubscriptionRepo extends JpaRepository<PlanSubscription,Long> {


    List<PlanSubscription> findAllByUserId(Long userId);
}
