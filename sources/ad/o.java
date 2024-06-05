package ad;

import java.util.ArrayList;
import java.util.Iterator;
import lc.d;

/* compiled from: QueuingEventSink */
final class o implements d.b {

    /* renamed from: a  reason: collision with root package name */
    private d.b f31567a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Object> f31568b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f31569c = false;

    /* compiled from: QueuingEventSink */
    static class a {
        a() {
        }
    }

    /* compiled from: QueuingEventSink */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        String f31570a;

        /* renamed from: b  reason: collision with root package name */
        String f31571b;

        /* renamed from: c  reason: collision with root package name */
        Object f31572c;

        b(String str, String str2, Object obj) {
            this.f31570a = str;
            this.f31571b = str2;
            this.f31572c = obj;
        }
    }

    o() {
    }

    private void b(Object obj) {
        if (!this.f31569c) {
            this.f31568b.add(obj);
        }
    }

    private void c() {
        if (this.f31567a != null) {
            Iterator<Object> it = this.f31568b.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof a) {
                    this.f31567a.a();
                } else if (next instanceof b) {
                    b bVar = (b) next;
                    this.f31567a.error(bVar.f31570a, bVar.f31571b, bVar.f31572c);
                } else {
                    this.f31567a.success(next);
                }
            }
            this.f31568b.clear();
        }
    }

    public void a() {
        b(new a());
        c();
        this.f31569c = true;
    }

    public void d(d.b bVar) {
        this.f31567a = bVar;
        c();
    }

    public void error(String str, String str2, Object obj) {
        b(new b(str, str2, obj));
        c();
    }

    public void success(Object obj) {
        b(obj);
        c();
    }
}
