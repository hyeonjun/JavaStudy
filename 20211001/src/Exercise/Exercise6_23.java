package Exercise;

class Exercise6_23
{
	public static int max(int[] arr) {
		
		
		if (arr == null || arr.length == 0) {
			return -999999;
		}
		
		int v = arr[0];
		for (int i =1; i<arr.length; i++) {
			v = (arr[i] > v) ? arr[i] : v;
		}
		
		return v; 
	}

	public static void main(String[] args) 
	{
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪:"+max(data));
		System.out.println("�ִ밪:"+max(null));
		System.out.println("�ִ밪:"+max(new int[]{})); // ũ�Ⱑ 0�� �迭
	}
}
