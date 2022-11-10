package Day1;

public class EqualityChecking {

	public static void main(String[] args) {
		Object o=new Object();
		String s=new String("bhaskar");
		StringBuffer sb=new StringBuffer();
		System.out.println(o==s);//false
		System.out.println(o==sb);//false
		

	}

}
