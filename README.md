# PersonenListe
Gives List of People back with specific parts in tier name (like max)
# Introduction
Welcome to the Person List application! This Java program manages a list of persons with their names and provides functionalities to filter and display the list based on different criteria.

# Usage
## Create Persons:
The program initializes a list of persons with names and usernames.

## Display All Persons: 
Prints a list of all persons.

System.out.println("liste von allen Personen ");
for (int i = 0; i < Persons.size(); i++) {
    System.out.println((i + 1) + "." + Persons.get(i));
}
## Display Persons with Specific Name: 
Prints a list of persons with a specific first name.

System.out.println("liste von allen Personen max");
for (int i = 0; i < Ausgabe("max").size(); i++) {
    System.out.println((i + 1) + "." + Ausgabe("max").get(i));
}
## Display Persons Containing a Substring in the Name: 
Prints a list of persons whose first names contain a specified substring.

System.out.println("alle personen mit max im namen egal wo");
for (int i = 0; i < Ausgabe2("max").size(); i++) {
    System.out.println((i + 1) + "." + Ausgabe2("max").get(i));
}
# Methods
## Ausgabe(String search)
Returns a list of persons with a specific first name (case-insensitive).

## Ausgabe2(String search)
Returns a list of persons whose first names contain a specified substring.

# Example
Persons.add(new Person("Tim", "tim"));
Persons.add(new Person("Max", "Maue"));
Persons.add(new Person("timaxi", "Buli"));

// Display all persons
System.out.println("liste von allen Personen ");
for (int i = 0; i < Persons.size(); i++) {
    System.out.println((i + 1) + "." + Persons.get(i));
}

// Display persons with the first name "max"
System.out.println("liste von allen Personen max");
for (int i = 0; i < Ausgabe("max").size(); i++) {
    System.out.println((i + 1) + "." + Ausgabe("max").get(i));
}

// Display persons containing "max" in the name
System.out.println("alle personen mit max im namen egal wo");
for (int i = 0; i < Ausgabe2("max").size(); i++) {
    System.out.println((i + 1) + "." + Ausgabe2("max").get(i));
}

### Feel free to explore and modify the code to suit your needs!
