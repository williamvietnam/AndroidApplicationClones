package com.instagram.data.network.firebase

import com.google.firebase.firestore.FirebaseFirestore

interface FirebaseServicesHelper {
    fun getFirebaseFireStore(): FirebaseFirestore
}