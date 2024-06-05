package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamic.a;
import java.lang.reflect.Field;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class b<T> extends a.C0158a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15495a;

    private b(Object obj) {
        this.f15495a = obj;
    }

    public static <T> T A1(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f15495a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            q.k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e11);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static <T> a B1(T t10) {
        return new b(t10);
    }
}
