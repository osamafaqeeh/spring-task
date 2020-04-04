package com.spring.traning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class FactoryBeans {
    @Bean
    public VipClientStore getVipClientStore(){
        return new VipClientStore();
    }
    @Bean
    public StoreClient getStoreClient(){
        return new StoreClient();
    }
    @Bean

    public Store getStore(){
        return new Store();
    }
    @Bean
    @Primary
    public Store getStore1(){
        Store store=new Store();
        store.setItem(new Item1());
        return store;
    }
    @Bean
    public Store getStore2(){
        Store store=new Store();
        store.setItem(new Item2());
        return store;
    }
    @Bean
    public Item getItem1(){
        return new Item1();
    }
    @Bean
    public Item getItem2(){
        return new Item2();
    }
}
