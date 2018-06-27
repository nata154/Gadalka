package by.htp.Gadalka2.run;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

import by.htp.Gadalka2.Entity.Client;
import by.htp.Gadalka2.Entity.FortuneTeller;

public class RunGadalka {

	public static void main(String[] args) {
		FortuneTeller ft=new FortuneTeller();
		Client nadya=new Client("Nadya");
		Client misha=new Client("Misha");
		
		Set<String> listPredications=new HashSet<>();
		
		listPredications=ft.getPredications();
		
		for (String predication: listPredications) {
			System.out.println(predication);			
		}
		
		System.out.println("--");
		
		GregorianCalendar gregorianCalendar= new GregorianCalendar();
		
		String testDivination=ft.getDivinationByPredication("marryList", nadya, gregorianCalendar);
//		String testDivination2=ft.getDivinationByPredication("yearsToLiveList", misha, gregorianCalendar);
		
		
		System.out.println(testDivination);
	}

}
