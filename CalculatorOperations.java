// Source code is decompiled from a .class file using FernFlower decompiler.
//create new folder and give the name to that folder 'calculator'.after that create one file name it as 'CalculatorOperations.java' and write this code in it.
package calculator;

public class CalculatorOperations {

    public double add(int var1, int var2) {
        return var1 + var2;
    }

    public double sub(int var1, int var2) {
        return var1 - var2;
    }

    public double mul(int var1, int var2) {
        return var1 * var2;
    }

    public double div(int var1, int var2) {
        if (var2 == 0) {
            return Double.NaN;
        } else {
            return (double) var1 / var2; // Ensure proper float division
        }
    }
}

