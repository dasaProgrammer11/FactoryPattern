package com.factory.os;

import javax.crypto.Mac;

public class OSFactory {

    public OS getFactoryObject(String osType){
        if(osType.equals("Most Used"))
            return new Windows();
        else if(osType.equals("Most Secure"))
            return new Linux();
        else if (osType.equals("Most Stabled"))
            return new IOS();
        return  new Windows();
    }
}
