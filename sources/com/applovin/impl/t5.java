package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class t5 implements g5 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12249a;

    /* renamed from: b  reason: collision with root package name */
    private final List f12250b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final g5 f12251c;

    /* renamed from: d  reason: collision with root package name */
    private g5 f12252d;

    /* renamed from: e  reason: collision with root package name */
    private g5 f12253e;

    /* renamed from: f  reason: collision with root package name */
    private g5 f12254f;

    /* renamed from: g  reason: collision with root package name */
    private g5 f12255g;

    /* renamed from: h  reason: collision with root package name */
    private g5 f12256h;

    /* renamed from: i  reason: collision with root package name */
    private g5 f12257i;

    /* renamed from: j  reason: collision with root package name */
    private g5 f12258j;

    /* renamed from: k  reason: collision with root package name */
    private g5 f12259k;

    public static final class a implements g5.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f12260a;

        /* renamed from: b  reason: collision with root package name */
        private final g5.a f12261b;

        /* renamed from: c  reason: collision with root package name */
        private yo f12262c;

        public a(Context context) {
            this(context, new b6.b());
        }

        /* renamed from: b */
        public t5 a() {
            t5 t5Var = new t5(this.f12260a, this.f12261b.a());
            yo yoVar = this.f12262c;
            if (yoVar != null) {
                t5Var.a(yoVar);
            }
            return t5Var;
        }

        public a(Context context, g5.a aVar) {
            this.f12260a = context.getApplicationContext();
            this.f12261b = aVar;
        }
    }

    public t5(Context context, g5 g5Var) {
        this.f12249a = context.getApplicationContext();
        this.f12251c = (g5) a1.a((Object) g5Var);
    }

    private void a(g5 g5Var) {
        for (int i10 = 0; i10 < this.f12250b.size(); i10++) {
            g5Var.a((yo) this.f12250b.get(i10));
        }
    }

    private g5 g() {
        if (this.f12253e == null) {
            b1 b1Var = new b1(this.f12249a);
            this.f12253e = b1Var;
            a((g5) b1Var);
        }
        return this.f12253e;
    }

    private g5 h() {
        if (this.f12254f == null) {
            q4 q4Var = new q4(this.f12249a);
            this.f12254f = q4Var;
            a((g5) q4Var);
        }
        return this.f12254f;
    }

    private g5 i() {
        if (this.f12257i == null) {
            f5 f5Var = new f5();
            this.f12257i = f5Var;
            a((g5) f5Var);
        }
        return this.f12257i;
    }

    private g5 j() {
        if (this.f12252d == null) {
            n8 n8Var = new n8();
            this.f12252d = n8Var;
            a((g5) n8Var);
        }
        return this.f12252d;
    }

    private g5 k() {
        if (this.f12258j == null) {
            hi hiVar = new hi(this.f12249a);
            this.f12258j = hiVar;
            a((g5) hiVar);
        }
        return this.f12258j;
    }

    private g5 l() {
        if (this.f12255g == null) {
            try {
                g5 g5Var = (g5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f12255g = g5Var;
                a(g5Var);
            } catch (ClassNotFoundException unused) {
                kc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f12255g == null) {
                this.f12255g = this.f12251c;
            }
        }
        return this.f12255g;
    }

    private g5 m() {
        if (this.f12256h == null) {
            op opVar = new op();
            this.f12256h = opVar;
            a((g5) opVar);
        }
        return this.f12256h;
    }

    public Uri c() {
        g5 g5Var = this.f12259k;
        if (g5Var == null) {
            return null;
        }
        return g5Var.c();
    }

    public void close() {
        g5 g5Var = this.f12259k;
        if (g5Var != null) {
            try {
                g5Var.close();
            } finally {
                this.f12259k = null;
            }
        }
    }

    public Map e() {
        g5 g5Var = this.f12259k;
        return g5Var == null ? Collections.emptyMap() : g5Var.e();
    }

    public void a(yo yoVar) {
        a1.a((Object) yoVar);
        this.f12251c.a(yoVar);
        this.f12250b.add(yoVar);
        a(this.f12252d, yoVar);
        a(this.f12253e, yoVar);
        a(this.f12254f, yoVar);
        a(this.f12255g, yoVar);
        a(this.f12256h, yoVar);
        a(this.f12257i, yoVar);
        a(this.f12258j, yoVar);
    }

    private void a(g5 g5Var, yo yoVar) {
        if (g5Var != null) {
            g5Var.a(yoVar);
        }
    }

    public long a(j5 j5Var) {
        a1.b(this.f12259k == null);
        String scheme = j5Var.f8675a.getScheme();
        if (yp.a(j5Var.f8675a)) {
            String path = j5Var.f8675a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f12259k = j();
            } else {
                this.f12259k = g();
            }
        } else if ("asset".equals(scheme)) {
            this.f12259k = g();
        } else if ("content".equals(scheme)) {
            this.f12259k = h();
        } else if ("rtmp".equals(scheme)) {
            this.f12259k = l();
        } else if ("udp".equals(scheme)) {
            this.f12259k = m();
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            this.f12259k = i();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f12259k = k();
        } else {
            this.f12259k = this.f12251c;
        }
        return this.f12259k.a(j5Var);
    }

    public int a(byte[] bArr, int i10, int i11) {
        return ((g5) a1.a((Object) this.f12259k)).a(bArr, i10, i11);
    }
}
