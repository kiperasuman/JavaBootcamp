public class App {
    public static void main(String[] args) throws Exception {
        // 220 - 224

        int number1 = 220;
        int number2 = 284;
        int total = 0;
        int total2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total += i;
            }
        }
        for(int i = 1 ; i < number2 ; i++){
            if(number2 % i == 0){
                total2 += i;
            }
        }
        if(number1 == total2 && number2 == total ){
            System.out.println(number1 + " ve "+number2 + " arkadaş sayıdır ! ");
        }else{
            System.out.println(number1 + " ve "+number2 + " arkadaş sayı değildir !");
        }
    }
}
