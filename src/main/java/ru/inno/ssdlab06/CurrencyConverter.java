package ru.inno.ssdlab06;

public class CurrencyConverter {

    public float convert(int value, String to, String from){
        Currency curFrom = Currency.getCurrency(from);
        Currency curTo = Currency.getCurrency(to);
        return curFrom.convert(value*1f, curTo);
    }
}
