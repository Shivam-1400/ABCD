package Mst;

import java.util.*;

public class MstQ1 {

public static int mergeArray(int a[],int b[]){

int c[]=new int[5]; int k=0,sum=0;

for (int i=0;i<4;i++)

{for(int j=0;j<4;j++)

{

if(a[i]==b[j])

{

c[k]=a[i];

k++;

}

}

}

for(int i=0;i<k;i++)

{

sum+=c[i];

}

return sum;

}

public static void main(String[] args) {

int[] a={1,2,3,4};

int[] b={3,4,5,6};

System.out.println(mergeArray(a,b));

}

}