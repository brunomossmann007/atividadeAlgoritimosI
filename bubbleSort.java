class bubbleSort {
    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1])
                    troca(v, j, j + 1);
            }
        }

       
    }

    private static void troca(int[] v, int j, int i) {
        troca(v, j +1, j);
    }
}
