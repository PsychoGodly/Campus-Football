package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public abstract class zzbd implements InvocationHandler {
    private final Object zza;

    public zzbd(Object obj) {
        this.zza = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (m.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (m.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (m.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (!(objArr == null || objArr.length == 0 || objArr[0].hashCode() != obj.hashCode())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else if (!zza(obj, method, objArr)) {
            return w.f38141a;
        } else {
            if ((this.zza != null || !m.a(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !m.a(zzeg.zza(obj2.getClass()), zzeg.zza(method.getReturnType())))) {
                Object obj3 = this.zza;
                Class<?> returnType = method.getReturnType();
                throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + returnType);
            }
            Object obj4 = this.zza;
            return obj4 == null ? w.f38141a : obj4;
        }
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
