package stepen;

import java.util.Scanner;

public class Stepeni {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, n;
		System.out.println("Dp brojot: ");
		n=input.nextInt();
		i=1;
		while(i <=n)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
			i=i+1;
		}
}
}
		
	