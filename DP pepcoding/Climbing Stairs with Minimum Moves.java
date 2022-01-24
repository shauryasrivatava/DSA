import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}

		Integer dp[]=new Integer[n+1];
		dp[n]=0;

		for(int i=n-1;i>=0;i--){
		int min=Integer.MAX_VALUE;
		   for(int j=1;j<=arr[i] && i+j<dp.length;j++){
		      if(dp[i+j]!=null){
		        min=Math.min(dp[i+j],min);}
		   }
		   if(min!=Integer.MAX_VALUE){
    	           	dp[i]= min+1;}
		}
    //PRINTING THE DP array
		//for(Integer i: dp){
		//    if(i!=null)
		//       System.out.print(i+" ");
		//}
    // PRINTING the ans
    System.out.print(dp[0]);
	}
}
