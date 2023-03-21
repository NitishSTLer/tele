package com.telecom.repository;

import com.telecom.entities.GuestBroadBandSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestBroadBandSubscriptionRepo extends JpaRepository<GuestBroadBandSubscription, Long> {
}
