package com.mobile.pvnews.utils

import android.content.Context
import android.net.ConnectivityManager
import com.mobile.pvnews.utils.NetworkHelper
import javax.inject.Inject

class NetworkHelperImpl @Inject constructor(private val context: Context) : NetworkHelper {

    override fun isNetworkConnected(): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork?.isConnected ?: false
    }
}