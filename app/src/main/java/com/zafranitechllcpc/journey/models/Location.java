package com.zafranitechllcpc.journey.models;

import android.support.annotation.NonNull;

public class Location extends BaseModel {

    String address;

    public Location() {
    }


    public void setAddress(@NonNull final String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
