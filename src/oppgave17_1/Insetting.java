package oppgave17_1;

public class Insetting {

    public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a, int k) {
        System.out.println("Vi spurte om de " + k + " minste tallene.");
        System.out.println("Before: ");
        for (T t : a) {
            System.out.print(t + " ");
        }

        for (int i = 1; i < k; i++) {
            T temp = a[i];
            int j = i - 1;

            while (j >= 0 && temp.compareTo(a[j]) < 0) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = temp;
        }

        for (int i = k; i < a.length; i++) {
            T temp = a[i];
            int j = i - 1;

            if (a[i].compareTo(a[k]) <= 0) {
                while (j >= 0 && temp.compareTo(a[j]) < 0) {
                    a[j + 1] = a[j];
                    j--;

                }
            }
            a[j + 1] = temp;

        }

        System.out.println();
        System.out.println("After: ");
        for (T t : a) {
            System.out.print(t + " ");
        }
    }
}
