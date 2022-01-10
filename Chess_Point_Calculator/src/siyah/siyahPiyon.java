package siyah;

public class siyahPiyon {
	public static void siyahPiyon(String[][] arr,int a,int b) 
	{
		//kale tasinin 4 yöne dogru hareketleri bulundu
		//sinirlar kontrol edildi
		//piyonlarin hareket yönu olarak verilen orneklerdeki tahtalar referans alýnmýstir
		
		//sag capraz
		while(true) {
		if((a+1) >7 ||(b+1)>7) {break;}
		if(arr[a+1][b+1].charAt(1) =='s') {break;}
			else if(arr[a+1][b+1].equals("pb")) {
				arr[a+1][b+1] = "pb+";
				break;
			}
			else if(arr[a+1][b+1].equals("kb")) {
				arr[a+1][b+1] = "kb+";
				break;
			}
			else if(arr[a+1][b+1].equals("ab")) {
				arr[a+1][b+1] = "ab+";
				break;
			}
			else if(arr[a+1][b+1].equals("vb")) {
				arr[a+1][b+1] = "vb+";
				break;
			}
			else if(arr[a+1][b+1].equals("sb")) {
				arr[a+1][b+1] = "sb+";
				break;
			}
			break;
		}
		//sol capraz
		while(true) {
			if((a+1) > 7 ||(b-1)<0) {break;}
			if(arr[a+1][b-1].charAt(1) =='s') {break;}
				if(arr[a+1][b-1].equals("pb")) {
					arr[a+1][b-1] = "pb+";
					break;
				}
				else if(arr[a+1][b-1].equals("kb")) {
					arr[a+1][b-1] = "kb+";
					break;
				}
				else if(arr[a+1][b-1].equals("ab")) {
					arr[a+1][b-1] = "ab+";
					break;
				}
				else if(arr[a+1][b-1].equals("vb")) {
					arr[a+1][b-1] = "vb+";
					break;
				}
				else if(arr[a+1][b-1].equals("sb")) {
					arr[a+1][b-1] = "sb+";
					break;
				}
				break;
			}
	}
}
