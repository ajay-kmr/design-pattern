package com.ttn.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class SortAdapter implements Sorter {

	public Integer[] sort(Integer[] numbers) {
		
		List<Integer> numbersList = Arrays.asList(numbers);
		
		NumberSorter numberSorter = new NumberSorter();
		numbersList = numberSorter.sort(numbersList);
		
		return ((Integer[]) numbersList.toArray());
		//return (Integer[]) numbersList.toArray((Object[]) Array.newInstance(Integer.class, numbersList.size()));
	}
}
