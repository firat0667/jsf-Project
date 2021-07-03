package jsf_projects;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="indexBean")
@SessionScoped

public class IndexBean {
	
	private List<Person>personList;
	private Person person;
	private String name;
	private String surname;
	private String email;
	
	
	public IndexBean() {
		personList =new ArrayList();
	}

	
	
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void clickButtonAddTable() {
		person = new Person();
		person.setId(personList.size()+1);
		person.setName(name);
		person.setSurname(surname);
		person.setEmail(email);
		
		personList.add(person);
		
	}
	
}
