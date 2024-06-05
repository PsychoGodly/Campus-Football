package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.w2;
import com.google.android.gms.ads.internal.client.z4;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsp implements Parcelable.Creator {
    public static final zzbso zza(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        long j10 = 0;
        long j11 = 0;
        Bundle bundle = null;
        u4 u4Var = null;
        z4 z4Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzbzg zzbzg = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbdl zzbdl = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        w2 w2Var = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbjx zzbjx = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i16 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i17 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    bundle = b.a(parcel2, r10);
                    break;
                case 3:
                    u4Var = (u4) b.e(parcel2, r10, u4.CREATOR);
                    break;
                case 4:
                    z4Var = (z4) b.e(parcel2, r10, z4.CREATOR);
                    break;
                case 5:
                    str = b.f(parcel2, r10);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) b.e(parcel2, r10, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) b.e(parcel2, r10, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = b.f(parcel2, r10);
                    break;
                case 9:
                    str3 = b.f(parcel2, r10);
                    break;
                case 10:
                    str4 = b.f(parcel2, r10);
                    break;
                case 11:
                    zzbzg = (zzbzg) b.e(parcel2, r10, zzbzg.CREATOR);
                    break;
                case 12:
                    bundle2 = b.a(parcel2, r10);
                    break;
                case 13:
                    i11 = b.t(parcel2, r10);
                    break;
                case 14:
                    arrayList = b.h(parcel2, r10);
                    break;
                case 15:
                    bundle3 = b.a(parcel2, r10);
                    break;
                case 16:
                    z10 = b.m(parcel2, r10);
                    break;
                case 18:
                    i12 = b.t(parcel2, r10);
                    break;
                case 19:
                    i13 = b.t(parcel2, r10);
                    break;
                case 20:
                    f10 = b.p(parcel2, r10);
                    break;
                case 21:
                    str5 = b.f(parcel2, r10);
                    break;
                case 25:
                    j10 = b.u(parcel2, r10);
                    break;
                case 26:
                    str6 = b.f(parcel2, r10);
                    break;
                case 27:
                    arrayList2 = b.h(parcel2, r10);
                    break;
                case 28:
                    str7 = b.f(parcel2, r10);
                    break;
                case 29:
                    zzbdl = (zzbdl) b.e(parcel2, r10, zzbdl.CREATOR);
                    break;
                case 30:
                    arrayList3 = b.h(parcel2, r10);
                    break;
                case 31:
                    j11 = b.u(parcel2, r10);
                    break;
                case 33:
                    str8 = b.f(parcel2, r10);
                    break;
                case 34:
                    f11 = b.p(parcel2, r10);
                    break;
                case 35:
                    i14 = b.t(parcel2, r10);
                    break;
                case 36:
                    i15 = b.t(parcel2, r10);
                    break;
                case 37:
                    z12 = b.m(parcel2, r10);
                    break;
                case 39:
                    str9 = b.f(parcel2, r10);
                    break;
                case 40:
                    z11 = b.m(parcel2, r10);
                    break;
                case 41:
                    str10 = b.f(parcel2, r10);
                    break;
                case 42:
                    z13 = b.m(parcel2, r10);
                    break;
                case 43:
                    i16 = b.t(parcel2, r10);
                    break;
                case 44:
                    bundle4 = b.a(parcel2, r10);
                    break;
                case 45:
                    str11 = b.f(parcel2, r10);
                    break;
                case 46:
                    w2Var = (w2) b.e(parcel2, r10, w2.CREATOR);
                    break;
                case 47:
                    z14 = b.m(parcel2, r10);
                    break;
                case 48:
                    bundle5 = b.a(parcel2, r10);
                    break;
                case 49:
                    str12 = b.f(parcel2, r10);
                    break;
                case 50:
                    str13 = b.f(parcel2, r10);
                    break;
                case 51:
                    str14 = b.f(parcel2, r10);
                    break;
                case 52:
                    z15 = b.m(parcel2, r10);
                    break;
                case 53:
                    arrayList4 = b.d(parcel2, r10);
                    break;
                case 54:
                    str15 = b.f(parcel2, r10);
                    break;
                case 55:
                    arrayList5 = b.h(parcel2, r10);
                    break;
                case 56:
                    i17 = b.t(parcel2, r10);
                    break;
                case 57:
                    z16 = b.m(parcel2, r10);
                    break;
                case 58:
                    z17 = b.m(parcel2, r10);
                    break;
                case 59:
                    z18 = b.m(parcel2, r10);
                    break;
                case 60:
                    arrayList6 = b.h(parcel2, r10);
                    break;
                case 61:
                    str16 = b.f(parcel2, r10);
                    break;
                case 63:
                    zzbjx = (zzbjx) b.e(parcel2, r10, zzbjx.CREATOR);
                    break;
                case 64:
                    str17 = b.f(parcel2, r10);
                    break;
                case 65:
                    bundle6 = b.a(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new zzbso(i10, bundle, u4Var, z4Var, str, applicationInfo, packageInfo, str2, str3, str4, zzbzg, bundle2, i11, arrayList, bundle3, z10, i12, i13, f10, str5, j10, str6, arrayList2, str7, zzbdl, arrayList3, j11, str8, f11, z11, i14, i15, z12, str9, str10, z13, i16, bundle4, str11, w2Var, z14, bundle5, str12, str13, str14, z15, arrayList4, str15, arrayList5, i17, z16, z17, z18, arrayList6, str16, zzbjx, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbso[i10];
    }
}
