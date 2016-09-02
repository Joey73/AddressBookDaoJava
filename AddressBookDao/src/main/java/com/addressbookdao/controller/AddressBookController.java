package com.addressbookdao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.addressbookdao.data.ContactDataEntry;
import com.addressbookdao.data.ContactDataEntryList;
import com.addressbookdao.repository.AddressBookRepository;

@RestController
@RequestMapping("/contacts")
public class AddressBookController {
	private AddressBookRepository addressBookRepository;
	
	public AddressBookController() {
	}
	
	@Autowired
	public AddressBookController(AddressBookRepository addressBookRepository){
		this.addressBookRepository = addressBookRepository;
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public ContactDataEntryList getAllContacts(){
		ContactDataEntryList contactDataEntryList = new ContactDataEntryList();
		contactDataEntryList.setContactDataEntryList(this.addressBookRepository.findAll());
		return contactDataEntryList;
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public ContactDataEntry getContact(@PathVariable Long id){
		return this.addressBookRepository.findOne(id);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ContactDataEntry addContact(@RequestBody ContactDataEntry contactDataEntry){
		return this.addressBookRepository.save(contactDataEntry);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public void deleteContact(@PathVariable Long id){
		this.addressBookRepository.delete(id);
	}
}
