class Return
{
	public static void main(String[] args)
	{
		boolean t=true;
		System.out.println("before the return");
		if (t) return;
		System.out.println("this won't execute");
	}

}