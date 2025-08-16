package excelReaad;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.out.println(ExcelRead.readstringdata(0, 0));
		System.out.println(ExcelRead.readintegerdata(0, 1));
		System.out.println(ExcelRead.readstringdata(1, 0));
		System.out.println(ExcelRead.readintegerdata(1, 1));
	}

}
