package com.nbgsoftware.gbrains.data.remote;

import com.nbgsoftware.gbrains.data.models.User;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiServices {

    @GET(ApiEndPoint.GET_DATA_USER)
    Single<User> getDataUser();

}
