package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import kotlin.jvm.internal.m;

/* compiled from: ExceptionExtensions.kt */
public final class ExceptionExtensionsKt {
    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        boolean z10;
        String className;
        m.e(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        m.d(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                z10 = false;
            } else {
                m.d(className, "className");
                z10 = p.u(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, (Object) null);
            }
            if (z10) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            m.d(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        if (str != null) {
            return str;
        }
        return "unknown";
    }
}
