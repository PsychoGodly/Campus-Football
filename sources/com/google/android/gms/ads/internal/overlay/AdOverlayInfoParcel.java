package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.j;
import com.google.android.gms.ads.internal.util.t0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcvb;
import com.google.android.gms.internal.ads.zzdcc;
import com.google.android.gms.internal.ads.zzdpi;
import com.google.android.gms.internal.ads.zzeaf;
import com.google.android.gms.internal.ads.zzfdk;
import i5.a;
import i5.c;
import t4.e0;
import t4.i;
import t4.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final i f14697a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.a f14698b;

    /* renamed from: c  reason: collision with root package name */
    public final t f14699c;

    /* renamed from: d  reason: collision with root package name */
    public final zzcei f14700d;

    /* renamed from: f  reason: collision with root package name */
    public final zzbgk f14701f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14702g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14703h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14704i;

    /* renamed from: j  reason: collision with root package name */
    public final e0 f14705j;

    /* renamed from: k  reason: collision with root package name */
    public final int f14706k;

    /* renamed from: l  reason: collision with root package name */
    public final int f14707l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14708m;

    /* renamed from: n  reason: collision with root package name */
    public final zzbzg f14709n;

    /* renamed from: o  reason: collision with root package name */
    public final String f14710o;

    /* renamed from: p  reason: collision with root package name */
    public final j f14711p;

    /* renamed from: q  reason: collision with root package name */
    public final zzbgi f14712q;

    /* renamed from: r  reason: collision with root package name */
    public final String f14713r;

    /* renamed from: s  reason: collision with root package name */
    public final zzeaf f14714s;

    /* renamed from: t  reason: collision with root package name */
    public final zzdpi f14715t;

    /* renamed from: u  reason: collision with root package name */
    public final zzfdk f14716u;

    /* renamed from: v  reason: collision with root package name */
    public final t0 f14717v;

    /* renamed from: w  reason: collision with root package name */
    public final String f14718w;

    /* renamed from: x  reason: collision with root package name */
    public final String f14719x;

    /* renamed from: y  reason: collision with root package name */
    public final zzcvb f14720y;

    /* renamed from: z  reason: collision with root package name */
    public final zzdcc f14721z;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, t tVar, zzbgi zzbgi, zzbgk zzbgk, e0 e0Var, zzcei zzcei, boolean z10, int i10, String str, zzbzg zzbzg, zzdcc zzdcc) {
        this.f14697a = null;
        this.f14698b = aVar;
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14712q = zzbgi;
        this.f14701f = zzbgk;
        this.f14702g = null;
        this.f14703h = z10;
        this.f14704i = null;
        this.f14705j = e0Var;
        this.f14706k = i10;
        this.f14707l = 3;
        this.f14708m = str;
        this.f14709n = zzbzg;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = zzdcc;
    }

    public static AdOverlayInfoParcel b(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.f14697a, i10, false);
        c.j(parcel, 3, b.B1(this.f14698b).asBinder(), false);
        c.j(parcel, 4, b.B1(this.f14699c).asBinder(), false);
        c.j(parcel, 5, b.B1(this.f14700d).asBinder(), false);
        c.j(parcel, 6, b.B1(this.f14701f).asBinder(), false);
        c.q(parcel, 7, this.f14702g, false);
        c.c(parcel, 8, this.f14703h);
        c.q(parcel, 9, this.f14704i, false);
        c.j(parcel, 10, b.B1(this.f14705j).asBinder(), false);
        c.k(parcel, 11, this.f14706k);
        c.k(parcel, 12, this.f14707l);
        c.q(parcel, 13, this.f14708m, false);
        c.p(parcel, 14, this.f14709n, i10, false);
        c.q(parcel, 16, this.f14710o, false);
        c.p(parcel, 17, this.f14711p, i10, false);
        c.j(parcel, 18, b.B1(this.f14712q).asBinder(), false);
        c.q(parcel, 19, this.f14713r, false);
        c.j(parcel, 20, b.B1(this.f14714s).asBinder(), false);
        c.j(parcel, 21, b.B1(this.f14715t).asBinder(), false);
        c.j(parcel, 22, b.B1(this.f14716u).asBinder(), false);
        c.j(parcel, 23, b.B1(this.f14717v).asBinder(), false);
        c.q(parcel, 24, this.f14718w, false);
        c.q(parcel, 25, this.f14719x, false);
        c.j(parcel, 26, b.B1(this.f14720y).asBinder(), false);
        c.j(parcel, 27, b.B1(this.f14721z).asBinder(), false);
        c.b(parcel, a10);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, t tVar, zzbgi zzbgi, zzbgk zzbgk, e0 e0Var, zzcei zzcei, boolean z10, int i10, String str, String str2, zzbzg zzbzg, zzdcc zzdcc) {
        this.f14697a = null;
        this.f14698b = aVar;
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14712q = zzbgi;
        this.f14701f = zzbgk;
        this.f14702g = str2;
        this.f14703h = z10;
        this.f14704i = str;
        this.f14705j = e0Var;
        this.f14706k = i10;
        this.f14707l = 3;
        this.f14708m = null;
        this.f14709n = zzbzg;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = zzdcc;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, t tVar, e0 e0Var, zzcei zzcei, int i10, zzbzg zzbzg, String str, j jVar, String str2, String str3, String str4, zzcvb zzcvb) {
        this.f14697a = null;
        this.f14698b = null;
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14712q = null;
        this.f14701f = null;
        this.f14703h = false;
        if (((Boolean) a0.c().zzb(zzbar.zzaC)).booleanValue()) {
            this.f14702g = null;
            this.f14704i = null;
        } else {
            this.f14702g = str2;
            this.f14704i = str3;
        }
        this.f14705j = null;
        this.f14706k = i10;
        this.f14707l = 1;
        this.f14708m = null;
        this.f14709n = zzbzg;
        this.f14710o = str;
        this.f14711p = jVar;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = str4;
        this.f14720y = zzcvb;
        this.f14721z = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, t tVar, e0 e0Var, zzcei zzcei, boolean z10, int i10, zzbzg zzbzg, zzdcc zzdcc) {
        this.f14697a = null;
        this.f14698b = aVar;
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14712q = null;
        this.f14701f = null;
        this.f14702g = null;
        this.f14703h = z10;
        this.f14704i = null;
        this.f14705j = e0Var;
        this.f14706k = i10;
        this.f14707l = 2;
        this.f14708m = null;
        this.f14709n = zzbzg;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = zzdcc;
    }

    AdOverlayInfoParcel(i iVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, zzbzg zzbzg, String str4, j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f14697a = iVar;
        this.f14698b = (com.google.android.gms.ads.internal.client.a) b.A1(a.C0158a.M0(iBinder));
        this.f14699c = (t) b.A1(a.C0158a.M0(iBinder2));
        this.f14700d = (zzcei) b.A1(a.C0158a.M0(iBinder3));
        this.f14712q = (zzbgi) b.A1(a.C0158a.M0(iBinder6));
        this.f14701f = (zzbgk) b.A1(a.C0158a.M0(iBinder4));
        this.f14702g = str;
        this.f14703h = z10;
        this.f14704i = str2;
        this.f14705j = (e0) b.A1(a.C0158a.M0(iBinder5));
        this.f14706k = i10;
        this.f14707l = i11;
        this.f14708m = str3;
        this.f14709n = zzbzg;
        this.f14710o = str4;
        this.f14711p = jVar;
        this.f14713r = str5;
        this.f14718w = str6;
        this.f14714s = (zzeaf) b.A1(a.C0158a.M0(iBinder7));
        this.f14715t = (zzdpi) b.A1(a.C0158a.M0(iBinder8));
        this.f14716u = (zzfdk) b.A1(a.C0158a.M0(iBinder9));
        this.f14717v = (t0) b.A1(a.C0158a.M0(iBinder10));
        this.f14719x = str7;
        this.f14720y = (zzcvb) b.A1(a.C0158a.M0(iBinder11));
        this.f14721z = (zzdcc) b.A1(a.C0158a.M0(iBinder12));
    }

    public AdOverlayInfoParcel(i iVar, com.google.android.gms.ads.internal.client.a aVar, t tVar, e0 e0Var, zzbzg zzbzg, zzcei zzcei, zzdcc zzdcc) {
        this.f14697a = iVar;
        this.f14698b = aVar;
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14712q = null;
        this.f14701f = null;
        this.f14702g = null;
        this.f14703h = false;
        this.f14704i = null;
        this.f14705j = e0Var;
        this.f14706k = -1;
        this.f14707l = 4;
        this.f14708m = null;
        this.f14709n = zzbzg;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = zzdcc;
    }

    public AdOverlayInfoParcel(t tVar, zzcei zzcei, int i10, zzbzg zzbzg) {
        this.f14699c = tVar;
        this.f14700d = zzcei;
        this.f14706k = 1;
        this.f14709n = zzbzg;
        this.f14697a = null;
        this.f14698b = null;
        this.f14712q = null;
        this.f14701f = null;
        this.f14702g = null;
        this.f14703h = false;
        this.f14704i = null;
        this.f14705j = null;
        this.f14707l = 1;
        this.f14708m = null;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = null;
        this.f14718w = null;
        this.f14714s = null;
        this.f14715t = null;
        this.f14716u = null;
        this.f14717v = null;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = null;
    }

    public AdOverlayInfoParcel(zzcei zzcei, zzbzg zzbzg, t0 t0Var, zzeaf zzeaf, zzdpi zzdpi, zzfdk zzfdk, String str, String str2, int i10) {
        this.f14697a = null;
        this.f14698b = null;
        this.f14699c = null;
        this.f14700d = zzcei;
        this.f14712q = null;
        this.f14701f = null;
        this.f14702g = null;
        this.f14703h = false;
        this.f14704i = null;
        this.f14705j = null;
        this.f14706k = 14;
        this.f14707l = 5;
        this.f14708m = null;
        this.f14709n = zzbzg;
        this.f14710o = null;
        this.f14711p = null;
        this.f14713r = str;
        this.f14718w = str2;
        this.f14714s = zzeaf;
        this.f14715t = zzdpi;
        this.f14716u = zzfdk;
        this.f14717v = t0Var;
        this.f14719x = null;
        this.f14720y = null;
        this.f14721z = null;
    }
}
