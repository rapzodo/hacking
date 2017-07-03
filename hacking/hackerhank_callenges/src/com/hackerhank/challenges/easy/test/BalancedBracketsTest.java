package com.hackerhank.challenges.easy.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerhank.challenges.easy.BalancedBrackets;

public class BalancedBracketsTest {
	private BalancedBrackets app = new BalancedBrackets();
	
	@Test
//	@Ignore
	public void shouldReturnNoForOddString(){
		Assert.assertEquals(false, app.solution("{]]{()}{])"));
	}
//	@Ignore
	@Test
	public void shoudlReturnYes(){
		Assert.assertEquals(true, app.solution("{}"));
		Assert.assertEquals(true, app.solution("{}{()}{{}}"));
	}
	@Test
	@Ignore
	public void shoudlReturnNo(){
		Assert.assertEquals(false, app.solution("[{"));
	}
	@Test
	@Ignore
	public void shoudlReturnYesWithComplexInput(){
		Assert.assertEquals(true, app.solution("()[{}()]([[][]()[[]]]{()})([]()){[]{}}{{}}{}(){([[{}([]{})]])}"));
	}
	@Test
	@Ignore
	public void shoudlReturnNOWithComplexInput(){
		Assert.assertEquals(false, app.solution("()[{}()]([[][]()[[]]]{()})([]()){[){}}{{}}{}(){([[{}([]{})]])}"));
	}
}
