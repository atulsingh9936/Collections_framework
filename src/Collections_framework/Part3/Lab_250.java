package Collections_framework.Part3;

import java.util.HashSet;
import java.util.Set;

public class Lab_250 {
    public static void main(String[] args) {
        // given an array of integers , return an array of the unique elements
        // Input:[1,2,2,3,4,4,5]
        //output:[1,2,3,4,5]
        int [] input = {1,2,2,3,4,4,5};
        Set<Integer> uniqueset = new HashSet<>();
        for(int num:input){
            uniqueset.add(num);
        }
        System.out.println(uniqueset);
    }
}
