package week105;

public class LocalVariables {
	int fish = 5;
	static int banana = 2;
	final int cake = 3;
	
	public static void main(String[]args) {
		 LocalVariables cat = new LocalVariables();
		 cat.show();
	   	cat.display();
	}
	public void show() {
		String cat1 = "Luca eat a fish = "+ fish +"and eat ="+ banana + "cake ="+cake;
		System.out.println("Inside show meyhod cat1 = "+cat1);
	}
	public  void display() {
		String cat2 = "Promote Mobile Vivo s7";
		System.out.println(cat2);
	}
}
