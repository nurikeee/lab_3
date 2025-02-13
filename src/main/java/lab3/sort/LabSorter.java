package lab3.sort;

public class LabSorter {

    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] source) {
     boolean sorted = false;

     while (!sorted) {
         sorted = true;

         for (int i = 0; i < source.length - 1; i++) {
             if (source[i] > source[i+1]) {
                 int temp = source[i];
                 source[i] = source[i+1];
                 source[i+1] = temp;
                 sorted = false;

             }
         }
     }

        return source;
    }
}
