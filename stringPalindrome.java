public class stringPalindrome
{
	public static void main(String[] args)
	{
     String x = "madam";

     StringBuffer sb = new StringBuffer(x);

     String y = sb.reverse().toString();

     if(x.equals(y))
     {
     	System.out.println("\n\n\n\"Madam\" is a Palindromic Word.");
     }
     else
     {
     	System.out.println("\n\n\n\"Madam\" is not a Palindromic Word.");
     }


     String a = "sir";

     StringBuffer sb1 = new StringBuffer(a);

     String b = sb1.reverse().toString();

     if(a.equals(b))
     {
     	System.out.println("\n\n\n\"Sir\" is a Palindromic Word.");
     }
     else
     {
     	System.out.println("\n\n\n\"Sir\" is not a Palindromic Word.");
     }
	}
}