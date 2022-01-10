package beyaz;

public class beyazKale {
	public static void beyazKale(String[][] arr,int a,int b) {
		//kale tasinin 4 yöne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//herhangi bir tasla karsilasirsa o yöne dogru hareketi durduruldu
				
		//üst
		for(int i = 1; i<8;i++) {
			if((a-i) < 0) {break;}
			if(arr[a-i][b].charAt(1) =='b') {break;}
				
				if(arr[a-i][b].equals("ps")) {
					arr[a-i][b] = "ps+";
					break;
				}
				else if(arr[a-i][b].equals("ks")) {
					arr[a-i][b] = "ks+";
					break;
				}
				else if(arr[a-i][b].equals("as")) {
					arr[a-i][b] = "as+";
					break;
				}
				else if(arr[a-i][b].equals("vs")) {
					arr[a-i][b] = "vs+";
					break;
				}
				else if(arr[a-i][b].equals("ss")) {
					arr[a-i][b] = "ss+";
					break;
				}
				
				
			}
		
		// sol
		for(int i = 1; i<8;i++) {
			if((b-i)<0) {break;}
			if(arr[a][b-i].charAt(1) =='b') {break;}
				if(arr[a][b-i].equals("ps")) {
					arr[a][b-i] = "ps+";
					break;
				}
				else if(arr[a][b-i].equals("ks")) {
					arr[a][b-i] = "ks+";
					break;
				}
				else if(arr[a][b-i].equals("as")) {
					arr[a][b-i] = "as+";
					break;
				}
				else if(arr[a][b-i].equals("vs")) {
					arr[a][b-i] = "vs+";
					break;
				}
				else if(arr[a][b-i].equals("ss")) {
					arr[a][b-i] = "ss+";
					break;
				}
			}
		
		//alt
		for(int i = 1; i<8;i++) {
			if((a+i) > 7 ) {break;}
			if(arr[a+i][b].charAt(1) =='b') {break;}
				if(arr[a+i][b].equals("ps")) {
					arr[a+i][b] = "ps+";
					break;
				}
				else if(arr[a+i][b].equals("ks")) {
					arr[a+i][b] = "ks+";
					break;
				}
				else if(arr[a+i][b].equals("as")) {
					arr[a+i][b] = "as+";
					break;
				}
				else if(arr[a+i][b].equals("vs")) {
					arr[a+i][b] = "vs+";
					break;
				}
				else if(arr[a+i][b].equals("ss")) {
					arr[a+i][b] = "ss+";
					break;
				}
			}
		
		// sag
		for(int i = 1; i<8;i++) {
			
			if((b+i)>7) {break;}
			if(arr[a][b+i].charAt(1) =='b') {break;}
				if(arr[a][b+i].equals("ps")) {
					arr[a][b+i] = "ps+";
					break;
				}
				else if(arr[a][b+i].equals("ks")) {
					arr[a][b+i] = "ks+";
					break;
				}
				else if(arr[a][b+i].equals("as")) {
					arr[a][b+i] = "as+";
					break;
				}
				else if(arr[a][b+i].equals("vs")) {
					arr[a][b+i] = "vs+";
					break;
				}
				else if(arr[a][b+i].equals("ss")) {
					arr[a][b+i] = "ss+";
					break;
				}
			}
		
	}
}
