package com.applovin.impl;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a6 implements m8 {

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f6293n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o  reason: collision with root package name */
    private static final Constructor f6294o;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6295b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6296c;

    /* renamed from: d  reason: collision with root package name */
    private int f6297d;

    /* renamed from: e  reason: collision with root package name */
    private int f6298e;

    /* renamed from: f  reason: collision with root package name */
    private int f6299f;

    /* renamed from: g  reason: collision with root package name */
    private int f6300g;

    /* renamed from: h  reason: collision with root package name */
    private int f6301h;

    /* renamed from: i  reason: collision with root package name */
    private int f6302i;

    /* renamed from: j  reason: collision with root package name */
    private int f6303j;

    /* renamed from: k  reason: collision with root package name */
    private int f6304k = 1;

    /* renamed from: l  reason: collision with root package name */
    private int f6305l;

    /* renamed from: m  reason: collision with root package name */
    private int f6306m = 112800;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(i8.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f6294o = constructor;
    }

    private void a(int i10, List list) {
        int i11 = 2;
        switch (i10) {
            case 0:
                list.add(new i());
                return;
            case 1:
                list.add(new l());
                return;
            case 2:
                boolean z10 = this.f6297d | this.f6295b;
                if (!this.f6296c) {
                    i11 = 0;
                }
                list.add(new j0(i11 | z10 ? 1 : 0));
                return;
            case 3:
                boolean z11 = this.f6298e | this.f6295b;
                if (!this.f6296c) {
                    i11 = 0;
                }
                list.add(new q0(i11 | z11 ? 1 : 0));
                return;
            case 4:
                Constructor constructor = f6294o;
                if (constructor != null) {
                    try {
                        list.add((i8) constructor.newInstance(new Object[]{Integer.valueOf(this.f6299f)}));
                        return;
                    } catch (Exception e10) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
                    }
                } else {
                    list.add(new t8(this.f6299f));
                    return;
                }
            case 5:
                list.add(new c9());
                return;
            case 6:
                list.add(new tc(this.f6300g));
                return;
            case 7:
                boolean z12 = this.f6303j | this.f6295b;
                if (!this.f6296c) {
                    i11 = 0;
                }
                list.add(new jf(i11 | z12 ? 1 : 0));
                return;
            case 8:
                list.add(new h9(this.f6302i));
                list.add(new kf(this.f6301h));
                return;
            case 9:
                list.add(new dg());
                return;
            case 10:
                list.add(new ei());
                return;
            case 11:
                list.add(new dp(this.f6304k, this.f6305l, this.f6306m));
                return;
            case 12:
                list.add(new mr());
                return;
            case 14:
                list.add(new tb());
                return;
            default:
                return;
        }
    }

    public synchronized i8[] a() {
        return a(Uri.EMPTY, (Map) new HashMap());
    }

    public synchronized i8[] a(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int a10 = o8.a(map);
        if (a10 != -1) {
            a(a10, (List) arrayList);
        }
        int a11 = o8.a(uri);
        if (!(a11 == -1 || a11 == a10)) {
            a(a11, (List) arrayList);
        }
        for (int i10 : f6293n) {
            if (!(i10 == a10 || i10 == a11)) {
                a(i10, (List) arrayList);
            }
        }
        return (i8[]) arrayList.toArray(new i8[arrayList.size()]);
    }
}
