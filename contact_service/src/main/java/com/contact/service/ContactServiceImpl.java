package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	List<Contact> list = List.of(new Contact(1L,"Aditya@gmail.com","Aditya",1111L),
			new Contact(2L,"Mudar@gmail.com","Mudar",2222L),
			new Contact(3L,"Ram@gmail.com","Ram",3333L));
	
	@Override
	public List<Contact> getContactofUser(Long userId) {

		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

	@Override
	public List<Contact> getAllContact() {
		return list;
	}

	
}
