package beyaz;

public class beyazFil {
	public static void beyazFil(String[][] arr,int a,int b) {
		//fil tasinin 4 y�ne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//herhangi bir tasla karsilasirsa o y�ne dogru hareketi durduruldu
		//added line to beyaz fil
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
	 * Fil attan biraz daha uğraştırıcı oldu çünkü her seferinde sonsuza kadar bakabildiği için
	 * sınırdan çıkma durumları kontrol edildi. 
	 * 
	 * Fil çapraz hareket ettiği için çaprazında ilk karşılaştığı xx den farklı taş ile sınır kondu ve kontrol
	 * sağlandı.
	 * 
	 * En son olarak 4 durum incelendi ve olası puan kısıtlamaları total değerimizden çıkarıldı.
	 * result içerisinde geri döndürüldü.
	 * */
}
