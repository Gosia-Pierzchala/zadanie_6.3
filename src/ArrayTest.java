public class ArrayTest {
    public static void main(String[] args) {
        int[] tablica1 = {1, 2, 3, 4, 5, 6};
        int[] tablica2 = {1, 2, 3, 4, 5, 6};

        ArrayComparator arrayComparator = new ArrayComparator();

        boolean finalCheck = arrayComparator.compare(tablica1, tablica2);
        System.out.println("Czy tablice są indentyczne? " + finalCheck);
    }
}
