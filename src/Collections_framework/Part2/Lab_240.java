package Collections_framework.Part2;

import java.util.*;

public class Lab_240 {
    public static void main(String[] args) {
        List ttacourseList = new LinkedList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET blueprint");
        ttacourseList.add("jav for testers");
        ttacourseList.add(1);
        ttacourseList.add(true);
        ttacourseList.add(3.14);
        System.out.println(ttacourseList);

        Vector<String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPIT");
        v2.add("Sdet blurprint");



        Enumeration e = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
