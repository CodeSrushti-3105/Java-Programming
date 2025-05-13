// Source code is decompiled from a .class file using FernFlower decompiler.
//create new folder and give the name to that folder 'calculator'.after that create one file name it as 'CalculatorOperations.java' and write this code in it.
package calculator;

public class CalculatorOperations {
   public CalculatorOperations() {
   }

   public double add(double var1, double var3) {
      return var1 + var3;
   }

   public double subtract(double var1, double var3) {
      return var1 - var3;
   }

   public double multiply(double var1, double var3) {
      return var1 * var3;
   }

   public double divide(double var1, double var3) {
      return var3 == 0.0 ? Double.NaN : var1 / var3;
   }
}
