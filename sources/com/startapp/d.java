package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.Set;

/* compiled from: Sta */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15716a;

    /* renamed from: b  reason: collision with root package name */
    public final n4<AdvertisingIdResolver> f15717b;

    /* renamed from: c  reason: collision with root package name */
    public final i2<AdDebuggerMetadata> f15718c;

    public d(Context context, n4<AdvertisingIdResolver> n4Var, i2<AdDebuggerMetadata> i2Var) {
        this.f15716a = context;
        this.f15717b = n4Var;
        this.f15718c = i2Var;
    }

    public boolean a() {
        Set<String> a10;
        AdDebuggerMetadata a11 = this.f15718c.a();
        if (a11 == null || (a10 = a11.a()) == null) {
            return false;
        }
        return a10.contains(this.f15717b.a().a().f17341a);
    }
}
