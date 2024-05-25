package obj.sub;

public class avg {

	public static void main(String[] args) {
		
		Subject s = new Subject();
		
		float f = s.avg(78, 89, 96);
		float p = s.per(43, 67, 99);
		
		
		System.out.println("avarage : " + f);
		System.out.println("percentage:"+ p);
		
		
	}

}
