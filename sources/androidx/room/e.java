package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import c1.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker */
public class e {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f4694m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f4695a;

    /* renamed from: b  reason: collision with root package name */
    final String[] f4696b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f4697c;

    /* renamed from: d  reason: collision with root package name */
    final h f4698d;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f4699e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f4700f = false;

    /* renamed from: g  reason: collision with root package name */
    volatile f f4701g;

    /* renamed from: h  reason: collision with root package name */
    private b f4702h;

    /* renamed from: i  reason: collision with root package name */
    private final d f4703i;

    /* renamed from: j  reason: collision with root package name */
    final m.b<c, d> f4704j = new m.b<>();

    /* renamed from: k  reason: collision with root package name */
    private f f4705k;

    /* renamed from: l  reason: collision with root package name */
    Runnable f4706l = new a();

    /* compiled from: InvalidationTracker */
    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p10 = e.this.f4698d.p(new c1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p10.getInt(0)));
                } catch (Throwable th) {
                    p10.close();
                    throw th;
                }
            }
            p10.close();
            if (!hashSet.isEmpty()) {
                e.this.f4701g.w();
            }
            return hashSet;
        }

        public void run() {
            c1.b U;
            Lock h10 = e.this.f4698d.h();
            Set<Integer> set = null;
            try {
                h10.lock();
                if (!e.this.c()) {
                    h10.unlock();
                } else if (!e.this.f4699e.compareAndSet(true, false)) {
                    h10.unlock();
                } else if (e.this.f4698d.k()) {
                    h10.unlock();
                } else {
                    h hVar = e.this.f4698d;
                    if (hVar.f4745g) {
                        U = hVar.i().U();
                        U.k();
                        set = a();
                        U.O();
                        U.a0();
                    } else {
                        set = a();
                    }
                    h10.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (e.this.f4704j) {
                            Iterator<Map.Entry<c, d>> it = e.this.f4704j.iterator();
                            while (it.hasNext()) {
                                ((d) it.next().getValue()).a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException e10) {
                try {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                } catch (Throwable th) {
                    h10.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                U.a0();
                throw th2;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f4708a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f4709b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f4710c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4711d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4712e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f4708a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4709b = zArr;
            this.f4710c = new int[i10];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.f4711d) {
                    if (!this.f4712e) {
                        int length = this.f4708a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 < length) {
                                boolean z10 = this.f4708a[i10] > 0;
                                boolean[] zArr = this.f4709b;
                                if (z10 != zArr[i10]) {
                                    int[] iArr = this.f4710c;
                                    if (!z10) {
                                        i11 = 2;
                                    }
                                    iArr[i10] = i11;
                                } else {
                                    this.f4710c[i10] = 0;
                                }
                                zArr[i10] = z10;
                                i10++;
                            } else {
                                this.f4712e = true;
                                this.f4711d = false;
                                int[] iArr2 = this.f4710c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4708a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f4711d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4708a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f4711d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this) {
                this.f4712e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f4713a;

        public c(String[] strArr) {
            this.f4713a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: InvalidationTracker */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f4714a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f4715b;

        /* renamed from: c  reason: collision with root package name */
        final c f4716c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f4717d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f4716c = cVar;
            this.f4714a = iArr;
            this.f4715b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f4717d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f4717d = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.f4714a.length;
            Set set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f4714a[i10]))) {
                    if (length == 1) {
                        set2 = this.f4717d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f4715b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f4716c.b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.f4715b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f4715b[0])) {
                        set = this.f4717d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4715b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i11++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4716c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4698d = hVar;
        this.f4702h = new b(strArr.length);
        this.f4695a = new HashMap<>();
        this.f4697c = map2;
        this.f4703i = new d(hVar);
        int length = strArr.length;
        this.f4696b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4695a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4696b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4696b[i10] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f4695a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4695a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4697c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4697c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(c1.b bVar, int i10) {
        bVar.s("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4696b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f4694m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.s(sb2.toString());
        }
    }

    private void k(c1.b bVar, int i10) {
        String str = this.f4696b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String b10 : f4694m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, b10);
            bVar.s(sb2.toString());
        }
    }

    public void a(c cVar) {
        d h10;
        String[] h11 = h(cVar.f4713a);
        int[] iArr = new int[h11.length];
        int length = h11.length;
        int i10 = 0;
        while (i10 < length) {
            Integer num = this.f4695a.get(h11[i10].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i10] = num.intValue();
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + h11[i10]);
            }
        }
        d dVar = new d(cVar, iArr, h11);
        synchronized (this.f4704j) {
            h10 = this.f4704j.h(cVar, dVar);
        }
        if (h10 == null && this.f4702h.b(iArr)) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (!this.f4698d.o()) {
            return false;
        }
        if (!this.f4700f) {
            this.f4698d.i().U();
        }
        if (this.f4700f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* access modifiers changed from: package-private */
    public void d(c1.b bVar) {
        synchronized (this) {
            if (this.f4700f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.s("PRAGMA temp_store = MEMORY;");
            bVar.s("PRAGMA recursive_triggers='ON';");
            bVar.s("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f4701g = bVar.x("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f4700f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f4704j) {
            Iterator<Map.Entry<c, d>> it = this.f4704j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f4699e.compareAndSet(false, true)) {
            this.f4698d.j().execute(this.f4706l);
        }
    }

    public void g(c cVar) {
        d m10;
        synchronized (this.f4704j) {
            m10 = this.f4704j.m(cVar);
        }
        if (m10 != null && this.f4702h.c(m10.f4714a)) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Context context, String str) {
        this.f4705k = new f(context, str, this, this.f4698d.j());
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (this.f4698d.o()) {
            m(this.f4698d.i().U());
        }
    }

    /* access modifiers changed from: package-private */
    public void m(c1.b bVar) {
        if (!bVar.q0()) {
            while (true) {
                try {
                    Lock h10 = this.f4698d.h();
                    h10.lock();
                    try {
                        int[] a10 = this.f4702h.a();
                        if (a10 == null) {
                            h10.unlock();
                            return;
                        }
                        int length = a10.length;
                        bVar.k();
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = a10[i10];
                            if (i11 == 1) {
                                j(bVar, i10);
                            } else if (i11 == 2) {
                                k(bVar, i10);
                            }
                        }
                        bVar.O();
                        bVar.a0();
                        this.f4702h.d();
                        h10.unlock();
                    } catch (Throwable th) {
                        h10.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e10) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                    return;
                }
            }
        }
    }
}
