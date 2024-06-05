package com.unity3d.services.core.extensions;

import fe.a;
import fe.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.p0;
import pe.q0;
import pe.x0;
import sd.o;
import xd.d;

/* compiled from: CoroutineExtensions.kt */
public final class CoroutineExtensionsKt {
    private static final ConcurrentHashMap<Object, x0<?>> deferreds = new ConcurrentHashMap<>();
    private static final AtomicBoolean deferredsCleanLaunched = new AtomicBoolean();

    public static final ConcurrentHashMap<Object, x0<?>> getDeferreds() {
        return deferreds;
    }

    public static final AtomicBoolean getDeferredsCleanLaunched() {
        return deferredsCleanLaunched;
    }

    public static final <T> Object memoize(Object obj, p<? super p0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        return q0.e(new CoroutineExtensionsKt$memoize$2(obj, pVar, (d<? super CoroutineExtensionsKt$memoize$2>) null), dVar);
    }

    private static final <T> Object memoize$$forInline(Object obj, p<? super p0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(obj, pVar, (d<? super CoroutineExtensionsKt$memoize$2>) null);
        l.a(0);
        Object e10 = q0.e(coroutineExtensionsKt$memoize$2, dVar);
        l.a(1);
        return e10;
    }

    public static final <R> Object runReturnSuspendCatching(a<? extends R> aVar) {
        Object obj;
        m.e(aVar, "block");
        try {
            o.a aVar2 = o.f38128b;
            obj = o.b(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            o.a aVar3 = o.f38128b;
            obj = o.b(sd.p.a(th));
        }
        if (o.g(obj)) {
            o.a aVar4 = o.f38128b;
            return o.b(obj);
        }
        Throwable d10 = o.d(obj);
        if (d10 == null) {
            return obj;
        }
        o.a aVar5 = o.f38128b;
        return o.b(sd.p.a(d10));
    }

    public static final <R> Object runSuspendCatching(a<? extends R> aVar) {
        m.e(aVar, "block");
        try {
            o.a aVar2 = o.f38128b;
            return o.b(aVar.invoke());
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th) {
            o.a aVar3 = o.f38128b;
            return o.b(sd.p.a(th));
        }
    }
}
