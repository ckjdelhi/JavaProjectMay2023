package com.oops.abstraction2;

public class Test {

	public static void main(String[] args) {
		
		MobileServiceProvider airtel = new MobileServiceProvider();
		airtel.makeCall();
		airtel.receiveCall();
		airtel.receiveSMS();
		airtel.sendSMS();
		airtel.videoCalls();
		airtel.show();
				
		Client1 c1=new MobileServiceProvider();
		c1.makeCall();
		c1.receiveSMS();
		c1.sendSMS();
		
		
		Client2 c2=new MobileServiceProvider();
		c2.receiveSMS();
		c2.sendSMS();

		
		Client3 c3=new MobileServiceProvider();
		c3.receiveSMS();
		c3.sendSMS();
		c3.makeCall();
		c3.videoCalls();
		c3.receiveCall();
		
		Client4 c4=new MobileServiceProvider();
		c4.videoCalls();
		
		
		
	}

}
