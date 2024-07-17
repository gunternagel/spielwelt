package de.nagel.spielwelt;

import io.reactivex.Observable;

public class reactivedemo{
    
    public reactivedemo(){
        
    }

    public java.util.List<Integer> findEvenNumbers(Observable<Integer> numbers) {
        return numbers.filter(x -> (x % 2) == 0).toList().blockingGet();
    }

    public java.util.List<Integer> findUnevenNumbers(Observable<Integer> numbers) {
        return numbers.filter(x -> (x%2) == 1).toList().blockingGet();
    }

    public Object findFirstNumber(Observable<Integer> numbers) {
        return numbers.firstElement().blockingGet();
    }

    public Object LastFirstNumber(Observable<Integer> numbers) {
        return numbers.lastElement().blockingGet();
    }

    
}