package differential;

import java.util.Scanner;

public class differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of"
				+ " h > ");
		double h = Double.parseDouble(scan.next());
	
		differential_lib dlib = new differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getDx());
		System.out.println("f(x)=x^2�ɂ����鑊�Ό덷��"+dlib.getLx());
	    
	//��Ԑ��x�̍������̂��́A0.0000001�ł������B
	}
	
	

}
