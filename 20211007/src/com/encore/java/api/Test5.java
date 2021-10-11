package com.encore.java.api;

// Wrapper 클래스
// Boxing : Wrapper.valueOf() => 기본->참조
// UnBoxing : 참조.타입value() => 참조->기본
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true;
		byte b = 12;
		char c = 'A';
		double d = 3.14;
		float f = 10.5f;
		int i = 123;
		long l = 123456789;
		short s = 256;
		
		// Boxing
		Boolean obj1 = Boolean.valueOf(bool);
		Byte obj2 = Byte.valueOf(b);
		Character obj3 = Character.valueOf(c);
		Double obj4 = Double.valueOf(d);
		Float obj5 = Float.valueOf(f);
		Integer obj6 = Integer.valueOf(i);
		Long obj7 = Long.valueOf(l);
		Short obj8 = Short.valueOf(s);
		
		// UnBoxing
		boolean bool2 = obj1.booleanValue();
		byte b2 = obj2.byteValue();
		char c2 = obj3.charValue();
		double d2 = obj4.doubleValue();
		float f2 = obj5.floatValue();
		int i2 = obj6.intValue();
		long l2 = obj7.longValue();
		short s2 = obj8.shortValue();
		
		// auto Boxing - valueof나 타입Value를 사용하지않아도 가능하다.
		int n1 = 10;
		Integer obj9 = n1;
		
		Integer obj10 = new Integer("20");
		int n2 = obj10;
		
		Integer obj11 = 30;
		int n3 = obj11 + 40;
		
		boolean boole = Boolean.parseBoolean("true");
		byte b3 = Byte.parseByte("12");
		double d3 = Double.parseDouble("12.5");
		float f3 = Float.parseFloat("12.5f");
		int i3 = Integer.parseInt("123");
		
	}

}
