package com.mitt.mockito.mockitoexample;

public class SomeBuisnessImpl {

	private DataService dataService;
	
	
	int findGreatestFromAllData() {
		int [] data = dataService.retriveAllData() ;
		int greatest = Integer.MIN_VALUE;
		
		for(int value: data) {
			if(value>greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
	
}
