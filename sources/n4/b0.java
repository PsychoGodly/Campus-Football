package n4;

import com.google.android.gms.ads.internal.client.n4;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20908a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20909b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20910c;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f20911a = true;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f20912b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public boolean f20913c = false;

        public b0 a() {
            return new b0(this, (k0) null);
        }

        public a b(boolean z10) {
            this.f20913c = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f20912b = z10;
            return this;
        }

        public a d(boolean z10) {
            this.f20911a = z10;
            return this;
        }
    }

    public b0(n4 n4Var) {
        this.f20908a = n4Var.f14513a;
        this.f20909b = n4Var.f14514b;
        this.f20910c = n4Var.f14515c;
    }

    /* synthetic */ b0(a aVar, k0 k0Var) {
        this.f20908a = aVar.f20911a;
        this.f20909b = aVar.f20912b;
        this.f20910c = aVar.f20913c;
    }

    public boolean a() {
        return this.f20910c;
    }

    public boolean b() {
        return this.f20909b;
    }

    public boolean c() {
        return this.f20908a;
    }
}
