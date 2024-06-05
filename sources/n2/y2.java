package n2;

import java.io.IOException;

/* compiled from: ParserException */
public class y2 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20775a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20776b;

    protected y2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f20775a = z10;
        this.f20776b = i10;
    }

    public static y2 a(String str, Throwable th) {
        return new y2(str, th, true, 1);
    }

    public static y2 b(String str, Throwable th) {
        return new y2(str, th, true, 0);
    }

    public static y2 c(String str, Throwable th) {
        return new y2(str, th, true, 4);
    }

    public static y2 d(String str) {
        return new y2(str, (Throwable) null, false, 1);
    }
}
