import java.util.*;
class Pan
{
 public static void main(String[] args) 
 {
  Scanner scn=new Scanner(System.in);
  int t=scn.nextInt();
  String s[]=new String[t];
  boolean output[]=new boolean[t];
  for(int i=0; i<s.length;i++)
  {
   s[i]=scn.next();
   boolean ss=s[i].matches("[A-Z]{5}\\d{4}[A-Z]{1}");
   output[i]=ss;
  }
  for(boolean b:output)
  {
   System.out.println(b);
  }
 }
}
