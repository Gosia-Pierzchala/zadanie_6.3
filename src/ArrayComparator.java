public class ArrayComparator {

    boolean compare (int[] tablica1, int[] tablica2){
        boolean result = tablica1 == tablica2;
        if(tablica1.length != tablica2.length){
            result = false;
        } else {
            for (int i = 0; i < tablica1.length; i++) {
                if(tablica1[i] == tablica2[i]){
                    result = true;
                } else { result = false;
                    break;
                }
            }
        }
        return result;
    }
}
