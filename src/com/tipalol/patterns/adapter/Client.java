package com.tipalol.patterns.adapter;

/*
*  We can't change this class
*  because it is in some production dll for example
*  and this class is pretty good
*  but you need to add some functionality from new interface.
*  Decision is Adapter pattern.
*  */
public class Client {

    private String version;

    public void Update() {
        //updating client
    }

    //another important staff

}
