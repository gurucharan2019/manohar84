package letcode;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[10];
		a[0] = "Pineapple";
		a[1] = "apple";
		a[2] = "Jack fruit";
		a[3] = "Pear";
		a[4] = "Mango";
		a[5] = "Dragon";
		a[6] = "Argan";
		a[7] = "Orange";
		
		System.out.println(a[0]);
		System.out.println(a.length);
		System.out.println(a[a.length - 5]);
		System.out.println(Arrays.toString(a));
	
		

	}

}
