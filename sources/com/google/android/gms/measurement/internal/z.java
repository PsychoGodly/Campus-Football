package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class z extends a implements Iterable<String> {
    public static final Parcelable.Creator<z> CREATOR = new b0();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f25309a;

    z(Bundle bundle) {
        this.f25309a = bundle;
    }

    public final Iterator<String> iterator() {
        return new c0(this);
    }

    public final String toString() {
        return this.f25309a.toString();
    }

    /* access modifiers changed from: package-private */
    public final Double v(String str) {
        return Double.valueOf(this.f25309a.getDouble(str));
    }

    public final Bundle w() {
        return new Bundle(this.f25309a);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, w(), false);
        c.b(parcel, a10);
    }

    /* access modifiers changed from: package-private */
    public final Long x(String str) {
        return Long.valueOf(this.f25309a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Object y(String str) {
        return this.f25309a.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String z(String str) {
        return this.f25309a.getString(str);
    }

    public final int zza() {
        return this.f25309a.size();
    }
}
