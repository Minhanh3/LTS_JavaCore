package JAV2_1;

public class JAV2_1_03_InMang2chieu {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j  < a[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(" }");
            if (i  < a.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
