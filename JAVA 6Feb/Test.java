class Base
{
      private int  x;
      /* Base (int x)
       {
                      this.x = x;
       }*/ 
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
         protected  int  y;
        Derived (int x1,  int y1)
         {
	         //   this.y = y;
                            //super.x = x1;
                            super(x);
                           this.y  = y;
          }
          public  void setY(int y)
         {
               this
          public int getY( )
           {
                          return(y);
            }
}
/*class Derived1 extends Derived
{
         private  int result;
         public int calcResult( )
           {
            	result   =  x*y ;
	return (result);
            }
            public void setXY(int  x, int  y)
          {
           //super.setX(x) 
          //super.setY(y)
          super.x  =  x;
          super.y =  y;
          }   
	
}*/	 	
class Test
{
         public static void main(String args[])
            {
	Derived dobj  =  new Derived(25 );
                    System.out.println(dobj.getX( ));
                    System.out.println(dobj.getY( ));
	//dobj.setXY(10,20);	
	//int x1  = dobj.x;
                   //dobj.x = 100;
                   // System.out.println(dobj. calcResult());
            }
}