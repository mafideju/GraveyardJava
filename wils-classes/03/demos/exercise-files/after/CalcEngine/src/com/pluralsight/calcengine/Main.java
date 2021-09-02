package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[16];
        equations[0] = new MathEquation("a", 100.0d, 50.0d);
        equations[1] = new MathEquation("a", 25.0d, 92.0d);
        equations[2] = new MathEquation("a", 225.0d, 17.0d);
        equations[3] = new MathEquation("a", 11.0d, 3.0d);

        equations[4] = new MathEquation("s", 100.0d, 50.0d);
        equations[5] = new MathEquation("s", 25.0d, 92.0d);
        equations[6] = new MathEquation("s", 225.0d, 17.0d);
        equations[7] = new MathEquation("s", 11.0d, 3.0d);

        equations[8] = new MathEquation("m", 100.0d, 50.0d);
        equations[9] = new MathEquation("m", 25.0d, 92.0d);
        equations[10] = new MathEquation("m", 225.0d, 17.0d);
        equations[11] = new MathEquation("m", 11.0d, 3.0d);

        equations[12] = new MathEquation("d", 100.0d, 50.0d);
        equations[13] = new MathEquation("d", 25.0d, 92.0d);
        equations[14] = new MathEquation("d", 225.0d, 17.0d);
        equations[15] = new MathEquation("d", 11.0d, 3.0d);

        for(MathEquation equation : equations) {
            equation.execute();
            String code = "";
            switch (equation.getOpCode()) {
                case "a":
                    code = "Adiçao";
                    break;
                case "s":
                    code = "Subtração";
                    break;
                case "m":
                    code = "Multiplicação";
                    break;
                case "d":
                    code = "Divisão";
                    break;
                default:
                    code = "Valor não reconhecido";
            }


            System.out.println("O resultado da " + code + " de " + equation.getLeftVal() + " e de " + equation.getRightVal() + " é = " + equation.getResult());
        }

    }



}



















