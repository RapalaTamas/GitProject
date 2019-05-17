/* @author kinpe */
package project0517;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<Person> read() {
        List<Person> persons = new ArrayList<>();
        try {
            Scanner sc = new Scanner( new File("us-500.csv") ); 
            sc.nextLine();
            while (sc.hasNext()) {
                String[] line = sc.nextLine().split(",");
                String name = line[0] + " " + line[1];
                String city = line[4];
                String email = line[10];
                Person person = new Person(name, city, email);
                persons.add(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nem tudtam olvasni a fájlt.");
        }
        return persons;
    }
}