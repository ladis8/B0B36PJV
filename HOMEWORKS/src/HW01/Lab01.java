package HW01;

/**
 * Created by ladislav on 10/03/17.
 */

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab01 {

    private Scanner sc;
    private DecimalFormat df;

    public void start(String[] args) {
        homework();
    }

    private void homework (){
        double a,b;
        int c;

        sc = new Scanner(System.in);
        System.out.printf("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):\n");
        switch (sc.nextInt()){
            case 1:

                System.out.printf("Zadej scitanec: \n");
                a = sc.nextDouble();
                System.out.printf("Zadej scitanec: \n");
                b = sc.nextDouble();

                System.out.printf("Zadej pocet desetinnych mist: \n");
                c = sc.nextInt();
                if (c <0){
                    System.out.println("Chyba - musi byt zadane kladne cislo!");
                    break;
                }

                df = new DecimalFormat();
                df.setMinimumFractionDigits(c);
                df.setMaximumFractionDigits(c);
                df.setGroupingUsed(false);
                System.out.printf("%s + %s = %s\n", df.format(a),df.format(b),df.format(a+b));
                break;
            case 2:

                System.out.printf("Zadej mensenec: \n");
                a = sc.nextDouble();
                System.out.printf("Zadej mensitel: \n");
                b = sc.nextDouble();

                System.out.printf("Zadej pocet desetinnych mist: \n");
                c = sc.nextInt();
                if (c <0){
                    System.out.println("Chyba - musi byt zadane kladne cislo!");
                    break;
                }

                df = new DecimalFormat();
                df.setMinimumFractionDigits(c);
                df.setMaximumFractionDigits(c);
                df.setGroupingUsed(false);
                System.out.printf("%s - %s = %s\n", df.format(a),df.format(b),df.format(a-b));
                break;
            case 3:
                System.out.printf("Zadej cinitel: \n");
                a = sc.nextDouble();
                System.out.printf("Zadej cinitel: \n");
                b = sc.nextDouble();
                System.out.printf("Zadej pocet desetinnych mist: \n");
                c = sc.nextInt();
                if (c <0){
                    System.out.println("Chyba - musi byt zadane kladne cislo!");
                    break;
                }

                df = new DecimalFormat();
                df.setMinimumFractionDigits(c);
                df.setMaximumFractionDigits(c);
                df.setGroupingUsed(false);
                System.out.printf("%s * %s = %s\n", df.format(a),df.format(b),df.format(a*b));
                break;
            case 4:

                System.out.printf("Zadej delenec: \n");
                a = sc.nextDouble();
                System.out.printf("Zadej delitel: \n");
                String d =sc.next();

                if (d.equals("0")){
                    System.out.println("Pokus o deleni nulou!");
                    break;
                }
                else{
                    b = Double.parseDouble(d);
                }
                System.out.printf("Zadej pocet desetinnych mist: \n");
                BigDecimal a1, b1, o;
                a1 = new BigDecimal(a);
                b1 = new BigDecimal(b);
                o = new BigDecimal (a1.toString());
                o=o.divide(b1);
                c = sc.nextInt();
                if (c <0){
                    System.out.println("Chyba - musi byt zadane kladne cislo!");
                    break;
                }

                df = new DecimalFormat();
                df.setMinimumFractionDigits(c);
                df.setMaximumFractionDigits(c);
                df.setGroupingUsed(false);
                System.out.printf("%s / %s = %s\n", df.format(a1),df.format(b1),df.format(o));
                break;
            default:
                System.out.println("Chybna volba!");

        }
    }

    private double round(double value, int decimalPlaces)
    {
        double shift = Math.pow(10,decimalPlaces);
        return Math.round(value*shift)/shift;
    }
}
