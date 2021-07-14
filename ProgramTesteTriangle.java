package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTesteTriangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Classe instanciada
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the measures of triangle Y");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        //Chamada do método área.
        double areaX = x.area();
        double areaY = y.area();

        scan.close();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Triangle with larger area: X");
        } else{
            System.out.println("Triangle with larger area: Y");

        }






    }
}
