package com.melville.tom.adaptor.object;

import java.util.HashMap;

import com.melville.tom.adaptor.MyRest;

public class RestMain {
    public static void main(String[] args){
        MyRest restTool = new MyRestImpl();
        restTool.get("http://www.google.ie", new HashMap<>());
    }
}
