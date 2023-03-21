package com.telecom.services.guest;

import com.telecom.dto.*;
import com.telecom.responce.GeneralResponse;

import java.util.List;

public interface GuestService {

    List<PlanDto> getAllPlansForGuest();

    List<BroadbandDto> getAllBroadBandsForGuest();

    PlanDto getPlanById(Long planId);

    BroadbandDto getBroadBandById(Long broadbandId);

    GeneralResponse subscribePlan(GuestPlanSubscriptionDto guestPlanSubscriptionDto,Long planId);

    GeneralResponse subscribeBroadband(GuestBroadBandSubscriptionDto guestBroadBandSubscriptionDto,Long broadbandId);

}
