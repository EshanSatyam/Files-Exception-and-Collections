import java.util.*;

public class C3_UniqueNumberList {

    public static void main(String[] args) {
        // Maintaining order with no duplicate elements insertion in
// the ArrayList.

                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(2);
                list.add(1);
                list.add(4);
                list.add(5);
                List<Integer>ls1 = new ArrayList<Integer>();
                for(int i=0; i < list.size(); i++)
                {
                    System.out.println(list.get(i));
                    int Num;
                    if(!ls1.contains(list.get(i)))
                    {
                        Num=list.get(i);
                        ls1.add(Num);
                    }
                }
                System.out.println(ls1);
    }
}