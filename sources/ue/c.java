package ue;

import fe.l;
import kotlin.jvm.internal.m;

/* compiled from: ExceptionsConstructor.kt */
final class c extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final c f38792a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final a f38793b = new a();

    /* compiled from: ExceptionsConstructor.kt */
    public static final class a extends ClassValue<l<? super Throwable, ? extends Throwable>> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public l<Throwable, Throwable> computeValue(Class<?> cls) {
            m.c(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            return o.b(cls);
        }
    }

    private c() {
    }

    public l<Throwable, Throwable> a(Class<? extends Throwable> cls) {
        return (l) f38793b.get(cls);
    }
}
