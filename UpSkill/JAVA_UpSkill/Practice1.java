import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();

      if(num1 > num2){
        System.out.println("A");
      }else if (num1 == num2){
        System.out.println("AB");
      }else{
        System.out.println("B");
      }
      in.close();
	}
}