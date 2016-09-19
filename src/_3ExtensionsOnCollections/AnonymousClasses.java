package _3ExtensionsOnCollections;

import kotlin.jvm.functions.Function2;

import static _3ExtensionsOnCollections.LambdasKt.performOperation;

public class AnonymousClasses {
    public static void main(String[] args) {
        performOperation(new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer invoke(Integer i, Integer j) {
                return i + j;
            }
        });
    }
}
