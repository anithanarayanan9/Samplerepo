package string;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer obj =new StringBuffer("Hello");
		obj.replace(1, 4, "abcde");
		System.out.println(obj);
	}

}
