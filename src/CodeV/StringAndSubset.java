package CodeV;

import java.util.Scanner;

public class StringAndSubset {
	
	public static void subset(String s[], int rank, int N)
	{
		int currentRank=0;
		for(int len=0; len<=N ;len++)
		{
			if(len==0)
			{
				currentRank++;
				continue;
			}
			for(int j=0;j<=N-len;j++)
			{
				currentRank++;
				String st = "";
				for(int k=j;k<(j+len);k++)
				{
					st+=s[k];
					if(k!=j+len-1)
						st+=",";
				}
				if(currentRank==rank)
				{
					System.out.println(st);
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N,R;
		
		N = sc.nextInt();
		R = sc.nextInt();
		
		String str[];
		sc.nextLine();
		str = sc.nextLine().split(",");
		
		StringAndSubset.subset(str, R, str.length);
	}
}
