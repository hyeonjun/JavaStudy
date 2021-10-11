package edu;

import java.util.HashSet;
import java.util.Random;

public class Test5 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		Random number = new Random();
		
		for (int i = 0; i < 6; i++) {
			int n = number.nextInt(46);
			lotto.add(n);
		}
		
		System.out.println(lotto);
		System.out.println(lotto.size());
	}
}
