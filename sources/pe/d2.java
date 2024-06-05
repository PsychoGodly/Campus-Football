package pe;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;

/* compiled from: Exceptions.kt */
public final class d2 extends CancellationException implements i0<d2> {

    /* renamed from: a  reason: collision with root package name */
    public final transient c2 f37290a;

    public d2(String str, Throwable th, c2 c2Var) {
        super(str);
        this.f37290a = c2Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: b */
    public d2 a() {
        if (!t0.c()) {
            return null;
        }
        String message = getMessage();
        m.b(message);
        return new d2(message, this, this.f37290a);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d2) {
                d2 d2Var = (d2) obj;
                if (!m.a(d2Var.getMessage(), getMessage()) || !m.a(d2Var.f37290a, this.f37290a) || !m.a(d2Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (t0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        m.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f37290a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f37290a;
    }
}
