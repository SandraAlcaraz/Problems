
public class RotateMatrix {



    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last-offset][first];

                // bottom -> left
                matrix[last-offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }

        for (int i=0; i<matrix.length; i++){


            for (int j=0; j<matrix.length; j++){

                //sample[i][j] = (j*5) + sample[i][0];

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }



    public static void main(String args []){



            int[][] sample = new int[5][5];
            int k=0;

            for (int i=0; i<sample.length; i++){

                sample[i][0] = k;
                k = k+2;

                for (int j=0; j<sample.length; j++){

                    sample[i][j] = (j*5) + sample[i][0];

                    System.out.print(sample[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(" ");
            rotate(sample, 5);



        }



}
