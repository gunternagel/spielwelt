package de.nagel.spielwelt;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Test;

import io.reactivex.Observable;
// import io.reactivex.observables.*;

import de.nagel.spielwelt.*;

public class reactivedemotest{

    @Test
    void findEvenNumberTest(){
        Observable<Integer> numbers = Observable.range(1, 10);

        reactivedemo sut = new reactivedemo();

        var actual = sut.process(numbers);

        Assertions.allOf(actual).equals(new ArrayList(2, 4, 6, 8, 10));
    }

}