import java.util.Scanner;

public class function3 {
    public static int multiplyNumber(int a, int b){
        int sum = a * b;
        return sum ;
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = multiplyNumber(a, b);
        System.out.println("multiply:" + sum);
    }
    
}
