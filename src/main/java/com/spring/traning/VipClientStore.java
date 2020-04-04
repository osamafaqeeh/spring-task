package com.spring.traning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class VipClientStore {

    @Autowired
    @Qualifier("getStore2")
    private Store store;

    public void ShowStore(){
        store.showItem();

    }
}
