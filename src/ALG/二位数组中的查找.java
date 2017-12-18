package ALG;

public class 二位数组中的查找 {

    public static void main(String[] args) {
        int[][] ayyars = new int[][]{{1,2,3},{4,5,6}};
        findfigureFromTwo(ayyars,5);
    }

    public static void findfigureFromTwo(int[][] matrix,int number){

        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            System.out.println("matrix is error");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols-1;

        while(row >= 0 && row < rows && col >=0 && col < cols){
            if(matrix[row][col] == number){
                System.out.println("row and col:" + (row+1) + "," + (col+1));
                return;
            }else if(matrix[row][col] > number){
                col--;
            }else if(matrix[row][col] < number){
                row++;
            }
        }

        System.out.println("not find");
    }
}
