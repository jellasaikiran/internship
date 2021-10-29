package Assignment5.Main;

import Assignment5.Data.Data;
import Assignment5.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.globalPrint();
        data.localPrint();

        Singleton singleton = Singleton.initializingString("Jella");
        singleton.printString();

    }
}
