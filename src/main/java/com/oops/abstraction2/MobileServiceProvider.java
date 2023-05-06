package com.oops.abstraction2;

public class MobileServiceProvider extends CommonFeature implements Client1,Client2, Client3, Client4 {

	@Override
	public void receiveCall() {
		System.out.println("Calling..");
	}

	@Override
	public void videoCalls() {
		System.out.println("videoCalls..");		
	}

	@Override
	public void sendSMS() {
		System.out.println("sendSMS..");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("receiveSMS..");		
	}

	@Override
	public void makeCall() {
		System.out.println("makeCall..");		
	}

}
