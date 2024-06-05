package com.applovin.impl;

import com.applovin.impl.re;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.se;
import java.util.HashMap;
import java.util.Map;

public final class te {

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap f12399b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap f12400c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f12401d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final k f12402a;

    public te(k kVar) {
        this.f12402a = kVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10, Long l11) {
        return l10;
    }

    private boolean a(re reVar, se seVar, re.a aVar) {
        if (reVar == null) {
            this.f12402a.L();
            if (t.a()) {
                this.f12402a.L().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        } else if (seVar == null) {
            this.f12402a.L();
            if (t.a()) {
                this.f12402a.L().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        } else if (aVar != null) {
            return true;
        } else {
            this.f12402a.L();
            if (t.a()) {
                this.f12402a.L().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
            }
            return false;
        }
    }

    private void b(re reVar, se seVar, re.a aVar) {
        HashMap hashMap;
        if (a(reVar, seVar, aVar)) {
            String b10 = seVar.b();
            HashMap a10 = a(seVar.a());
            synchronized (a10) {
                if (a10.containsKey(b10)) {
                    hashMap = (HashMap) a10.get(b10);
                } else {
                    HashMap hashMap2 = new HashMap();
                    a10.put(b10, hashMap2);
                    hashMap = hashMap2;
                }
                hashMap.put(reVar, aVar.a(hashMap.get(reVar)));
            }
        }
    }

    public Map a(re reVar, se.a aVar) {
        HashMap a10 = a(aVar);
        HashMap hashMap = new HashMap();
        synchronized (a10) {
            for (String str : a10.keySet()) {
                hashMap.put(str, ((HashMap) a10.get(str)).get(reVar));
            }
        }
        return hashMap;
    }

    private HashMap a(se.a aVar) {
        if (aVar == se.a.AD_UNIT_ID) {
            return f12399b;
        }
        if (aVar == se.a.AD_FORMAT) {
            return f12400c;
        }
        return f12401d;
    }

    public void a(re reVar, se seVar) {
        b(reVar, seVar, s50.f11300a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10) {
        long j10 = 1;
        if (l10 != null) {
            j10 = 1 + l10.longValue();
        }
        return Long.valueOf(j10);
    }

    public void a(re reVar, se seVar, Long l10) {
        b(reVar, seVar, new r50(l10));
    }
}
