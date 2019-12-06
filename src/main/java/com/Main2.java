package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args){

        List<Patient> patients = Arrays.asList(
            new Patient("Jan", "Kowalski"),
            new Patient("Man", "Kowalski"),
            new Patient("Ban", "Kowalski"),
            new Patient("Tan", "Kowalski"),
            new Patient("Pan", "Kowalski")
        );
        System.out.println(patients);
        IntStream.rangeClosed(1,12).forEach(i -> patients.
                forEach(patient -> patient.addExamination(i, DoctorType.DOCTOR.getDoctor(), patient.getLifePoints())));
        System.out.println(patients);
        System.out.println("tada");
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
