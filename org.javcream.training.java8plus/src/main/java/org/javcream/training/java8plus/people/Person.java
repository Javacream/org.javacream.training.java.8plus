package org.javcream.training.java8plus.people;

import java.util.Optional;

public class Person implements AddressProvider, Addressable{

	private String lastname;
	private String firstname;
	private Optional<Address> address;
	
	public Address getAddress() {
//		if (address.isPresent()) {
//			return address.get();
//		}else{
//			return Address.NullAddress
//		}
		
		return address.map(a -> a).orElse(Address.NullAddress);
	}
	public void setAddress(Optional<Address> address) {
		this.address = address;
	}
	public Person(String lastname, String firstname, Address address) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = Optional.of(address);
	
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [lastname=" + lastname + ", firstname=" + firstname + "]";
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String getCity() {
		return AddressProvider.super.getStreet() + Addressable.super.getCity();
	}
}
