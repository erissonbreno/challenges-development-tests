package eliasnogueiracourse.simple;

import org.junit.jupiter.api.Test;

import static eliasnogueiracourse.Votacao.podeVotar;
import static eliasnogueiracourse.Votacao.retornaAnoAtual;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VotacaoTest {

    @Test
    public void whenAgeEquals15CanNotVote(){
        String name = "Maria";
        int bornYear = retornaAnoAtual() - 15;
        String expectedResult = "Maria voce nao pode votar";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals16OptionalVote() {
        String name = "Rodrigo";
        int bornYear = retornaAnoAtual() - 16;
        String expectedResult = "Rodrigo seu voto e facultativo";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals17OptionalVote() {
        String name = "Joao";
        int bornYear = retornaAnoAtual() - 17;
        String expectedResult = "Joao seu voto e facultativo";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals18MandatoryVote() {
        String name = "Carla";
        int bornYear = retornaAnoAtual() - 18;
        String expectedResult = "Carla seu voto e obrigatorio";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals25MandatoryVote() {
        String name = "Jose";
        int bornYear = retornaAnoAtual() - 25;
        String expectedResult = "Jose seu voto e obrigatorio";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals70MandatoryVote() {
        String name = "Maria";
        int bornYear = retornaAnoAtual() - 70;
        String expectedResult = "Maria seu voto e obrigatorio";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenAgeEquals71OptionalVote() {
        String name = "Pedro";
        int bornYear = retornaAnoAtual() - 71;
        String expectedResult = "Pedro seu voto e facultativo";
        String actualResult = podeVotar(name, bornYear);

        assertEquals(expectedResult, actualResult);
    }
}
