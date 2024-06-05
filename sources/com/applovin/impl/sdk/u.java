package com.applovin.impl.sdk;

import com.applovin.impl.be;
import java.util.HashMap;
import java.util.Map;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private final t f12043a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12044b = new HashMap(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f12045c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f12046a;

        /* renamed from: b  reason: collision with root package name */
        private final String f12047b;

        /* renamed from: c  reason: collision with root package name */
        private final String f12048c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f12049d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f12050e;

        public a(String str, String str2, String str3) {
            this.f12046a = str;
            this.f12047b = str2;
            this.f12048c = str3;
        }

        /* access modifiers changed from: protected */
        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String c() {
            return this.f12048c;
        }

        public String d() {
            return this.f12049d;
        }

        public String e() {
            return this.f12050e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String b10 = b();
            String b11 = aVar.b();
            if (b10 != null ? !b10.equals(b11) : b11 != null) {
                return false;
            }
            String a10 = a();
            String a11 = aVar.a();
            if (a10 != null ? !a10.equals(a11) : a11 != null) {
                return false;
            }
            String c10 = c();
            String c11 = aVar.c();
            if (c10 != null ? !c10.equals(c11) : c11 != null) {
                return false;
            }
            String d10 = d();
            String d11 = aVar.d();
            if (d10 != null ? !d10.equals(d11) : d11 != null) {
                return false;
            }
            String e10 = e();
            String e11 = aVar.e();
            return e10 != null ? e10.equals(e11) : e11 == null;
        }

        public int hashCode() {
            String b10 = b();
            int i10 = 43;
            int hashCode = b10 == null ? 43 : b10.hashCode();
            String a10 = a();
            int hashCode2 = ((hashCode + 59) * 59) + (a10 == null ? 43 : a10.hashCode());
            String c10 = c();
            int hashCode3 = (hashCode2 * 59) + (c10 == null ? 43 : c10.hashCode());
            String d10 = d();
            int hashCode4 = (hashCode3 * 59) + (d10 == null ? 43 : d10.hashCode());
            String e10 = e();
            int i11 = hashCode4 * 59;
            if (e10 != null) {
                i10 = e10.hashCode();
            }
            return i11 + i10;
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public String b() {
            return this.f12046a;
        }

        public String a() {
            return this.f12047b;
        }
    }

    u(k kVar) {
        this.f12043a = kVar.L();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.be r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12045c
            monitor-enter(r0)
            java.lang.String r1 = r7.getAdUnitId()     // Catch:{ all -> 0x007c }
            java.util.Map r2 = r6.f12044b     // Catch:{ all -> 0x007c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x007c }
            com.applovin.impl.sdk.u$a r2 = (com.applovin.impl.sdk.u.a) r2     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x0022
            boolean r7 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x007c }
            if (r7 == 0) goto L_0x0020
            com.applovin.impl.sdk.t r7 = r6.f12043a     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "MediationWaterfallWinnerTracker"
            java.lang.String r2 = "No previous winner to clear."
            r7.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x007c }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x0022:
            java.lang.String r3 = r7.A()     // Catch:{ all -> 0x007c }
            java.lang.String r4 = r2.b()     // Catch:{ all -> 0x007c }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0054
            boolean r7 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x007c }
            if (r7 == 0) goto L_0x004e
            com.applovin.impl.sdk.t r7 = r6.f12043a     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "MediationWaterfallWinnerTracker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r4.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r5 = "Clearing previous winning ad: "
            r4.append(r5)     // Catch:{ all -> 0x007c }
            r4.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x007c }
            r7.a((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ all -> 0x007c }
        L_0x004e:
            java.util.Map r7 = r6.f12044b     // Catch:{ all -> 0x007c }
            r7.remove(r1)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0054:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x007a
            com.applovin.impl.sdk.t r1 = r6.f12043a     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "MediationWaterfallWinnerTracker"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
            r4.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r5 = "Previous winner not cleared for ad: "
            r4.append(r5)     // Catch:{ all -> 0x007c }
            r4.append(r7)     // Catch:{ all -> 0x007c }
            java.lang.String r7 = " , since it could have already been updated with a new ad: "
            r4.append(r7)     // Catch:{ all -> 0x007c }
            r4.append(r2)     // Catch:{ all -> 0x007c }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x007c }
            r1.a((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.u.a(com.applovin.impl.be):void");
    }

    public void b(be beVar) {
        a(beVar, (be) null);
    }

    public void a(be beVar, be beVar2) {
        synchronized (this.f12045c) {
            if (t.a()) {
                t tVar = this.f12043a;
                tVar.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + beVar);
            }
            a aVar = new a(beVar.A(), beVar.c(), beVar.getNetworkName());
            if (beVar2 != null) {
                String unused = aVar.f12049d = beVar2.c();
                String unused2 = aVar.f12050e = beVar2.getNetworkName();
            }
            this.f12044b.put(beVar.getAdUnitId(), aVar);
        }
    }

    public a a(String str) {
        a aVar;
        synchronized (this.f12045c) {
            aVar = (a) this.f12044b.get(str);
        }
        return aVar;
    }
}
