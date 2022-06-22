import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {

    @DataProvider(name = "testTeenagerAge")
    Object[][] testTeenagerAge() {
        return new Object[][] {
                {5, false},
                {13, true},
                {15, true},
                {19, true},
                {35, false}
        };
    }
    @Test (dataProvider = "testTeenagerAge")
    public void testIfTennager(int age, boolean expectedAnsw) throws Exception {
        boolean result = Person.isTeenager(age);
        Assert.assertEquals(expectedAnsw, result);
    }
}
