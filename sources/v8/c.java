package v8;

import com.applovin.mediation.MaxReward;
import z8.a;
import z8.b;

/* compiled from: BinaryBitmap */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f30741a;

    /* renamed from: b  reason: collision with root package name */
    private b f30742b;

    public c(b bVar) {
        if (bVar != null) {
            this.f30741a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public b a() throws j {
        if (this.f30742b == null) {
            this.f30742b = this.f30741a.b();
        }
        return this.f30742b;
    }

    public a b(int i10, a aVar) throws j {
        return this.f30741a.c(i10, aVar);
    }

    public int c() {
        return this.f30741a.d();
    }

    public int d() {
        return this.f30741a.f();
    }

    public boolean e() {
        return this.f30741a.e().f();
    }

    public c f() {
        return new c(this.f30741a.a(this.f30741a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (j unused) {
            return MaxReward.DEFAULT_LABEL;
        }
    }
}
