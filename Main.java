
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        Date date = new Date(year, month, day);
        System.out.println("Your entered date: " + date.toString());
    }
   

}
