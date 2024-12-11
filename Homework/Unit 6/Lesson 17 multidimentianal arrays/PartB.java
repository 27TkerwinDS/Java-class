public class PartB {
    
    public static void printar(int[][] toPrint){

        for (int i=0; i<toPrint.length;i++){
            for(int o=0;o<toPrint[0].length;o++){
                System.out.print(toPrint[i][o]+", ");
            }
            System.out.println();
        }

    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        int[][]filled1={
            {8,6,7},
            {5,3,0}
        };
        int[][]filled2={
            {0,7,6,5},
            {2,2,0,1},
            {8,4,5,7}
        };
        System.out.println("Array1: ");
        printar(filled1);
        System.out.println("Array2: ");
        printar(filled2);
    }
}
