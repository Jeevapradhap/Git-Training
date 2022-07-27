package assistedpractice;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=14;
		float y=x;
		short s=(short)x;
		byte f=(byte)s;
		System.out.println("Before typecasting:"+x);
		System.out.println("After implicit typecasting:"+y);
		System.out.println("Before explicit typecasting:"+f);

	}

}
