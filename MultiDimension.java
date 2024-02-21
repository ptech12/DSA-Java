
public class MultiDimension {
    

    public static void main(String[] args) {
        

        /* 2D array init */
        int[][] arr = new int[3][];

        /* Static Array */
        
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        // System.out.println(arr2D.length);
        /* 2D Array I/O */
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                System.out.print(arr2D[i][j]);
                System.out.print('\t');
            }
            System.out.println();
        }
        

    }
}
