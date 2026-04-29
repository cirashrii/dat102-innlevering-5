package oppgave17_1;

import java.util.Random;
import static oppgave17_1.Insetting.*;
import static oppgave17_1.Utvalg.*;
import oppgave17_1.Haug.*;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        Random random = new Random();

        for(int i = 0; i<numbers.length;i++) {
            numbers[i] = random.nextInt(20);
        }

        sorterVedInnsetting(numbers, 5);
        //utvalgssortering(numbers, 5);
//        Haug test = new Haug(numbers);
//        test.toString();


    }
}
