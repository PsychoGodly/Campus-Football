package b2;

import android.util.Base64;
import b2.d;
import com.applovin.mediation.MaxReward;
import com.google.auto.value.AutoValue;
import z1.d;

@AutoValue
/* compiled from: TransportContext */
public abstract class o {

    @AutoValue.Builder
    /* compiled from: TransportContext */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(d dVar);
    }

    public static a a() {
        return new d.b().d(z1.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract z1.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(z1.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? MaxReward.DEFAULT_LABEL : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
