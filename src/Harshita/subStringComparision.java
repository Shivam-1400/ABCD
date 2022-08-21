package Harshita;

import java.util.Scanner;

public class subStringComparision  {

    public static String getSmallLarge(String s, int k) {
    String small = "";
    String large = "";
    small = large = s.substring(0, k);

    for (int i=1; i<s.length()-k+1; i++) {
        String substr = s.substring(i, i+k);
        if (small.compareTo(substr) > 0)
            small = substr;
        if (large.compareTo(substr) < 0)
            large = substr;
    }

    return small + "\n" + large;
}
      
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = cin.next();
        System.out.print("Enter length: ");
        int k = cin.nextInt();
        cin.close();
      
        System.out.println(getSmallLarge(s, k));
    }
}

