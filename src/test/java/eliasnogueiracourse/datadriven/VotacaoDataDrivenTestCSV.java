package eliasnogueiracourse.datadriven;


import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static eliasnogueiracourse.Votacao.podeVotar;
import static eliasnogueiracourse.Votacao.retornaAnoAtual;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class VotacaoDataDrivenTestCSV {

    @Parameter(0) String name;
    @Parameter(1) int bornYear;
    @Parameter(2) String expectedResult;

    @FileParameters(value = "src/test/resources/massa.csv",mapper = CsvWithHeaderMapper.class)
    @Test(timeout = 1000)
    public void checkMandatoryVotes(String name, int bornYear, String expectedResult) {
        assertEquals(expectedResult, podeVotar(name, bornYear));
    }

}
