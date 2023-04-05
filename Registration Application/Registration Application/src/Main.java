import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Registration Page Application

        Scanner sc = new Scanner(System.in);

        System.out.println("LOGIN PAGE");


        String Name = "ESHAN";
        String Password = "12345";
        int pass = 3;

        while (true) {

            System.out.println("Please Enter Your Name");
            String nameInput = sc.nextLine();

            System.out.println("Please Enter Your Password");
            String PasswordInput = sc.nextLine();


            if (Name.equals(nameInput) && Password.equals(PasswordInput)) {

                System.out.println("LOGIN SUCCESSFULLY");
                System.out.println("Welcome, ESHAN");
                break;

            } else if (!(Name.equals(nameInput)) && Password.equals(PasswordInput)) {

                System.out.println("Please Enter Valid Username");

                pass = pass -1;
                System.out.println("You left with " + pass + " Chances");
            } else if (Name.equals(nameInput) && !(Password.equals(PasswordInput))) {

                System.out.println("Please Enter Valid Password");

                pass -= 1;
                System.out.println("You left with " + pass + " Chances");
            } else if (!(Name.equals(nameInput)) && !(Password.equals(PasswordInput))) {

                System.out.println("Please Enter Valid Username and Password");

                pass -= 1;
                System.out.println("You left with " + pass + " Chances");
            }
            if (pass == 0){

                System.out.println("You are blocked");
                break;
            }

        }
    }
}