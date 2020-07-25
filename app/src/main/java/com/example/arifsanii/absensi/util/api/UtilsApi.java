package com.example.arifsanii.absensi.util.api;

public class UtilsApi {

    // http://absensirpl.000webhostapp.com ini adalah localhost.
    public static final String BASE_URL_API = "http://absensirpl.000webhostapp.com/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
