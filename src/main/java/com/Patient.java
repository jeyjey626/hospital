package com;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Data
@Getter
@Setter

class Patient {
    private String name;
    private String surname;
    private Double lifePoints;
    private ArrayList<Examination> examinationArrayList;
    private Boolean stable;

    public String getFullName(){return name + surname;}

    public void addExamination(Integer day, String doctorType, Double lifePoints){
        this.examinationArrayList.add(new Examination(day, doctorType, lifePoints));
    }

    public Patient(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.lifePoints = Double.valueOf(20);
        this.stable = true;
        this.examinationArrayList = new ArrayList<>();
    }
}
