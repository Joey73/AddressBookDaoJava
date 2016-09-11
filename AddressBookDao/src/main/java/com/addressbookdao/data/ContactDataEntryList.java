package com.addressbookdao.data;

import java.util.List;

public class ContactDataEntryList {
	private List<ContactDataEntry> contactDataEntryList;

	public ContactDataEntryList(){
	}

	public ContactDataEntryList(List<ContactDataEntry> contactDataEntryList){
		this.contactDataEntryList = contactDataEntryList;
	}

	public List<ContactDataEntry> getContactDataEntryList() {
		return contactDataEntryList;
	}

	public void setContactDataEntryList(List<ContactDataEntry> contactDataEntryList) {
		this.contactDataEntryList = contactDataEntryList;
	}

	@Override
	public String toString(){
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < this.contactDataEntryList.size(); i++){
			result.append(this.contactDataEntryList.get(i).toString());
			if(i != this.contactDataEntryList.size() - 1){
				result.append(" - ");
			}
		}
		return result.toString();
	}
}