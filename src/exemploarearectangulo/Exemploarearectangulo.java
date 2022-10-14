/**
 * @version 1.0
 */
package exemploarearectangulo;

import java.util.Scanner;


public class Exemploarearectangulo {

    public static void main(String[] args) {
        //proxecto que calcula o area dun rectangulo de base=2 e altura=5
        float base , altura ;//son variable locales
        Scanner obxScaner = new Scanner(System.in);//instanciando un obxeto de tipo scanner
        System.out.println("teclea base");
        base=obxScaner.nextFloat();
        System.out.println("teclea altura");
        altura=obxScaner.nextFloat();
        float area=base*altura;
        System.out.println("o area ="+area);
    }
    
}
