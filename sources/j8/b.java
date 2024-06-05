package j8;

import com.google.firebase.messaging.l0;
import n7.d;

/* compiled from: MessagingClientEventExtension */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f29081b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final a f29082a;

    /* compiled from: MessagingClientEventExtension */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f29083a = null;

        a() {
        }

        public b a() {
            return new b(this.f29083a);
        }

        public a b(a aVar) {
            this.f29083a = aVar;
            return this;
        }
    }

    b(a aVar) {
        this.f29082a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public a a() {
        return this.f29082a;
    }

    public byte[] c() {
        return l0.a(this);
    }
}
