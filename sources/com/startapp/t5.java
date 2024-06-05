package com.startapp;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.List;

/* compiled from: Sta */
public class t5 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f17297a;

    public t5(NativeAdDetails nativeAdDetails) {
        this.f17297a = nativeAdDetails;
    }

    public void onViewAttachedToWindow(View view) {
        View view2;
        AdDetails adDetails;
        List<VerificationDetails> b10;
        NativeAdDetails nativeAdDetails = this.f17297a;
        nativeAdDetails.getClass();
        if (!(!MetaData.f17070k.V() || (view2 = (View) nativeAdDetails.f16537h.get()) == null || (adDetails = nativeAdDetails.f16530a) == null || (b10 = adDetails.b()) == null)) {
            b6 b6Var = new b6(view2.getContext(), b10, false);
            nativeAdDetails.f16540k = b6Var;
            if (b6Var.c()) {
                nativeAdDetails.f16540k.a(view2);
                nativeAdDetails.f16540k.e();
                nativeAdDetails.f16540k.d();
                nativeAdDetails.f16540k.b();
            }
        }
        this.f17297a.a();
    }

    public void onViewDetachedFromWindow(View view) {
        NativeAdDetails nativeAdDetails = this.f17297a;
        ra raVar = nativeAdDetails.f16536g;
        if (raVar != null) {
            raVar.a();
            nativeAdDetails.f16536g = null;
        }
        NativeAdDetails nativeAdDetails2 = this.f17297a;
        b6 b6Var = nativeAdDetails2.f16540k;
        if (b6Var != null) {
            b6Var.a();
            nativeAdDetails2.f16540k = null;
        }
        view.removeOnAttachStateChangeListener(this.f17297a.f16538i);
    }
}
