import java.util.Scanner;

import javax.net.ssl.HostnameVerifier;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        char letter = 'A';
        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir !");
                break;
            default:
                System.out.println("İnce sesli harftir !");
        }
    }
}
