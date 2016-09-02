package com.addressbookdao.seeder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.addressbookdao.data.ContactDataEntry;
import com.addressbookdao.repository.AddressBookRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner{
	private AddressBookRepository addressBookRepository;
	
	@Autowired
	public DatabaseSeeder(AddressBookRepository addressBookRepository){
		this.addressBookRepository = addressBookRepository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		List<ContactDataEntry> contactDataList = new ArrayList<ContactDataEntry>();
		
		ContactDataEntry contactData1 = new ContactDataEntry("firstName1", "lastName1", "address11", "address21", "city1", "state1", "zip1", "country1");
		ContactDataEntry contactData2 = new ContactDataEntry("firstName2", "lastName2", "address12", "address22", "city2", "state2", "zip2", "country2");
		ContactDataEntry contactData3 = new ContactDataEntry("firstName3", "lastName3", "address13", "address23", "city3", "state3", "zip3", "country3");
		
		contactDataList.add(contactData1);
		contactDataList.add(contactData2);
		contactDataList.add(contactData3);
		
		this.addressBookRepository.save(contactDataList);
	}

}
