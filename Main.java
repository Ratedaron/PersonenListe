package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Person> Persons = new ArrayList<>();

    public static void main(String[] args) {
        //Atributte

        Persons.add(new Person("Tim", "tim"));
        Persons.add(new Person("Max", "Maue"));
        Persons.add(new Person("timaxi", "Buli"));
        Persons.add(new Person("Hans", "Murmaxer"));
        Persons.add(new Person("MaX", "Max"));
        Persons.add(new Person("Maximus", "Johnson"));
        Persons.add(new Person("MAX", "Doe"));
        Persons.add(new Person("Alex", "Maxwell"));
        Persons.add(new Person("Jane", "Maxson"));
        Persons.add(new Person("Maximus", "Smith"));

        //ausgabe aller PAersonen
        System.out.println("liste von allen Personen ");

        for (int i = 0; i < Persons.size(); i++) {
            //Persons.forEach(person -> System.out.println(person));
            System.out.println((i + 1) + "." + Persons.get(i));
        }

        System.out.println("--------------");
        System.out.println("liste von allen Personen max");
        for (int i = 0; i < Ausgabe("max").size(); i++) {
            //Persons.forEach(person -> System.out.println(person));
            System.out.println((i + 1) + "." + Ausgabe("max").get(i));
        }

        //Ausgabe("max").forEach(person -> System.out.println(person));
        System.out.println("---------------------");
        System.out.println("alle personen mit max im namen egal wo");

        for (int i = 0; i < Ausgabe2("max").size(); i++) {
            //Persons.forEach(person -> System.out.println(person));
            System.out.println((i + 1) + "." + Ausgabe2("max").get(i));
        }
        //Ausgabe2("max").forEach(person -> System.out.println(person));


    }

    public static List<Person> Ausgabe2(String search) {

        return Persons.stream()
                .filter(persons -> persons.getFirstname().contains(search))
                .collect(Collectors.toList());

    }

    public static List<Person> Ausgabe(String search) {
        return Persons.stream()
                .filter(persons -> persons.getFirstname().equalsIgnoreCase(search))
                .collect(Collectors.toList());
    }


}



