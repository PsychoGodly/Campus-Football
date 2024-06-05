package va;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinEventParameters;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;
import xa.c;
import xa.d;
import xa.e;
import xa.g;
import xa.h;

/* compiled from: Database */
class i {

    /* renamed from: n  reason: collision with root package name */
    private static Boolean f23366n;

    /* renamed from: a  reason: collision with root package name */
    final boolean f23367a;

    /* renamed from: b  reason: collision with root package name */
    final String f23368b;

    /* renamed from: c  reason: collision with root package name */
    final int f23369c;

    /* renamed from: d  reason: collision with root package name */
    final int f23370d;

    /* renamed from: e  reason: collision with root package name */
    final Context f23371e;

    /* renamed from: f  reason: collision with root package name */
    final List<g> f23372f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    final Map<Integer, t> f23373g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public o f23374h;

    /* renamed from: i  reason: collision with root package name */
    SQLiteDatabase f23375i;

    /* renamed from: j  reason: collision with root package name */
    private int f23376j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f23377k = 0;

    /* renamed from: l  reason: collision with root package name */
    private Integer f23378l;

    /* renamed from: m  reason: collision with root package name */
    private int f23379m = 0;

    /* compiled from: Database */
    class a implements DatabaseErrorHandler {
        a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    i(Context context, String str, int i10, boolean z10, int i11) {
        this.f23371e = context;
        this.f23368b = str;
        this.f23367a = z10;
        this.f23369c = i10;
        this.f23370d = i11;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(e eVar) {
        Boolean h10 = eVar.h();
        boolean z10 = Boolean.TRUE.equals(h10) && eVar.e();
        if (z10) {
            int i10 = this.f23377k + 1;
            this.f23377k = i10;
            this.f23378l = Integer.valueOf(i10);
        }
        if (!w(eVar)) {
            if (z10) {
                this.f23378l = null;
            }
        } else if (z10) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", this.f23378l);
            eVar.success(hashMap);
        } else {
            if (Boolean.FALSE.equals(h10)) {
                this.f23378l = null;
            }
            eVar.success((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public void Q() {
        while (!this.f23372f.isEmpty() && this.f23378l == null) {
            this.f23372f.get(0).a();
            this.f23372f.remove(0);
        }
    }

    private void S(e eVar, Runnable runnable) {
        Integer d10 = eVar.d();
        Integer num = this.f23378l;
        if (num == null) {
            runnable.run();
        } else if (d10 == null || (!d10.equals(num) && d10.intValue() != -1)) {
            this.f23372f.add(new g(eVar, runnable));
        } else {
            runnable.run();
            if (this.f23378l == null && !this.f23372f.isEmpty()) {
                this.f23374h.a(this, new c(this));
            }
        }
    }

    protected static boolean i(Context context, String str, boolean z10) {
        ApplicationInfo applicationInfo;
        try {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(128));
            } else {
                applicationInfo = y(context, packageName, 128);
            }
            if (applicationInfo.metaData.getBoolean(str, z10)) {
                return true;
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    protected static boolean j(Context context) {
        return i(context, "com.tekartik.sqflite.wal_enabled", false);
    }

    private void l(int i10) {
        t tVar = this.f23373g.get(Integer.valueOf(i10));
        if (tVar != null) {
            m(tVar);
        }
    }

    private void m(t tVar) {
        try {
            int i10 = tVar.f23402a;
            if (r.c(this.f23370d)) {
                Log.d("Sqflite", A() + "closing cursor " + i10);
            }
            this.f23373g.remove(Integer.valueOf(i10));
            tVar.f23404c.close();
        } catch (Exception unused) {
        }
    }

    private Map<String, Object> n(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i10 = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap2 = new HashMap();
                i10 = cursor.getColumnCount();
                hashMap2.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap2.put("rows", arrayList2);
                HashMap hashMap3 = hashMap2;
                arrayList = arrayList2;
                hashMap = hashMap3;
            }
            arrayList.add(e0.a(cursor, i10));
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    static void o(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    private boolean p(e eVar) {
        if (!w(eVar)) {
            return false;
        }
        eVar.success((Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean I(xa.e r10) {
        /*
            r9 = this;
            boolean r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.C()     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x009b
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0099 }
            if (r5 <= 0) goto L_0x009b
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x009b
            int r5 = r0.getInt(r1)     // Catch:{ Exception -> 0x0099 }
            if (r5 != 0) goto L_0x0067
            int r5 = r9.f23370d     // Catch:{ Exception -> 0x0099 }
            boolean r5 = va.r.b(r5)     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x0060
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "no changes (id was "
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            long r6 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0099 }
        L_0x0060:
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0067:
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0099 }
            int r2 = r9.f23370d     // Catch:{ Exception -> 0x0099 }
            boolean r2 = va.r.b(r2)     // Catch:{ Exception -> 0x0099 }
            if (r2 == 0) goto L_0x008e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r2.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r7 = "inserted "
            r2.append(r7)     // Catch:{ Exception -> 0x0099 }
            r2.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.d(r4, r2)     // Catch:{ Exception -> 0x0099 }
        L_0x008e:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0099 }
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            r0.close()
            return r3
        L_0x0099:
            r2 = move-exception
            goto L_0x00c2
        L_0x009b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = r9.A()     // Catch:{ Exception -> 0x0099 }
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r6 = "fail to read changes for Insert"
            r5.append(r6)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0099 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0099 }
            r10.success(r2)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x00bb
            r0.close()
        L_0x00bb:
            return r3
        L_0x00bc:
            r10 = move-exception
            goto L_0x00cd
        L_0x00be:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L_0x00c2:
            r9.D(r2, r10)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x00ca
            r0.close()
        L_0x00ca:
            return r1
        L_0x00cb:
            r10 = move-exception
            r2 = r0
        L_0x00cd:
            if (r2 == 0) goto L_0x00d2
            r2.close()
        L_0x00d2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: va.i.I(xa.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ all -> 0x00a3 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(xa.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorPageSize"
            java.lang.Object r0 = r10.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            va.d0 r1 = r10.b()
            int r2 = r9.f23370d
            boolean r2 = va.r.b(r2)
            if (r2 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.A()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Sqflite"
            android.util.Log.d(r3, r2)
        L_0x002c:
            r2 = 0
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r9.z()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            va.b r5 = new va.b     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String r1 = r1.c()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.lang.String[] r6 = va.a.f23344a     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            android.database.Cursor r1 = r4.rawQueryWithFactory(r5, r1, r6, r2)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.util.Map r4 = r9.n(r1, r0)     // Catch:{ Exception -> 0x008c }
            r5 = 1
            if (r0 == 0) goto L_0x0056
            boolean r6 = r1.isLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.isAfterLast()     // Catch:{ Exception -> 0x008c }
            if (r6 != 0) goto L_0x0056
            r6 = 1
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x0081
            int r6 = r9.f23379m     // Catch:{ Exception -> 0x008c }
            int r6 = r6 + r5
            r9.f23379m = r6     // Catch:{ Exception -> 0x008c }
            java.lang.String r7 = "cursorId"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x008c }
            r4.put(r7, r8)     // Catch:{ Exception -> 0x008c }
            va.t r7 = new va.t     // Catch:{ Exception -> 0x008c }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x008c }
            r7.<init>(r6, r0, r1)     // Catch:{ Exception -> 0x008c }
            java.util.Map<java.lang.Integer, va.t> r0 = r9.f23373g     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r0.put(r2, r7)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r2 = r7
            goto L_0x0081
        L_0x007b:
            r10 = move-exception
            r2 = r7
            goto L_0x00a4
        L_0x007e:
            r0 = move-exception
            r2 = r7
            goto L_0x0093
        L_0x0081:
            r10.success(r4)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            r1.close()
        L_0x008b:
            return r5
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r10 = move-exception
            r1 = r2
            goto L_0x00a4
        L_0x0091:
            r0 = move-exception
            r1 = r2
        L_0x0093:
            r9.D(r0, r10)     // Catch:{ all -> 0x00a3 }
            if (r2 == 0) goto L_0x009b
            r9.m(r2)     // Catch:{ all -> 0x00a3 }
        L_0x009b:
            if (r2 != 0) goto L_0x00a2
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            return r3
        L_0x00a3:
            r10 = move-exception
        L_0x00a4:
            if (r2 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            r1.close()
        L_0x00ab:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: va.i.J(xa.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6 A[Catch:{ all -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean K(xa.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "cursorId"
            java.lang.Object r1 = r10.a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "cancel"
            java.lang.Object r3 = r10.a(r3)
            boolean r2 = r2.equals(r3)
            int r3 = r9.f23370d
            boolean r3 = va.r.c(r3)
            if (r3 == 0) goto L_0x0047
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.A()
            r3.append(r4)
            java.lang.String r4 = "cursor "
            r3.append(r4)
            r3.append(r1)
            if (r2 == 0) goto L_0x0039
            java.lang.String r4 = " cancel"
            goto L_0x003b
        L_0x0039:
            java.lang.String r4 = " next"
        L_0x003b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Sqflite"
            android.util.Log.d(r4, r3)
        L_0x0047:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0052
            r9.l(r1)
            r10.success(r3)
            return r4
        L_0x0052:
            java.util.Map<java.lang.Integer, va.t> r2 = r9.f23373g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            va.t r2 = (va.t) r2
            r5 = 0
            if (r2 == 0) goto L_0x0095
            android.database.Cursor r6 = r2.f23404c     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            int r7 = r2.f23403b     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.util.Map r7 = r9.n(r6, r7)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            boolean r8 = r6.isLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r8 != 0) goto L_0x007b
            boolean r6 = r6.isAfterLast()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            if (r6 != 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0085
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x008e }
            r7.put(r0, r1)     // Catch:{ Exception -> 0x008e }
        L_0x0085:
            r10.success(r7)     // Catch:{ Exception -> 0x008e }
            if (r6 != 0) goto L_0x008d
            r9.m(r2)
        L_0x008d:
            return r4
        L_0x008e:
            r0 = move-exception
            goto L_0x00b1
        L_0x0090:
            r10 = move-exception
            goto L_0x00c5
        L_0x0092:
            r0 = move-exception
            r6 = 0
            goto L_0x00b1
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.<init>()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r6 = "Cursor "
            r4.append(r6)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = " not found"
            r4.append(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
            throw r0     // Catch:{ Exception -> 0x0092, all -> 0x0090 }
        L_0x00b1:
            r9.D(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00ba
            r9.m(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bb
        L_0x00ba:
            r3 = r2
        L_0x00bb:
            if (r6 != 0) goto L_0x00c2
            if (r3 == 0) goto L_0x00c2
            r9.m(r3)
        L_0x00c2:
            return r5
        L_0x00c3:
            r10 = move-exception
            r5 = r6
        L_0x00c5:
            if (r5 != 0) goto L_0x00cc
            if (r2 == 0) goto L_0x00cc
            r9.m(r2)
        L_0x00cc:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: va.i.K(xa.e):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean L(xa.e r8) {
        /*
            r7 = this;
            boolean r0 = r7.w(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.success(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.C()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = "Sqflite"
            if (r0 == 0) goto L_0x0066
            int r5 = r0.getCount()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 <= 0) goto L_0x0066
            boolean r5 = r0.moveToFirst()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0066
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            int r5 = r7.f23370d     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            boolean r5 = va.r.b(r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r5 == 0) goto L_0x0055
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.A()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "changed "
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.d(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.success(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r0.close()
            return r2
        L_0x0060:
            r8 = move-exception
            r3 = r0
            goto L_0x0093
        L_0x0063:
            r2 = move-exception
            r3 = r0
            goto L_0x008a
        L_0x0066:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = r7.A()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r6 = "fail to read changes for Update/Delete"
            r5.append(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            android.util.Log.e(r4, r5)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            r8.success(r3)     // Catch:{ Exception -> 0x0063, all -> 0x0060 }
            if (r0 == 0) goto L_0x0086
            r0.close()
        L_0x0086:
            return r2
        L_0x0087:
            r8 = move-exception
            goto L_0x0093
        L_0x0089:
            r2 = move-exception
        L_0x008a:
            r7.D(r2, r8)     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0092
            r3.close()
        L_0x0092:
            return r1
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            r3.close()
        L_0x0098:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: va.i.L(xa.e):boolean");
    }

    private boolean w(e eVar) {
        d0 b10 = eVar.b();
        if (r.b(this.f23370d)) {
            Log.d("Sqflite", A() + b10);
        }
        Boolean h10 = eVar.h();
        try {
            C().execSQL(b10.c(), b10.d());
            u(h10);
            return true;
        } catch (Exception e10) {
            D(e10, eVar);
            return false;
        }
    }

    public static boolean x(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    static ApplicationInfo y(Context context, String str, int i10) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getApplicationInfo(str, i10);
    }

    /* access modifiers changed from: package-private */
    public String A() {
        return "[" + B() + "] ";
    }

    /* access modifiers changed from: package-private */
    public String B() {
        Thread currentThread = Thread.currentThread();
        return MaxReward.DEFAULT_LABEL + this.f23369c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase C() {
        return this.f23375i;
    }

    /* access modifiers changed from: package-private */
    public void D(Exception exc, e eVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            eVar.error("sqlite_error", "open_failed " + this.f23368b, (Object) null);
        } else if (exc instanceof SQLException) {
            eVar.error("sqlite_error", exc.getMessage(), h.a(eVar));
        } else {
            eVar.error("sqlite_error", exc.getMessage(), h.a(eVar));
        }
    }

    public void E(e eVar) {
        S(eVar, new d(this, eVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean F() {
        return this.f23376j > 0;
    }

    public void M() {
        if (f23366n == null) {
            Boolean valueOf = Boolean.valueOf(j(this.f23371e));
            f23366n = valueOf;
            if (valueOf.booleanValue() && r.c(this.f23370d)) {
                Log.d("Sqflite", A() + "[sqflite] WAL enabled");
            }
        }
        this.f23375i = SQLiteDatabase.openDatabase(this.f23368b, (SQLiteDatabase.CursorFactory) null, f23366n.booleanValue() ? 805306368 : 268435456);
    }

    public void N() {
        this.f23375i = SQLiteDatabase.openDatabase(this.f23368b, (SQLiteDatabase.CursorFactory) null, 1, new a());
    }

    public void O(e eVar) {
        S(eVar, new f(this, eVar));
    }

    public void P(e eVar) {
        S(eVar, new e(this, eVar));
    }

    public void R(e eVar) {
        S(eVar, new g(this, eVar));
    }

    /* access modifiers changed from: package-private */
    public void h(j jVar, k.d dVar) {
        d dVar2 = new d(jVar, dVar);
        boolean c10 = dVar2.c();
        boolean j10 = dVar2.j();
        ArrayList arrayList = new ArrayList();
        for (Map cVar : (List) dVar2.a("operations")) {
            c cVar2 = new c(cVar, c10);
            String f10 = cVar2.f();
            f10.hashCode();
            char c11 = 65535;
            switch (f10.hashCode()) {
                case -1319569547:
                    if (f10.equals("execute")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1183792455:
                    if (f10.equals("insert")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -838846263:
                    if (f10.equals("update")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 107944136:
                    if (f10.equals(AppLovinEventParameters.SEARCH_QUERY)) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    if (p(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(dVar);
                        return;
                    }
                case 1:
                    if (I(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(dVar);
                        return;
                    }
                case 2:
                    if (L(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(dVar);
                        return;
                    }
                case 3:
                    if (J(cVar2)) {
                        cVar2.r(arrayList);
                        break;
                    } else if (j10) {
                        cVar2.q(arrayList);
                        break;
                    } else {
                        cVar2.p(dVar);
                        return;
                    }
                default:
                    dVar.error("bad_param", "Batch method '" + f10 + "' not supported", (Object) null);
                    return;
            }
        }
        if (c10) {
            dVar.success((Object) null);
        } else {
            dVar.success(arrayList);
        }
    }

    public void k() {
        if (!this.f23373g.isEmpty() && r.b(this.f23370d)) {
            Log.d("Sqflite", A() + this.f23373g.size() + " cursor(s) are left opened");
        }
        this.f23375i.close();
    }

    /* access modifiers changed from: package-private */
    public synchronized void u(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            this.f23376j++;
        } else if (Boolean.FALSE.equals(bool)) {
            this.f23376j--;
        }
    }

    public void v(e eVar) {
        S(eVar, new h(this, eVar));
    }

    public SQLiteDatabase z() {
        return this.f23375i;
    }
}
