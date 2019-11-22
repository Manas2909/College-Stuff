package prac2.mono;
import java.util.*;
public class mono_alpha {
	 public static char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z' };
     public static char q[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
            'V', 'B', 'N', 'M' };
 
    public static String encrypt(String s)
    {
    	System.out.println(s);
        String res = "";
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
            	if (p[j] == s.charAt(i))
                {
                    res += q[j];
                    break;
                }
            }
        }
        return (res);
    }
 
    public static String decrypt(String s)
    {
        char c1[] = new char[(s.length())];
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 0; j < 26; j++)
            {
                if (q[j] == s.charAt(i))
                {
                    c1[i] = p[j];
                    break;
                }
            }
        }
        return (new String(c1));
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your string");
		Scanner sc=new Scanner(System.in);
		String en = encrypt(sc.nextLine().toLowerCase());
        System.out.println("Encrypted message: " + en);
        System.out.println("Decrypted message: " + decrypt(en));
        sc.close();
	}

}
