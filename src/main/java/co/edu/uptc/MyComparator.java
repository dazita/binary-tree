package co.edu.uptc;

import java.util.Comparator;

public class MyComparator{

    public static Comparator<Person> comparator = new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
          return o1.getName().compareTo(o2.getName());
        }
        
    };
    
}
