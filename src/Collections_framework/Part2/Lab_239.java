package Collections_framework.Part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab_239 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET blueprint");
        ttacourseList.add("jav for testers");
        ttacourseList.add(1);
        ttacourseList.add(true);
        ttacourseList.add(3.14);

        Iterator iterator = ttacourseList.iterator();

        // Iterate through the collection
        while (iterator.hasNext()) {
            Object tacourselist = iterator.next();
            System.out.println(tacourselist);
        }


        for (Object course : ttacourseList) {
            System.out.println(course);
        }

        for(int i=0;i< ttacourseList.size();i++){
            System.out.println(ttacourseList.get(i));
        }
         // list - Arraylist,Linkedlist, vector, stack
        ListIterator lt = ttacourseList.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }


        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while (lt2.hasNext()){
            System.out.println(lt2.hasPrevious());
        }



    }
}