package com.sudarshan.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sudarshan.day3.Television;

class TelevisionTest {

	Television television;

	@BeforeEach
	void setUp() {
		television = new Television(true, 50, 514);
	}

	@AfterEach
	void tearDown() {
		television = null;
	}

	@Test
	void testIncreaseVolume() {
		assertEquals(51, television.increaseVolume());
		assertEquals(52, television.increaseVolume());
		assertEquals(53, television.increaseVolume());
		
	}

	@Test
	void testDecreaseVolume() {
		assertEquals(49, television.decreaseVolume());
		assertEquals(48, television.decreaseVolume());
		assertEquals(47, television.decreaseVolume());
		assertEquals(46, television.decreaseVolume());
	}

	@Test
	void testChangeChannel() {
		assertEquals(543, television.changeChannel(543));
		assertEquals(256, television.changeChannel(256));
		assertEquals(530, television.changeChannel(530));
		assertEquals(630, television.changeChannel(630));
		
	}

	@Test
	void testChangeState() {
		assertEquals(false, television.changeState());
	}

}
