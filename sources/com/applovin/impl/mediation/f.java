package com.applovin.impl.mediation;

import com.applovin.impl.be;
import com.applovin.impl.ke;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9647a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: b  reason: collision with root package name */
    private final k f9648b;

    /* renamed from: c  reason: collision with root package name */
    private final t f9649c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9650d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Map f9651e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Set f9652f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final Object f9653g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final Set f9654h = new HashSet();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9655a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9656b;

        /* renamed from: c  reason: collision with root package name */
        private final MaxAdFormat f9657c;

        /* renamed from: d  reason: collision with root package name */
        private final JSONObject f9658d;

        a(String str, String str2, be beVar, k kVar) {
            this.f9655a = str;
            this.f9656b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f9658d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (beVar != null) {
                this.f9657c = beVar.getFormat();
                JsonUtils.putString(jSONObject, "format", beVar.getFormat().getLabel());
                return;
            }
            this.f9657c = null;
        }

        /* access modifiers changed from: package-private */
        public JSONObject a() {
            return this.f9658d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f9655a.equals(aVar.f9655a) || !this.f9656b.equals(aVar.f9656b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f9657c;
            MaxAdFormat maxAdFormat2 = aVar.f9657c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int hashCode = ((this.f9655a.hashCode() * 31) + this.f9656b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f9657c;
            return hashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f9655a + '\'' + ", operationTag='" + this.f9656b + '\'' + ", format=" + this.f9657c + '}';
        }
    }

    public f(k kVar) {
        if (kVar != null) {
            this.f9648b = kVar;
            this.f9649c = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public void a(String str, String str2, be beVar) {
        synchronized (this.f9653g) {
            this.f9648b.L();
            if (t.a()) {
                t L = this.f9648b.L();
                L.b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f9654h.add(new a(str, str2, beVar, this.f9648b));
        }
    }

    public Collection b() {
        Set unmodifiableSet;
        synchronized (this.f9650d) {
            unmodifiableSet = Collections.unmodifiableSet(this.f9652f);
        }
        return unmodifiableSet;
    }

    public Collection c() {
        Set unmodifiableSet;
        synchronized (this.f9650d) {
            HashSet hashSet = new HashSet(this.f9651e.size());
            for (Class name : this.f9651e.values()) {
                hashSet.add(name.getName());
            }
            unmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return unmodifiableSet;
    }

    /* access modifiers changed from: package-private */
    public g a(ke keVar) {
        return a(keVar, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.impl.mediation.g a(com.applovin.impl.ke r10, boolean r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0118
            java.lang.String r0 = r10.c()
            java.lang.String r1 = r10.b()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0035
            boolean r10 = com.applovin.impl.sdk.t.a()
            if (r10 == 0) goto L_0x0034
            com.applovin.impl.sdk.t r10 = r9.f9649c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "No adapter name provided for "
            r11.append(r0)
            r11.append(r1)
            java.lang.String r0 = ", not loading the adapter "
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "MediationAdapterManager"
            r10.b(r0, r11)
        L_0x0034:
            return r3
        L_0x0035:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x005f
            boolean r10 = com.applovin.impl.sdk.t.a()
            if (r10 == 0) goto L_0x005e
            com.applovin.impl.sdk.t r10 = r9.f9649c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Unable to find default className for '"
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "MediationAdapterManager"
            r10.b(r0, r11)
        L_0x005e:
            return r3
        L_0x005f:
            if (r11 == 0) goto L_0x006c
            java.util.Map r2 = r9.f9647a
            java.lang.Object r2 = r2.get(r1)
            com.applovin.impl.mediation.g r2 = (com.applovin.impl.mediation.g) r2
            if (r2 == 0) goto L_0x006c
            return r2
        L_0x006c:
            java.lang.Object r2 = r9.f9650d
            monitor-enter(r2)
            java.util.Set r4 = r9.f9652f     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.contains(r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x00f0
            java.util.Map r4 = r9.f9651e     // Catch:{ all -> 0x0115 }
            boolean r4 = r4.containsKey(r1)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x0088
            java.util.Map r4 = r9.f9651e     // Catch:{ all -> 0x0115 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0115 }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x0115 }
            goto L_0x0095
        L_0x0088:
            java.lang.Class r4 = r9.a((java.lang.String) r1)     // Catch:{ all -> 0x0115 }
            if (r4 != 0) goto L_0x0095
            java.util.Set r10 = r9.f9652f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0095:
            com.applovin.impl.mediation.g r5 = r9.a((com.applovin.impl.ke) r10, (java.lang.Class) r4, (boolean) r11)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00cb
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0115 }
            if (r3 == 0) goto L_0x00b9
            com.applovin.impl.sdk.t r3 = r9.f9649c     // Catch:{ all -> 0x0115 }
            java.lang.String r6 = "MediationAdapterManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r7.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r8 = "Loaded "
            r7.append(r8)     // Catch:{ all -> 0x0115 }
            r7.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0115 }
            r3.a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0115 }
        L_0x00b9:
            java.util.Map r0 = r9.f9651e     // Catch:{ all -> 0x0115 }
            r0.put(r1, r4)     // Catch:{ all -> 0x0115 }
            if (r11 == 0) goto L_0x00c9
            java.util.Map r11 = r9.f9647a     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r10.b()     // Catch:{ all -> 0x0115 }
            r11.put(r10, r5)     // Catch:{ all -> 0x0115 }
        L_0x00c9:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r5
        L_0x00cb:
            boolean r10 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x00e9
            com.applovin.impl.sdk.t r10 = r9.f9649c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r4.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r5 = "Failed to load "
            r4.append(r5)     // Catch:{ all -> 0x0115 }
            r4.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0115 }
            r10.b(r11, r0)     // Catch:{ all -> 0x0115 }
        L_0x00e9:
            java.util.Set r10 = r9.f9652f     // Catch:{ all -> 0x0115 }
            r10.add(r1)     // Catch:{ all -> 0x0115 }
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x00f0:
            boolean r10 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x0115 }
            if (r10 == 0) goto L_0x0113
            com.applovin.impl.sdk.t r10 = r9.f9649c     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = "MediationAdapterManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0115 }
            r1.<init>()     // Catch:{ all -> 0x0115 }
            java.lang.String r4 = "Not attempting to load "
            r1.append(r4)     // Catch:{ all -> 0x0115 }
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = " due to prior errors"
            r1.append(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0115 }
            r10.a((java.lang.String) r11, (java.lang.String) r0)     // Catch:{ all -> 0x0115 }
        L_0x0113:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return r3
        L_0x0115:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r10
        L_0x0118:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "No adapter spec specified"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.f.a(com.applovin.impl.ke, boolean):com.applovin.impl.mediation.g");
    }

    private g a(ke keVar, Class cls, boolean z10) {
        try {
            return new g(keVar, (MediationAdapterBase) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{this.f9648b.v0()}), z10, this.f9648b);
        } catch (Throwable th) {
            t.c("MediationAdapterManager", "Failed to load adapter: " + keVar, th);
            return null;
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f9653g) {
            arrayList = new ArrayList(this.f9654h.size());
            for (a a10 : this.f9654h) {
                arrayList.add(a10.a());
            }
        }
        return arrayList;
    }

    private Class a(String str) {
        Class<MaxAdapter> cls = MaxAdapter.class;
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2.asSubclass(cls);
            }
            t.h("MediationAdapterManager", str + " error: not an instance of '" + cls.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
