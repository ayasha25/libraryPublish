package com.example.ayashalibrary03;

import android.content.Context;
import android.widget.Toast;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;

public class AyashaMessage {
   static Single res = new Single() {
        @Override
        protected void subscribeActual(@NonNull SingleObserver observer) {

        }
    };
    public static void s (Context context) {
        Toast.makeText(context,"hey",Toast.LENGTH_SHORT).show();
        res.blockingSubscribe();
    }
}
