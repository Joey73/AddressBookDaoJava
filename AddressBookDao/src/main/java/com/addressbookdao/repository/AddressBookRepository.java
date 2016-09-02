package com.addressbookdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressbookdao.data.ContactDataEntry;

@Repository
public interface AddressBookRepository extends JpaRepository<ContactDataEntry, Long>{

}
