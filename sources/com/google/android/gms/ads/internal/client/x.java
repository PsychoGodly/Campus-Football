package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbzg;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class x {

    /* renamed from: f  reason: collision with root package name */
    private static final x f14597f = new x();

    /* renamed from: a  reason: collision with root package name */
    private final zzbyt f14598a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14599b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14600c;

    /* renamed from: d  reason: collision with root package name */
    private final zzbzg f14601d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f14602e;

    protected x() {
        zzbyt zzbyt = new zzbyt();
        v vVar = new v(new t4(), new r4(), new t3(), new zzbfw(), new zzbvi(), new zzbqz(), new zzbfx());
        String zzd = zzbyt.zzd();
        zzbzg zzbzg = new zzbzg(0, (int) ModuleDescriptor.MODULE_VERSION, true, false, false);
        Random random = new Random();
        this.f14598a = zzbyt;
        this.f14599b = vVar;
        this.f14600c = zzd;
        this.f14601d = zzbzg;
        this.f14602e = random;
    }

    public static v a() {
        return f14597f.f14599b;
    }

    public static zzbyt b() {
        return f14597f.f14598a;
    }

    public static zzbzg c() {
        return f14597f.f14601d;
    }

    public static String d() {
        return f14597f.f14600c;
    }

    public static Random e() {
        return f14597f.f14602e;
    }
}
