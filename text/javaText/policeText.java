package javaText;

//package com.tws.refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;

public class policeText {

 @Test
 void should_return_true_if_driver_age_big_than_eighteen() {
  //given
  Police police = new Police();
  Driver driver = new Driver(49);
  //when
  boolean result= police.checkDriver(driver);
  //then
  assertEquals(true, result);
  
 }
}