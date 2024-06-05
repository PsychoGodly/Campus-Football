package la;

import android.content.ContentValues;
import com.onesignal.q3;
import com.onesignal.t2;
import com.onesignal.v1;
import com.unity3d.ads.metadata.MediationMetaData;
import ja.b;
import ja.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.m;
import ma.d;
import ma.e;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: OSOutcomeEventsCache.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f29206a;

    /* renamed from: b  reason: collision with root package name */
    private final q3 f29207b;

    /* renamed from: c  reason: collision with root package name */
    private final t2 f29208c;

    /* renamed from: la.a$a  reason: collision with other inner class name */
    /* compiled from: OSOutcomeEventsCache.kt */
    public /* synthetic */ class C0311a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29209a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.DIRECT.ordinal()] = 1;
            iArr[c.INDIRECT.ordinal()] = 2;
            f29209a = iArr;
        }
    }

    public a(v1 v1Var, q3 q3Var, t2 t2Var) {
        m.e(v1Var, "logger");
        m.e(q3Var, "dbHelper");
        m.e(t2Var, "preferences");
        this.f29206a = v1Var;
        this.f29207b = q3Var;
        this.f29208c = t2Var;
    }

    private final void a(List<ma.a> list, JSONArray jSONArray, b bVar) {
        if (jSONArray != null) {
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        String string = jSONArray.getString(i10);
                        m.d(string, "influenceId");
                        list.add(new ma.a(string, bVar));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    if (i11 < length) {
                        i10 = i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private final void b(List<ma.a> list, e eVar) {
        if (eVar != null) {
            JSONArray a10 = eVar.a();
            JSONArray b10 = eVar.b();
            a(list, a10, b.IAM);
            a(list, b10, b.NOTIFICATION);
        }
    }

    private final d f(c cVar, e eVar, e eVar2, String str, d dVar) {
        d dVar2;
        d dVar3;
        int i10 = C0311a.f29209a[cVar.ordinal()];
        if (i10 == 1) {
            eVar.c(new JSONArray(str));
            if (dVar == null) {
                dVar2 = null;
            } else {
                dVar2 = dVar.c(eVar);
            }
            return dVar2 == null ? new d(eVar, (e) null) : dVar2;
        } else if (i10 != 2) {
            return dVar;
        } else {
            eVar2.c(new JSONArray(str));
            if (dVar == null) {
                dVar3 = null;
            } else {
                dVar3 = dVar.e(eVar2);
            }
            if (dVar3 == null) {
                return new d((e) null, eVar2);
            }
            return dVar3;
        }
    }

    private final d h(c cVar, e eVar, e eVar2, String str) {
        d dVar;
        int i10 = C0311a.f29209a[cVar.ordinal()];
        if (i10 == 1) {
            eVar.d(new JSONArray(str));
            dVar = new d(eVar, (e) null);
        } else if (i10 != 2) {
            return null;
        } else {
            eVar2.d(new JSONArray(str));
            dVar = new d((e) null, eVar2);
        }
        return dVar;
    }

    public final synchronized void c(String str, String str2) {
        m.e(str, "notificationTableName");
        m.e(str2, "notificationIdColumnName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NOT EXISTS(SELECT NULL FROM ");
        sb2.append(str);
        sb2.append(" n WHERE n.");
        sb2.append(str2);
        sb2.append(" = channel_influence_id AND channel_type = \"");
        String bVar = b.NOTIFICATION.toString();
        Locale locale = Locale.ROOT;
        m.d(locale, "ROOT");
        if (bVar != null) {
            String lowerCase = bVar.toLowerCase(locale);
            m.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb2.append(lowerCase);
            sb2.append("\")");
            this.f29207b.n("cached_unique_outcome", sb2.toString(), (String[]) null);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final synchronized void d(ma.b bVar) {
        m.e(bVar, "event");
        this.f29207b.n("outcome", "timestamp = ?", new String[]{String.valueOf(bVar.c())});
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[SYNTHETIC, Splitter:B:37:0x00c4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<ma.b> e() {
        /*
            r18 = this;
            r7 = r18
            monitor-enter(r18)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00ce }
            r8.<init>()     // Catch:{ all -> 0x00ce }
            r9 = 0
            com.onesignal.q3 r10 = r7.f29207b     // Catch:{ all -> 0x00c1 }
            java.lang.String r11 = "outcome"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.j(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r10.moveToFirst()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00b3
        L_0x001f:
            java.lang.String r0 = "notification_influence_type"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x00be }
            ja.c$a r1 = ja.c.f29109a     // Catch:{ all -> 0x00be }
            ja.c r0 = r1.a(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "iam_influence_type"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x00be }
            ja.c r2 = r1.a(r2)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = "notification_ids"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x00be }
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "[]"
        L_0x004b:
            java.lang.String r3 = "iam_ids"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x00be }
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = "[]"
        L_0x0059:
            r5 = r3
            java.lang.String r3 = "name"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r12 = r10.getString(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "weight"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00be }
            float r14 = r10.getFloat(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "timestamp"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x00be }
            long r15 = r10.getLong(r3)     // Catch:{ all -> 0x00be }
            ma.e r3 = new ma.e     // Catch:{ JSONException -> 0x00a5 }
            r4 = 3
            r3.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a5 }
            ma.e r6 = new ma.e     // Catch:{ JSONException -> 0x00a5 }
            r6.<init>(r9, r9, r4, r9)     // Catch:{ JSONException -> 0x00a5 }
            ma.d r0 = r7.h(r0, r3, r6, r1)     // Catch:{ JSONException -> 0x00a5 }
            r1 = r18
            r4 = r6
            r6 = r0
            r1.f(r2, r3, r4, r5, r6)     // Catch:{ JSONException -> 0x00a5 }
            if (r0 != 0) goto L_0x0095
            ma.d r0 = new ma.d     // Catch:{ JSONException -> 0x00a5 }
            r0.<init>(r9, r9)     // Catch:{ JSONException -> 0x00a5 }
        L_0x0095:
            r13 = r0
            ma.b r0 = new ma.b     // Catch:{ JSONException -> 0x00a5 }
            java.lang.String r1 = "name"
            kotlin.jvm.internal.m.d(r12, r1)     // Catch:{ JSONException -> 0x00a5 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15)     // Catch:{ JSONException -> 0x00a5 }
            r8.add(r0)     // Catch:{ JSONException -> 0x00a5 }
            goto L_0x00ad
        L_0x00a5:
            r0 = move-exception
            com.onesignal.v1 r1 = r7.f29206a     // Catch:{ all -> 0x00be }
            java.lang.String r2 = "Generating JSONArray from notifications ids outcome:JSON Failed."
            r1.c(r2, r0)     // Catch:{ all -> 0x00be }
        L_0x00ad:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x001f
        L_0x00b3:
            boolean r0 = r10.isClosed()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x00bc
            r10.close()     // Catch:{ all -> 0x00ce }
        L_0x00bc:
            monitor-exit(r18)
            return r8
        L_0x00be:
            r0 = move-exception
            r9 = r10
            goto L_0x00c2
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            if (r9 == 0) goto L_0x00cd
            boolean r1 = r9.isClosed()     // Catch:{ all -> 0x00ce }
            if (r1 != 0) goto L_0x00cd
            r9.close()     // Catch:{ all -> 0x00ce }
        L_0x00cd:
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.e():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r4.isClosed() == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r4.isClosed() == false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<ja.a> g(java.lang.String r23, java.util.List<ja.a> r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            monitor-enter(r22)
            java.lang.String r2 = "name"
            kotlin.jvm.internal.m.e(r0, r2)     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "influences"
            r3 = r24
            kotlin.jvm.internal.m.e(r3, r2)     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r2.<init>()     // Catch:{ all -> 0x00b5 }
            r4 = 0
            java.util.Iterator r3 = r24.iterator()     // Catch:{ JSONException -> 0x0099 }
        L_0x001b:
            boolean r5 = r3.hasNext()     // Catch:{ JSONException -> 0x0099 }
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r3.next()     // Catch:{ JSONException -> 0x0099 }
            ja.a r5 = (ja.a) r5     // Catch:{ JSONException -> 0x0099 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0099 }
            r6.<init>()     // Catch:{ JSONException -> 0x0099 }
            org.json.JSONArray r7 = r5.b()     // Catch:{ JSONException -> 0x0099 }
            if (r7 != 0) goto L_0x0033
            goto L_0x001b
        L_0x0033:
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0099 }
            if (r8 <= 0) goto L_0x0079
            r9 = 0
            r10 = 0
        L_0x003b:
            int r11 = r10 + 1
            java.lang.String r10 = r7.getString(r10)     // Catch:{ JSONException -> 0x0099 }
            ja.b r12 = r5.c()     // Catch:{ JSONException -> 0x0099 }
            java.lang.String[] r15 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r16 = "channel_influence_id = ? AND channel_type = ? AND name = ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ JSONException -> 0x0099 }
            r14[r9] = r10     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0099 }
            r13 = 1
            r14[r13] = r12     // Catch:{ JSONException -> 0x0099 }
            r12 = 2
            r14[r12] = r0     // Catch:{ JSONException -> 0x0099 }
            com.onesignal.q3 r13 = r1.f29207b     // Catch:{ JSONException -> 0x0099 }
            java.lang.String r12 = "cached_unique_outcome"
            r18 = 0
            r19 = 0
            r20 = 0
            java.lang.String r21 = "1"
            r17 = r14
            r14 = r12
            android.database.Cursor r4 = r13.i(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ JSONException -> 0x0099 }
            int r12 = r4.getCount()     // Catch:{ JSONException -> 0x0099 }
            if (r12 != 0) goto L_0x0074
            r6.put(r10)     // Catch:{ JSONException -> 0x0099 }
        L_0x0074:
            if (r11 < r8) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r10 = r11
            goto L_0x003b
        L_0x0079:
            int r7 = r6.length()     // Catch:{ JSONException -> 0x0099 }
            if (r7 <= 0) goto L_0x001b
            ja.a r5 = r5.a()     // Catch:{ JSONException -> 0x0099 }
            r5.e(r6)     // Catch:{ JSONException -> 0x0099 }
            r2.add(r5)     // Catch:{ JSONException -> 0x0099 }
            goto L_0x001b
        L_0x008a:
            if (r4 != 0) goto L_0x008d
            goto L_0x00a7
        L_0x008d:
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x00a7
        L_0x0093:
            r4.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00a7
        L_0x0097:
            r0 = move-exception
            goto L_0x00a9
        L_0x0099:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x00a7
            goto L_0x0093
        L_0x00a7:
            monitor-exit(r22)
            return r2
        L_0x00a9:
            if (r4 == 0) goto L_0x00b4
            boolean r2 = r4.isClosed()     // Catch:{ all -> 0x00b5 }
            if (r2 != 0) goto L_0x00b4
            r4.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.g(java.lang.String, java.util.List):java.util.List");
    }

    public final Set<String> i() {
        t2 t2Var = this.f29208c;
        return t2Var.c(t2Var.f(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (Set<String>) null);
    }

    public final boolean j() {
        t2 t2Var = this.f29208c;
        return t2Var.j(t2Var.f(), this.f29208c.h(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void k(ma.b r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "eventParams"
            kotlin.jvm.internal.m.e(r9, r0)     // Catch:{ all -> 0x00f0 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x00f0 }
            r0.<init>()     // Catch:{ all -> 0x00f0 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            ja.c r2 = ja.c.UNATTRIBUTED     // Catch:{ all -> 0x00f0 }
            ma.d r3 = r9.b()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            ma.e r3 = r3.a()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x0021
        L_0x001f:
            r3 = r2
            goto L_0x0046
        L_0x0021:
            org.json.JSONArray r4 = r3.b()     // Catch:{ all -> 0x00f0 }
            if (r4 != 0) goto L_0x0029
        L_0x0027:
            r4 = r2
            goto L_0x0034
        L_0x0029:
            int r5 = r4.length()     // Catch:{ all -> 0x00f0 }
            if (r5 <= 0) goto L_0x0027
            ja.c r0 = ja.c.DIRECT     // Catch:{ all -> 0x00f0 }
            r7 = r4
            r4 = r0
            r0 = r7
        L_0x0034:
            org.json.JSONArray r3 = r3.a()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x003b
            goto L_0x0044
        L_0x003b:
            int r5 = r3.length()     // Catch:{ all -> 0x00f0 }
            if (r5 <= 0) goto L_0x0044
            ja.c r2 = ja.c.DIRECT     // Catch:{ all -> 0x00f0 }
            r1 = r3
        L_0x0044:
            r3 = r2
            r2 = r4
        L_0x0046:
            ma.d r4 = r9.b()     // Catch:{ all -> 0x00f0 }
            if (r4 != 0) goto L_0x004d
            goto L_0x0074
        L_0x004d:
            ma.e r4 = r4.b()     // Catch:{ all -> 0x00f0 }
            if (r4 != 0) goto L_0x0054
            goto L_0x0074
        L_0x0054:
            org.json.JSONArray r5 = r4.b()     // Catch:{ all -> 0x00f0 }
            if (r5 != 0) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            int r6 = r5.length()     // Catch:{ all -> 0x00f0 }
            if (r6 <= 0) goto L_0x0064
            ja.c r2 = ja.c.INDIRECT     // Catch:{ all -> 0x00f0 }
            r0 = r5
        L_0x0064:
            org.json.JSONArray r4 = r4.a()     // Catch:{ all -> 0x00f0 }
            if (r4 != 0) goto L_0x006b
            goto L_0x0074
        L_0x006b:
            int r5 = r4.length()     // Catch:{ all -> 0x00f0 }
            if (r5 <= 0) goto L_0x0074
            ja.c r3 = ja.c.INDIRECT     // Catch:{ all -> 0x00f0 }
            r1 = r4
        L_0x0074:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00f0 }
            r4.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r5 = "notification_ids"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00f0 }
            r4.put(r5, r0)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "iam_ids"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "notification_influence_type"
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00e8
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "iam_influence_type"
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.m.d(r1, r2)     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r9.a()     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "weight"
            float r1 = r9.d()     // Catch:{ all -> 0x00f0 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r1)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "timestamp"
            long r1 = r9.c()     // Catch:{ all -> 0x00f0 }
            java.lang.Long r9 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x00f0 }
            r4.put(r0, r9)     // Catch:{ all -> 0x00f0 }
            com.onesignal.q3 r9 = r8.f29207b     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "outcome"
            r1 = 0
            r9.q(r0, r1, r4)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r8)
            return
        L_0x00e0:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r0)     // Catch:{ all -> 0x00f0 }
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00e8:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r9.<init>(r0)     // Catch:{ all -> 0x00f0 }
            throw r9     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: la.a.k(ma.b):void");
    }

    public final void l(Set<String> set) {
        t2 t2Var = this.f29208c;
        String f10 = t2Var.f();
        m.b(set);
        t2Var.g(f10, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    public final synchronized void m(ma.b bVar) {
        m.e(bVar, "eventParams");
        this.f29206a.d(m.m("OneSignal saveUniqueOutcomeEventParams: ", bVar));
        String a10 = bVar.a();
        ArrayList<ma.a> arrayList = new ArrayList<>();
        d b10 = bVar.b();
        e a11 = b10 == null ? null : b10.a();
        d b11 = bVar.b();
        e b12 = b11 == null ? null : b11.b();
        b(arrayList, a11);
        b(arrayList, b12);
        for (ma.a aVar : arrayList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("channel_influence_id", aVar.b());
            contentValues.put("channel_type", aVar.a().toString());
            contentValues.put(MediationMetaData.KEY_NAME, a10);
            this.f29207b.q("cached_unique_outcome", (String) null, contentValues);
        }
    }
}
