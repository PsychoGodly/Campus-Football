package sd;

import kotlin.jvm.internal.h;

/* compiled from: Standard.kt */
public final class m extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        kotlin.jvm.internal.m.e(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
