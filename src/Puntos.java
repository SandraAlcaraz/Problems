import java.util.HashMap;

public class Puntos {

    static double xC;
    static double yC;
    static double distanceTotal;
    static HashMap<Coodenada, Double> distances;
    static double distanciaPuntos;
    static double mediumDistance;
    static double hipotenusaActual;
    static double catetoRequeridoX;
    static double catetoRequeridoY;



    public static double distancia(Coodenada i, Coodenada f){
        xC=Math.abs(i.getX()-f.getX());
        yC= Math.abs(i.getY()-f.getY());
        return Math.sqrt((xC*xC)+(yC*yC));
    }

    public static double reglaDeTresCateto(double hipotenusaRequerida, double hipotenusaActual, double cateto){
        return (hipotenusaRequerida*cateto)/hipotenusaActual;
    }

    public static Coodenada getMiddlePoint(Coodenada i , Coodenada f , double hF){
        hipotenusaActual= distancia(i,f);
        catetoRequeridoX= reglaDeTresCateto(hF, hipotenusaActual, xC);
        catetoRequeridoY=reglaDeTresCateto(hF, hipotenusaActual, yC );

        return new Coodenada((i.getX()+catetoRequeridoX), i.getY()+catetoRequeridoY);
    }


    public static int encuentraPunto(Coodenada [] coodenadas){
        distanceTotal= 0;
        for( int i=0; i<coodenadas.length-1; i++){
            distanciaPuntos = distancia(coodenadas[i], coodenadas[i+1]);
            distances.put(coodenadas[i], distanciaPuntos);
            distanceTotal+=distanciaPuntos;
        }
        System.out.println(distanceTotal);
        mediumDistance= distanceTotal/2;
        for(int i=0; i<distances.size(); i++){
            distances.get(i);

        }
        return 0;
    }

    public static void main(String [] args){
        Coodenada a [] = new Coodenada [8];
        a[0]= new Coodenada(3,0);
        a[1]= new Coodenada(0,7);
        a[2]= new Coodenada(4,3);
        a[3]= new Coodenada(10,6);
        a[4]= new Coodenada(14,1);
        a[5]= new Coodenada(22,7);
        a[6]= new Coodenada(16,7);
        a[7]= new Coodenada(15,5);
        encuentraPunto(a);
    }


    static class  Coodenada{
         double x;
        double y;
        public Coodenada(double x,double y){
            this.x=x;
            this.y=y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
