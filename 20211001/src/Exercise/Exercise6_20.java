package Exercise;

class Exercise6_20
{
	static int[] shuffle(int[] arr) {
		int k, l, temp;
		for (int i=0; i<arr.length; i++) {
			k = (int) (Math.random()*9);
			l = (int) (Math.random()*9);
			temp = arr[k];
			arr[k] = arr[l];
			arr[l] = temp;
		}
		return arr;
	}

	public static void main(String[] args) 
	{
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}