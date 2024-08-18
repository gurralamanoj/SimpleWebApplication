package com.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity
public class UserEntity {
	@Id
	public Long id;
	public String firstName;
	public String lastName;
	public String department;
	public Float salary;
	public long age;

	public UserEntity(long id, String firstName, String lastName, String department, long age, float salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}
}
