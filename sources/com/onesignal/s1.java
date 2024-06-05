package com.onesignal;

import android.content.ContentValues;
import com.facebook.ads.AdSDKNotificationListener;
import com.onesignal.k3;
import com.onesignal.v3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository */
class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final r3 f28137a;

    /* renamed from: b  reason: collision with root package name */
    private final v1 f28138b;

    /* renamed from: c  reason: collision with root package name */
    private final t2 f28139c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f28140d = 0;

    /* compiled from: OSInAppMessageRepository */
    class a extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f28142b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f28144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f28145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f28146f;

        a(String str, int i10, String str2, String str3, String str4, boolean z10) throws JSONException {
            this.f28141a = str;
            this.f28142b = i10;
            this.f28143c = str2;
            this.f28144d = str3;
            this.f28145e = str4;
            this.f28146f = z10;
            put("app_id", str);
            put("device_type", i10);
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z10) {
                put("first_click", true);
            }
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class b extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f28148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f28149b;

        b(Set set, i iVar) {
            this.f28148a = set;
            this.f28149b = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            s1.this.u("engagement", i10, str);
            this.f28149b.a(str);
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            s1.this.v("engagement", str);
            s1.this.w(this.f28148a);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class c extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28151a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28152b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f28154d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f28155e;

        c(String str, String str2, String str3, int i10, String str4) throws JSONException {
            this.f28151a = str;
            this.f28152b = str2;
            this.f28153c = str3;
            this.f28154d = i10;
            this.f28155e = str4;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i10);
            put("page_id", str4);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class d extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f28157a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f28158b;

        d(Set set, i iVar) {
            this.f28157a = set;
            this.f28158b = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            s1.this.u("page impression", i10, str);
            this.f28158b.a(str);
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            s1.this.v("page impression", str);
            s1.this.C(this.f28157a);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class e extends JSONObject {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f28162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f28163d;

        e(String str, String str2, String str3, int i10) throws JSONException {
            this.f28160a = str;
            this.f28161b = str2;
            this.f28162c = str3;
            this.f28163d = i10;
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", i10);
            put("first_impression", true);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class f extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f28165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f28166b;

        f(Set set, i iVar) {
            this.f28165a = set;
            this.f28166b = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            s1.this.u(AdSDKNotificationListener.IMPRESSION_EVENT, i10, str);
            this.f28166b.a(str);
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            s1.this.v(AdSDKNotificationListener.IMPRESSION_EVENT, str);
            s1.this.z(this.f28165a);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class g extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28168a;

        g(i iVar) {
            this.f28168a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            s1.this.u("html", i10, str);
            this.f28168a.a(str);
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            this.f28168a.b(str);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    class h extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f28170a;

        h(i iVar) {
            this.f28170a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(int i10, String str, Throwable th) {
            s1.this.u("html", i10, str);
            JSONObject jSONObject = new JSONObject();
            if (!OSUtils.V(i10) || s1.this.f28140d >= OSUtils.f27517a) {
                int unused = s1.this.f28140d = 0;
                try {
                    jSONObject.put("retry", false);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            } else {
                s1.g(s1.this);
                try {
                    jSONObject.put("retry", true);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
            this.f28170a.a(jSONObject.toString());
        }

        /* access modifiers changed from: package-private */
        public void b(String str) {
            int unused = s1.this.f28140d = 0;
            this.f28170a.b(str);
        }
    }

    /* compiled from: OSInAppMessageRepository */
    interface i {
        void a(String str);

        void b(String str);
    }

    s1(r3 r3Var, v1 v1Var, t2 t2Var) {
        this.f28137a = r3Var;
        this.f28138b = v1Var;
        this.f28139c = t2Var;
    }

    static /* synthetic */ int g(s1 s1Var) {
        int i10 = s1Var.f28140d;
        s1Var.f28140d = i10 + 1;
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = com.onesignal.t3.f28204a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(java.util.Set<java.lang.String> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x001f
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x001f
            java.lang.String r0 = com.onesignal.t3.f28204a
            r1 = 0
            java.lang.String r2 = "PREFS_OS_CLICKED_CLICK_IDS_IAMS"
            java.util.Set r1 = com.onesignal.t3.g(r0, r2, r1)
            if (r1 == 0) goto L_0x001f
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x001f
            r1.removeAll(r5)
            com.onesignal.t3.n(r0, r2, r1)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.s1.i(java.util.Set):void");
    }

    private void j(Set<String> set) {
        if (set != null && set.size() > 0) {
            String str = t3.f28204a;
            Set<String> g10 = t3.g(str, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
            Set<String> g11 = t3.g(str, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
            if (g10 != null && g10.size() > 0) {
                g10.removeAll(set);
                t3.n(str, "PREFS_OS_DISPLAYED_IAMS", g10);
            }
            if (g11 != null && g11.size() > 0) {
                g11.removeAll(set);
                t3.n(str, "PREFS_OS_IMPRESSIONED_IAMS", g11);
            }
        }
    }

    private String t(String str, String str2, String str3) {
        if (str2 == null) {
            v1 v1Var = this.f28138b;
            v1Var.a("Unable to find a variant for in-app message " + str);
            return null;
        }
        return "in_app_messages/" + str + "/variants/" + str2 + "/html?app_id=" + str3;
    }

    /* access modifiers changed from: private */
    public void u(String str, int i10, String str2) {
        v1 v1Var = this.f28138b;
        v1Var.a("Encountered a " + i10 + " error while attempting in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    public void v(String str, String str2) {
        v1 v1Var = this.f28138b;
        v1Var.d("Successful post for in-app message " + str + " request: " + str2);
    }

    /* access modifiers changed from: private */
    public void w(Set<String> set) {
        this.f28139c.g(t3.f28204a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", set);
    }

    /* access modifiers changed from: private */
    public void z(Set<String> set) {
        this.f28139c.g(t3.f28204a, "PREFS_OS_IMPRESSIONED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    public synchronized void A(i1 i1Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", i1Var.f27580a);
        contentValues.put("display_quantity", Integer.valueOf(i1Var.f().a()));
        contentValues.put("last_display", Long.valueOf(i1Var.f().b()));
        contentValues.put("click_ids", i1Var.d().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(i1Var.h()));
        if (this.f28137a.h("in_app_message", contentValues, "message_id = ?", new String[]{i1Var.f27580a}) == 0) {
            this.f28137a.q("in_app_message", (String) null, contentValues);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Date date) {
        this.f28139c.i(t3.f28204a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", date != null ? date.toString() : null);
    }

    /* access modifiers changed from: package-private */
    public void C(Set<String> set) {
        this.f28139c.g(t3.f28204a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    public void D(String str, String str2, String str3, int i10, String str4, String str5, boolean z10, Set<String> set, i iVar) {
        try {
            a aVar = new a(str, i10, str2, str5, str3, z10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("in_app_messages/");
            String str6 = str4;
            sb2.append(str4);
            sb2.append("/click");
            v3.j(sb2.toString(), aVar, new b(set, iVar));
        } catch (JSONException e10) {
            e10.printStackTrace();
            this.f28138b.a("Unable to execute in-app message action HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    public void E(String str, String str2, String str3, int i10, String str4, Set<String> set, i iVar) {
        try {
            e eVar = new e(str, str2, str3, i10);
            v3.j("in_app_messages/" + str4 + "/impression", eVar, new f(set, iVar));
        } catch (JSONException e10) {
            e10.printStackTrace();
            this.f28138b.a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    public void F(String str, String str2, String str3, int i10, String str4, String str5, Set<String> set, i iVar) {
        try {
            c cVar = new c(str, str2, str3, i10, str5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("in_app_messages/");
            String str6 = str4;
            sb2.append(str4);
            sb2.append("/pageImpression");
            v3.j(sb2.toString(), cVar, new d(set, iVar));
        } catch (JSONException e10) {
            e10.printStackTrace();
            this.f28138b.a("Unable to execute in-app message impression HTTP request due to invalid JSON");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r12.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void h() {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "message_id"
            java.lang.String r1 = "click_ids"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "last_display < ?"
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b6 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            r5 = 15552000(0xed4e00, double:7.683709E-317)
            long r1 = r1 - r5
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00b6 }
            r2 = 1
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ all -> 0x00b6 }
            r2 = 0
            r10[r2] = r1     // Catch:{ all -> 0x00b6 }
            java.util.Set r1 = com.onesignal.OSUtils.L()     // Catch:{ all -> 0x00b6 }
            java.util.Set r11 = com.onesignal.OSUtils.L()     // Catch:{ all -> 0x00b6 }
            r12 = 0
            com.onesignal.r3 r2 = r13.f28137a     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "in_app_message"
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r0
            r6 = r10
            android.database.Cursor r12 = r2.j(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x0078
            int r2 = r12.getCount()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x003f
            goto L_0x0078
        L_0x003f:
            boolean r2 = r12.moveToFirst()     // Catch:{ JSONException -> 0x008e }
            if (r2 == 0) goto L_0x006e
        L_0x0045:
            java.lang.String r2 = "message_id"
            int r2 = r12.getColumnIndex(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "click_ids"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ JSONException -> 0x008e }
            r1.add(r2)     // Catch:{ JSONException -> 0x008e }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008e }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x008e }
            java.util.Set r2 = com.onesignal.OSUtils.M(r2)     // Catch:{ JSONException -> 0x008e }
            r11.addAll(r2)     // Catch:{ JSONException -> 0x008e }
            boolean r2 = r12.moveToNext()     // Catch:{ JSONException -> 0x008e }
            if (r2 != 0) goto L_0x0045
        L_0x006e:
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
        L_0x0074:
            r12.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x009b
        L_0x0078:
            com.onesignal.k3$r0 r2 = com.onesignal.k3.r0.DEBUG     // Catch:{ JSONException -> 0x008e }
            java.lang.String r3 = "Attempted to clean 6 month old IAM data, but none exists!"
            com.onesignal.k3.A1(r2, r3)     // Catch:{ JSONException -> 0x008e }
            if (r12 == 0) goto L_0x008a
            boolean r0 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r0 != 0) goto L_0x008a
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x008a:
            monitor-exit(r13)
            return
        L_0x008c:
            r0 = move-exception
            goto L_0x00aa
        L_0x008e:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x008c }
            if (r12 == 0) goto L_0x009b
            boolean r2 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r2 != 0) goto L_0x009b
            goto L_0x0074
        L_0x009b:
            com.onesignal.r3 r2 = r13.f28137a     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "in_app_message"
            r2.n(r3, r0, r10)     // Catch:{ all -> 0x00b6 }
            r13.j(r1)     // Catch:{ all -> 0x00b6 }
            r13.i(r11)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r13)
            return
        L_0x00aa:
            if (r12 == 0) goto L_0x00b5
            boolean r1 = r12.isClosed()     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x00b5
            r12.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.s1.h():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r1.isClosed() == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<com.onesignal.i1> k() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r0.<init>()     // Catch:{ all -> 0x0099 }
            r1 = 0
            com.onesignal.r3 r2 = r10.f28137a     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "in_app_message"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r2.j(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToFirst()     // Catch:{ JSONException -> 0x007a }
            if (r2 == 0) goto L_0x006e
        L_0x001b:
            java.lang.String r2 = "message_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = "click_ids"
            int r3 = r1.getColumnIndex(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r4 = "display_quantity"
            int r4 = r1.getColumnIndex(r4)     // Catch:{ JSONException -> 0x007a }
            int r4 = r1.getInt(r4)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r5 = "last_display"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ JSONException -> 0x007a }
            long r5 = r1.getLong(r5)     // Catch:{ JSONException -> 0x007a }
            java.lang.String r7 = "displayed_in_session"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ JSONException -> 0x007a }
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x007a }
            r8 = 1
            if (r7 != r8) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r8 = 0
        L_0x0052:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x007a }
            java.util.Set r3 = com.onesignal.OSUtils.M(r7)     // Catch:{ JSONException -> 0x007a }
            com.onesignal.i1 r7 = new com.onesignal.i1     // Catch:{ JSONException -> 0x007a }
            com.onesignal.r1 r9 = new com.onesignal.r1     // Catch:{ JSONException -> 0x007a }
            r9.<init>(r4, r5)     // Catch:{ JSONException -> 0x007a }
            r7.<init>(r2, r3, r8, r9)     // Catch:{ JSONException -> 0x007a }
            r0.add(r7)     // Catch:{ JSONException -> 0x007a }
            boolean r2 = r1.moveToNext()     // Catch:{ JSONException -> 0x007a }
            if (r2 != 0) goto L_0x001b
        L_0x006e:
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
        L_0x0074:
            r1.close()     // Catch:{ all -> 0x0099 }
            goto L_0x008b
        L_0x0078:
            r0 = move-exception
            goto L_0x008d
        L_0x007a:
            r2 = move-exception
            com.onesignal.k3$r0 r3 = com.onesignal.k3.r0.ERROR     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "Generating JSONArray from iam click ids:JSON Failed."
            com.onesignal.k3.b(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x008b
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x008b
            goto L_0x0074
        L_0x008b:
            monitor-exit(r10)
            return r0
        L_0x008d:
            if (r1 == 0) goto L_0x0098
            boolean r2 = r1.isClosed()     // Catch:{ all -> 0x0099 }
            if (r2 != 0) goto L_0x0098
            r1.close()     // Catch:{ all -> 0x0099 }
        L_0x0098:
            throw r0     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.s1.k():java.util.List");
    }

    /* access modifiers changed from: package-private */
    public Set<String> l() {
        return this.f28139c.c(t3.f28204a, "PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public Set<String> m() {
        return this.f28139c.c(t3.f28204a, "PREFS_OS_DISPLAYED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void n(String str, String str2, String str3, i iVar) {
        v3.e(t(str2, str3, str), new h(iVar), (String) null);
    }

    /* access modifiers changed from: package-private */
    public void o(String str, String str2, i iVar) {
        v3.e("in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, new g(iVar), (String) null);
    }

    /* access modifiers changed from: package-private */
    public Set<String> p() {
        return this.f28139c.c(t3.f28204a, "PREFS_OS_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public Date q() {
        String e10 = this.f28139c.e(t3.f28204a, "PREFS_OS_LAST_TIME_IAM_DISMISSED", (String) null);
        if (e10 == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH).parse(e10);
        } catch (ParseException e11) {
            k3.A1(k3.r0.ERROR, e11.getLocalizedMessage());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String r() {
        return this.f28139c.e(t3.f28204a, "PREFS_OS_CACHED_IAMS", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Set<String> s() {
        return this.f28139c.c(t3.f28204a, "PREFS_OS_PAGE_IMPRESSIONED_IAMS", (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void x(Set<String> set) {
        this.f28139c.g(t3.f28204a, "PREFS_OS_DISPLAYED_IAMS", set);
    }

    /* access modifiers changed from: package-private */
    public void y(String str) {
        this.f28139c.i(t3.f28204a, "PREFS_OS_CACHED_IAMS", str);
    }
}
