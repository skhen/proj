package fr.uga.projet1.defaultItf;

import java.util.Comparator;

public interface Comparatruc<T> extends Comparable<T> {
	
	default Boolean identique(T obj)
	{
		return this.compareTo(obj) == 0;
	}
	
	default Boolean plusGrand(T obj)
	{
		return this.compareTo(obj) > 0;
	}
	
	default Boolean plusPetit(T obj)
	{
		return this.compareTo(obj) < 0;
	}
	
}
