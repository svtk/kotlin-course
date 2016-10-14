package _3CompanionObject;

public class UsingCompanionObjectsFromJava {

    public static void main(String[] args) {

        A.Companion.create();
//        A.create() - doesn't compile

        A.staticFunction();
    }
}
