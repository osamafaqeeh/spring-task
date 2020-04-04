package com.spring.traning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StoreClient {
    @Autowired
    private Store store;


    public void ShowStoreItem(){
        this.store.showItem();
    }
}
