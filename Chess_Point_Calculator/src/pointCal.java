
public class pointCal {
	public static double calculator(String[][] dtable,String color)
	{
		// isaretlenmis tablonun puan hesabý
		double point=0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(dtable[i][j].equals("p"+color)) {
					point+=1;
				}
				if(dtable[i][j].equals("p"+color+"+")) {
					point+=0.5;
				}
				if (dtable[i][j].equals("f"+color)) {
					point+=3;
				}
				if (dtable[i][j].equals("f"+color+"+")) {
					point+=1.5;
				}
				if (dtable[i][j].equals("a"+color)) {
					point+=3;
				}
				if (dtable[i][j].equals("a"+color+"+")) {
					point+=1.5;
				}
				if (dtable[i][j].equals("k"+color)) {
					point+=5;
				}
				if (dtable[i][j].equals("k"+color+"+")) {
					point+=2.5;
				}
				if (dtable[i][j].equals("v"+color)) {
					point+=9;
				}
				if (dtable[i][j].equals("v"+color+"+")) {
					point+=4.5;
				}
				if (dtable[i][j].equals("s"+color)) {
					point+=100;
				}
				if (dtable[i][j].equals("s"+color+"+")) {
					point+=50;
				}
			}
		}
		return point;
	}
	

}