package com.cts.userlog.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.userlog.user.User;

@Service
public class UserServices {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;

	static {
		users.add(new User(1, "surendra", new Date()));
		users.add(new User(2, "rajesh", new Date()));
		users.add(new User(3, "suresh", new Date()));
	}

	public List<User> getUsers() {

		return users;
	}

	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;

	}

	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				System.out.println(id);
				
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
