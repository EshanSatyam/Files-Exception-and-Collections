import java.util.ArrayList;
import java.util.HashSet;

public class C1_UniqueNumber {

    public static void main(String[] args) {

        //Program to print only the unique number from ArrayList

        //Creating ArrayList

        ArrayList<Integer> UniqueNumber = new ArrayList<>();

        //Adding Numbers to list
        UniqueNumber.add(3);
        UniqueNumber.add(3);
        UniqueNumber.add(1);
        UniqueNumber.add(1);
        UniqueNumber.add(5);
        UniqueNumber.add(5);

        /* Converting ArrayList into HashSet which will Print
           only Unique Values */

        HashSet<Integer> UniqueList = new HashSet<>(UniqueNumber);

        //Printing the Unique Values
        System.out.println("The Original Values Of ArrayList is : " + UniqueNumber);
        System.out.println("The Unique Values from Arraylist is : " + UniqueList);

    }
}
