package j2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b2.h;
import b2.i;
import b2.o;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import e2.a;
import e2.c;
import e2.e;
import e2.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2.b;

/* compiled from: SQLiteEventStore */
public class m0 implements d, k2.b, c {

    /* renamed from: g  reason: collision with root package name */
    private static final z1.b f19247g = z1.b.b("proto");

    /* renamed from: a  reason: collision with root package name */
    private final t0 f19248a;

    /* renamed from: b  reason: collision with root package name */
    private final l2.a f19249b;

    /* renamed from: c  reason: collision with root package name */
    private final l2.a f19250c;

    /* renamed from: d  reason: collision with root package name */
    private final e f19251d;

    /* renamed from: f  reason: collision with root package name */
    private final rd.a<String> f19252f;

    /* compiled from: SQLiteEventStore */
    interface b<T, U> {
        U apply(T t10);
    }

    /* compiled from: SQLiteEventStore */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f19253a;

        /* renamed from: b  reason: collision with root package name */
        final String f19254b;

        private c(String str, String str2) {
            this.f19253a = str;
            this.f19254b = str2;
        }
    }

    /* compiled from: SQLiteEventStore */
    interface d<T> {
        T a();
    }

    m0(l2.a aVar, l2.a aVar2, e eVar, t0 t0Var, rd.a<String> aVar3) {
        this.f19248a = t0Var;
        this.f19249b = aVar;
        this.f19250c = aVar2;
        this.f19251d = eVar;
        this.f19252f = aVar3;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ e2.a A1(Map map, a.C0183a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b a12 = a1(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(e2.c.c().c(a12).b(j10).a());
        }
        P1(aVar, map);
        aVar.e(i1());
        aVar.d(f1());
        aVar.c(this.f19252f.get());
        return aVar.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ e2.a B1(String str, Map map, a.C0183a aVar, SQLiteDatabase sQLiteDatabase) {
        return (e2.a) U1(sQLiteDatabase.rawQuery(str, new String[0]), new p(this, map, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object C1(List list, o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a k10 = i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new h(S1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new h(S1(cursor.getString(4)), Q1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object D1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long E1(i iVar, o oVar, SQLiteDatabase sQLiteDatabase) {
        if (l1()) {
            j(1, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long c12 = c1(sQLiteDatabase, oVar);
        int e10 = this.f19251d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(c12));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(MediationMetaData.KEY_NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] F1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object G1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            j((long) i10, c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object H1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        U1(sQLiteDatabase.rawQuery(str2, (String[]) null), new g0(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean I1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object J1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) U1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.I())}), x.f35704a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.I()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.I())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object K1(long j10, o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m2.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m2.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object L1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f19249b.a()).execute();
        return null;
    }

    private List<k> M1(SQLiteDatabase sQLiteDatabase, o oVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long j12 = j1(sQLiteDatabase, oVar);
        if (j12 == null) {
            return arrayList;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        U1(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{j12.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new o(this, arrayList, oVar));
        return arrayList;
    }

    private Map<Long, Set<c>> N1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        U1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", MediationMetaData.KEY_NAME, "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new r(hashMap));
        return hashMap;
    }

    private static byte[] O1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void P1(a.C0183a aVar, Map<String, List<e2.c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.a(e2.d.c().c((String) next.getKey()).b((List) next.getValue()).a());
        }
    }

    private byte[] Q1(long j10) {
        return (byte[]) U1(e1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), s.f35698a);
    }

    private <T> T R1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f19250c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f19250c.a() >= ((long) this.f19251d.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static z1.b S1(String str) {
        if (str == null) {
            return f19247g;
        }
        return z1.b.b(str);
    }

    private static String T1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T U1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b a1(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.I()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.I()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.I()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.I()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.I()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.I()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.I()) {
            return bVar7;
        }
        f2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void b1(SQLiteDatabase sQLiteDatabase) {
        R1(new c0(sQLiteDatabase), b0.f35659a);
    }

    private long c1(SQLiteDatabase sQLiteDatabase, o oVar) {
        Long j12 = j1(sQLiteDatabase, oVar);
        if (j12 != null) {
            return j12.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(m2.a.a(oVar.d())));
        contentValues.put("next_request_ms", 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private e2.b f1() {
        return e2.b.b().b(e.c().b(d1()).c(e.f19242a.f()).a()).a();
    }

    private long g1() {
        return e1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long h1() {
        return e1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private f i1() {
        return (f) k1(new w(this.f19249b.a()));
    }

    private Long j1(SQLiteDatabase sQLiteDatabase, o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{oVar.b(), String.valueOf(m2.a.a(oVar.d()))}));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) U1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), v.f35702a);
    }

    private boolean l1() {
        return g1() * h1() >= this.f19251d.f();
    }

    private List<k> m1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f19253a, cVar.f19254b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            j((long) i10, c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer o1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        U1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new f0(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q1(Throwable th) {
        throw new k2.a("Timed out while trying to acquire the lock.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase r1(Throwable th) {
        throw new k2.a("Timed out while trying to open db.", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long s1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f u1(long j10, SQLiteDatabase sQLiteDatabase) {
        return (f) U1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new l(j10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long v1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean w1(o oVar, SQLiteDatabase sQLiteDatabase) {
        Long j12 = j1(sQLiteDatabase, oVar);
        if (j12 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) U1(e1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{j12.toString()}), y.f35705a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List x1(SQLiteDatabase sQLiteDatabase) {
        return (List) U1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.f35700a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List y1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(o.a().b(cursor.getString(1)).d(m2.a.b(cursor.getInt(2))).c(O1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List z1(o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> M1 = M1(sQLiteDatabase, oVar, this.f19251d.d());
        for (z1.d dVar : z1.d.values()) {
            if (dVar != oVar.d()) {
                int d10 = this.f19251d.d() - M1.size();
                if (d10 <= 0) {
                    break;
                }
                M1.addAll(M1(sQLiteDatabase, oVar.f(dVar), d10));
            }
        }
        return m1(M1, N1(sQLiteDatabase, M1));
    }

    public boolean A0(o oVar) {
        return ((Boolean) k1(new l0(this, oVar))).booleanValue();
    }

    public Iterable<o> I() {
        return (Iterable) k1(z.f35706a);
    }

    public long I0(o oVar) {
        return ((Long) U1(e1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m2.a.a(oVar.d()))}), u.f35701a)).longValue();
    }

    public k J0(o oVar, i iVar) {
        f2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) k1(new j0(this, iVar, oVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    public void K0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            k1(new m(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + T1(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public void close() {
        this.f19248a.close();
    }

    /* access modifiers changed from: package-private */
    public long d1() {
        return g1() * h1();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase e1() {
        t0 t0Var = this.f19248a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) R1(new d0(t0Var), a0.f35658a);
    }

    public void h() {
        k1(new h0(this));
    }

    public <T> T i(b.a<T> aVar) {
        SQLiteDatabase e12 = e1();
        b1(e12);
        try {
            T a10 = aVar.a();
            e12.setTransactionSuccessful();
            return a10;
        } finally {
            e12.endTransaction();
        }
    }

    public void j(long j10, c.b bVar, String str) {
        k1(new q(str, bVar, j10));
    }

    /* access modifiers changed from: package-private */
    public <T> T k1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase e12 = e1();
        e12.beginTransaction();
        try {
            T apply = bVar.apply(e12);
            e12.setTransactionSuccessful();
            return apply;
        } finally {
            e12.endTransaction();
        }
    }

    public int l() {
        return ((Integer) k1(new i0(this, this.f19249b.a() - this.f19251d.c()))).intValue();
    }

    public void m(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            e1().compileStatement("DELETE FROM events WHERE _id in " + T1(iterable)).execute();
        }
    }

    public e2.a n() {
        return (e2.a) k1(new n(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), e2.a.e()));
    }

    public void r0(o oVar, long j10) {
        k1(new e0(j10, oVar));
    }

    public Iterable<k> z0(o oVar) {
        return (Iterable) k1(new k0(this, oVar));
    }
}
