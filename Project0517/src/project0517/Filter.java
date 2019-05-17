/* @author kinpe */
package project0517;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Person> cityFilter(String city, List<Person> persons) {
        List<Person> personsInCity = new ArrayList<>();
        for (Person person : persons) {
            if (person.getCity().equals(city)) {
                personsInCity.add(person);
            }
        }
        return personsInCity;
    }
}