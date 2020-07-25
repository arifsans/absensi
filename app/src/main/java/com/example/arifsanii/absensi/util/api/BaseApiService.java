package com.example.arifsanii.absensi.util.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseApiService {

    // Fungsi ini untuk memanggil API http://absensirpl.000webhostapp.com/login.php
    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> loginRequest(@Field("nip") String nip,
                                    @Field("pwd_dosen") String password);

    // Fungsi ini untuk memanggil API http://absensirpl.000webhostapp.com/register.php
    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseBody> registerRequest(@Field("name") String nama,
                                       @Field("nim") String nim,
                                       @Field("email") String email,
                                       @Field("password") String password);

}
