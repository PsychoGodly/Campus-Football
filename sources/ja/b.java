package ja;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: OSInfluenceChannel.kt */
public enum b {
    IAM("iam"),
    NOTIFICATION("notification");
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f29104b = null;

    /* renamed from: a  reason: collision with root package name */
    private final String f29108a;

    /* compiled from: OSInfluenceChannel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(String str) {
            b bVar = null;
            if (str != null) {
                b[] values = b.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    b bVar2 = values[length];
                    if (bVar2.c(str)) {
                        bVar = bVar2;
                        break;
                    }
                }
            }
            return bVar == null ? b.NOTIFICATION : bVar;
        }
    }

    static {
        f29104b = new a((h) null);
    }

    private b(String str) {
        this.f29108a = str;
    }

    public final boolean c(String str) {
        m.e(str, "otherName");
        return m.a(this.f29108a, str);
    }

    public String toString() {
        return this.f29108a;
    }
}
