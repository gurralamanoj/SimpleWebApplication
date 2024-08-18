package com.webapp.model;

import com.webapp.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor // Creates a constructor User()
@AllArgsConstructor // Creates a constructor User(Long id, String firstName, String lastName, String
					// department, long age, float salary)
@ToString
public class User {
	Long id;
	String firstName;
	String lastName;
	String department;
	Float salary;
	long age;

	public User(String firstName, String lastName, String department, long age, float salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	public User UserMapper(UserEntity userEntity) {
		this.id = userEntity.id;
		this.firstName = userEntity.firstName;
		this.lastName = userEntity.lastName;
		this.department = userEntity.department;
		this.age = userEntity.age;
		this.salary = userEntity.salary;
		return this;
	}
}
