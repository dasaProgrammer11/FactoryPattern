package com.factory.os;

public class factoryMain {

    public static void main(String args[]){
        OSFactory osFactory= new OSFactory();
        OS osSecure=osFactory.getFactoryObject("Most Secure");
        osSecure.showFeature();

        OS osStable=osFactory.getFactoryObject("Most Stabled");
        osStable.showFeature();
    }
}
