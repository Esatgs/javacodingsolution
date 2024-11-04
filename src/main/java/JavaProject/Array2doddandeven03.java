package JavaProject;

public class Array2doddandeven03 {
    public static void main(String[] args) {

        int[][] numbers = {
                {9,2,3},
                {5,8,7},
                {9,10,12}


        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }



    }
}
