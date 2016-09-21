package _2Extensions;

import static _2Extensions.ExtensionsKt.lastChar;

public class ExtensionsFromJava {
    public static void main(String[] args) {
        // из Java вызывается как обычный статический метод, принимающий String в качестве первого параметра
        char ch = lastChar("abc");

        // если мы добавим аннотацию @file:JvmName("StringUtil")
//        char ch = StringUtil.lastChar("abc");
    }
}
