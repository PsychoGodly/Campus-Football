package com.startapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import com.startapp.t1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
public class o3 {

    /* renamed from: a  reason: collision with root package name */
    public final l3 f16196a;

    /* renamed from: b  reason: collision with root package name */
    public final v2 f16197b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16198c;

    /* renamed from: d  reason: collision with root package name */
    public final i2<Integer> f16199d;

    /* renamed from: e  reason: collision with root package name */
    public final t1 f16200e;

    /* renamed from: f  reason: collision with root package name */
    public final h2<i3, k3, n3, t3> f16201f;

    /* renamed from: g  reason: collision with root package name */
    public final i2<AnalyticsConfig> f16202g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Pair<k3, Long>> f16203h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f16204i = new AtomicLong();

    /* renamed from: j  reason: collision with root package name */
    public final i2<Void> f16205j = new a();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f16206k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final i2<Void> f16207l = new c();

    /* renamed from: m  reason: collision with root package name */
    public final n3 f16208m = new d();

    /* renamed from: n  reason: collision with root package name */
    public final g2<i3, Void> f16209n = new g();

    /* compiled from: Sta */
    public class a implements i2<Void> {
        public a() {
        }

        public Object a() {
            try {
                o3 o3Var = o3.this;
                o3Var.f16197b.execute(new q3(o3Var));
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                o3.this.b();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    public class c implements i2<Void> {
        public c() {
        }

        public Object a() {
            try {
                o3.this.a(0);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Sta */
    public class d implements n3 {
        public d() {
        }

        public void a(i3 i3Var, int i10) {
            try {
                o3 o3Var = o3.this;
                o3Var.getClass();
                o3Var.f16197b.execute(new p3(o3Var, i3Var, i10, System.currentTimeMillis()));
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Sta */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i3 f16214a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k3 f16215b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n3 f16216c;

        public e(i3 i3Var, k3 k3Var, n3 n3Var) {
            this.f16214a = i3Var;
            this.f16215b = k3Var;
            this.f16216c = n3Var;
        }

        public void run() {
            int i10;
            o3 o3Var = o3.this;
            i3 i3Var = this.f16214a;
            k3 k3Var = this.f16215b;
            n3 n3Var = this.f16216c;
            o3Var.getClass();
            try {
                i10 = o3Var.f16196a.a(i3Var, k3Var) ? 2 : 3;
                if (n3Var == null) {
                    return;
                }
            } catch (Throwable unused) {
                if (n3Var != null) {
                    i10 = 0;
                } else {
                    return;
                }
            }
            n3Var.a(i3Var, i10);
        }
    }

    /* compiled from: Sta */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i3 f16218a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k3 f16219b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n3 f16220c;

        public f(long j10, i3 i3Var, k3 k3Var, n3 n3Var) {
            this.f16218a = i3Var;
            this.f16219b = k3Var;
            this.f16220c = n3Var;
        }

        public void run() {
            o3.this.a(this.f16218a, this.f16219b, this.f16220c);
        }
    }

    /* compiled from: Sta */
    public class g implements g2<i3, Void> {
        public g() {
        }

        public Object a(Object obj) {
            i3 i3Var = (i3) obj;
            if (i3Var == null) {
                return null;
            }
            try {
                o3.this.a(i3Var);
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public o3(l3 l3Var, v2 v2Var, Executor executor, i2<Integer> i2Var, t1 t1Var, h2<i3, k3, n3, t3> h2Var, i2<AnalyticsConfig> i2Var2) {
        this.f16196a = l3Var;
        this.f16197b = v2Var;
        this.f16198c = executor;
        this.f16199d = i2Var;
        this.f16200e = t1Var;
        this.f16201f = h2Var;
        this.f16202g = i2Var2;
    }

    /* JADX INFO: finally extract failed */
    public void a(i3 i3Var) {
        k3 a10 = a(i3Var.f15911a);
        long uptimeMillis = (this.f16204i.get() + a10.f16024f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        l3 l3Var = this.f16196a;
        long currentTimeMillis = System.currentTimeMillis();
        l3Var.getClass();
        long j10 = i3Var.f15912b;
        l3.a(j10, currentTimeMillis);
        SQLiteDatabase a11 = l3Var.a();
        a11.beginTransaction();
        try {
            int a12 = l3.a(a11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a12 + 1));
            a11.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
            a11.setTransactionSuccessful();
            a11.endTransaction();
            a(i3Var, a10, this.f16208m);
        } catch (Throwable th) {
            a11.endTransaction();
            throw th;
        }
    }

    public void b() {
        this.f16197b.a(this.f16206k);
        if (!this.f16200e.a()) {
            AnalyticsConfig a10 = this.f16202g.a();
            long j10 = 300000;
            if (a10 != null) {
                j10 = Math.max(300000, j9.e(a10.f()));
            }
            a(j10);
            return;
        }
        Integer a11 = this.f16199d.a();
        int i10 = 1;
        int max = a11 != null ? Math.max(1, a11.intValue()) : 1;
        AnalyticsConfig a12 = this.f16202g.a();
        if (a12 != null) {
            i10 = Math.max(1, a12.g());
        }
        try {
            this.f16196a.a(this.f16209n, i10, max);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        ConnectivityManager connectivityManager;
        if (this.f16204i.compareAndSet(0, SystemClock.uptimeMillis())) {
            l3 l3Var = this.f16196a;
            i2<Void> i2Var = this.f16207l;
            synchronized (l3Var) {
                l3Var.f16092c.add(i2Var);
            }
            t1 t1Var = this.f16200e;
            i2<Void> i2Var2 = this.f16205j;
            synchronized (t1Var.f17279c) {
                if (!t1Var.f17279c.contains(i2Var2)) {
                    t1Var.f17279c.add(i2Var2);
                }
            }
            t1 t1Var2 = this.f16200e;
            if (!t1Var2.f17280d.getAndSet(true)) {
                try {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 21 && (connectivityManager = (ConnectivityManager) t1Var2.f17277a.getSystemService("connectivity")) != null) {
                        connectivityManager.addDefaultNetworkActiveListener(new s1(t1Var2));
                        ConnectivityHelperMetadata a10 = t1Var2.f17278b.a();
                        t1.a aVar = null;
                        ConnectivityHelperMetadata.Transport a11 = a10 != null ? a10.a() : null;
                        if (a11 != null) {
                            if (i10 >= 24 && j9.a(i10, a11.a())) {
                                aVar = new b(t1Var2.f17277a, connectivityManager);
                            } else if (j9.a(i10, a11.b())) {
                                aVar = new w(t1Var2.f17277a, connectivityManager);
                            }
                            if (aVar != null) {
                                aVar.b();
                                t1Var2.f17281e = aVar;
                            }
                        }
                    }
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
            this.f16197b.execute(new q3(this));
        }
    }

    public final k3 a(j3 j3Var) {
        k3 k3Var;
        Map<String, AnalyticsCategoryConfig> d10;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f16203h) {
            Pair pair = this.f16203h.get(j3Var.f15965a);
            k3Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (k3) pair.first;
        }
        if (k3Var != null) {
            return k3Var;
        }
        AnalyticsConfig a10 = this.f16202g.a();
        if (!(a10 == null || (d10 = a10.d()) == null || (analyticsCategoryConfig = d10.get(j3Var.f15965a)) == null)) {
            k3Var = new k3(j3Var.f15966b, analyticsCategoryConfig);
        }
        if (k3Var == null) {
            k3Var = j3Var.f15966b;
        }
        synchronized (this.f16203h) {
            this.f16203h.put(j3Var.f15965a, new Pair(k3Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return k3Var;
    }

    public void a(i3 i3Var, n3 n3Var) {
        AnalyticsConfig a10 = this.f16202g.a();
        if (a10 != null && !a10.dns) {
            k3 a11 = a(i3Var.f15911a);
            if (Math.random() < a11.f16019a) {
                if (a11.f16022d) {
                    this.f16197b.execute(new e(i3Var, a11, (n3) null));
                } else if (this.f16200e.a()) {
                    long uptimeMillis = (this.f16204i.get() + a11.f16024f) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0) {
                        this.f16197b.a(new f(uptimeMillis, i3Var, a11, (n3) null), uptimeMillis);
                    } else {
                        a(i3Var, a11, (n3) null);
                    }
                }
            }
        }
    }

    public void a(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        this.f16197b.a(this.f16206k, j10);
    }

    /* JADX INFO: finally extract failed */
    public void a(i3 i3Var, int i10, long j10) {
        if (i10 == 1) {
            l3 l3Var = this.f16196a;
            l3Var.getClass();
            long j11 = i3Var.f15912b;
            l3.a(j11, j10);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j10));
            l3Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
            a(0);
            return;
        }
        AnalyticsConfig a10 = this.f16202g.a();
        int max = a10 != null ? Math.max(1, a10.g()) : 1;
        l3 l3Var2 = this.f16196a;
        l3Var2.getClass();
        long j12 = i3Var.f15912b;
        l3.a(j12, j10);
        SQLiteDatabase a11 = l3Var2.a();
        a11.beginTransaction();
        try {
            if (l3.a(a11, j12) >= max) {
                a11.delete("events", "rowid = ?", new String[]{String.valueOf(j12)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j10));
                a11.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j12)});
            }
            a11.setTransactionSuccessful();
            a11.endTransaction();
            AnalyticsConfig a12 = this.f16202g.a();
            long j13 = 1000;
            if (a12 != null) {
                j13 = Math.max(1000, a12.h());
            }
            a(j13);
        } catch (Throwable th) {
            a11.endTransaction();
            throw th;
        }
    }

    public void a(i3 i3Var, k3 k3Var, n3 n3Var) {
        Runnable a10 = this.f16201f.a(i3Var, k3Var, n3Var);
        if (a10 != null) {
            this.f16198c.execute(a10);
        } else if (n3Var != null) {
            n3Var.a(i3Var, 0);
        }
    }
}
