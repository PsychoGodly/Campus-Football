package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class j<L> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f15158a;

    /* renamed from: b  reason: collision with root package name */
    private volatile L f15159b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a<L> f15160c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final L f15161a;

        /* renamed from: b  reason: collision with root package name */
        private final String f15162b;

        a(L l10, String str) {
            this.f15161a = l10;
            this.f15162b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15161a == aVar.f15161a && this.f15162b.equals(aVar.f15162b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f15161a) * 31) + this.f15162b.hashCode();
        }
    }

    j(Looper looper, L l10, String str) {
        this.f15158a = new n5.a(looper);
        this.f15159b = q.l(l10, "Listener must not be null");
        this.f15160c = new a<>(l10, q.g(str));
    }

    public void a() {
        this.f15159b = null;
        this.f15160c = null;
    }
}
