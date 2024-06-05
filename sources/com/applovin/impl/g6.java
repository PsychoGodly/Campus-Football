package com.applovin.impl;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.impl.g5;
import com.applovin.impl.t5;
import com.applovin.impl.yh;

public final class g6 implements yd {

    /* renamed from: a  reason: collision with root package name */
    private final g5.a f7912a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f7913b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f7914c;

    /* renamed from: d  reason: collision with root package name */
    private long f7915d;

    /* renamed from: e  reason: collision with root package name */
    private long f7916e;

    /* renamed from: f  reason: collision with root package name */
    private long f7917f;

    /* renamed from: g  reason: collision with root package name */
    private float f7918g;

    /* renamed from: h  reason: collision with root package name */
    private float f7919h;

    public g6(Context context, m8 m8Var) {
        this((g5.a) new t5.a(context), m8Var);
    }

    private static SparseArray a(g5.a aVar, m8 m8Var) {
        Class<g5.a> cls = g5.a.class;
        Class<yd> cls2 = yd.class;
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (yd) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (yd) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (yd) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{aVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (yd) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new yh.b(aVar, m8Var));
        return sparseArray;
    }

    public g6(g5.a aVar, m8 m8Var) {
        this.f7912a = aVar;
        SparseArray a10 = a(aVar, m8Var);
        this.f7913b = a10;
        this.f7914c = new int[a10.size()];
        for (int i10 = 0; i10 < this.f7913b.size(); i10++) {
            this.f7914c[i10] = this.f7913b.keyAt(i10);
        }
        this.f7915d = -9223372036854775807L;
        this.f7916e = -9223372036854775807L;
        this.f7917f = -9223372036854775807L;
        this.f7918g = -3.4028235E38f;
        this.f7919h = -3.4028235E38f;
    }
}
