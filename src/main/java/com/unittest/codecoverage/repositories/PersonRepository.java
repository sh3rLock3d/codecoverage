package com.unittest.codecoverage.repositories;

import java.util.ArrayList;
import java.util.Objects;

import com.unittest.codecoverage.models.Person;

public class PersonRepository {
	private ArrayList<Person> repo = new ArrayList<>();

	public Person insert(Person person) {
		Objects.requireNonNull(person, "person can't be null");
		repo.add(person);
		return person;
	}
	
	public void update(Person person) {	
		Objects.requireNonNull(person, "person can't be null");
		for(int i = 0; i < repo.size();i++){
			if (repo.get(i).getName().equals(person.getName())){
				repo.remove(i);
				repo.add(person);
				return;
			}
		}
	}
	
	public void delete(String name) {	
		Objects.requireNonNull(name, "name can't be null");
		for(int i = 0; i < repo.size();i++){
			if (repo.get(i).getName().equals(name)){
				repo.remove(i);
				return;
			}
		}
	}
	
	public Person get(String name) {
		Objects.requireNonNull(name, "name can't be null");
		for(int i = 0; i < repo.size();i++){
			if (repo.get(i).getName().equals(name)){
				return repo.get(i);
			}
		}
		return null;
	}

}
