import java.util.Scanner;

public class MaxOfThree {

    int max3(int a, int b, int c){
        if (a>b && a>c){
            return a;
        }
        if (b>a && b>c){
            return b;
        }
        return c;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxOfThree m1 = new MaxOfThree();
        System.out.println("Enter the Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = m1.max3(a, b, c);
        System.out.println("Largest Number is "+res);
    }
}
