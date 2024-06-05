package com.h2.dynamic_app;

import android.content.Context;
import android.view.LayoutInflater;
import io.flutter.embedding.android.d;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.googlemobileads.h0;

public class MainActivity extends d {
    public a l(Context context) {
        return com.ryanheise.audioservice.a.B(context);
    }

    public void n(a aVar) {
        aVar.q().f(new h0());
        super.n(aVar);
        h0.c(aVar, "NativeAdmobFactory", new a(LayoutInflater.from(this)));
    }

    public void t(a aVar) {
        h0.g(aVar, "NativeAdmobFactory");
    }
}
