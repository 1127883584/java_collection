package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder, rightBorder);
        int max = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(number -> number % 2 == 0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0 ; i < arrayList.size(); i ++) {
            sum += arrayList.get(i)*3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for (int i = 0 ; i < arrayList.size(); i ++) {
            if (arrayList.get(i) % 2 == 1) {
                arrayList.set(i, arrayList.get(i) * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        double sum = 0.0;
        for (int i = 0 ; i < arrayList.size(); i ++) {
            if (arrayList.get(i) % 2 == 0) {
                sum += arrayList.get(i);
                list.add(arrayList.get(i));
            }
        }
        return sum/list.size();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < arrayList.size(); i ++) {
            if (arrayList.get(i) % 2 == 0 && !list.contains(arrayList.get(i))) {
                list.add(arrayList.get(i));
            }
        }
        return list;
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
