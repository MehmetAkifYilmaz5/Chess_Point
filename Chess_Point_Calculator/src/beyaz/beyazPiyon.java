package beyaz;

public class beyazPiyon {
	public static void beyazPiyon(String[][] arr,int a,int b) 
	{
		//kale tasinin 4 yöne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//piyonlarin hareket yönu olarak verilen orneklerdeki tahtalar referans alýnmýstir
		
		//sol capraz
		while(true) {
		if((a-1) <0 ||(b-1)<0) {break;}
		if(arr[a-1][b-1].charAt(1) =='b') {break;}
			if(arr[a-1][b-1].equals("ps")) {
				arr[a-1][b-1] = "ps+";
				break;
			}
			else if(arr[a-1][b-1].equals("ks")) {
				arr[a-1][b-1] = "ks+";
				break;
			}
			else if(arr[a-1][b-1].equals("as")) {
				arr[a-1][b-1] = "as+";
				break;
			}
			else if(arr[a-1][b-1].equals("vs")) {
				arr[a-1][b-1] = "vs+";
				break;
			}
			else if(arr[a-1][b-1].equals("ss")) {
				arr[a-1][b-1] = "ss+";
				break;
			}
			break;
		}
		//sag capraz
		while(true) {
			if((a-1) < 0 ||(b+1)>7) {break;}
			if(arr[a-1][b+1].charAt(1) =='b') {break;}
				if(arr[a-1][b+1].equals("ps")) {
					arr[a-1][b+1] = "ps+";
					break;
				}
				else if(arr[a-1][b+1].equals("ks")) {
					arr[a-1][b+1] = "ks+";
					break;
				}
				else if(arr[a-1][b+1].equals("as")) {
					arr[a-1][b+1] = "as+";
					break;
				}
				else if(arr[a-1][b+1].equals("vs")) {
					arr[a-1][b+1] = "vs+";
					break;
				}
				else if(arr[a-1][b+1].equals("ss")) {
					arr[a-1][b+1] = "ss+";
					break;
				}
				break;
			}
		
	}
}
