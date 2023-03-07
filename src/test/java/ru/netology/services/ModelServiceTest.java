package ru.netology.services;

import ru.netology.services.ModelService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ModelServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ru.netology.services/parameter_test.csv")
    public void testWitchCSV(int income, int expenses, int threshold, int expected) {
        ModelService service = new ModelService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}