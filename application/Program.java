package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.LegalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		List <TaxPayer> list = new ArrayList<TaxPayer>();
		
		for(int i = 1 ; i <= N; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c) ? ");
			char resp = sc.next().charAt(0);
			if(resp == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expeditures: ");
				double healthExpenditures = sc.nextDouble();				
				list.add(new Individual(name, annualIncome, healthExpenditures));
				System.out.println();
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();				
				list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
				System.out.println();
			}			
		}
		
			System.out.println("TAXES PAID: ");
			
			double sum = 0.0;
			
			for(TaxPayer tax : list) {
				double tp = tax.tax();
				System.out.println(tax.getName() + ": $ " + String.format("%.2f", tp));
				sum += tp;
			}
		
			System.out.println();
			System.out.printf("TOTAL TAXES: %.2f", sum );
		
		
		
		sc.close();

	}

}
