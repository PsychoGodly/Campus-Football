package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

public class uj {

    /* renamed from: a  reason: collision with root package name */
    private final k f12593a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12594b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f12595c = new Object();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12596a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.applovin.impl.uj$b[] r0 = com.applovin.impl.uj.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12596a = r0
                com.applovin.impl.uj$b r1 = com.applovin.impl.uj.b.AD_FORMAT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12596a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.impl.uj$b r1 = com.applovin.impl.uj.b.AD_UNIT_ID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12596a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.applovin.impl.uj$b r1 = com.applovin.impl.uj.b.ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.uj.a.<clinit>():void");
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final vj f12601a;

        /* renamed from: b  reason: collision with root package name */
        private final long f12602b;

        /* renamed from: c  reason: collision with root package name */
        private final long f12603c;

        private c(vj vjVar, long j10) {
            this.f12601a = vjVar;
            this.f12602b = j10;
            this.f12603c = SystemClock.elapsedRealtime();
        }

        /* access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f12603c > this.f12602b;
        }

        public vj c() {
            return this.f12601a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            vj c10 = c();
            vj c11 = cVar.c();
            return c10 != null ? c10.equals(c11) : c11 == null;
        }

        public int hashCode() {
            long b10 = b();
            long a10 = a();
            int i10 = ((((int) (b10 ^ (b10 >>> 32))) + 59) * 59) + ((int) ((a10 >>> 32) ^ a10));
            vj c10 = c();
            return (i10 * 59) + (c10 == null ? 43 : c10.hashCode());
        }

        public String toString() {
            return "SignalCacheManager.SignalWrapper(signal=" + c() + ", expirationTimeMillis=" + b() + ", cacheTimestampMillis=" + a() + ")";
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public long b() {
            return this.f12602b;
        }

        public long a() {
            return this.f12603c;
        }

        /* synthetic */ c(vj vjVar, long j10, a aVar) {
            this(vjVar, j10);
        }
    }

    public uj(k kVar) {
        this.f12593a = kVar;
    }

    private String a(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String c10 = wjVar.c();
        int i10 = a.f12596a[wjVar.s().ordinal()];
        if (i10 == 1) {
            return c10 + "_" + maxAdFormat.getLabel();
        } else if (i10 != 2) {
            return c10;
        } else {
            return c10 + "_" + str;
        }
    }

    public vj b(wj wjVar, String str, MaxAdFormat maxAdFormat) {
        String a10 = a(wjVar, str, maxAdFormat);
        synchronized (this.f12595c) {
            c cVar = (c) this.f12594b.get(a10);
            if (cVar == null) {
                return null;
            }
            if (cVar.d()) {
                this.f12594b.remove(a10);
                return null;
            }
            this.f12593a.L();
            if (t.a()) {
                t L = this.f12593a.L();
                L.a("SignalCacheManager", "Returning cached signal for: " + wjVar);
            }
            vj b10 = cVar.f12601a;
            return b10;
        }
    }

    public void a(vj vjVar, wj wjVar, String str, MaxAdFormat maxAdFormat) {
        if (vjVar != null) {
            long t10 = wjVar.t();
            if (t10 > 0) {
                this.f12593a.L();
                if (t.a()) {
                    t L = this.f12593a.L();
                    L.a("SignalCacheManager", "Caching signal for: " + wjVar);
                }
                String a10 = a(wjVar, str, maxAdFormat);
                c cVar = new c(vjVar, t10, (a) null);
                synchronized (this.f12595c) {
                    this.f12594b.put(a10, cVar);
                }
            }
        }
    }
}
