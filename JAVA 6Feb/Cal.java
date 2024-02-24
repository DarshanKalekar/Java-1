class Cal1
{
    public static int add(int a, int b) {
        return( a + b);
    }
	   public static int subtract(int a, int b) {
        return( a - b);
    }
	public static int multiply(int a, int b) {
        return( a * b);
    }
   }
 class Cal
{
    public static void main(String[] args) 
    {
        int num1 = 20;
        int num2 = 10;
        
        System.out.println("Addition: " + Cal1.add(num1, num2));
        System.out.println("Subtraction: " + Cal1.subtract(num1, num2));
        System.out.println("Multiplication: " + Cal1.multiply(num1, num2));
  }
}