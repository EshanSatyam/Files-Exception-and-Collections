import java.util.HashSet;
import java.util.Scanner;

public class C2_MenuProgram {

    static int choice;

    public static void main(String[] args) {


        //Creating HashSet
        HashSet<Integer> elements = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        //Providing Choices
        while (choice != 4) {
            System.out.println("Enter your Choice : ");
            System.out.println("Press 1 for adding Element");
            System.out.println("Press 2 for removing Element");
            System.out.println("Press 3 for displaying Element");
            System.out.println("Press 4 to exit menu");
            choice = sc.nextInt();

            switch (choice) {

                //Case for adding element
                case 1:
                    System.out.println("Enter an Element to Add - ");
                    int addedNum = sc.nextInt();
                    elements.add(addedNum);
                    System.out.println("Number added successfully.");
                    System.out.println("If you want to exit please enter 4");
                    break;


                case 2:
                    System.out.println("Enter the Element to remove ");
                    int removedNum = sc.nextInt();
                    if (elements.remove(removedNum)) {
                        System.out.println(removedNum + " Element removed successfully");
                    } else {
                        System.out.println(removedNum + " Element Not found in set");
                    }
                    System.out.println("If you want to exit please enter 4");
                    break;


                case 3:
                    if (elements.isEmpty()) {
                        System.out.println("Set is empty, There is nothing to display");
                    } else {
                        System.out.println("Elements in the set is : ");
                        System.out.println(elements);
                    }
                    break;


                case 4:
                    System.out.println("Exiting the Menu.....");
                    break;


                default:
                    System.out.println("Please enter valid choice");
            }
        }
    }
}