import java.util.Scanner;

public class zamanTest {

	public static void main(String[] args) {
	    int hour,minute,second;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Saati girin:");
		hour = input.nextInt();
		System.out.println("Dakikayi girin:");
		minute = input.nextInt();
		System.out.println("Saniyeyi girin:");
		second = input.nextInt();
		
		zaman z = new zaman(hour,minute,second);
		System.out.println(z.display());
		z.setHour(11);
		System.out.println(z.display());
		
		z.setSaat(25,33,45);
		System.out.println(z.display());
		zaman.say();
	
		zaman z1 = new zaman(hour,minute,second);
		zaman.say();	
		
		zaman z2 = new zaman(hour,second);
		zaman z3 = new zaman(hour);
		
		System.out.println(z.display());
		System.out.println(z1.display());
		System.out.println(z2.display());
		System.out.println(z3.display());
		

	}

}
