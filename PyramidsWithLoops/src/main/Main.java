/* Bowen Xu
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
    aaaa1     i = 1  n = 4
    aaa222    i = 2  n = 3
    aa33333   i = 3  n = 2
    a4444444  i = 4  n = 1
    555555555 i = 5  n = 0
               
              n = 5-i
*/


package main;

public class Main {

	public static void main(String[] args) {
		int lines = 5;
		int k = 0;
		for (int i = 1; i <= lines; i++) 
		{
			for (k = 0; k< lines-i; k++)
			{
				System.out.print(" ");
			}
			
				
			for (int j = 0; j < 2*i-1; j++) 
			{
				
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}

