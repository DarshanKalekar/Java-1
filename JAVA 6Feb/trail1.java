import java.util.Scanner;
class whole
{
 	public static void main (Using arg[])
 {
 	 Byte b1;
         Short sh1;
	
               Scanner scin=new Scanner(System.in);
	       System.out.println("Byte value for b1 range 0.265");
               b1=scin.nextByte();
               sh1=scin.nextShort();
   	       b1++;
               sh1--;

               b1=b1+sh1;
	       sh1=b1-sh1;
	       b1=b1-sh1; 	
	      System.out.println("b1="+b1);
              System.out.println("sh1="+sh1);


	
   }
 }