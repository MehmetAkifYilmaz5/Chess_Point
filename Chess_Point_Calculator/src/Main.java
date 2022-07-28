import java.io.BufferedReader;

import java.io.FileReader;
import java.util.Scanner;

import siyah.*;
import beyaz.*;


public class Main {
	static String[][] dtable = new String[99][99];
	public static void main(String[] args) {
		while(true)
		{
		int Boardnum = 0;
		String[] table = new String[99];
		Scanner sc = new Scanner(System.in);
		System.out.println("Uzerinde islem yapacaginiz board numarasini giriniz?(\"0\"for exit)");
		
		//i removed from branch and added new text

		//added second line of text

		//lets add more text so we can se what the fuck happens 	
		
		//like this 
		
		
		//like this
		Boardnum = sc.nextInt();
		if(Boardnum==0)
		{
			sc.close();
			break;
		}
		int counter = 0;
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("Applicant Assesment Test_4_EK_AtFil\\board"+Boardnum+".txt"));// Burada path girmemiz gerekiyor ki o pathdeki txt formatÄ±nÄ± incelesin
			String s;																				
			System.out.println("Uzerinde calisacagimiz tablo : ");                                  
			while ((s = br.readLine()) != null) {   // text formundaki dosya dizi haline cevirildi
				table[counter] = s;
				System.out.println(s);
				counter++;
			}
			br.close();
		} 
		catch (Exception ex) {
			System.out.println(ex);
			continue;
		}
		fill2Darr(table);
	
		
		for (int i = 0; i < 8; i++) {		//tahta üzerindeki istenen taslar kendilerine uygun harket classlarýna gonderilir
			for (int j = 0; j < 8; j++) {
				if (dtable[i][j].equals("vs") || dtable[i][j].equals("vs+")) {
					siyah.siyahFil.siyahFil(dtable, i, j);
					siyah.siyahKale.siyahKale(dtable, i, j);
				}
				if (dtable[i][j].equals("vb") || dtable[i][j].equals("vb+")) {
					beyaz.beyazFil.beyazFil(dtable, i, j);
					beyaz.beyazKale.beyazKale(dtable, i, j);
				}
				if(dtable[i][j].equals("as") || dtable[i][j].equals("as+")) {
					siyah.siyahAt.siyahAt(dtable, i, j);
				}
				if (dtable[i][j].equals("ab") || dtable[i][j].equals("ab+")) {
					beyaz.beyazAt.beyazAt(dtable, i, j);
				}
				if(dtable[i][j].equals("ps") || dtable[i][j].equals("ps+")) {
					siyah.siyahPiyon.siyahPiyon(dtable, i, j);
				}
				if (dtable[i][j].equals("pb") || dtable[i][j].equals("pb+")) {
					beyaz.beyazPiyon.beyazPiyon(dtable, i, j);
				}
			}
		}

		System.out.println();
		System.out.println("*********************");
		System.out.println();
		System.out.println("Sonuc Tablosu");
		System.out.println("siyah puani:"+pointCal.calculator(dtable,"s"));//isaretlenmis taslarýn oldugu tahta puan hesaplamasýnda geçer
		System.out.println("beyaz puani:"+pointCal.calculator(dtable,"b"));
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(dtable[i][j]+" ");
			}
			System.out.println();
		} 
		}
		

	}
	public static void fill2Darr(String arr[]) { // gelen veri tek boyutlu bir diziye atýldý.
					 // tek boyutlu dizi iki boyutlu diziye donusturuldu.
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				dtable[i][j] = arr[i].split(" ")[j];	
			}
		} 

		
	}
}
