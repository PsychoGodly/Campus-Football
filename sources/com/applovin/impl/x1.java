package com.applovin.impl;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface x1 {
    yo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    public interface a {
        void a(int i10, long j10, long j11);

        /* renamed from: com.applovin.impl.x1$a$a  reason: collision with other inner class name */
        public static final class C0145a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList f13222a = new CopyOnWriteArrayList();

            /* renamed from: com.applovin.impl.x1$a$a$a  reason: collision with other inner class name */
            private static final class C0146a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f13223a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f13224b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f13225c;

                public C0146a(Handler handler, a aVar) {
                    this.f13223a = handler;
                    this.f13224b = aVar;
                }

                public void a() {
                    this.f13225c = true;
                }
            }

            public void a(Handler handler, a aVar) {
                a1.a((Object) handler);
                a1.a((Object) aVar);
                a(aVar);
                this.f13222a.add(new C0146a(handler, aVar));
            }

            public void a(int i10, long j10, long j11) {
                Iterator it = this.f13222a.iterator();
                while (it.hasNext()) {
                    C0146a aVar = (C0146a) it.next();
                    if (!aVar.f13225c) {
                        aVar.f13223a.post(new l70(aVar, i10, j10, j11));
                    }
                }
            }

            public void a(a aVar) {
                Iterator it = this.f13222a.iterator();
                while (it.hasNext()) {
                    C0146a aVar2 = (C0146a) it.next();
                    if (aVar2.f13224b == aVar) {
                        aVar2.a();
                        this.f13222a.remove(aVar2);
                    }
                }
            }
        }
    }
}
