package genrics;

import java.util.Random;

public class Getdata {
	public int data() {
		Random r=new Random();
		int num=r.nextInt(100);
		return num;
	}

}
