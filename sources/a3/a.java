package a3;

import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.a0;

/* compiled from: Atom */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f190a;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    /* compiled from: Atom */
    static final class C0002a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f191b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f192c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<C0002a> f193d = new ArrayList();

        public C0002a(int i10, long j10) {
            super(i10);
            this.f191b = j10;
        }

        public void d(C0002a aVar) {
            this.f193d.add(aVar);
        }

        public void e(b bVar) {
            this.f192c.add(bVar);
        }

        public C0002a f(int i10) {
            int size = this.f193d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0002a aVar = this.f193d.get(i11);
                if (aVar.f190a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f192c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f192c.get(i11);
                if (bVar.f190a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return a.a(this.f190a) + " leaves: " + Arrays.toString(this.f192c.toArray()) + " containers: " + Arrays.toString(this.f193d.toArray());
        }
    }

    /* compiled from: Atom */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final a0 f194b;

        public b(int i10, a0 a0Var) {
            super(i10);
            this.f194b = a0Var;
        }
    }

    public a(int i10) {
        this.f190a = i10;
    }

    public static String a(int i10) {
        return MaxReward.DEFAULT_LABEL + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f190a);
    }
}
