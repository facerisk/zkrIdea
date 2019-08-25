public class Maopao {
    public static void main(String[] atrgs) {
        int[] n = new int[]{1, 2, 55, 3, 46, 33};
        int temp;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - i - 1; j++) {
                if (n[j] > n[j+1]) {
                    temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        for(int i : n)
        System.out.println(i);
    }
}
