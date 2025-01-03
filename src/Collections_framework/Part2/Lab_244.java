package Collections_framework.Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_244 {
    public static void main(String[] args) {
//        List<Integer> mymarks = new ArrayList<>();
//        mymarks.add(91);
//        mymarks.add(87);
//        mymarks.add(80);
//        Collections.sort(mymarks);
//        System.out.println(mymarks);

        student s = new student(1,"pramod");
        student s1 =  new student(5,"dutta");
        student s2 = new student(3,"akarshit");

        List<student> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);

     Collections.sort(students,new SortByIdAsc());
      //  Collections.sort(students,new SortByIddesc());
       // Collections.sort(students,new SortByIdNameAsc());
        Collections.sort(students,new SortByIdNameDesc());
        System.out.println(students);

    }
}
