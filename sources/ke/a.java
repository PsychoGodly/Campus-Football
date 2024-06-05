package ke;

import kotlin.jvm.internal.h;
import td.e0;
import zd.c;

/* compiled from: Progressions.kt */
public class a implements Iterable<Integer>, ge.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0409a f36005d = new C0409a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f36006a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36007b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36008c;

    /* renamed from: ke.a$a  reason: collision with other inner class name */
    /* compiled from: Progressions.kt */
    public static final class C0409a {
        private C0409a() {
        }

        public /* synthetic */ C0409a(h hVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f36006a = i10;
            this.f36007b = c.c(i10, i11, i12);
            this.f36008c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int b() {
        return this.f36006a;
    }

    public final int e() {
        return this.f36007b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f36006a == aVar.f36006a && this.f36007b == aVar.f36007b && this.f36008c == aVar.f36008c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f36008c;
    }

    /* renamed from: g */
    public e0 iterator() {
        return new b(this.f36006a, this.f36007b, this.f36008c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36006a * 31) + this.f36007b) * 31) + this.f36008c;
    }

    public boolean isEmpty() {
        if (this.f36008c > 0) {
            if (this.f36006a > this.f36007b) {
                return true;
            }
        } else if (this.f36006a < this.f36007b) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.f36008c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f36006a);
            sb2.append("..");
            sb2.append(this.f36007b);
            sb2.append(" step ");
            i10 = this.f36008c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f36006a);
            sb2.append(" downTo ");
            sb2.append(this.f36007b);
            sb2.append(" step ");
            i10 = -this.f36008c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
