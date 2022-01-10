package beyaz;

public class beyazAt {
	public static void beyazAt(String[][] arr, int a, int b) {
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
			if(arr[a][b].equals("ps")) {
				arr[a][b] = "ps+";
			}
			else if(arr[a][b].equals("as")) {
				arr[a][b] = "as+";
			}
			else if(arr[a][b].equals("fs")) {
				arr[a][b] = "fs+";
			}
			else if(arr[a][b].equals("ks")) {
				arr[a][b] = "ks+";
			}
			else if(arr[a][b].equals("vs")) {
				arr[a][b] = "vs+";
			}
			else if(arr[a][b].equals("ss")) {
				arr[a][b] = "ss+";
			}
		}
		//atin hareketlerinin satranc tahtasý icinde oldugunun kontrolu
		public static boolean sinir(int x,int y) {
			if(x >= 0 && x<8) {
				if( (y >= 0) && y<8) {
					return true;
				}
			}
			return false;
		}
		
}
