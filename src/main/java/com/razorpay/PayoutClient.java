package com.razorpay;

import java.util.List;

import org.json.JSONObject;

public class PayoutClient extends ApiClient {

	PayoutClient(String auth) {
		super(auth);
	}

	public Payout create(JSONObject request) throws RazorpayException {
		Payout payout = post(Constants.PAYOUT_CREATE, request);
		return payout;
	}

	public List<Payout> fetchAll(JSONObject request) throws RazorpayException {
		return getCollection(Constants.PAYOUT_LIST, request);
	}

	public List<Payout> fetchAll() throws RazorpayException {
		return fetchAll(null);
	}

	public Payout fetch(String id) throws RazorpayException {
		return get(String.format(Constants.PAYOUT_GET, id), null);
	}


}
