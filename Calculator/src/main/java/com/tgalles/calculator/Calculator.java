package com.tgalles.calculator;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {
        return opG + opD;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0){
            throw new ErreurDivisionPar0();
        }
        else{
            return opG / opD;
        }

    }

    public static Set<Integer> ensembleChiffres(int pNombre){
        Set<Integer> liste =  new HashSet<>();
        pNombre = Math.abs(pNombre);
        String nb = String.valueOf(pNombre);
        for(int i = 0; i < nb.length(); i++){
            char c = nb.charAt(i);
            liste.add(Character.getNumericValue(c));
        }
        return liste;
    }
}

