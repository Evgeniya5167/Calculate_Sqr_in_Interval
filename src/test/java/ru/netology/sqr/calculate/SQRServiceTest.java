package ru.netology.sqr.calculate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/amountsqr.csv")

    public void CalculateSqrInInterval(int expected, int firstNumber, int secondNumber) {
        SQRService service = new SQRService();

        int actual = (int) service.sqrAmount(firstNumber, secondNumber);

        assertEquals(expected, actual);
    }
}
