public class App {
    public static void main(String[] args) throws Exception {
       
        int sayi = 45;
        int sayi2 = 25;
        int sayi3 = 35;

        if (sayi > sayi2 && sayi > sayi3) {
            System.out.println("En büyük sayı : " + sayi);
        } else if (sayi2 > sayi && sayi2 > sayi3) {
            System.out.println("En büyük sayı : " + sayi2);
        } else {
            System.out.println("En büyük sayı : " + sayi3);
        }
    }
}
