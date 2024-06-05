package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import kotlin.jvm.internal.m;
import sd.o;

/* compiled from: ResultExtensions.kt */
public final class ResultExtensionsKt {
    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        E d10 = o.d(obj);
        m.j(3, "E");
        if (d10 instanceof Exception) {
            return (Exception) d10;
        }
        return null;
    }

    public static final /* synthetic */ <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        E d10 = o.d(obj);
        m.j(3, "E");
        if (d10 instanceof Exception) {
            return (Exception) d10;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable d10 = o.d(obj);
        if (d10 instanceof InitializationException) {
            return (InitializationException) d10;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable d10 = o.d(obj);
        if (d10 instanceof InitializationException) {
            return (InitializationException) d10;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
