package com;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main2 {
    private static final int UNSTABLECHANCEPERCENT = 10;
    private static Random random = new Random();
    public static void main(String[] args){

        List<Patient> patients = Arrays.asList(
            new Patient("Jan", "Kowalski"),
            new Patient("Man", "Kowalski"),
            new Patient("Ban", "Kowalski"),
            new Patient("Tan", "Kowalski"),
            new Patient("Pan", "Kowalski")
        );


        IntStream.rangeClosed(1,12).forEach(i -> {
            patients.stream()
                        .filter(patient -> patient.getLifePoints() > 0) //STOP curing already dead
                        .filter(patient -> random.nextInt(100) > UNSTABLECHANCEPERCENT) //not curing the unstable (0.1 chance)
                        .forEach(patient -> {
                            String doctorType = DoctorType.randomDoctor();
                            patient.addExamination(i, doctorType, healing(DoctorType.valueOf(doctorType), patient));
                        });
        });
        System.out.println(patients.get(1));

        System.out.println(patients.stream()
                .filter(patient -> patient.getLifePoints() > 0)
                .map(Patient::getFullName)
                .collect(Collectors.toList()));
    }

    private static Double healing(DoctorType doctorType, Patient patient){
        double afterHealing = doctorType.getHealing() * (patient.getLifePoints() - random.nextInt(10)); //patient lost some points overnight
        patient.setLifePoints(afterHealing);
        return afterHealing;
    }
}
/*
program ma być bez if ani for, map/filter/reduce
pacjent stabilny czy nie - pacjent niestabilny - nie można dalej leczyć - szansa 0,1 żeby się zdarzyć na pacjencie danego dnia.
Z końcem dnia pacjenci stają się stabilny.
Tracable historia pacjenta - każde dni po kolei

Symulacja szpitala:
x pacjentów, x healers - albo lekarka albo pielęgniarz -> każde ma inną moc leczenia (współczynnik). Każdy pacjent ma karcie
lekarze się wpisują gdy leczą pacjenta - raz dziennie
12 dni
Każdy pacjent codziennie traci liczbę pkt życia

kto przeżył

 */
