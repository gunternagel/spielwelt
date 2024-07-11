package de.nagel.spielwelt;

import io.reactivex.Observable;

public class reactivedemo{
    
    public reactivedemo(){
        
    }

    public java.util.List<Integer> findEvenNumbers(Observable<Integer> numbers) {
        return numbers.filter(x -> (x % 2) == 0).toList().blockingGet();
    }

    
}