class multbytwo
{
	public static void main(String[] args)
	{
		int i,num=0xffffffe;
		for(i=0;i<4;i++)
		{
			num=num<<1;
			System.out.println(num);
		}	
	}

}