package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
public void shareDocument() {
	System.out.println("shareDocoment");
}
public void makecall() {
	System.out.println("makeCall");
}
public static void main(String[] args) {
	Mobile iphone = new Mobile();
	iphone.sendMessage();
	iphone.shareDocument();
	iphone.makecall();
}
}
