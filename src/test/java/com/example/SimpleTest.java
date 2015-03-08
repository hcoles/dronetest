package com.example;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SimpleTest {
  @Test
  public void test1() {
      assertThat(Simple.method(1), is(42));
 }

  @Test
  public void test2() {
      assertThat(Simple.method(2), is(13));
  }

  @Test
  public void test3() throws Exception {
      assertThat(Simple.method(3), is(0));
  }
}
