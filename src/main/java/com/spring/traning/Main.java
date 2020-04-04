package com.spring.traning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeans.class);
         StoreClient storeClient=applicationContext.getBean(StoreClient.class);
         storeClient.ShowStoreItem();
         VipClientStore vipClientStore=applicationContext.getBean(VipClientStore.class);
         vipClientStore.ShowStore();
    }
}
