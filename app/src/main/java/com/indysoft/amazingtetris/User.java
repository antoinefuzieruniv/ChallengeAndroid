package com.indysoft.amazingtetris;

public class User {

    String uid;
    Boolean malus;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getMalus() {
        return malus;
    }

    public void setMalus(Boolean malus) {
        this.malus = malus;
    }

    public User(String uid, Boolean malus) {
        this.uid = uid;
        this.malus = malus;
    }
}
