package com.zalando.elevator.solutions;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedTransferQueue;

public class ElevatorStopsCalculator {

	private Queue<Entry<Integer, Integer>> peopleQueue = new LinkedTransferQueue<>();
	
	public int calculateStops(int[] A, int[] B, int M, int X, int Y) {
		int stops = 0;
		int weigthCount = 0;
		int totalPeople = 0;
		Set<Integer> floors = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			Entry<Integer, Integer> person = new AbstractMap.SimpleEntry<Integer, Integer>(A[i], B[i]);
			peopleQueue.offer(person);
		}
		while(!peopleQueue.isEmpty()){
			Entry<Integer, Integer> person = peopleQueue.peek();
			if(person.getKey() > Y){
				return stops;
			}
			totalPeople++;
			weigthCount+=person.getKey();
			if(weigthCount <= Y && totalPeople <= X){
				peopleQueue.poll();
				if(floors.add(person.getValue())){
					stops++;
				}
				continue;
			}
			totalPeople = 0;
			weigthCount = 0;
			floors.clear();
			stops++;
		}
		stops++;
		return stops;
	}

}
