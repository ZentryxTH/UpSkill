import java.util.Scanner;

public class ProblemSolving {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      Scanner input2 = new Scanner(System.in);
      int num2 = input2.nextInt();

      if ((num1 >= 0 && num1 <= Math.pow(10,9)) && (num2 >= 0 && num2 <= Math.pow(10,9))){
        System.out.println(num1+num2);
      }
      input.close();
      input2.close();
    }
}