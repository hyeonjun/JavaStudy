package edu;

import java.util.HashSet;
import java.util.Iterator;

public class User {
	String ssn;
	String name;
	public User(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [ssn="+ssn+", name="+name+"]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(ssn);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		User u = (User)obj;
		if (this.ssn.equals(u.ssn)) {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		User u1 = new User("123", "±èÇª¸§");
		User u2 = new User("123", "±èÇª¸§");
		
		HashSet<User> users = new HashSet<User>();
		users.add(u1);
		users.add(u2);
		
		System.out.println(users);
		
		Iterator<User> iter = users.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
