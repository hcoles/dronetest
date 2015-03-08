package com.example;

public class Simple {
  public static int method(int digits) {
      final int result;

      if (digits == 1) {
          final int day = 6;

          result = day * 7;
      } else if (digits == 2) {
          result = 13;
      } else {
          result = 0;
      }

      return result;
  }
}
