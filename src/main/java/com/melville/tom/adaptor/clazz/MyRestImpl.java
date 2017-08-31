package com.melville.tom.adaptor.clazz;

import java.util.Map;

import com.melville.tom.adaptor.MyHttpResponse;
import com.melville.tom.adaptor.MyRest;


public class MyRestImpl /*extends HttpClient*/ implements MyRest {
    @Override
    public MyHttpResponse get(final String uri, final Map<String, String> headers) {
        return null;
    }

    @Override
    public MyHttpResponse post(final String uri, final String data, final Map<String, String> headers) {
        return null;
    }

    @Override
    public MyHttpResponse put(final String uri, final String data, final Map<String, String> headers) {
        return null;
    }

    @Override
    public MyHttpResponse delete(final String uri, final Map<String, String> headers) {
        return null;
    }
}
