package ue;

import xd.g;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class k extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final transient g f38809a;

    public k(g gVar) {
        this.f38809a = gVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f38809a.toString();
    }
}
