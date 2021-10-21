package arrayofarrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] dataArray ={{0,1,2}, {0,1,2}, {0,1,2}, {0,1,2}};

        arrayOfArrays.printArrayOfArrays(dataArray);
    }

    public void printArrayOfArrays(int[][] a){
        for(int rowS[]: a){
            for (int columns: rowS){
                System.out.print(columns);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
