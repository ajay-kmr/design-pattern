package com.ttn.designpatterns.structural.adapter;

public class SortClient {

	public static void main(String[] args) {
		
		Integer[] numbers = {15, 41, 22, 68, 50, 81};
		
		Sorter sorter = new SortAdapter();
		numbers = sorter.sort(numbers);
		
		for(Integer number : numbers) {
			System.out.print(number + " ");
		}
	}
}
