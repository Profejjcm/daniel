package es.calcularpi;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularPI {

     public static void main(String[] args) {
        MathContext mc = new MathContext(NUM_DIG);         
        compute(mc);
    }

    public static void compute(MathContext mc) {
        //Seleccionar el codigo establecido entre los dos comentarios "//meter en el método compute", click derecho sobre la seleccion, pulsar la opción refactor, opcion "introduce",opcion "method" y rellenar con los datos datos que pide el examen.
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(NUM_DIG);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = piFunction(k, mc);           
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
    }
    public static final int NUM_DIG = 10; // Seleccionar el valor 10, click derecho, opción "Refactor" ,opcion "introduce", opcion "constant" y rellenar con las indicaciones del examen

    public static BigDecimal piFunction(int k, MathContext mc) {
        //meter en el método piFunction
        //Seleccione todo lo situado entre los "//meter en el método piFunction//" 
        //click derecho sobre la seleccion, pulsar la opción refactor, opcion "introduce",opcion "method" y rellenar con los datos datos que pide el examen.
        int k8 = 8 * k;
        BigDecimal val1 = new BigDecimal(4);
        val1 = val1.divide(new BigDecimal(k8 + 1), mc);
        BigDecimal val2 = new BigDecimal(-2);
        val2 = val2.divide(new BigDecimal(k8 + 4), mc);
        BigDecimal val3 = new BigDecimal(-1);
        val3 = val3.divide(new BigDecimal(k8 + 5), mc);
        BigDecimal val4 = new BigDecimal(-1);
        val4 = val4.divide(new BigDecimal(k8 + 6), mc);
        BigDecimal val = val1;
        val = val.add(val2);
        val = val.add(val3);
        val = val.add(val4);
        BigDecimal multiplier = new BigDecimal(16);
        multiplier = multiplier.pow(k);
        BigDecimal one = new BigDecimal(1);
        multiplier = one.divide(multiplier, mc);
        val = val.multiply(multiplier);
        BigDecimal piK = val;
        return piK;
    }
}
     
