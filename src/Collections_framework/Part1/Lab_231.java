package Collections_framework.Part1;

import java.util.List;

public class Lab_231 {
    public static void main(String[] args) {
        // shopping list
        // milk,bread, butter, cheese
        // 4 elements
        // collection framework-> How you can store the elements

        List shoppinglist =List.of("milk","Bread","Butter","Cheese");
        System.out.println(shoppinglist);
        System.out.println(shoppinglist.size());


        List Fruites = List.of("orange", "Apple","Banana","Apple","Watermelon");
        // List can contain duplicates elements
        System.out.println(Fruites);
        System.out.println(Fruites.size());

//        List My_10_marks = List.of(91,92,93,95,100);
//        System.out.println(My_10_marks);
//        System.out.println(My_10_marks.size());
//
//
//        List Different_data_types = List.of("Pramod",true,123);
        System.out.println(Fruites.get(0));
        System.out.println(Fruites.indexOf("Apple"));

        // is empty
        System.out.println(Fruites.isEmpty());


        // add, remove. clear, contains, indexof , is empty, size, get

        // addAll, remove all, retainall,containsall
//        Fruites.add("grape");
//        System.out.println(Fruites);




    }
}
