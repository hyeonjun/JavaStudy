package Exercise;

class Exercise9_10
{
	static String format(String str, int length, int alignment) { 
		if (str.length() > length) 
			return str.substring(0, length);
		
		char[] arr = new char[length];
		for (int i=0; i<length; i++) {
			arr[i] = ' ';
		}
		
		if (alignment == 0) {
			System.arraycopy(str.toCharArray(), 0, arr, 0, str.length());
		} else if (alignment == 1) {
			System.arraycopy(str.toCharArray(), 0, arr, (length-str.length())/2, str.length());
		} else {
			System.arraycopy(str.toCharArray(), 0, arr, length-str.length(), str.length());
		}
		
		return new String(arr);
		/*	
			(1) format�޼��带 �ۼ��Ͻÿ�.
			1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
			2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
			3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�.
			   (System.arraycopy()���)
			4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
		*/
	}

	public static void main(String[] args) {
		String str = "������";

		System.out.println(format(str,7,0)); // ���� ����
		System.out.println(format(str,7,1)); // ��� ����
		System.out.println(format(str,7,2)); // ������ ����
	}
}
