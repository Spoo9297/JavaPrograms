package Jan.ex_190125;
import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        for(int i =1; i <= 10 ;i++){
          System.out.println(num+"*"+ i +"="+ num*i);
        }

    }

}
