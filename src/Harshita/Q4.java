package Harshita;

import java.math.RoundingMode;
import java.math.BigDecimal;
import java.util.Scanner;

public class Q4 {



  public static void main(String[] args) {



    Scanner input = new Scanner(System.in);



    double a = 4.567;   int b= 2;

    System.out.println("float value : " + a);



    BigDecimal bd = new BigDecimal(a).setScale(b, RoundingMode.HALF_UP);

    float newInput = bd.floatValue();



    System.out.println("after rounding to "+ b+ " decimal places : " + newInput);



  }

}