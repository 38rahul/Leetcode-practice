import   java.util.*;

public class SetZeroMatrix {

    public  static  void setZero(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(m + " " + n);
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
// [[1,1,1]
//  [1,0,1]
//  [1,1,1]
// ]
        Scanner sc = new Scanner(System.in);
        //int m = sc.nextInt();
        //int n= sc.nextInt();
        int matrix[][] = {{1,1,1},{1,0,1},  {1,1,1}};
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j]  =sc.nextInt();
//            }
//        }
        setZero(matrix);

    }
}
