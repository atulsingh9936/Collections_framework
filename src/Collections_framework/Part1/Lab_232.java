package Collections_framework.Part1;

import java.util.ArrayList;
import java.util.List;

public class Lab_232 {
    public static void main(String[] args) {
        List Arraylist = new ArrayList();
      //  ArrayList arraylist2 = new ArrayList();
        // add, remove, clear, contains, index of, is empty, size, get
        // addAll,remove all,retainall,containsLL



        Arraylist.add("Pramod");
        Arraylist.add("Anusha");
        Arraylist.add("kiran");
        Arraylist.add("Pramod");
        Arraylist.add("Pramod");
        System.out.println(Arraylist);
        System.out.println(Arraylist.size());
        Arraylist.remove("Pramod");
        // Removes the first occurrence of the specified element from the list
        System.out.println(Arraylist);


        Arraylist.clear();
        System.out.println(Arraylist);
        System.out.println(Arraylist.isEmpty());



        Arraylist.add("Pramod");
        Arraylist.add("Anusha");
        Arraylist.add("kiran");
        Arraylist.add("Pramod");
        Arraylist.add("Pramod");
        System.out.println(Arraylist);
        Arraylist.add("dutta");
        System.out.println(Arraylist);
        Arraylist.set(1,"AnushaDutta");
        Arraylist.add(123);
        Arraylist.add(true);
        System.out.println(Arraylist);


        System.out.println("-----------");
        for(int i=0;i<Arraylist.size();i++){
            System.out.println(Arraylist.get(i));


            // for each loop

            for(Object obj :Arraylist){
                System.out.println(obj);
            }
        }




    }
}
