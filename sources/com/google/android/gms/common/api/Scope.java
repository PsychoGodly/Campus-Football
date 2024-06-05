package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    final int f15006a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15007b;

    Scope(int i10, String str) {
        q.h(str, "scopeUri must not be null or empty");
        this.f15006a = i10;
        this.f15007b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f15007b.equals(((Scope) obj).f15007b);
    }

    public int hashCode() {
        return this.f15007b.hashCode();
    }

    public String toString() {
        return this.f15007b;
    }

    public String v() {
        return this.f15007b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15006a);
        c.q(parcel, 2, v(), false);
        c.b(parcel, a10);
    }

    public Scope(String str) {
        this(1, str);
    }
}
