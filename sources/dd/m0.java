package dd;

import dd.y0;
import java.nio.charset.Charset;

/* compiled from: InternalMetadata */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f32299a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final t6.a f32300b = y0.f32389f;

    /* compiled from: InternalMetadata */
    public interface a<T> extends y0.j<T> {
    }

    public static int a(y0 y0Var) {
        return y0Var.h();
    }

    public static <T> y0.g<T> b(String str, a<T> aVar) {
        boolean z10 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        return y0.g.g(str, z10, aVar);
    }

    public static y0 c(byte[]... bArr) {
        return new y0(bArr);
    }

    public static byte[][] d(y0 y0Var) {
        return y0Var.q();
    }
}
