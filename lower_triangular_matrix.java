package array2d;
import java.util.Scanner;

public class lower_triangular_matrix {
	public static void main(String[] args) {  
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of row");
		int r= scan.nextInt();
		System.out.println("enter the size of colomn");
		int c= scan.nextInt();
		int count1=0, count2=0;
		int size = c*r;
		int[][] arr = new int[r][c];
		System.out.println("enter the an array element");
		for(int i=0; i<r; i++)
		{
		for(int j=0;j<c;j++)
		{
		arr[i][j] = scan.nextInt();
		}
		}
		for(int i=0; i<r; i++)
		{
		for(int j=0; j<c; j++)
		{
		System.out.print(arr[i][j]+" ");

		}
		System.out.println();
		}
		for(int i = 0; i < r; i++)
		       {  
		           for(int j = 0; j < c; j++)
		           {  
		               if(arr[i][j]%2==0) {  
		                   count1++;  
		               }
		               else
		               {
		            count2++;
		               }
		           }
		       }
		System.out.println("even numbers in matrix are::"+count1);
		System.out.println("odd numbers in matrix are::"+count2);
		}

	
	

}
