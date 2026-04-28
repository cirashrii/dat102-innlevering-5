package oppgave17_1;

public class Utvalg {
    public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int k) {

        System.out.println("Vi spurte om de " + k + " minste tallene.");
        System.out.println("Before: ");
        for (T t : a) {
            System.out.print(t + " ");
        }

        int n = a.length;

        for (int i = 0; i < k; i++) {
            int minsteIndeks = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(a[minsteIndeks]) < 0) {
                    minsteIndeks = j;
                }
            }

            swap(a, i, minsteIndeks);
        }

        System.out.println();
        System.out.println("After: ");
        for (T t : a) {
            System.out.print(t + " ");
        }
    }

    public static void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}