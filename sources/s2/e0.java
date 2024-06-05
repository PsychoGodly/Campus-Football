package s2;

import j4.i;
import java.io.IOException;
import java.util.Arrays;
import k4.a0;
import n2.r1;

/* compiled from: TrackOutput */
public interface e0 {

    /* compiled from: TrackOutput */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f22399a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f22400b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22401c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22402d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f22399a = i10;
            this.f22400b = bArr;
            this.f22401c = i11;
            this.f22402d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f22399a == aVar.f22399a && this.f22401c == aVar.f22401c && this.f22402d == aVar.f22402d && Arrays.equals(this.f22400b, aVar.f22400b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f22399a * 31) + Arrays.hashCode(this.f22400b)) * 31) + this.f22401c) * 31) + this.f22402d;
        }
    }

    void a(r1 r1Var);

    void b(long j10, int i10, int i11, int i12, a aVar);

    int c(i iVar, int i10, boolean z10, int i11) throws IOException;

    void d(a0 a0Var, int i10);

    int e(i iVar, int i10, boolean z10) throws IOException;

    void f(a0 a0Var, int i10, int i11);
}
