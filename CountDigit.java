import java.util.*;
public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int num = sc.nextInt();
        int count = 0;

        while (num > 0) {
            num /=10;
            count++;
        }
        System.out.println("Digit: " +count );
        sc.close();
    }
}
