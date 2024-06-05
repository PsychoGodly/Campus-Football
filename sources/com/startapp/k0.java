package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u7;

/* compiled from: Sta */
public class k0 extends GetAdRequest {
    public boolean U0;
    public int V0;

    public void a(r6 r6Var) throws SDKException {
        super.a(r6Var);
        r6Var.a("fixedSize", (Object) Boolean.valueOf(this.U0), false, true);
        r6Var.a("bnrt", (Object) Integer.valueOf(this.V0), false, true);
    }

    public void f(Context context) {
        String str;
        u7 u10 = ComponentLocator.a(context).u();
        AdPreferences.Placement placement = this.f17029j0;
        int i10 = this.V0;
        if (placement == null) {
            str = null;
        } else {
            str = u10.f17374a.get(new u7.a(placement, i10));
        }
        this.f17044y0 = str;
    }
}
