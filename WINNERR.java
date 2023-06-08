/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
	    int i = in.nextInt();
	    for(i=i;i>0;i--){
	        if(!in.hasNext())break;
	        int Pa = in.nextInt();
	        int Pb = in.nextInt();
	        int Qa = in.nextInt();
	        int Qb = in.nextInt();
	        int minq = Math.max(Qa,Qb);
	        int minp = Math.max(Pa,Pb);
	        if(minq>minp){
	            System.out.println("P");
	            
	        }
	        if(minp>minq){
	            System.out.println("Q");
	            
	        }
	        if(minp==minq){
	            System.out.println("Tie");
	            
	        }
	    }
		
	}
}


output:
4
5 10 2 12
P
10 30 15 15
Q
20 8 4 20
Tie
6 6 6 6
Tie