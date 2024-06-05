package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class t4 {

    /* renamed from: a  reason: collision with root package name */
    private final t f12241a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f12242b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f12243c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f12244d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f12245a;

        /* renamed from: b  reason: collision with root package name */
        private final b f12246b;

        /* renamed from: c  reason: collision with root package name */
        private final long f12247c;

        private c(String str, long j10, b bVar) {
            this.f12245a = str;
            this.f12247c = j10;
            this.f12246b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f12245a;
            String str2 = ((c) obj).f12245a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f12245a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f12245a + '\'' + ", countdownStepMillis=" + this.f12247c + '}';
        }

        /* access modifiers changed from: private */
        public b a() {
            return this.f12246b;
        }

        /* access modifiers changed from: private */
        public long b() {
            return this.f12247c;
        }

        /* access modifiers changed from: private */
        public String c() {
            return this.f12245a;
        }
    }

    public t4(Handler handler, k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (kVar != null) {
            this.f12242b = handler;
            this.f12241a = kVar.L();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i10) {
        b c10 = cVar.a();
        if (c10.b()) {
            if (this.f12244d.get() == i10) {
                try {
                    c10.a();
                    a(cVar, i10);
                } catch (Throwable th) {
                    if (t.a()) {
                        t tVar = this.f12241a;
                        tVar.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                }
            } else if (t.a()) {
                t tVar2 = this.f12241a;
                tVar2.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
            }
        } else if (t.a()) {
            t tVar3 = this.f12241a;
            tVar3.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    public void a(String str, long j10, b bVar) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f12242b != null) {
            if (t.a()) {
                t tVar = this.f12241a;
                tVar.a("CountdownManager", "Adding countdown: " + str);
            }
            this.f12243c.add(new c(str, j10, bVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    public void c() {
        if (t.a()) {
            this.f12241a.a("CountdownManager", "Stopping countdowns...");
        }
        this.f12244d.incrementAndGet();
        this.f12242b.removeCallbacksAndMessages((Object) null);
    }

    private void a(c cVar, int i10) {
        this.f12242b.postDelayed(new c50(this, cVar, i10), cVar.b());
    }

    public void a() {
        if (t.a()) {
            this.f12241a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f12243c.clear();
    }

    public void b() {
        HashSet<c> hashSet = new HashSet<>(this.f12243c);
        if (t.a()) {
            t tVar = this.f12241a;
            tVar.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f12244d.incrementAndGet();
        for (c cVar : hashSet) {
            if (t.a()) {
                t tVar2 = this.f12241a;
                tVar2.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + incrementAndGet + "...");
            }
            a(cVar, incrementAndGet);
        }
    }
}
