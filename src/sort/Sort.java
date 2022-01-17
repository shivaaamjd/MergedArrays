package sort;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

       ArrayList <Integer> list1 = new ArrayList<Integer>();
       ArrayList <Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        // for (int i = 0; i < list1.size(); i++) {
            list1.addAll(Collections.singleton((in.nextInt())));
            System.out.println(list1);
      //  }
        list2.addAll(Collections.singleton(in.nextInt()));
            System.out.println(list2);
            System.out.println(list3);
        }


       /* private static int Merge (ArrayList a,ArrayList b) {
            return ArrayList a.add(ArrayList b);
        }*/
}
