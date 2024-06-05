package lc;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lc.c;

/* compiled from: EventChannel */
public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f36103a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f36104b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f36105c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0412c f36106d;

    /* compiled from: EventChannel */
    public interface b {
        void a();

        void error(String str, String str2, Object obj);

        void success(Object obj);
    }

    /* compiled from: EventChannel */
    private final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0413d f36107a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<b> f36108b = new AtomicReference<>((Object) null);

        /* compiled from: EventChannel */
        private final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final AtomicBoolean f36110a;

            private a() {
                this.f36110a = new AtomicBoolean(false);
            }

            public void a() {
                if (!this.f36110a.getAndSet(true) && c.this.f36108b.get() == this) {
                    d.this.f36103a.f(d.this.f36104b, (ByteBuffer) null);
                }
            }

            public void error(String str, String str2, Object obj) {
                if (!this.f36110a.get() && c.this.f36108b.get() == this) {
                    d.this.f36103a.f(d.this.f36104b, d.this.f36105c.e(str, str2, obj));
                }
            }

            public void success(Object obj) {
                if (!this.f36110a.get() && c.this.f36108b.get() == this) {
                    d.this.f36103a.f(d.this.f36104b, d.this.f36105c.c(obj));
                }
            }
        }

        c(C0413d dVar) {
            this.f36107a = dVar;
        }

        private void c(Object obj, c.b bVar) {
            if (this.f36108b.getAndSet((Object) null) != null) {
                try {
                    this.f36107a.g(obj);
                    bVar.a(d.this.f36105c.c((Object) null));
                } catch (RuntimeException e10) {
                    xb.b.c("EventChannel#" + d.this.f36104b, "Failed to close event stream", e10);
                    bVar.a(d.this.f36105c.e("error", e10.getMessage(), (Object) null));
                }
            } else {
                bVar.a(d.this.f36105c.e("error", "No active stream to cancel", (Object) null));
            }
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f36108b.getAndSet(aVar) != null) {
                try {
                    this.f36107a.g((Object) null);
                } catch (RuntimeException e10) {
                    xb.b.c("EventChannel#" + d.this.f36104b, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.f36107a.h(obj, aVar);
                bVar.a(d.this.f36105c.c((Object) null));
            } catch (RuntimeException e11) {
                this.f36108b.set((Object) null);
                xb.b.c("EventChannel#" + d.this.f36104b, "Failed to open event stream", e11);
                bVar.a(d.this.f36105c.e("error", e11.getMessage(), (Object) null));
            }
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j a10 = d.this.f36105c.a(byteBuffer);
            if (a10.f36116a.equals("listen")) {
                d(a10.f36117b, bVar);
            } else if (a10.f36116a.equals("cancel")) {
                c(a10.f36117b, bVar);
            } else {
                bVar.a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: lc.d$d  reason: collision with other inner class name */
    /* compiled from: EventChannel */
    public interface C0413d {
        void g(Object obj);

        void h(Object obj, b bVar);
    }

    public d(c cVar, String str) {
        this(cVar, str, s.f36131b);
    }

    public void d(C0413d dVar) {
        c cVar = null;
        if (this.f36106d != null) {
            c cVar2 = this.f36103a;
            String str = this.f36104b;
            if (dVar != null) {
                cVar = new c(dVar);
            }
            cVar2.e(str, cVar, this.f36106d);
            return;
        }
        c cVar3 = this.f36103a;
        String str2 = this.f36104b;
        if (dVar != null) {
            cVar = new c(dVar);
        }
        cVar3.i(str2, cVar);
    }

    public d(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0412c) null);
    }

    public d(c cVar, String str, l lVar, c.C0412c cVar2) {
        this.f36103a = cVar;
        this.f36104b = str;
        this.f36105c = lVar;
        this.f36106d = cVar2;
    }
}
