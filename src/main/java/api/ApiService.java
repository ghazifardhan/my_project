/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import models.CallbackData;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author Riesto
 */
public interface ApiService {
    
    @GET("/check")
    Call<ResponseBody> checkApiVersion();
    
    @POST("/login")
    @FormUrlEncoded
    Call<ResponseBody> login(@Field("email") String email, @Field("password") String password);
    
    @POST("/register")
    @FormUrlEncoded
    Call<ResponseBody> register(@Field("name") String name, @Field("email") String email, @Field("password") String password, @Field("password_confirmation") String password_confirmation);
    
}
