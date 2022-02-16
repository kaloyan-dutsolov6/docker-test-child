package test.service;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.util.List;

public class HttpService {

    private static final String URL = "http:host.docker.internal:8081/test/result";
    private final OkHttpClient httpClient;

    public HttpService() {
        this.httpClient = new OkHttpClient();
    }
}
