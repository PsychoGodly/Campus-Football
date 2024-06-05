package n7;

import java.io.IOException;
import k7.b;
import k7.c;
import k7.g;

/* compiled from: ProtobufValueEncoderContext */
class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29440a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29441b = false;

    /* renamed from: c  reason: collision with root package name */
    private c f29442c;

    /* renamed from: d  reason: collision with root package name */
    private final f f29443d;

    i(f fVar) {
        this.f29443d = fVar;
    }

    private void a() {
        if (!this.f29440a) {
            this.f29440a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    public void b(c cVar, boolean z10) {
        this.f29440a = false;
        this.f29442c = cVar;
        this.f29441b = z10;
    }

    public g c(String str) throws IOException {
        a();
        this.f29443d.g(this.f29442c, str, this.f29441b);
        return this;
    }

    public g d(boolean z10) throws IOException {
        a();
        this.f29443d.l(this.f29442c, z10, this.f29441b);
        return this;
    }
}
