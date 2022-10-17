public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 7, 9, 15, 22, 0, 13, 45, 47 };
        int aranacak = 45;

        for (var temp : array) {
            if (temp == aranacak) {
                System.out.println("Aranan sayı bulundu ! : " + temp);
                return;
            }
        }
    }
}
