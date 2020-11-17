import java.util.Scanner;

public class main{
	public static void main(String[]args){
		
		double vol;
		Scanner input = new Scanner(System.in);
		System.out.println("masukkan nilai jari-jari :");
		vol = input.nextInt();
	
		hitung2 h = new hitung2(vol);
		volume2 v = new hitung2(vol);
		
		h.hasil();
		
		
		
	
		
		
	}
}
