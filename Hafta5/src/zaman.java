
public class zaman {

	private int hour;
	private int minute;
	private int second;
	public static int count;
	
	
	public zaman(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		count++;
	}
	
	public zaman(int hour) {
		this.hour = hour;
		
	}
	
	public zaman(int hour,int second) {
		this.hour=hour;
		this.second=second;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setSaat(int hour,int minute,int second) {
		
		
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second>59) {
			System.out.println("girmis oldugunuz saat sinirlarin disinda.");
		}
		else {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		}
		
		/*
		if(hour>=0||hour<24||minute>=0||minute<60||second>=0||second<60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;	
		}
		else System.out.println("girmis oldugunuz saat sinirlarin disinda.");
	    */
	}
	
	public String display() {
		return String.format("%02d:%02d:%02d %s",getHour(),getMinute(),getSecond(),"zaman");
	}
	
	public static void say() {
		System.out.println("Giris sayisi: "+count);
	}
	
}
