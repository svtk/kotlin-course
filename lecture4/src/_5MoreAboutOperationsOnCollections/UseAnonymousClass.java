package _5MoreAboutOperationsOnCollections;

import kotlin.jvm.functions.Function1;

import java.util.ArrayList;
import java.util.List;

public class UseAnonymousClass {
    public static void main(String[] args) {
        List<String> stringList =  new ArrayList<>();
        InlineFunctionsKt.filter(stringList, new Function1<String, Boolean>() {
            @Override
            public Boolean invoke(String s) {
                return !s.isEmpty();
            }
        });
    }
}
