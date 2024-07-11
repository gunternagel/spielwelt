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

}