package fr.uga.projet1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.DateFormatter;

import fr.uga.projet1.poo.Contact;
import fr.uga.projet1.poo.Etudiant;

public class App {

	public static void main(String[] args) {
		try {
			Contact c1 = new Contact(1, "toto", 230);
			Contact c2 = new Contact(1, "toto", 230);
			System.out.println("comparaison avec =" + (c1 == c2));
			System.out.println("comparaison avec equals :" + c1.equals(c2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

//		System.out.println("--- Java 7 ---");
//		SimpleDateFormat df = new SimpleDateFormat("dd/MM/YY");
//		Date date = new Date();
//		System.out.println(df.format(date));
//
//		
//		System.out.println("--- Java 8 ---");
//		
//		
//		LocalDate naiss = LocalDate.of(1942, 04, 15);
//		LocalDate ajh = LocalDate.now();
//		
//		Period age = Period.between(ajh, naiss);
//		
//		System.out.println("Age : " + age.toString());
//		
		
		System.out.println( "Liste des étudiants                   :--------------");
		List<Etudiant> listEtu = new ArrayList<Etudiant>();
		for(int i = 1; i<= 10; i++) {
			listEtu.add(new Etudiant("etu"+i, "prenom"+i, i*2));
			listEtu.add(new Etudiant("etuX" + i, "prenomX" + i, i*1.5));
		}
			listEtu.forEach(System.out::println);

		System.out.println( "Liste des étudiants ayant la  moyenne :--------------");			
		List<Etudiant> luMoy = listEtu.stream()
				.filter(((e)->e.getMoyenne() >= 10))
						.collect(Collectors.toList());
		
		luMoy.forEach(System.out::println);

		System.out.println( "Noms d'étudiants ayant la  moyenne :--------------");			
		List<String> moy = (List<String>) listEtu.stream()
				.filter(((e)->e.getMoyenne() >= 10))
						.map(Etudiant::getNom)
						.collect(Collectors.toList());
		
		moy.forEach(System.out::println);

		System.out.println( "Noms d'étudiants ayant la  moyenne :--------------");			
		String moyListe = listEtu.stream()
				.filter(((e)->e.getMoyenne() >= 10))
						.map(Etudiant::getNom)
						.collect(Collectors.joining(","));
		
		System.out.println(moyListe);

		System.out.println( "Moyenne générale                   :--------------");			
		double moyGlob = listEtu.stream()
				.collect(Collectors.averagingDouble(Etudiant::getMoyenne));
		System.out.println("moyenne 1           :  " + moyGlob);
		
		System.out.println( "Moyenne générale                   :--------------");					
		OptionalDouble moyeGen = listEtu.stream()
				.mapToDouble(Etudiant::getMoyenne)
				.average();	
		System.out.println("moyenne  2          :  " + moyeGen.getAsDouble());
		
		System.out.println( "Meilleurs moyenne                  :--------------");					
		String bestMoy = listEtu.stream()
				.max(Comparator.comparing(Etudiant::getMoyenne))
				.get()
				.getNom();
		System.out.println("Vainqueur          :  " + bestMoy);
				
		//map à plusieurs clés
		Map<String, List<Etudiant>> myMap =
				listEtu.stream()
				.collect(Collectors.groupingBy(Etudiant::getMention));
		
		//Sol 1 : parcours des clés
		for (String cle : myMap.keySet()) {
			System.out.println(cle + " = ");
			for (Etudiant et : myMap.get(cle)) {
				System.out.print(et.getNom() + ",");
			}
			System.out.println();
		}
		
//		System.out.println( "Noms d'étudiants ayant la  meilleure moyenne :--------------");			
//		List<String> moy = (List<String>) listEtu.stream()
//				.filter(((e)->e.getMoyenne() >= 10))
//						.map(Etudiant::getNom)
//						.collect(Collectors.);
//		
//		moy.forEach(System.out::println);

		
//		listEtu.stream()
//		.coll
//		System.out.println( "Liste des étudiants ayant la  moyenne :--------------");

		
		
//		System.out.println( "Liste des étudiants par moyenne :--------------");
//		List<Etudiant> luMoy = listEtu.stream()
//				.sorted(Comparator.comparing(Etudiant::getMoyenne))
//				.collect(Collectors.toList());
//		luMoy.forEach(System.out::println);
		
//		double max = luMoy.stream().max(Comparator.comparing(luMoy.)
		
		System.out.println("..");
		
		
	
				
		
		
		
	}

}