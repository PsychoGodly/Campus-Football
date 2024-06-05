package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import c1.c;
import c1.e;
import c1.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase */
public abstract class h {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile c1.b f4739a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f4740b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f4741c;

    /* renamed from: d  reason: collision with root package name */
    private c1.c f4742d;

    /* renamed from: e  reason: collision with root package name */
    private final e f4743e = e();

    /* renamed from: f  reason: collision with root package name */
    private boolean f4744f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4745g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f4746h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock f4747i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Integer> f4748j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f4749k = new ConcurrentHashMap();

    /* compiled from: RoomDatabase */
    public static class a<T extends h> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f4750a;

        /* renamed from: b  reason: collision with root package name */
        private final String f4751b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f4752c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f4753d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f4754e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f4755f;

        /* renamed from: g  reason: collision with root package name */
        private c.C0106c f4756g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f4757h;

        /* renamed from: i  reason: collision with root package name */
        private c f4758i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        private boolean f4759j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4760k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4761l;

        /* renamed from: m  reason: collision with root package name */
        private final d f4762m = new d();

        /* renamed from: n  reason: collision with root package name */
        private Set<Integer> f4763n;

        /* renamed from: o  reason: collision with root package name */
        private Set<Integer> f4764o;

        /* renamed from: p  reason: collision with root package name */
        private String f4765p;

        /* renamed from: q  reason: collision with root package name */
        private File f4766q;

        a(Context context, Class<T> cls, String str) {
            this.f4752c = context;
            this.f4750a = cls;
            this.f4751b = str;
        }

        public a<T> a(b bVar) {
            if (this.f4753d == null) {
                this.f4753d = new ArrayList<>();
            }
            this.f4753d.add(bVar);
            return this;
        }

        public a<T> b(z0.a... aVarArr) {
            if (this.f4764o == null) {
                this.f4764o = new HashSet();
            }
            for (z0.a aVar : aVarArr) {
                this.f4764o.add(Integer.valueOf(aVar.f24102a));
                this.f4764o.add(Integer.valueOf(aVar.f24103b));
            }
            this.f4762m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f4757h = true;
            return this;
        }

        public T d() {
            Executor executor;
            if (this.f4752c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4750a != null) {
                Executor executor2 = this.f4754e;
                if (executor2 == null && this.f4755f == null) {
                    Executor f10 = l.c.f();
                    this.f4755f = f10;
                    this.f4754e = f10;
                } else if (executor2 != null && this.f4755f == null) {
                    this.f4755f = executor2;
                } else if (executor2 == null && (executor = this.f4755f) != null) {
                    this.f4754e = executor;
                }
                Set<Integer> set = this.f4764o;
                if (!(set == null || this.f4763n == null)) {
                    for (Integer next : set) {
                        if (this.f4763n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f4756g == null) {
                    this.f4756g = new d1.c();
                }
                String str = this.f4765p;
                if (!(str == null && this.f4766q == null)) {
                    if (this.f4751b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f4766q == null) {
                        this.f4756g = new k(str, this.f4766q, this.f4756g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f4752c;
                String str2 = this.f4751b;
                c.C0106c cVar = this.f4756g;
                d dVar = this.f4762m;
                ArrayList<b> arrayList = this.f4753d;
                boolean z10 = this.f4757h;
                c c10 = this.f4758i.c(context);
                Executor executor3 = this.f4754e;
                Executor executor4 = this.f4755f;
                boolean z11 = this.f4759j;
                boolean z12 = this.f4760k;
                boolean z13 = this.f4761l;
                boolean z14 = z12;
                boolean z15 = z13;
                a aVar = new a(context, str2, cVar, dVar, arrayList, z10, c10, executor3, executor4, z11, z14, z15, this.f4763n, this.f4765p, this.f4766q);
                T t10 = (h) g.b(this.f4750a, "_Impl");
                t10.l(aVar);
                return t10;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> e() {
            this.f4760k = false;
            this.f4761l = true;
            return this;
        }

        public a<T> f(c.C0106c cVar) {
            this.f4756g = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f4754e = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(c1.b bVar) {
        }

        public void b(c1.b bVar) {
        }

        public void c(c1.b bVar) {
        }
    }

    /* compiled from: RoomDatabase */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public c c(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, z0.a>> f4771a = new HashMap<>();

        private void a(z0.a aVar) {
            int i10 = aVar.f24102a;
            int i11 = aVar.f24103b;
            TreeMap treeMap = this.f4771a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f4771a.put(Integer.valueOf(i10), treeMap);
            }
            z0.a aVar2 = (z0.a) treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        private List<z0.a> d(List<z0.a> list, boolean z10, int i10, int i11) {
            Set set;
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = this.f4771a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    if (z10) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z11 = true;
                        boolean z12 = false;
                        if (!it.hasNext()) {
                            z11 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z10 ? !(intValue < i11 || intValue >= i10) : !(intValue > i11 || intValue <= i10)) {
                            z12 = true;
                            continue;
                        }
                        if (z12) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i10 = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z11);
            return null;
        }

        public void b(z0.a... aVarArr) {
            for (z0.a a10 : aVarArr) {
                a(a10);
            }
        }

        public List<z0.a> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f4744f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f4748j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        c1.b U = this.f4742d.U();
        this.f4743e.m(U);
        U.k();
    }

    public f d(String str) {
        a();
        b();
        return this.f4742d.U().x(str);
    }

    /* access modifiers changed from: protected */
    public abstract e e();

    /* access modifiers changed from: protected */
    public abstract c1.c f(a aVar);

    @Deprecated
    public void g() {
        this.f4742d.U().a0();
        if (!k()) {
            this.f4743e.f();
        }
    }

    /* access modifiers changed from: package-private */
    public Lock h() {
        return this.f4747i.readLock();
    }

    public c1.c i() {
        return this.f4742d;
    }

    public Executor j() {
        return this.f4740b;
    }

    public boolean k() {
        return this.f4742d.U().q0();
    }

    public void l(a aVar) {
        c1.c f10 = f(aVar);
        this.f4742d = f10;
        if (f10 instanceof j) {
            ((j) f10).i(aVar);
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f4681g == c.WRITE_AHEAD_LOGGING) {
                z10 = true;
            }
            this.f4742d.setWriteAheadLoggingEnabled(z10);
        }
        this.f4746h = aVar.f4679e;
        this.f4740b = aVar.f4682h;
        this.f4741c = new l(aVar.f4683i);
        this.f4744f = aVar.f4680f;
        this.f4745g = z10;
        if (aVar.f4684j) {
            this.f4743e.i(aVar.f4676b, aVar.f4677c);
        }
    }

    /* access modifiers changed from: protected */
    public void m(c1.b bVar) {
        this.f4743e.d(bVar);
    }

    public boolean o() {
        c1.b bVar = this.f4739a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(e eVar) {
        return q(eVar, (CancellationSignal) null);
    }

    public Cursor q(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f4742d.U().s0(eVar);
        }
        return this.f4742d.U().f0(eVar, cancellationSignal);
    }

    @Deprecated
    public void r() {
        this.f4742d.U().O();
    }
}
