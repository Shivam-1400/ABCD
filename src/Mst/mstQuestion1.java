package Mst;

import java.util.Scanner;

class Matrix {

    int row;

    int col;

    int[][] a;

    

    public Matrix(int r, int c)

    {

        row = r;

        col = c;

        a = new int[row][col];

    }

    

    public int getrow()

    {

        return row;

    }

    public int getcol()

    {

        return col;

    }
    public int[][] getMatrix()

    {

        return a;

    }

    public int getelement(int r, int c)

    {

        return a[r][c];

    }

    public void setelement(int r, int c, int value)

    {

        a[r][c] = value;

    }

    public static Matrix add(Matrix a, Matrix b)

    {

        if((a.row != b.row) || (a.col != b.col))

        {

          System.out.println("Matrices can not be added");

          return new Matrix(0,0);

        }

        else

        {

          Matrix m = new Matrix(a.row,a.col);

          for(int i = 0;i<m.row;i++)

          {

            for(int j = 0;j<m.col;j++)

            {

              m.setelement(i,j,(a.getelement(i,j)+b.getelement(i,j)));

            }

          }

          return m;

        }

    }

    public static Matrix mult(Matrix a, Matrix b)

    {

      Matrix m = new Matrix(a.row,b.col);

      for(int i = 0;i<a.row;i++)

      {

        for(int j = 0;j<b.col;j++)

        {

          int s = 0;

          for(int k = 0;k<a.col;k++)

          {

            s = s+(a.getelement(i,k)*b.getelement(k,j));

            

          }

          m.setelement(i,j,s);

        }

      }

    

      return m;

    }

    

    public static void printmat(Matrix A)

    {

    

        for(int i = 0;i<A.row;i++)

        {

            for(int j = 0;j<A.col;j++)

            {

              System.out.print(A.a[i][j]+" ");

            }

            System.out.println("");

         }

    }

}
public class mstQuestion1 {
	public static void main(String args[]) {
		System.out.print("Enter row and col of matrix A: ");
		int Ar, Ac;
		Ar= new Scanner(System.in).nextInt();
		Ac= new Scanner(System.in).nextInt();
		Matrix A= new Matrix(Ar, Ac);
		for(int i=0; i< A.a.length; i++) {
			for(int j=0; j< A.a[1].length; j++) {
				System.out.print("Enter element A["+i+"]["+j+"]: ");
				int a= new Scanner(System.in).nextInt();
				A.setelement(i, j, a);
			}
		}
		for(int i=0; i< A.a.length; i++) {
			for(int j=0; j< A.a[1].length; j++) {
				System.out.print( A.getelement(i, j)+ " ");
			}System.out.println();
		}
		
		System.out.print("Enter row and col of matrix B: ");
		int Br, Bc;
		Br= new Scanner(System.in).nextInt();
		Bc= new Scanner(System.in).nextInt();
		Matrix B= new Matrix(Br, Bc);
		for(int i=0; i< B.a.length; i++) {
			for(int j=0; j< B.a[1].length; j++) {
				System.out.print("Enter element B"+i+"]["+j+"]: ");
				int a= new Scanner(System.in).nextInt();
				B.setelement(i, j, a);
			}
		}
		for(int i=0; i< B.a.length; i++) {
			for(int j=0; j< B.a[1].length; j++) {
				System.out.print( B.getelement(i, j)+ " ");
			}System.out.println();
		}
		
		Matrix sumMatrix= Matrix.add(A, B);
		System.out.println("Sum of matrix A and B: ");
		Matrix.printmat(sumMatrix);
		
		Matrix proMatrix= Matrix.mult(A, B);
		System.out.println("Product of matrix A and B: ");
		Matrix.printmat(proMatrix);
	}

}
