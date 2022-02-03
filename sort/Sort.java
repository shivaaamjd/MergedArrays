public class Sort {
    import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

    public class Sort {
        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {

                ArrayList<Integer> list1 = new ArrayList<Integer>();
                list1.addAll(Collections.singleton((in.nextInt())));

                ArrayList<Integer> list2 = new ArrayList<Integer>();
                list2.addAll(Collections.singleton(in.nextInt()));

                Collections.sort(list1);
                Collections.sort(list2);

                System.out.println(list1);
                System.out.println(list2);

                ArrayList<Integer> list3 = new ArrayList<Integer>();
                // list3.addAll(list1);

                while (in.hasNextInt())
                {

                    Merge(list1,list2);
                    System.out.println(Merge(list1,list2));
                }
            }
        }

        private static int Merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            while (list1.addAll(list2)) ;
            Collections.sort(list1);
            {
                //System.out.println();
                return Merge(list1,list2);
            }
        }
    }
}
