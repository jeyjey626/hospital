package com;

public enum  DoctorType {
    DOCTOR("DOCTOR", 1.7), NURSE("NURSE", 1.3);

    private String doctor;
    private Double healing;

    DoctorType(String doctor, double healing) {
        this.doctor = doctor;
        this.healing = healing;
    }

    public String getDoctor() {
        return doctor;
    }

    public Double getHealing() {
        return healing;
    }
}
