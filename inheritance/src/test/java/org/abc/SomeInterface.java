package org.abc;

/**
 * Created by khangld5 on May 30, 2022
 */
public interface SomeInterface {
    int a = 9;

    default int xyz(){
        return a;
    }
}
