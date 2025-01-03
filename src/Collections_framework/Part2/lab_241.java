package Collections_framework.Part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab_241 {
    public static void main(String[] args) {
//        List stringlist = null;
//        stringlist.add("ATB");

        List<Integer> mymarks = new ArrayList<>();
        mymarks.add(91);
        mymarks.add(87);
        mymarks.add(80);
        Collections.sort(mymarks);
        System.out.println(mymarks);
    }
}
