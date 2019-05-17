/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project0517;

import java.util.List;

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

//        people.sort((Person a, Person b) -> a.getFullName().compareTo(b.getFullName()));
//        for (Person person : people) {
//            System.out.println(person.getFullName());
//        }
//        List<Person> peopleInChicago = Filter.cityFilter("Chicago", people);
//        for (Person person : peopleInChicago) {
//            System.out.println(person.getEmail());
//        }
        peopleInChicago(people);
    }
    
    public static void peopleInChicago(List<Person> people) {
        List<Person> peopleInChicago = Filter.cityFilter("Chicago", people);
        for (Person person : peopleInChicago) {
            System.out.println(person.getEmail());
        }
    }
    
}
