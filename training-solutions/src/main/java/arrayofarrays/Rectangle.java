package arrayofarrays;

public class Rectangle {
    public static int[][] rectangularMatrix(int size){
        int[][] rectang = new int[size][size];

        for(int rows = 0; rows< size; rows++){
            for(int col = 0; col< size; col++){
                rectang[rows][col] = rows;
            }
        }
        return rectang;
    }

    public static void main(String[] args) {
        ArrayOfArrays arrays = new ArrayOfArrays();
        arrays.printArrayOfArrays(rectangularMatrix(5));
    }
}
