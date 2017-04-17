package com.edu.cnu;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ghu33 on 2017-04-17.
 */
public class SimpleCalculatorTest {
    @Before
    public void setUp(){
        System.out.println("this is before");
    }
    @Test
    public void 간단한_덧셈_2더하기2는_4다(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2,2);
        assertThat(result, is( 4));
    }

    @Test
    public void 간단한_곱셈_2곱하기4는_8이다(){
        Calculator calculator = new Calculator();
        int result = calculator.multi(2,4);
        assertThat(result, is(8));
    }
    @Test
    public void 간단한_나눗셈_4나누기2는_2이다(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(4,2);
        assertThat(result, is(2));
    }

    @Test(expected = ArithmeticException.class)
    public void 영으로_나누면_에러발생(){
        Calculator calculator = new Calculator();
        calculator.divide(10,0);
    }

    @Test
    public void 영의_팩토리얼은_1이다(){
        Calculator calculator = new Calculator();
        int result = calculator.factorial(0);
        assertThat(result, is(1));
    }

    @Test
    public void 이의_팩토리얼은_2이다(){
        Calculator calculator = new Calculator();
        int result = calculator.factorial(2);
        assertThat(result, is(2));
    }

    @Test
    public void 오의_팩트리얼은_120이다(){
        Calculator calculator = new Calculator();
        int result = calculator.factorial(5);
        assertThat(result, is(120));
    }
}
