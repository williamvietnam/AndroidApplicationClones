package com.instagram.data.network.utilities

import com.instagram.data.network.utilities.NetworkInterceptor.NetworkRequestCode.REQUEST_CODE_400
import com.instagram.data.network.utilities.NetworkInterceptor.NetworkRequestCode.REQUEST_CODE_401
import com.instagram.data.network.utilities.NetworkInterceptor.NetworkRequestCode.REQUEST_CODE_403
import com.instagram.data.network.utilities.NetworkInterceptor.NetworkRequestCode.REQUEST_CODE_404
import okhttp3.Interceptor
import okhttp3.Response
import timber.log.Timber

/**
 * Author: William Giang Nguyen | 8/7/2022
 * */
class NetworkInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = chain.proceed(request)

        when (response.code) {
            REQUEST_CODE_400, REQUEST_CODE_401, REQUEST_CODE_403, REQUEST_CODE_404 -> {
                Timber.d("network error code ${response.code}")
            }
        }
        return response
    }

    object NetworkRequestCode {
        const val REQUEST_CODE_200 = 200    //normal
        const val REQUEST_CODE_400 = 400    //parameter error
        const val REQUEST_CODE_401 = 401    //unauthorized error
        const val REQUEST_CODE_403 = 403
        const val REQUEST_CODE_404 = 404    //No data error
        const val REQUEST_CODE_500 = 500    //system error
    }
}
