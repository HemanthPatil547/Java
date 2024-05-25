package obj.triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner (System.in);
		int b = sc.nextInt();
		int l = sc.nextInt();
		float f = a.area(l,b);
		
		System.out.println(f);

	}

}
