package prac1.ascii;
import java.util.*;
public class encrypt {
	//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		System.out.println("the string is :"+str1);
		System.out.println("enter your key");
		int key= sc.nextInt();
		System.out.println("the key is :"+key);
		
		String cypher="";
		String decypher="";
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isUpperCase(str1.charAt(i)))
			{
				int x=str1.charAt(i);
				int y=((x-65)+key)%26+65;
				cypher+=(char)y;
			}
			else if(Character.isLowerCase(str1.charAt(i)))
			{
				
				int x=str1.charAt(i);
				int y=((x-97)+key)%26+97;
				cypher+=(char)y;
			}
		}
		System.out.println("encrypt string is: "+cypher);
		for(int i=0;i<cypher.length();i++)
		{
			if(Character.isUpperCase(cypher.charAt(i)))
			{
				int x=cypher.charAt(i);
				if(((x-65)-key)>=0)
				{
					int y=((x-65)-key)%26+65;
					decypher+=(char)y;
				}
				else if(((x-65)-key<0))
				{
					int y=(26+((x-65)-key))%26+65;
					decypher+=(char)y;
				}
				
			}
			else if(Character.isLowerCase(cypher.charAt(i)))
			{
				
				int x=cypher.charAt(i);
				if(((x-97)-key)>=0)
				{
					int y=((x-97)-key)%26+97;
					decypher+=(char)y;
				}
				else if(((x-97)-key<0))
				{
					int y=(26+((x-97)-key))%26+97;
					decypher+=(char)y;
				}
			}
		}
		System.out.println("de-crypted string is: "+decypher);
		
	
		/*char[] c = new char[26];
		for(int i=97; i<123; i++)
		{
			c[i-97] = (char) i;
			System.out.println((i-97)+" : "+c[i-97]);
		}
		System.out.println("char array is: "+Arrays.toString(c));
		
		/*
		Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    List<Character> shuffled = Arrays.asList(letters);
	    Collections.shuffle(shuffled);
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < shuffled.size(); i++) {
	      sb.append(shuffled.get(i));
	    }
	    
	    System.out.println("shuffled array is: "+sb);
	    */
	   	}
	

}
