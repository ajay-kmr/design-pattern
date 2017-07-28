package com.ttn.designpatterns.structural.adapter;

import java.util.Collections;
import java.util.List;

public class NumberSorter {

	public List<Integer> sort(List<Integer> numbersList) {
		Collections.sort(numbersList);
		return numbersList;
	}
}
