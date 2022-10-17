import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Sayı asal değildir !");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı !");
        }
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime)
            System.out.println("Sayı Asaldır ! ");
        else
            System.out.println("Sayı Asal Değildir ! ");
    }
}
