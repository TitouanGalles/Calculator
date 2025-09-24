package com.tgalles.calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    //Calculator calculator;

    @BeforeEach
    public void setUp() {
        //calculator = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        //calculator = null;
    }

    @Test
    void addition_de_1_et_2_devrait_etre_egale_a_3(){
        //GIVEN
        int a = 1;
        int b = 2;

        //WHEN
        int resultat = Calculator.add(a, b);

        //THEN
        Assertions.assertThat(resultat).isEqualTo(3);
    }

    @Test
    void division_de_10_par_2_devrait_etre_egale_a_5(){
        //GIVEN
        int a = 10;
        int b = 2;

        //WHEN
        int resultat = Calculator.divide(a, b);

        //THEN
        Assertions.assertThat(resultat).isEqualTo(5);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",     // 0 + 1 = 1
            "1, 2, 3",     // 1 + 2 = 3
            "-2, 2, 0",    // -2 + 2 = 0
            "0, 0, 0",     // 0 + 0 = 0
            "-1, -2, -3"   // -1 + (-2) = -3
    })
    void addition_avec_parameterizedTest(int opG, int opD, int resultatAttendu) {
        // Vérification du résultat avec la méthode add
        Assertions.assertThat(resultatAttendu).isEqualTo(Calculator.add(opG, opD));
    }

    @Test
    void devrait_renvoyer_tableau_avec_1_2_3(){
        //GIVEN
        int a = -11;
        Set<Integer> listeRes = new HashSet<>();
        listeRes.add(1);
        //listeRes.add(2);
        //listeRes.add(3);

        //WHEN
        Set<Integer> resultat = Calculator.ensembleChiffres(a);

        //THEN
        Assertions.assertThat(resultat).isEqualTo(listeRes);
    }

    @Test
    void devrait_renvoyer_erreur_si_division_par_0(){
        //GIVEN
        int a = 10;
        int b = 0;

        //WHEN
        Throwable thrown = catchThrowable(() -> Calculator.divide(a, b));

        assertThat(thrown).isInstanceOf(ErreurDivisionPar0.class).hasMessage("Division par 0 impossible");
    }
}
