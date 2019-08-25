package test;

public class Test {
    public static void main(String[] args) {
        int[] n = {20, 10, 9, 89, 20, 10, 20};
        int temp;
        for (int i = 0; i < n.length - 1; i++) {
            for (int k = 0; k < n.length - 1; k++) {
                for (int j = i + 1; j < n.length; j++) {
                    if (n[i] > n[j]) {
                        if (n[i] == 10) {
                            continue;
                        }
                        if (n[i] == 20) {
                            break;
                        }
                        temp = n[j];
                        n[j] = n[i];
                        n[i] = temp;
                    }
                }
            }

        }
        for (int a : n) {
            System.out.println(a);
        }


    }
}

