package beyaz;

public class beyazFil {
	public static void beyazFil(String[][] arr,int a,int b) {
		//fil tasinin 4 y霵e dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//herhangi bir tasla karsilasirsa o y霵e dogru hareketi durduruldu
		//added line to beyaz fil

		/**
		 * added doc to beyaz fil
		 */

		// sol ust	
		for(int i = 1; i<8;i++) {
				if((a-i) < 0 ||(b-i)<0) {break;}
				if(arr[a-i][b-i].charAt(1) =='b') {break;}
					
					if(arr[a-i][b-i].equals("ps")) {
						arr[a-i][b-i] = "ps+";
						break;
					}
					else if(arr[a-i][b-i].equals("ks")) {
						arr[a-i][b-i] = "ks+";
						break;
					}
					else if(arr[a-i][b-i].equals("as")) {
						arr[a-i][b-i] = "as+";
						break;
					}
					else if(arr[a-i][b-i].equals("vs")) {
						arr[a-i][b-i] = "vs+";
						break;
					}
					else if(arr[a-i][b-i].equals("ss")) {
						arr[a-i][b-i] = "ss+";
						break;
					}
					
					
				}
			
			//sol alt
			for(int i = 1; i<8;i++) {
				if((a+i) > 7 ||(b-i)<0) {break;}
				if(arr[a+i][b-i].charAt(1) =='b') {break;}
					if(arr[a+i][b-i].equals("ps")) {
						arr[a+i][b-i] = "ps+";
						break;
					}
					else if(arr[a+i][b-i].equals("ks")) {
						arr[a+i][b-i] = "ks+";
						break;
					}
					else if(arr[a+i][b-i].equals("as")) {
						arr[a+i][b-i] = "as+";
						break;
					}
					else if(arr[a+i][b-i].equals("vs")) {
						arr[a+i][b-i] = "vs+";
						break;
					}
					else if(arr[a+i][b-i].equals("ss")) {
						arr[a+i][b-i] = "ss+";
						break;
					}
				}
		
			// sag alt
			for(int i = 1; i<8;i++) {
				if((a+i) > 7 ||(b+i)>7) {break;}
				if(arr[a+i][b+i].charAt(1) =='b') {break;}
					if(arr[a+i][b+i].equals("ps")) {
						arr[a+i][b+i] = "ps+";
						break;
					}
					else if(arr[a+i][b+i].equals("ks")) {
						arr[a+i][b+i] = "ks+";
						break;
					}
					else if(arr[a+i][b+i].equals("as")) {
						arr[a+i][b+i] = "as+";
						break;
					}
					else if(arr[a+i][b+i].equals("vs")) {
						arr[a+i][b+i] = "vs+";
						break;
					}
					else if(arr[a+i][b+i].equals("ss")) {
						arr[a+i][b+i] = "ss+";
						break;
					}
				}
			
			// sag �st
			for(int i = 1; i<8;i++) {
				
				if((a-i) < 0 ||(b+i)>7) {break;}
				if(arr[a-i][b+i].charAt(1) =='b') {break;}
					if(arr[a-i][b+i].equals("ps")) {
						arr[a-i][b+i] = "ps+";
						break;
					}
					else if(arr[a-i][b+i].equals("ks")) {
						arr[a-i][b+i] = "ks+";
						break;
					}
					else if(arr[a-i][b+i].equals("as")) {
						arr[a-i][b+i] = "as+";
						break;
					}
					else if(arr[a-i][b+i].equals("vs")) {
						arr[a-i][b+i] = "vs+";
						break;
					}
					else if(arr[a-i][b+i].equals("ss")) {
						arr[a-i][b+i] = "ss+";
						break;
					}
				}
				
		}
	/*
	 * Fil attan biraz daha u��ra��t覺r覺c覺 oldu 癟羹nk羹 her seferinde sonsuza kadar bakabildi��i i癟in
	 * s覺n覺rdan 癟覺kma durumlar覺 kontrol edildi. 
	 * 
	 * Fil 癟apraz hareket etti��i i癟in 癟apraz覺nda ilk kar��覺la��t覺��覺 xx den farkl覺 ta�� ile s覺n覺r kondu ve kontrol
	 * sa��land覺.
	 * 
	 * En son olarak 4 durum incelendi ve olas覺 puan k覺s覺tlamalar覺 total de��erimizden 癟覺kar覺ld覺.
	 * result i癟erisinde geri d繹nd羹r羹ld羹.
	 * */
}
