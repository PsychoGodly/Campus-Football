package i2;

import b2.o;
import j2.d;
import java.util.concurrent.Executor;
import k2.b;

/* compiled from: WorkInitializer */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f18911a;

    /* renamed from: b  reason: collision with root package name */
    private final d f18912b;

    /* renamed from: c  reason: collision with root package name */
    private final y f18913c;

    /* renamed from: d  reason: collision with root package name */
    private final b f18914d;

    w(Executor executor, d dVar, y yVar, b bVar) {
        this.f18911a = executor;
        this.f18912b = dVar;
        this.f18913c = yVar;
        this.f18914d = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (o b10 : this.f18912b.I()) {
            this.f18913c.b(b10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f18914d.i(new v(this));
    }

    public void c() {
        this.f18911a.execute(new u(this));
    }
}
