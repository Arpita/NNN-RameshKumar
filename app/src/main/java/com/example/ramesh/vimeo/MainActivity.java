package com.example.ramesh.vimeo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    CategoriesAdapter adapter;
    ActivityMainBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new CategoriesAdapter();

        getAllCategories();
    }

    public void getAllCategories(){

        Call<CategoryModel> callRegisterUser = ApiInterface.getRestApiMethods(MainActivity.this).getAllCategories();
        callRegisterUser.enqueue(new ApiCallback<CategoryModel>(MainActivity.this) {

            @Override
            public void onApiResponse(Response<CategoryModel> response, boolean isSuccess, String message) {
                if (isSuccess) {
                    if (response != null && response.body() != null) {
                        finish();
                    }
                } else {

                }
            }

            @Override
            public void onApiFailure(boolean isSuccess, String message) {
            }
        });


    }

}
