package com.zalando.elevator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zalando.elevator.solutions.ElevatorStopsCalculator;

public class ElevatorTest {

	private ElevatorStopsCalculator calc = new ElevatorStopsCalculator();
	
	@Test
	public void onePersonOverweighted(){
		int[]A = {190};
		int[]B = {2};
		assertEquals(0, calc.calculateStops(A,B,5,3,150));
		
	}
	
	@Test
	public void weightExceedsTest() {
		int[]A = {60,40,110};
		int[]B = {2,3,5};
		assertEquals(5, calc.calculateStops(A,B,5,3,200));
	}
	@Test
	public void maxPeopleExceedsTest() {
		int[]A = {60,40,80};
		int[]B = {2,3,5};
		assertEquals(5, calc.calculateStops(A,B,5,2,200));
	}
	@Test
	public void allPeopleToSameFloor(){
		int[]A = {60,40,80};
		int[]B = {2,2,2};
		assertEquals(2, calc.calculateStops(A,B,5,3,200));
	}
	@Test
	public void allPeopleToSameFloorAndWeithExceeds(){
		int[]A = {60,40,110};
		int[]B = {2,2,2};
		assertEquals(4, calc.calculateStops(A,B,5,3,200));
	}
	@Test
	public void allPeopleToSameFloorAndMaxPeopleExceeds(){
		int[]A = {60,40,110};
		int[]B = {2,2,2};
		assertEquals(4, calc.calculateStops(A,B,5,2,300));
	}
}
