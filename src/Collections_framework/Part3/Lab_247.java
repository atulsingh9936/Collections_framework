package Collections_framework.Part3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab_247 {
    public static void main(String[] args) {
        //Set courseSets = new LinkedHashSet(10,5);
        Set courseSets = new LinkedHashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("Sdet blueprints");
        courseSets.add("java for testers");
        System.out.println(courseSets);
    }
}
