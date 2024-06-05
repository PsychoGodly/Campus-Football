package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zzdg implements Parcelable.Creator<zzdd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    j10 = b.u(parcel2, r10);
                    break;
                case 2:
                    j11 = b.u(parcel2, r10);
                    break;
                case 3:
                    z10 = b.m(parcel2, r10);
                    break;
                case 4:
                    str = b.f(parcel2, r10);
                    break;
                case 5:
                    str2 = b.f(parcel2, r10);
                    break;
                case 6:
                    str3 = b.f(parcel2, r10);
                    break;
                case 7:
                    bundle = b.a(parcel2, r10);
                    break;
                case 8:
                    str4 = b.f(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new zzdd(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
