package ru.inno.ssdlab06;

public enum Currency {
    ROUBLE(1),
    EURO(180),
    DOLLAR(120),
    BITCOIN(30000*120),
    RIAL(20.37f);
    private float courseFromRubles; // 1 somthing is this num of rubles
    Currency(float courseFromRubles){
        this.courseFromRubles = courseFromRubles;
    }
    public static Currency getCurrency(String currency){
        switch (currency){
            case "rouble": return Currency.ROUBLE;
            case "usd": return Currency.DOLLAR;
            case "euro": return Currency.EURO;
            case "btc": return Currency.BITCOIN;
            case "rial": return Currency.RIAL;
        };
        return null;
    }
    public float convert(float value, Currency to){
        return courseFromRubles * value / to.courseFromRubles;
    }
}
