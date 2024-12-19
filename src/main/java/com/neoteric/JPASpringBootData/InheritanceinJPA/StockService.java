package com.neoteric.JPASpringBootData.InheritanceinJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    @Autowired
    private  StockRepository stockRepository;

    public Stock addStockToDataBase(Stock stock){
        return stockRepository.save(stock);

    }
}
