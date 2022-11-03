import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		ArrayList<String> dizi= new ArrayList<String>();
		dizi.add("red");
		dizi.add("yellow");
		dizi.add("green");
		dizi.add(1,"orange");
		
		for(int i=0;i<dizi.size();i++) {
			System.out.println(dizi.get(i));	
		}
		
		//boolean donduruyor.
		if(dizi.contains("blue")) {
			System.out.println("dizi icinde blue vardir.");
		}
		else System.out.println("dizi icinde blue yoktur.");
		
		System.out.println("Green index: " + dizi.indexOf("green"));
		
		dizi.clear(); //dizinin elemanlarini siliyor
		for(int i=0;i<dizi.size();i++) {
			System.out.println(dizi.get(i));	
		}

	}

}
