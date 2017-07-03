package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerhank.challenges.easy.RansonNote;

public class RansonNoteTest {

	@Test
	public void shoulReturnYes() {
		String magazineLine = "give me one grand today night";
		String rNoteLine = "give one grand today";
		assertEquals("YES",RansonNote.analyze(magazineLine.split(" "), rNoteLine.split(" ")));
	}

}
