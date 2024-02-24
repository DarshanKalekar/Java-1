class Number{
	int x;
	int y;
	
              public int add(int x,  int y) {
                      return(x+y);
                }

             public double add(double x,double  y) {
                    return(x-y);
               }
         
             public float add(float x, float y) {
                    return(x*y);
             }
}
class Cons
{
      	public static void main(String args[ ])
                         {
          
                         Number num1 = new Number( );
                          num1.add(10,20);
                                                               


                        }
}