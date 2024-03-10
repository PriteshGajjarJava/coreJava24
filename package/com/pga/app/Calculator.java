package com.pga.app;

import com.pga.maths.Addition;

class Calculator {
    public static void main(String[] args) {
      int a = 10;
      int b = 20;

      Addition obj = new Addition();
      int ans = obj.add(a, b);
      System.out.println("Answer is: " + ans);
    }
}
