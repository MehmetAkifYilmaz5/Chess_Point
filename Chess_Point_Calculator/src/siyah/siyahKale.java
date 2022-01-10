package siyah;

public class siyahKale {
	public static void siyahKale(String[][] arr,int a,int b) {
		//kale tasinin 4 yöne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//herhangi bir tasla karsilasirsa o yöne dogru hareketi durduruldu
		
		//üst
		for(int i = 1; i<8;i++) {
			if((a-i) < 0) {break;}
			if(arr[a-i][b].charAt(1) =='s') {break;}
				
				if(arr[a-i][b].equals("pb")) {
					arr[a-i][b] = "pb+";
					break;
				}
				else if(arr[a-i][b].equals("kb")) {
					arr[a-i][b] = "kb+";
					break;
				}
				else if(arr[a-i][b].equals("ab")) {
					arr[a-i][b] = "ab+";
					break;
				}
				else if(arr[a-i][b].equals("vb")) {
					arr[a-i][b] = "vb+";
					break;
				}
				else if(arr[a-i][b].equals("sb")) {
					arr[a-i][b] = "sb+";
					break;
				}
			}
		
		//sol
		for(int i = 1; i<8;i++) {
			if((b-i)<0) {break;}
			if(arr[a][b-i].charAt(1) =='s') {break;}
				if(arr[a][b-i].equals("pb")) {
					arr[a][b-i] = "pb+";
					break;
				}
				else if(arr[a][b-i].equals("kb")) {
					arr[a][b-i] = "kb+";
					break;
				}
				else if(arr[a][b-i].equals("ab")) {
					arr[a][b-i] = "ab+";
					break;
				}
				else if(arr[a][b-i].equals("vb")) {
					arr[a][b-i] = "vb+";
					break;
				}
				else if(arr[a][b-i].equals("sb")) {
					arr[a][b-i] = "sb+";
					break;
				}
			}
		
		//alt
		for(int i = 1; i<8;i++) {
			if((a+i) > 7 ) {break;}
			if(arr[a+i][b].charAt(1) =='s') {break;}
				if(arr[a+i][b].equals("pb")) {
					arr[a+i][b] = "pb+";
					break;
				}
				else if(arr[a+i][b].equals("kb")) {
					arr[a+i][b] = "kb+";
					break;
				}
				else if(arr[a+i][b].equals("ab")) {
					arr[a+i][b] = "ab+";
					break;
				}
				else if(arr[a+i][b].equals("vb")) {
					arr[a+i][b] = "vb+";
					break;
				}
				else if(arr[a+i][b].equals("sb")) {
					arr[a+i][b] = "sb+";
					break;
				}
			}
		
		// sag
		for(int i = 1; i<8;i++) {
			
			if((b+i)>7) {break;}
			if(arr[a][b+i].charAt(1) =='b') {break;}
				if(arr[a][b+i].equals("pb")) {
					arr[a][b+i] = "pb+";
					break;
				}
				else if(arr[a][b+i].equals("kb")) {
					arr[a][b+i] = "kb+";
					break;
				}
				else if(arr[a][b+i].equals("ab")) {
					arr[a][b+i] = "ab+";
					break;
				}
				else if(arr[a][b+i].equals("vb")) {
					arr[a][b+i] = "vb+";
					break;
				}
				else if(arr[a][b+i].equals("sb")) {
					arr[a][b+i] = "sb+";
					break;
				}
			}
	}
}
