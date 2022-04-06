package eliasnogueiracourse;

import categories.PrincipalFlow;
import categories.Smoke;
import eliasnogueiracourse.simple.VotacaoTest;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(Smoke.class)
@SuiteClasses({
        VotacaoTest.class
})
public class CategoriesSuite {
}
