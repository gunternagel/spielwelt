package de.nagel.spielwelt;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import io.reactivex.Observable;

public class reactivedemotest{

    @Test
    void findEvenNumbersTest(){
        Observable<Integer> numbers = Observable.range(1, 10);
        java.util.List<Integer> expected = List.of(Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10));
    
        reactivedemo sut = new reactivedemo();

        var actual = sut.findEvenNumbers(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findUnevenNumbersTest(){
        Observable<Integer> numbers = Observable.range(1, 10);
        java.util.List<Integer> expected = List.of(Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9));
    
        reactivedemo sut = new reactivedemo();

        var actual = sut.findUnevenNumbers(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);        
    }

    @Test
    void findFirstNumberTest(){
        Observable<Integer> numbers = Observable.range(1, 10);
        Integer expected = Integer.valueOf(1);
    
        reactivedemo sut = new reactivedemo();

        var actual = sut.findFirstNumber(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findLastNumberTest(){
        Observable<Integer> numbers = Observable.range(1, 10);
        Integer expected = Integer.valueOf(10);
    
        reactivedemo sut = new reactivedemo();

        var actual = sut.LastFirstNumber(numbers);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

}