package Exercise;

public class Exercise9_11 {

	public static void main(String[] args) {
		int s = Integer.parseInt(args[0]), e = Integer.parseInt(args[1]);
		
		for (int i=s; i<e+1; i++) {
			for (int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
}
