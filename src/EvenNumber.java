import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while(true) {
            try {
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered %d.", n);
                    break;
                }
                System.out.print("The number is not even.");
            } catch (Exception ex){
                System.out.println("Invalid number.");
            }
        }
    }
}
