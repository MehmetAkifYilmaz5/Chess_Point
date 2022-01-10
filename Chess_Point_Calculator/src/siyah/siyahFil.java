package siyah;

public class siyahFil {
	public static void siyahFil(String[][] arr,int a,int b) {
		//fil tasinin 4 yöne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//herhangi bir tasla karsilasirsa o yöne dogru hareketi durduruldu
		
		// sol ust
		for(int i = 1; i<8;i++) {
			if((a-i) < 0 ||(b-i)<0) {break;}
			if(arr[a-i][b-i].charAt(1) =='s') {break;}
				
				if(arr[a-i][b-i].equals("pb")) {
					arr[a-i][b-i] = "pb+";
					break;
				}
				else if(arr[a-i][b-i].equals("kb")) {
					arr[a-i][b-i] = "kb+";
					break;
				}
				else if(arr[a-i][b-i].equals("ab")) {
					arr[a-i][b-i] = "ab+";
					break;
				}
				else if(arr[a-i][b-i].equals("vb")) {
					arr[a-i][b-i] = "vb+";
					break;
				}
				else if(arr[a-i][b-i].equals("sb")) {
					arr[a-i][b-i] = "sb+";
					break;
				}
				
				
			}

		//sol alt
		for(int i = 1; i<8;i++) {
			if((a+i) > 7 ||(b-i)<0) {break;}
			if(arr[a+i][b-i].charAt(1) =='s') {break;}
				if(arr[a+i][b-i].equals("pb")) {
					arr[a+i][b-i] = "pb+";
					break;
				}
				else if(arr[a+i][b-i].equals("kb")) {
					arr[a+i][b-i] = "kb+";
					break;
				}
				else if(arr[a+i][b-i].equals("ab")) {
					arr[a+i][b-i] = "ab+";
					break;
				}
				else if(arr[a+i][b-i].equals("vb")) {
					arr[a+i][b-i] = "vb+";
					break;
				}
				else if(arr[a+i][b-i].equals("sb")) {
					arr[a+i][b-i] = "sb+";
					break;
				}
			}

		// sag alt
		for(int i = 1; i<8;i++) {
			if((a+i) > 7 ||(b+i)>7) {break;}
			if(arr[a+i][b+i].charAt(1) =='s') {break;}
				if(arr[a+i][b+i].equals("pb")) {
					arr[a+i][b+i] = "pb+";
					break;
				}
				else if(arr[a+i][b+i].equals("kb")) {
					arr[a+i][b+i] = "kb+";
					break;
				}
				else if(arr[a+i][b+i].equals("ab")) {
					arr[a+i][b+i] = "ab+";
					break;
				}
				else if(arr[a+i][b+i].equals("vb")) {
					arr[a+i][b+i] = "vb+";
					break;
				}
				else if(arr[a+i][b+i].equals("sb")) {
					arr[a+i][b+i] = "sb+";
					break;
				}
			}

		//sag üst
		for(int i = 1; i<8;i++) {
			
			if((a-i) < 0 ||(b+i)>7) {break;}
			if(arr[a-i][b+i].charAt(1) =='s') {break;}
				if(arr[a-i][b+i].equals("pb")) {
					arr[a-i][b+i] = "pb+";
					break;
				}
				else if(arr[a-i][b+i].equals("kb")) {
					arr[a-i][b+i] = "kb+";
					break;
				}
				else if(arr[a-i][b+i].equals("ab")) {
					arr[a-i][b+i] = "ab+";
					break;
				}
				else if(arr[a-i][b+i].equals("vb")) {
					arr[a-i][b+i] = "vb+";
					break;
				}
				else if(arr[a-i][b+i].equals("sb")) {
					arr[a-i][b+i] = "sb+";
					break;
				}
			}
		
	}
}
