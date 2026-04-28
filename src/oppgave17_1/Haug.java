package oppgave17_1;

import oppgave17_1.Utvalg;

import java.util.Arrays;

import static oppgave17_1.Utvalg.swap;

public class Haug<T extends Comparable<? super T>> {
        private T[] haug;
        private int antall;

        public Haug(T[] elementer) {
            antall = elementer.length;
            haug = Arrays.copyOf(elementer, antall + 1);

            for (int i = antall / 2; i > 0; i--) {
                reparerNed(i);
            }
        }

        private void reparerNed(int i) {
            while (2 * i <= antall) {
                int j = 2 * i;
                if (j < antall && haug[j + 1].compareTo(haug[j]) < 0) {
                    j++;
                }
                if (haug[i].compareTo(haug[j]) <= 0) break;

                swap(haug, i, j);
                i = j;
            }
        }
    }


