/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0517;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pepe
 */
public class Project0517 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        List<Person> people = Reader.read();

        people.sort((Person a, Person b) -> a.getFullName().compareTo(b.getFullName()));
        for (Person person : people) {
            System.out.println(person.getFullName());
        }
        List<Person> peopleInChicago = Filter.cityFilter("Chicago", people);
        for (Person person : peopleInChicago) {
            System.out.println(person.getEmail());
        }
        
    }
    
    public static void showPeopleInCity(List<Person> people) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy városnevet:");
        String city = sc.nextLine();
        boolean found = false;
        for (Person person : people) {
            if (person.getCity().equalsIgnoreCase(city)) {
                System.out.println(person.getFullName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ebben a városban lakó emberről nincs adatunk.");
        }
    }
    
}
