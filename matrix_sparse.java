package array2d;
import java.util.Scanner;

public class matrix_sparse {
	public static void main(String[] args) {  
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of row");
		int r= scan.nextInt();
		System.out.println("enter the size of colomn");
		int c= scan.nextInt();
		int count=0;
		int size = c*r;
		int[][] arr = new int[r][c];
		System.out.println("enter the 1st array element");
		for(int i=0; i<r; i++)
		{
		for(int j=0;j<c;j++)
		{
		arr[i][j] = scan.nextInt();
		}
		}
		       for(int i = 0; i < r; i++)
		       {  
		           for(int j = 0; j < c; j++)
		           {  
		               if(arr[i][j] == 0)  
		                   count++;  
		               }  
		           }  
		             
		       if(count > (size/2)) {  
		           System.out.println("Given matrix is a sparse matrix");
		       }
		       else  
		           System.out.println("Given matrix is not a sparse matrix");  
		   }  


}
