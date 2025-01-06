package Collections_framework.Part3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab_246 {
    public static void main(String[] args) {
        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("Sdet blueprints");
        courseSets.add("java for testers");
        System.out.println(courseSets);

        for(Object o :courseSets){
            System.out.println(o);
        }
        System.out.println("--------");

        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
