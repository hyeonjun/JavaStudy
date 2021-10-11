package Exercise;

class Exercise6_19
{
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) 
	{
		String str = "ABC123";
		System.out.println(str); // ABC123
		change(str);
		System.out.println("After change:"+str); // After change:ABC123 	
	}
}
