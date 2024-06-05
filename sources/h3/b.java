package h3;

import f3.a;
import f3.e;
import f3.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k4.a0;

/* compiled from: EventMessageDecoder */
public final class b extends h {
    /* access modifiers changed from: protected */
    public a b(e eVar, ByteBuffer byteBuffer) {
        return new a(c(new a0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(a0 a0Var) {
        return new a((String) k4.a.e(a0Var.A()), (String) k4.a.e(a0Var.A()), a0Var.z(), a0Var.z(), Arrays.copyOfRange(a0Var.e(), a0Var.f(), a0Var.g()));
    }
}
