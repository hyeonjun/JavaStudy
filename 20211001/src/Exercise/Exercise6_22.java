package Exercise;

class Exercise6_22
{
	public static boolean isNumber(String str) {
		boolean flag = true;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) > '9' || str.charAt(i) < '0') {
				flag = false;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) 
	{
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));		

		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));		
	}
}
