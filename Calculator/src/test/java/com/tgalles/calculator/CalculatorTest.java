package com.tgalles.calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void addition_de_1_et_2_devrait_etre_egale_a_3(){
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int resultat = calculator.add(a, b);

        //THEN
        Assertions.assertThat(resultat).isEqualTo(3);
    }

    @Test
    void division_de_10_par_2_devrait_etre_egale_a_5(){
        //GIVEN
        int a = 10;
        int b = 2;

        //WHEN
        int resultat = calculator.divide(a, b);

        //THEN
        Assertions.assertThat(resultat).isEqualTo(5);
    }

}
