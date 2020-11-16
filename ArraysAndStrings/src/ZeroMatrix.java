import java.util.ArrayList;

public class ZeroMatrix {
    public static class Casilla{
        int i;
        int j;
        public  Casilla(int i, int j){
            this.i=i;
            this.j=j;
        }
    }



    //i=y
    //j=x
    public static void setZeros(int array[][]){
        ArrayList<Casilla> arrayList= new ArrayList();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==0){
                    Casilla temp= new Casilla(j,i); //j=y
                    //i=x
                    arrayList.add(temp);
                }
            }
        }
        for(Casilla a: arrayList){
            int x= a.i;
            int y= a.j;
            System.out.println("x=" + x);
            System.out.println("y= " +y);
            for(int i=0; i<array.length; i++){ //ys
                System.out.println(array[i][x]);
                array[i][x]=0;
               }

            for(int j=0;j<array[0].length;j++){

                System.out.println("j= " +y);


                System.out.println(array[y][j]);
                array[y][j]=0;
            }
        }

        for (int i = 0; i< array.length; i++) {
            for (int j = 0; j< array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }

    }


    public static void main(String args []){

        int matriz[][] =
                {
                        {1,2,3,0,7},
                        {4,5,6,1,6},
                        {7,0,9,8,5},
                        {1,5,7,8,1},
                        {2,4,6,9,9}
                };

      setZeros(matriz);

    }
}
