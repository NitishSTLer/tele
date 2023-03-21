package com.telecom.repository;

import com.telecom.entities.GuestPlanSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestPlanSubscriptionRepo extends JpaRepository<GuestPlanSubscription,Long> {
}
