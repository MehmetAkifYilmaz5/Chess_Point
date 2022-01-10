package siyah;

public class siyahAt {
	public static void siyahAt(String[][] arr, int a, int b) {
		//atýn herbir haraketi icin noktalarýn dogrulugu kontrol edildi
		if(sinir(a-2,b-1)) {
			sonuc(arr,a-2,b-1);
		}
		if(sinir(a-2,b+1)) {
			sonuc(arr,a-2,b+1);
		}
		if(sinir(a+2,b-1)) {
			sonuc(arr,a+2,b-1);
		}
		if(sinir(a+2,b+1)) {
			sonuc(arr,a+2,b+1);
		}
		if(sinir(a+1,b-2)) {
			sonuc(arr,a+1,b-2);
		}
		if(sinir(a+1,b+2)) {
			sonuc(arr,a+1,b+2);
		}
		if(sinir(a-1,b-2)) {
			sonuc(arr,a-1,b-2);
		}
		if(sinir(a-1,b+2)) {
			sonuc(arr,a-1,b+2);
		}
	}
	//hedef noktada bulunan tas tehdit edilebiliyorsa "+" karakteriyle isaretlendi
	public static void sonuc(String[][] arr, int a ,int b) {
		if(arr[a][b].equals("pb")) {
			arr[a][b] = "pb+";
		}
		else if(arr[a][b].equals("ab")) {
			arr[a][b] = "ab+";
		}
		else if(arr[a][b].equals("fb")) {
			arr[a][b] = "fb+";
		}
		else if(arr[a][b].equals("kb")) {
			arr[a][b] = "kb+";
		}
		else if(arr[a][b].equals("vb")) {
			arr[a][b] = "vb+";
		}
		else if(arr[a][b].equals("sb")) {
			arr[a][b] = "sb+";
		}
		
	}
	//atin hareketlerinin satranc tahtasý icinde oldugunun kontrolu
	public static boolean sinir(int x,int y) {
		if(x >= 0 && x<8 ) {
			if( (y >= 0) && y<8) {
				return true;
			}
		}
		return false;
	}
}
