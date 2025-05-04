
public class Main1 {

	public static void main(String[] args) {
		int v1=100;
		long v2=1000;
		
		double v3 = 45000.00;
		
		System.out.println(v1+v2);
		System.out.println(v2-v1);
		System.out.println(v3*5.000);
		System.out.println(v3/v2);
		System.out.println(13%2);
		v1+=6;
		System.out.println(v1);
		v1-=6;
		System.out.println(v1);
		v1*=6;
		System.out.println(v1);
		v1/=6;
		System.out.println(v1);
		v1%=6;
		System.out.println(v1);
		++v1;
		System.out.println(v1);
		v1++;
		System.out.println(v1);
		int st=++v1 + ++v1;
		System.out.println(st);
	}

}
