public class CodeSnips{
    public static void main(String[] args) {
        /*
            * Declare and initialize an array of integers that has 4 rows and 3 columns.  All of the elements in the array should be initialized to zero.
            *Declare and initialize an array of integers that has 2 rows and 5 columns.  All of the elements in the array should be initialized to zero.
            *Declare and initialize an array of integers that represents the following matrix,
         */
        int[][]fourthree=new int[4][3];
        int[][]twofive=new int[2][5];
        int[][]filled={
            {8,6,7},
            {5,3,0}
        };
        for (int row = 0; row < fourthree.length; row++) {
            for (int col = 0; col < fourthree[0].length; col++) {
                System.out.print(fourthree[row][col]);
                // only print a comma if it's not the last column.
                if (col < fourthree[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < twofive.length; row++) {
            for (int col = 0; col < twofive[0].length; col++) {
                System.out.print(twofive[row][col]);
                // only print a comma if it's not the last column.
                if (col < twofive[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < filled.length; row++) {
            for (int col = 0; col < filled[0].length; col++) {
                System.out.print(filled[row][col]);
                // only print a comma if it's not the last column.
                if (col < filled[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }
}