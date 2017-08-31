package com.melville.tom.adaptor;

import java.util.Map;

public interface MyRest {

    MyHttpResponse get(String uri, Map<String, String> headers);

    MyHttpResponse post(String uri, String data, Map<String, String> headers);
    MyHttpResponse put(String uri, String data, Map<String, String> headers);
    MyHttpResponse delete(String uri, Map<String, String> headers);
}
