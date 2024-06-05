package com.applovin.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class l2 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f9134a;

    public static IBinder a(Bundle bundle, String str) {
        if (yp.f13662a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f9134a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f9134a = method2;
                method2.setAccessible(true);
                method = f9134a;
            } catch (NoSuchMethodException e10) {
                kc.b("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            kc.b("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }
}
