package com.esprit;

import java.util.List;

public interface ITestJava {
	/**
	 * Permet de retourner une liste de sous liste, o� chaque sous liste a au maximum � taille � �l�ments.
	 * @param maList
	 * @param taille
	 * @return
	 */
	List<List<Integer>> partition(List<Integer> maList,int taille);
}
