package week1.day2;

public class MyMobile {
	String call;
	char msg;
	int bill;
	
	public void makeCall()
	{
		System.out.println("The Mobile u have a feature to call?");
		//return makeCall;
	}
	public void sendSms()
	{
		System.out.println("The mobile u have can send msg to anyone?");
		//return char;
	}
	private void payBill()
	{
		System.out.println("The mobile amount paid through phonepee");
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMobile mob= new MyMobile();
		String call="Yes i can";
		char msg='s';		
		int bill=20000;
		mob.makeCall();
		System.out.println(call);
		mob.sendSms();
		System.out.println(msg);
		mob.payBill();
		
		
	}

}
