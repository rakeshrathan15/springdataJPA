package com.neoteric.JPASpringBootData.InheritanceinJPA;

public class StockTest {
    public static void main(String[] args) {
        StockService dao = new StockService();

        RestrictedStock restrictedStock = new RestrictedStock();
        restrictedStock.setName("restricted stock");
        restrictedStock.setVestingPeriod(5);
        restrictedStock.setValue(200.0);



        OptionStock optionalStock = new OptionStock();
        optionalStock.setStrikePrice(2000);
        optionalStock.setName("optionalStock");
        optionalStock.setValue(117.0);




        FutureStock futureStock = new FutureStock();
        futureStock.setMaturityDate("19/12/2024");
        futureStock.setValue(112);
        futureStock.setName("futurestock");




        dao.saveStock(restrictedStock);
        dao.saveStock(optionalStock);
        dao.saveStock(futureStock);
    }
}
