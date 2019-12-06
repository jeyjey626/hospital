package com;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    private static final List<DoctorType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static String randomDoctor()  {
        return VALUES.get(RANDOM.nextInt(SIZE)).doctor;
    }
}
