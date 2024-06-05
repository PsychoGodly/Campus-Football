package h0;

import java.io.IOException;
import kotlin.jvm.internal.m;

/* compiled from: Serializer.kt */
public final class a extends IOException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th) {
        super(str, th);
        m.e(str, "message");
    }
}
