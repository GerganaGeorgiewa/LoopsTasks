import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        do {
            sum = sum + (n%10);
            n = n / 10;
        } while (n>0);
        System.out.println("The sum is:" + sum);
    }
}
