import java.util.Scanner;

public class EvenOdd {
    String evenodd(int a){
        if(a%2==0){
            return " Is Even Number";
        }
        return " Is Odd Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOdd e1 = new EvenOdd();
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        String res = e1.evenodd(a);
        System.out.println(a+res);
    }
}
