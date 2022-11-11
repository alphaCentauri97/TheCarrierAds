package com.example.hiringmeaaratech.Models;

public class WalletModel {
    int user_profile;
    String invitationName,invitationPrice,date;

    public WalletModel(int user_profile, String invitationName, String invitationPrice, String date) {
        this.user_profile = user_profile;
        this.invitationName = invitationName;
        this.invitationPrice = invitationPrice;
        this.date = date;
    }

    public int getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(int user_profile) {
        this.user_profile = user_profile;
    }

    public String getInvitationName() {
        return invitationName;
    }

    public void setInvitationName(String invitationName) {
        this.invitationName = invitationName;
    }

    public String getInvitationPrice() {
        return invitationPrice;
    }

    public void setInvitationPrice(String invitationPrice) {
        this.invitationPrice = invitationPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
