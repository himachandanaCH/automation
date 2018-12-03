package jsp;

public class Account {

	public static void main(String[] args) {
		AcountEncaps abc=new AcountEncaps(500);
		int a= abc.getAmount();
		System.out.println(a);
		
		AcountEncaps bcd=new AcountEncaps(5000);
		int b = bcd.getAmount();
		System.out.println(b);



	}

}
