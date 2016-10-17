package _1Questions;

import kotlin.collections.CollectionsKt;

import java.util.List;

// Заинлайнит ли Java компилятор вызов функции filter? (Да / нет).

public class _5FilterFunctionFromJava {
    public static void foo(List<Integer> list) {
        List<Integer> positive =
                CollectionsKt.filter(list, element -> element > 0);

/*
        InlineFunctionsKt.filter(list, new Function1<Integer, Boolean>() {
            @Override
            public Boolean invoke(Integer i) {
                return i > 0;
            }
        });
*/
    }
}
