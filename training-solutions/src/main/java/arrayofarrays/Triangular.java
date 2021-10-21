package arrayofarrays;

public class Triangular {
    public static int [][] triangularMatrix(int size){
        int[][] triangl = new int[size][];
        for(int rows = 0;rows<size;rows++){
            triangl[rows] = new int[rows+1];
            triangl[rows][rows] = 1;
        }

        for(int i = 0; i< triangl.length;i++){
            for(int j = 0; j < i+1; j++){
                triangl[i][j] = i;
            }
        }

        return triangl;
    }

    public static void main(String[] args) {
        ArrayOfArrays arrays = new ArrayOfArrays();
        arrays.printArrayOfArrays(triangularMatrix(9));
    }
}


