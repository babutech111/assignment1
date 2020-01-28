package learning1;

import java.util.StringTokenizer;


public class Test1 {

	public static void main(String[] args) {

		System.out.println("hello");
	
		
		StringTokenizer st = new StringTokenizer("hello,welcome");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken(","));
		}
		
		
		System.out.println("=====");
        System.out.println(st.countTokens());		
		//split demo
		
		String s1="hello,welcome";
		String a[]=s1.split("e");
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
				
	}

}
