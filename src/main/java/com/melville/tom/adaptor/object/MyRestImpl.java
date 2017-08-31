package com.melville.tom.adaptor.object;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;

import com.melville.tom.adaptor.MyHttpResponse;
import com.melville.tom.adaptor.MyHttpResponseImpl;
import com.melville.tom.adaptor.MyRest;

public class MyRestImpl implements MyRest {
    private HttpClient httpClient;

    public MyRestImpl(){
        httpClient = HttpClients.createDefault();
    }
    @Override
    public MyHttpResponse get(final String uri, Map<String, String> headers) {
        HttpGet get = new HttpGet(uri);
        try {
            HttpResponse response = httpClient.execute(get);
            response.getStatusLine().getStatusCode();
            return new MyHttpResponseImpl(response);
        } catch (IOException e) {
            e.printStackTrace();
            //TODO Ha ha returning null!
            return null;
        }
    }

    @Override
    public MyHttpResponse post(String uri, String data, Map<String, String> headers) {
        HttpPost post = new HttpPost();
        try {
            httpClient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MyHttpResponse put(String uri, String data, Map<String, String> headers) {
        return null;
    }

    @Override
    public MyHttpResponse delete(String uri, Map<String, String> headers) {
        return null;
    }
}
