package ch09.test3.exam;

public class BeanFactory {
	public Object getBean(String name) { // factory method
		Object obj = null;
		if (name.equals("samsung")) {
			obj = new SamsungTV();
		} else if(name.equals("lg")) {
			obj = new LgTV();
		}
		return obj;
	}
}
