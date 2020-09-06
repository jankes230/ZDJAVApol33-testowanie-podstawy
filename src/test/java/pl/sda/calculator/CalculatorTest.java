package pl.sda.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5.0, actual);
    }

    @Test
    void shouldBeDividableByThree(){
        // given
        int arg = 9;

        //when
        boolean actual = sut.isDividableByThree(arg);

        //then
        assertTrue(actual);
    }
    @Test
    @DisplayName("Odejmowanie powinno zwrócić 0 przy odejmowaniu 5 od 5")
    void shouldReturnZeroForGivenArgsOnSubtractionOperation(){
        // given
        int arg1 = 5;
        int arg2 = 5;

        //when
        int actual = sut.substract(arg1, arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Metoda powinna zwracać wynik mnożenia")
    void shouldMultiply(){
        // given
        int arg1 = 4;
        int arg2 = 4;

        //when
        int actual = sut.multiply(arg1,arg2);

        //then
        assertEquals(16, actual);
    }
    @Test
    @DisplayName("Metoda powinna zwracać wynik mnożenia przez zero")
    void shouldMultiplyZero(){
        // given
        int arg1 = 4;
        int arg2 = 0;

        //when
        int actual = sut.multiply(arg1,arg2);

        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Metoda powinna zwracać wynik dzielenia 4 przez 4")
    void resultDivided(){
        //given
        double arg1 = 4;
        double arg2 = 4;

        //when
        double actual = sut.division(arg1,arg2);

        //then
        assertEquals(1, actual);

    }
    @Test
    @DisplayName("Metoda powinna zwracać wynik dzielenia 4 przez 0")
    void resultDividedFourByZero(){
        //given
        double arg1 = 4;
        double arg2 = 0;

        //when
        double actual = sut.division(arg1,arg2);

        //then
        assertEquals(0, actual);

    }
    @Test
    @DisplayName("Metoda powinna zwracać wynik dzielenia 0 przez 4")
    void resultDividedZeroByFour(){
        //given
        double arg1 = 0;
        double arg2 = 4;

        //when
        double actual = sut.division(arg1,arg2);

        //then
        assertEquals(0, actual);

    }

    @Test
    @DisplayName("Czy liczba powinna zwracać wartość logiczną true potwierdzającą parzystość liczby")
    void trueResultModulo(){
        //given
        int arg=8;

        //when
        boolean actual = sut.isEvenNumber(arg);

        //then
        assertTrue(actual,"Liczba jest parzysta");

    }
    @Test
    @DisplayName("Czy liczba powinna zwracać wartość logiczną false potwierdzającą nieparzystość liczby")
    void falseResultModulo(){
        //given
        int arg=7;

        //when
        boolean actual = sut.isNotEvenNumber(arg);

        //then
        assertTrue(actual,"Liczba jest nieparzysta");
    }
    @Test
    @DisplayName("Program zwraca 10% z liczby")
    void  valueTenPercentFormNumber(){
        //given
        int arg = 10;
        double percet = 0.1;

        //when
        double actual = sut.percentOfnumber(arg,percet);

        //then
        assertEquals(1, actual);
    }@Test
    @DisplayName("Program zwraca 1% z liczby")
    void  valueOnePercentFormNumber(){
        //given
        int arg = 10;
        double percet = 0.01;

        //when
        double actual = sut.percentOfnumber(arg,percet);

        //then
        assertEquals(0.1, actual);
    }@Test
    @DisplayName("Program zwraca 100% z liczby")
    void  valueOneHoundredPercentFormNumber(){
        //given
        int arg = 10;
        double percet = 1;

        //when
        double actual = sut.percentOfnumber(arg,percet);

        //then
        assertEquals(10, actual);
    }@Test
    @DisplayName("Program zwraca 0% z liczby")
    void  valueZeroPercentFormNumber(){
        //given
        int arg = 10;
        double percet = 0;

        //when
        double actual = sut.percentOfnumber(arg,percet);

        //then
        assertEquals(0, actual);
    }
}
