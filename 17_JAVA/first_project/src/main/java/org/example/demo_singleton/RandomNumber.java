package org.example.demo_singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static RandomNumber instance = null;
    
    private Random random = new Random();

    public List<Integer> numbers = new ArrayList<>();
    public List<Integer> numbersFound = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    private RandomNumber(){

    }

    public synchronized static RandomNumber getInstance(){
        if (instance == null) {
            instance = new RandomNumber();
        }
        return instance;
    }

    public Integer RandomNumber(){
        if (numbersFound.size() == 0) {
            numbersFound.addAll(numbers);
            numbers.clear();
        }
        Integer newNumber = numbers.get(random.nextInt(0, numbers.size()));
        numbers.add(newNumber);
        Integer index = numbers.indexOf(newNumber);
        numbers.remove(index);
        return newNumber;
    }

    @Override
    public String toString() {
        return "RandomNumber [random=" + random + ", numbers=" + numbers + ", numbersFound=" + numbersFound + "]";
    }
}
