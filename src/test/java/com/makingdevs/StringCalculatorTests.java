package com.makingdevs;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class StringCalculatorTests {

  @Test
  public void testEmpty(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("");
    assertEquals(0, result);
  }

  @Test
  public void testOneNumber(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4");
    assertEquals(4, result);
  }

  @Test
  public void testTwoNumbers(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4,5");
    assertEquals(9, result);
    result = sc.add("8,5");
    assertEquals(13, result);
  }

  @Test
  public void testAnyNumbers(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4,5,6");
    assertEquals(15, result);
    result = sc.add("1,2,3,3,4,5,6,7,8,9");
    assertEquals(48, result);
    result = sc.add("10,11,12,15");
    assertEquals(47, result);
  }

  @Test
  public void testBreakline(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("4,5\n6");
    assertEquals(15, result);
    result = sc.add("1,2\n3,3\n4,5\n6,7\n8,9");
    assertEquals(48, result);
    result = sc.add("10\n11,12\n15");
    assertEquals(48, result);
  }

  @Test
  @Ignore
  public void testAnotherDelimiter(){
    StringCalculator sc = new StringCalculator();
    int result = sc.add("//;\n4;5;6");
    assertEquals(15, result);
    result = sc.add("//#\n1#2#3#3#4#5#6#7#8#9");
    assertEquals(48, result);
    result = sc.add("//|\n10|11|12|15");
    assertEquals(48, result);
  }
}
