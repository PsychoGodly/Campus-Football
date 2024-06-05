package nd;

import kotlin.jvm.internal.h;

/* compiled from: Messages.kt */
public final class c extends RuntimeException {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36506c = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f36507a;

    /* renamed from: b  reason: collision with root package name */
    private Object f36508b;

    /* compiled from: Messages.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public c(String str, String str2, Object obj) {
        super(str2);
        this.f36507a = str;
        if (obj != null) {
            this.f36508b = obj;
        }
    }
}
