public class App {
    public static void main(String[] args) throws Exception {

        int number = -5;
        int total = 0;
        if(number < 1 ){
            System.out.println("Geçersiz sayıdır !");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if(total == number){
            System.out.println("Mükemmel Sayıdır ! ");
        }else {
            System.out.println("Mükemmel Sayı Değildir !");
        }

    }
}
