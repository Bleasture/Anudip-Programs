import java.util.Scanner;

public class Factorial {

    int fact(int a){
        int res = 1;
        for (int i = 1; i <=a; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial f1 = new Factorial();
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        System.out.println("The Factorial of "+a+" is "+f1.fact(a));
    }
}
