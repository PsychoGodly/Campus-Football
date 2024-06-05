package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.applovin.mediation.MaxReward;
import com.startapp.sdk.adsbase.a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.ImpressionsTrackingMetadata;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.z5;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
public class h3 implements h2<String, z5.a, Throwable, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15888a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f15889b;

    /* renamed from: c  reason: collision with root package name */
    public final TrackingParams f15890c;

    /* renamed from: d  reason: collision with root package name */
    public final i2<ImpressionsTrackingMetadata> f15891d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Pair<Integer, String>> f15892e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f15893f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicReference<ImpressionsTrackingMetadata> f15894g;

    /* renamed from: h  reason: collision with root package name */
    public String f15895h;

    public h3(Context context, List<String> list, TrackingParams trackingParams, i2<ImpressionsTrackingMetadata> i2Var) {
        this.f15888a = context;
        this.f15889b = list;
        this.f15890c = trackingParams;
        this.f15891d = i2Var;
        this.f15892e = Collections.synchronizedMap(new LinkedHashMap(list.size()));
        this.f15893f = new AtomicInteger(list.size());
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Pair pair;
        String str = (String) obj;
        Throwable th = (Throwable) obj3;
        if (((z5.a) obj2) != null) {
            pair = new Pair(4, String.valueOf(200));
        } else {
            if (th instanceof SDKException) {
                SDKException sDKException = (SDKException) th;
                if (sDKException.a() > 0) {
                    pair = new Pair(1, String.valueOf(sDKException.a()));
                } else {
                    th = th.getCause();
                }
            }
            pair = null;
        }
        if (pair == null) {
            if (th != null) {
                pair = new Pair(2, th.getClass().getName());
            } else {
                pair = new Pair(2, String.valueOf(-1));
            }
        }
        this.f15892e.put(str, pair);
        a();
        return null;
    }

    public static void a(Context context, List<String> list, TrackingParams trackingParams) {
        h3 h3Var = (h3) ComponentLocator.a(context).K.a().a(context, list, trackingParams);
        if (h3Var != null) {
            j9.a(h3Var.f15888a, 4, "Sending impression", true);
            for (String next : h3Var.f15889b) {
                if (next == null || next.length() <= 0) {
                    h3Var.f15892e.put(next, (Object) null);
                    h3Var.a();
                } else {
                    if (h3Var.f15895h == null) {
                        h3Var.f15895h = a.a(next, (String) null);
                    }
                    Pair<String, Boolean> a10 = t8.a(h3Var.f15888a, next, h3Var.f15890c, (h2<String, z5.a, Throwable, Void>) h3Var);
                    boolean equals = Boolean.TRUE.equals(a10.second);
                    h3Var.f15892e.put((String) a10.first, (Object) null);
                    if (!equals) {
                        h3Var.a();
                    }
                }
            }
        }
    }

    public final void a() {
        String str;
        if (this.f15893f.decrementAndGet() == 0) {
            AtomicReference<ImpressionsTrackingMetadata> atomicReference = this.f15894g;
            String str2 = null;
            if (atomicReference == null) {
                ImpressionsTrackingMetadata a10 = this.f15891d.a();
                if (a10 == null || a10.a() <= Math.random()) {
                    a10 = null;
                }
                AtomicReference<ImpressionsTrackingMetadata> atomicReference2 = new AtomicReference<>(a10);
                this.f15894g = atomicReference2;
                atomicReference = atomicReference2;
            }
            ImpressionsTrackingMetadata impressionsTrackingMetadata = atomicReference.get();
            if (impressionsTrackingMetadata != null) {
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                boolean z10 = false;
                String str3 = MaxReward.DEFAULT_LABEL;
                for (Map.Entry next : this.f15892e.entrySet()) {
                    Integer num = next.getValue() != null ? (Integer) ((Pair) next.getValue()).first : 2;
                    if (num != null && (impressionsTrackingMetadata.b() & num.intValue()) == num.intValue()) {
                        String valueOf = next.getValue() != null ? (String) ((Pair) next.getValue()).second : String.valueOf(-2);
                        String str4 = (String) next.getKey();
                        sb2.append(str3);
                        sb2.append(valueOf);
                        sb3.append(str3);
                        if (str4 != null) {
                            try {
                                Uri parse = Uri.parse(str4);
                                str = parse.getAuthority() + parse.getPath();
                            } catch (Throwable th) {
                                str = th.getClass().getName();
                            }
                        } else {
                            str = String.valueOf((char[]) null);
                        }
                        sb3.append(str);
                        z10 = true;
                        str3 = ",";
                    }
                }
                if (z10) {
                    i3 i3Var = new i3(j3.f15959l);
                    i3Var.f15915e = sb2 + ";" + sb3;
                    i3Var.f15917g = this.f15895h;
                    StringBuilder a11 = p0.a("adTag: ");
                    TrackingParams trackingParams = this.f15890c;
                    if (trackingParams != null) {
                        str2 = trackingParams.a();
                    }
                    a11.append(str2);
                    i3Var.f15914d = a11.toString();
                    i3Var.a();
                }
            }
        }
    }
}
