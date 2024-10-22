import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        /* Q -1 : 1.Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip:
        use if else) */

        /*System.out.println("Welcome , enter your role");
        Scanner input = new Scanner(System.in);
        String role = input.nextLine();
        if (role.toLowerCase().equals("admin")) {
            System.out.println("Welcome Admin");
        }else if (role.toLowerCase().equals("superuser")) {
            System.out.println("Welcome superuser");
        }else{
            System.out.println("Welcome user");
                }*/



        /* Q -2 : 2.Take three numbers from the user and print the greatest number.
                    Test Data
                    Input the 1st number: 25
                    Input the 2nd number: 78
                    Input the 3rd number: 87
                    Expected Output : The greatest: 87

        System.out.println("Input the 1st number :");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        System.out.println("Input the 2nd number :");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("Input the 3rd number :");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();


        if(number1 > number2 && number1 > number3){
            System.out.println("The greatest: "+number1);
        }else if(number2 > number1 && number2 > number3){
            System.out.println("The greatest:"+number2);
        }else if(number3 > number1 && number3 > number2){
            System.out.println("The greatest:"+number3);
        }*/

        /*Q - 3 : 3.Write a Java program that generates an integer between 1 and 7
        and displays the name of the weekday.
                Test Data
        number: 4
        Expected Output:
        Wednesday

        System.out.println("The number generated : ");

        Random random = new Random();
        int number = random.nextInt((7 - 1) +1) ;
        System.out.println(number);// see explanation below


        switch (number){
            case 1:
                System.out.println("Name of day : Sunday");
                break;
                case 2:
                    System.out.println("Name of day : Monday");
                    break;
                    case 3:
                        System.out.println("Name of day : Tuesday");
                        break;
                        case 4:
                            System.out.println("Name of day : Wednesday");
                            break;
                            case 5:
                                System.out.println("Name of day : Thursday");
                                break;
                                case 6:
                                    System.out.println("Name of day : Friday");
                                    break;
                                    case 7:
                                        System.out.println("Name of day : Saturday");
                                        break;
                                        default:
                                            System.out.println("Invalid day number");
                                            break;

        }*/



        /*Q - 4 : 4. Write a program that takes a numeric score as input and prints
        the corresponding letter grade using the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69 F:
        0-59
        Enter your numeric score: 85
        Numeric Score: 85
        Letter Grade: B

        System.out.println("Enter your Score  :");
        Scanner input1 = new Scanner(System.in);
        int score = input1.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: A");
        }else if(score >= 80 && score <= 89){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: B");

        }else if(score >= 70 && score <= 79){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: C");

        }else if(score >= 60 && score <= 69){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: D");
        }else{
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: F");
        }*/

        /*Q - 5 : 5. Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.
                use an if statement to categorize the age based on the following criteria:
        • If the age is less than 13, categorize them as a "Child."
        • If the age is between 13 and 19 (inclusive), categorize them as a
        "Teenager."
        • If the age is 20 or older, categorize them as an "Adult."
        Sample Output:
        Enter your age: 25
        You are an Adult.

        System.out.println("Enter your Age  :");
        Scanner input1 = new Scanner(System.in);
        int age = input1.nextInt();

        if(age >= 20){
            System.out.println("You are an Adult");
        }else if(age >= 13 && age <= 19){
            System.out.println("You are a Teenager");
        }else{
            System.out.println("You are a Child");

        }*/


    }
}