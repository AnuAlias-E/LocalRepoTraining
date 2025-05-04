
public class Main3 {
public static void main(String[] args) {
	byte v1=90;
	short v2=888;
	int v3=200;
	long v4=900;
	System.out.println(v1==v2 & v3==v4);
	System.out.println(v1==90 & v3==v4);
	System.out.println(v1==90 & v3==500);
	System.out.println(v1==90 & v3 ==200);
	
	System.out.println("-------------");
	System.out.println(v1==v1 && ++v3==v4);
	System.out.println(v3);
	System.out.println(v1==90 && v3==v4);
	System.out.println(v1==90 && v3==500);
	System.out.println(v1==90 && v3 ==200);
	
	System.out.println("-------------");
	System.out.println(v2==888 | ++v3==500);
	System.out.println(v3);
	System.out.println(v1==90 | v3==v4);
	System.out.println(v1==90 | v3==500);
	System.out.println(v1==90 | v3 ==200);
	
	System.out.println("-------------");
	System.out.println(v2==888 || ++v3==500);
	System.out.println(v3);
	System.out.println(v1==v2 || v3==v4);
	System.out.println(v1==90 || v3==v4);
	System.out.println(v1==90 || v3==500);
	System.out.println(v1==90 || v3 ==200);
}

}
