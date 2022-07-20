package com.nbgsoftware.gbrains.data.remote;

import com.nbgsoftware.gbrains.data.models.User;

import io.reactivex.rxjava3.core.Single;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelperImplement implements ApiHelper {

    private ApiServices apiService;

    public ApiServices getApiService() {
        this.apiService = ApiClient.getInstance().getRetrofit().create(ApiServices.class);
        return apiService;
    }

    public static class ApiClient {
        private static ApiClient instance;
        private final Retrofit retrofit;

        public static ApiClient getInstance() {
            if (instance == null) {
                instance = new ApiClient();
            }
            return instance;
        }

        private ApiClient() {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(httpLoggingInterceptor)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiEndPoint.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                    .build();
        }

        public Retrofit getRetrofit() {
            return retrofit;
        }
    }

    @Override
    public Single<User> getDataUser() {
        return apiService.getDataUser();
    }
}
