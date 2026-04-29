package oppgave17_1;

import java.util.Random;
import static oppgave17_1.Insetting.*;
import static oppgave17_1.Utvalg.*;
import oppgave17_1.Haug.*;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        Random random = new Random();

        int k = 5;

        for(int i = 0; i<numbers.length;i++) {
            numbers[i] = random.nextInt(20);
        }

//        sorterVedInnsetting(numbers, 5);
//        utvalgssortering(numbers, 5);

        System.out.println("Vi spurte om de " + k + " minste tallene.");
        System.out.println("Before: ");
        for (Integer t : numbers) {
            System.out.print(t + " ");
        }

        System.out.println();
        System.out.println("After: ");

        Haug test = new Haug();

        test = test.finnKMinste(numbers, 5);

        for (int i = 1; i <= test.getAntall(); i++) {
            System.out.print(test.getHaug()[i] + " ");
        }


    }
}
