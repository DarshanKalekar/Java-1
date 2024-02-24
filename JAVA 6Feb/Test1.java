class Base 
{
        	public int calc( int x, int y)
  	{
		System.out.println("BASE");
	     	return(x+y);
	}
}
class Derived extends Base
{
  	public int calc(int x, int y)
	{
		super.calc(10,20);
		System.out.println("DERIVED");
		return(x-y);
	}
}
class Test1
{
  	public static void main(String args[ ])
	{
		/* 
		Derived dobj  =  new Derived( );
		//int result  =  dobj.calc(10,20);
		int result  =  dobj.calc(10,20);
 		System.out.println(result);

             		/*
		Base bobj  =  new Derived( );
		int result  = bobj.calc(10,20);
		System.out.println(result);
		*/
		Derived dobj  =  new Base();
		//int result  =  dobj1.calc( );
 		System.out.println(result);
 	}
}