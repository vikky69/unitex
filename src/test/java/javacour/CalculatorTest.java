package javacour;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc=new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3,1), 0.0001);
        assertEquals(40, calc.add(35,5), 0.0001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(2, calc.sub(3,1), 0.0001);
    }

    @Test
    public void mul() throws Exception {
        assertEquals(48, calc.mul(6,8), 0.0001);
    }

    @Test (expected = ArithmeticException.class)
    public void div() throws Exception {
        assertEquals(10, calc.div(80,8), 0.0001);
    }

  //  @Test
  //  public void divByZero() throws Exception {
  //     calc.div(5,0);





    }
}