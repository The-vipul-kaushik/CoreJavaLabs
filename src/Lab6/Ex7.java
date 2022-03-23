package Lab6;

import java.util.Arrays;

public class Ex7 {
	
	public static int[] getSorted(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			String s = String.valueOf(a[i]);           //typecast to string
			StringBuffer str = new StringBuffer(s);    //string to sringBuffer to use reverse()
			str.reverse();
			s = str.toString();                        //stringBuffer to string
			a[i] = Integer.parseInt(s);                //string to int
		}
		
		Arrays.sort(a);
		return a;
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {123,234,345,456,567};
		
		arr = Ex7.getSorted(arr);
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}
