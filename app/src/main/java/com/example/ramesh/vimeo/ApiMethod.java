package com.example.ramesh.vimeo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

/**
 * Created by Ramesh on 2/22/2019.
 */

public interface ApiMethod {


    @GET("app/media?")
    @Headers({})
    Call<CategoryModel> getAllCategories(@Header("Authorization") String loginToken);


}
