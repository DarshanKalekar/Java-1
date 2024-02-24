class Base
{
      private int  x;
      public void  setX(int x)
      {
	   this. x = x;
       }
      public int getX( )
      {
                       return(x);
       }
}
class Derived extends Base
{
         private  int  y;
          public void setY(int y)
         {
	            this.y = y;
          }
          public int getY( )
           {
                          return(y);
            }
}
class Test
{
         public static void main(String args[])
            {
	Derived dobj  =  new Derived( );
	dobj.setX(10);
	dobj.setY(10);	
	int result = dobj.getX( )  *  dobj .getY( );
	System.out.println(result);
            }
}