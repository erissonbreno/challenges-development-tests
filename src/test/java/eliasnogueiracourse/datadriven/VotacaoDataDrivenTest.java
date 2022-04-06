package eliasnogueiracourse.datadriven;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static eliasnogueiracourse.Votacao.podeVotar;
import static eliasnogueiracourse.Votacao.retornaAnoAtual;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class VotacaoDataDrivenTest {

    String name;
    int bornYear;
    String expectedResult;

    public VotacaoDataDrivenTest(String name, int bornYear, String expectedResult) {
        this.name = name;
        this.bornYear = bornYear;
        this.expectedResult = expectedResult;
    }

    @Test
    public void checkMandatoryVotes() {
        assertEquals(expectedResult, podeVotar(name, bornYear));
    }

    @Parameters(name = "{0} | {1} | {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Maria", retornaAnoAtual() - 15, "Maria voce nao pode votar"},
                {"Rodrigo", retornaAnoAtual() - 16, "Rodrigo seu voto e facultativo"},
                {"Joao", retornaAnoAtual() - 17, "Joao seu voto e facultativo"},
                {"Carla", retornaAnoAtual() - 18, "Carla seu voto e obrigatorio"},
                {"Jose", retornaAnoAtual() - 25, "Jose seu voto e obrigatorio"},
                {"Ana", retornaAnoAtual() - 70, "Ana seu voto e obrigatorio"},
                {"Pedro", retornaAnoAtual() - 71, "Pedro seu voto e facultativo"}
        });
    }
}
