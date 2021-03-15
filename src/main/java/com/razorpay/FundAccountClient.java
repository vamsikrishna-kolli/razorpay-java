package com.razorpay;

import java.util.List;

import org.json.JSONObject;

public class FundAccountClient extends ApiClient {

	FundAccountClient(String auth) {
		super(auth);
	}

	public FundAccount create(JSONObject request) throws RazorpayException {
		FundAccount fundAccount = post(Constants.FUNDACCOUNT_CREATE, request);
		return fundAccount;
	}

	public List<FundAccount> fetchAll(JSONObject request) throws RazorpayException {
		return getCollection(Constants.FUNDACCOUNT_LIST, request);
	}

	public List<FundAccount> fetchAll() throws RazorpayException {
		return fetchAll(null);
	}

	public FundAccount fetch(String id) throws RazorpayException {
		return get(String.format(Constants.FUNDACCOUNT_GET, id), null);
	}

	public FundAccount activate(String id, JSONObject request) throws RazorpayException {
		return patch(String.format(Constants.FUNDACCOUNT_ACTIVATE, id), request);
	}

}
