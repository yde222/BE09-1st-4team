package com.starfoxKiosk.user.membership.service;

import com.starfoxKiosk.user.membership.domain.Membership;

import java.util.HashMap;
import java.util.Map;

public class MemshipService {

    private Map<String, Membership> memberships = new HashMap<>();

    public MemshipService() {
        //Dummy data
        memberships.put("01011112222", new Membership(01011112222,"Silver",10000,1));
        memberships.put("01033334444", new Membership(01033334444,"Silver",10000,1));
    }

    public Membership findByPhone(String phone) {
        return memberships.get(phone);
    }
}
