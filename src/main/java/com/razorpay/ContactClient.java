package com.razorpay;

import java.util.List;

import org.json.JSONObject;

public class ContactClient extends ApiClient {

	ContactClient(String auth) {
		super(auth);
	}

	public Contact create(JSONObject request) throws RazorpayException {
		Contact contact = post(Constants.CONTACT_CREATE, request);
		return contact;
	}

	public List<Contact> fetchAll(JSONObject request) throws RazorpayException {
		return getCollection(Constants.CONTACT_LIST, request);
	}

	public List<Contact> fetchAll() throws RazorpayException {
		return fetchAll(null);
	}

	public Contact fetch(String id) throws RazorpayException {
		return get(String.format(Constants.CONTACT_GET, id), null);
	}

	public Contact edit(String id, JSONObject request) throws RazorpayException {
		return patch(String.format(Constants.CONTACT_EDIT, id), request);
	}

}
