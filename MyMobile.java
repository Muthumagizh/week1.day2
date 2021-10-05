package week2.day2;

public class MyMobile {
	
	int a=5;
	String Name="Muthu";
	public void makecall()
	{
		System.out.println("make call");
	}
	public void sendmsg()
	{
		System.out.println("send msg");
	}
	private void PayBills()
	{
		System.out.println("check");
	}
			

	public static void main(String[] args) {
		
 MyMobile objMyMobile= new MyMobile();
 objMyMobile.makecall();
 objMyMobile.sendmsg();
 objMyMobile.PayBills();
 
	}

}

