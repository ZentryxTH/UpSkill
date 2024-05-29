// import java.util.Scanner;

public class TernaryOperator{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter your mark: ");
        // double mark = input.nextDouble();

        // String result = (mark > 40) ? "pass" : "fail";
        // System.out.println("You " + result + " the exam.");
        // input.close();

        // Scanner input = new Scanner(System.in);
        // int number = input.nextInt();
        // String result = (number > 0) ? "Positive Number" : "Negative Number";
        // System.out.println("This number is " + result);
        // input.close();

        int n1 = 2 , n2 = 9 , n3 = -11 ;
        int largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
        System.out.println("Largest Number: " + largest);
    }
}
    
