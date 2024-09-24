package co.edu.uptc;

import java.util.Comparator;

public class MyComparator implements Comparator<Person>{

    private String criteria;

    public MyComparator(String criteria){
        this.criteria = criteria;
    }

    @Override
    public int compare(Person o1, Person o2) {
        switch (criteria) {
            case "name":
                return o1.getName().compareTo(o2.getName());
            case "age":
                return Integer.compare(o1.getAge(), o2.getAge());
        }
        return 0;
    }
    
}
