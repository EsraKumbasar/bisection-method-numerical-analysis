package Deneme;
import java.math.*;
import java.util.Scanner;

class Bisection {
    static double func(double x){
        return Math.exp(x) * Math.sin(x) - Math.pow(x,2) - 2;
    }

    public static void main(String[] args) {
        int i = 0;
        double altdeger, ustdeger, c = 0, deger1, deger2, deger;
        final double HATA = 0.0001;
        Scanner input = new Scanner(System.in);
        System.out.println("Alt deger = ");
        altdeger = input.nextDouble();
        System.out.println("Ust deger = ");
        ustdeger = input.nextDouble();


        deger1 = func(altdeger);
        deger2 = func(ustdeger);

        if(deger1 * deger2 < 0){
            do{
                c = (altdeger + ustdeger) / 2;
                deger = func(c);
                if(deger1 * deger < 0){
                    ustdeger = c;
                    deger2 = deger;
                }else{
                    altdeger = c;
                    deger1 = deger;
                }
                i++;
                System.out.println(i + ".iterasyondeki deger= " + c);

            }while (Math.abs(deger) > HATA);

        }

    }

}
