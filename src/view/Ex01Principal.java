package view;
import controller.Ex01Controller;

public class Ex01Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01Controller ex01 = new Ex01Controller();
		System.out.println("Tempo para 1000: "+ex01.tpGasto(1000));
		System.out.println("Tempo para 10000: "+ex01.tpGasto(10000));
		System.out.println("Tempo para 100000: "+ex01.tpGasto(100000));
	}
}
