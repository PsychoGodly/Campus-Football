package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class k4 extends a {
    public static final Parcelable.Creator<k4> CREATOR = new l4();

    /* renamed from: a  reason: collision with root package name */
    public final String f14487a;

    k4(String str) {
        this.f14487a = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 15, this.f14487a, false);
        c.b(parcel, a10);
    }
}
