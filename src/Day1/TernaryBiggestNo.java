package Day1;

public class TernaryBiggestNo {

	public static void main(String[] args) {
		int a=30,b=20,c=40,big;
		big=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println("The biggest number is"+big);

	}

}
