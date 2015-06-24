package models;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints;

public class User {
	@Constraints.Required
	public String userName;
	@Constraints.Required
	public String firstName;
	public String middleInitial;
	@Constraints.Required
	public String lastName;
	@Constraints.Required
	public String email;
	@Constraints.Required
	public String phone;
	@Constraints.Required
	public boolean active;
	@Constraints.Required
	public boolean usPerson;
	public String additionalInfo;
	
	public User() {}
	
	public User(String userName, String firstName, String middleInitial,
			String lastName, String email, String phone, boolean active,
			boolean usPerson, String additionalInfo) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.active = active;
		this.usPerson = usPerson;
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		return userName+" - "+firstName+" "+lastName;
	}
	
	private static List<User> users = new ArrayList<User>();
	
	static {
    	users.add(new User("mlewis","Mark","C","Lewis","mclewis@swri.edu","x2449",true,true,""));
    	users.add(new User("llacher","Lisa","L","Lacher","llcaher@swri.edu","x2449",true,true,""));
    	users.add(new User("mjustice","Matt","","Justice","mjustice@swri.edu","x2449",true,true,""));
    	users.add(new User("jballew","Jordan","","Ballew","jballew@swri.edu","x2449",true,true,""));
    	users.add(new User("rthorpe","Rob","","Thorpe","rthorpe@swri.edu","x2449",true,true,""));
	}
	
	public static List<User> fetchUsers() {
		return new ArrayList<User>(users);
	}
	
	public static User fetchByUserName(String uname) {
		for(User u:users) if(u.userName.equals(uname)) return u;
		return null;
	}
	
	public static List<User> fetchByName(String name) {
		List<User> ret = new ArrayList<User>();
		for(User u:users) if(u.firstName.contains(name) || u.lastName.contains(name)) ret.add(u);
		return ret;
	}
	
	public static boolean remove(User user) {
		return users.remove(user);
	}
	
	public void save() {
		users.remove(fetchByUserName(userName));
		users.add(this);
	}
}
