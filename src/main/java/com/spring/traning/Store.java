package com.spring.traning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Store {
    
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public void showItem(){
        this.item.printItem();
    }
}
