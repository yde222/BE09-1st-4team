package com.starfoxKiosk.user.membership.controller;

import com.starfoxKiosk.user.membership.domain.Membership;
import com.starfoxKiosk.user.membership.service.MemshipService;
import com.starfoxKiosk.user.membership.view.MemshipView;

public class MemshipController {
    private MemshipService memshipService;
    private MemshipView memshipView;

    private MemshipController(){
        this.memshipService = new MemshipService();
        this.memshipView = new MemshipView();
    }

    public Membership findMembership() {
        String phone = memshipView.inputPhoneNum();
        Membership membership =  memshipService.findByPhone(phone);

        if (membership == null) {
            memshipView.displayMembershipInfo(membership);
        } else {
            System.out.println("멤버십 정보를 찾을 수 없습니다.");
        }
        return membership;

    }
}
