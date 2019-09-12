package com.tipalol.patterns.adapter;

/*
*   And that's all.
*   It is Adapter pattern
*   which allow us to add some functionality
*   to class we can't modify.
 */
public class Adapter extends Client implements ISender {

    @Override
    public void Send(String message) {
        //Send something
    }

}
