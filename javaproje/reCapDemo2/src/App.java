public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double[] array = { 1.5, 5.7, 3.9 };
        double total = 0;
        double temp = 0;
        for (double var : array) {
            total += var;
            if (var > temp) {
                temp = var;
            }
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük sayı : " + temp);

    }
}
