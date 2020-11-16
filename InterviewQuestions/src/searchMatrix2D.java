public class searchMatrix2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return false;
        }

        int x=0;
        int y=0;

        while (x<matrix.length&& y<matrix[0].length){
            if(target==matrix[x][y]){
                return true;
            }
            else{
                searchDownAndUp(x,y, target, matrix);
            }
        }

        return true;
    }

    public boolean searchDownAndUp(int x, int y, int target, int [][]matrix){

        return false;
    }


}
