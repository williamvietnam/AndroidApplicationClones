package com.instagram.data.network.firebase

import com.google.firebase.firestore.FirebaseFirestore
import com.instagram.data.network.firebase.FirebaseServicesHelper

class FirebaseServicesImplement(
    private val firebaseFireStore: FirebaseFirestore = FirebaseFirestore.getInstance()
) : FirebaseServicesHelper {

    override fun getFirebaseFireStore(): FirebaseFirestore {
        FirebaseFirestore.setLoggingEnabled(true)
        return this.firebaseFireStore
    }
}