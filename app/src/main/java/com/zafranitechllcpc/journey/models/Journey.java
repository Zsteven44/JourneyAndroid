package com.zafranitechllcpc.journey.models;

import com.workday.postman.annotations.Parceled;

import java.util.List;

@Parceled
public class Journey extends BaseModel {

    String name;
    List<Establishment> establishments;

    public Journey() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Establishment> getEstablishments() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }

}
