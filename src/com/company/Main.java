package com.company;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] arg) {
        Employee e0 = new Employee("Liam", "Lennon", "Teacher", 350000);
        Employee e1 = new Employee("Olivia", "Smith", "Professor", 500000);
        Student s0 = new Student("Noah", "Johnson", 2.22);
        Student s1 = new Student("Elijah", "Williams", 3.99);
        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(e0);
        ppl.add(e1);
        ppl.add(s0);
        ppl.add(s1);
        Collections.sort(ppl);
        printData(ppl);
    }
    public static void printData(Iterable<Person> ppl){
        for (Person person : ppl ) {
            if (person instanceof Employee){
                System.out.println(person + " Position: " + person.getPosition() + ". earns: " + person.getPaymentAmount() + " tenge");
            } else if (person instanceof Student) {
                System.out.println(person + " earns " + person.getPaymentAmount() + "tenge");
            }
        }
    }
}
