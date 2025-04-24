package com.starfoxKiosk.user.membership.domain;

public class Membership {
    private int membershipId;
    private String membershipName;
    private int thresholdAmount;
    private int customerId;

    public Membership() {}

    public Membership(int membershipId, String membershipName, int thresholdAmount, int customerId) {
        this.membershipId = membershipId;
        this.membershipName = membershipName;
        this.thresholdAmount = thresholdAmount;
        this.customerId = customerId;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getMembershipName() {
        return membershipName;
    }

    public void setMembershipName(String membershipName) {
        this.membershipName = membershipName;
    }

    public int getThresholdAmount() {
        return thresholdAmount;
    }

    public void setThresholdAmount(int thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Membership{" +
                "membershipId=" + membershipId +
                ", membershipName='" + membershipName + '\'' +
                ", thresholdAmount=" + thresholdAmount +
                ", customerId=" + customerId +
                '}';
    }


}
