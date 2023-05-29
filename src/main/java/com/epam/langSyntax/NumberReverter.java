package com.epam.langSyntax;

import java.util.stream.Stream;

public class NumberReverter {


    public void revert(int number) {
        StringBuilder temp = new StringBuilder(Integer.toString(number));
        temp.reverse();
        System.out.println(temp);
    }

}
