package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.h0;
import com.startapp.sdk.jobs.b;
import java.lang.reflect.Constructor;

/* compiled from: Sta */
public abstract class a {
    public abstract void a(b bVar);

    public boolean a(Context context, String[] strArr, b.a aVar, Bundle bundle) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (String cls : strArr) {
            Class<? extends U> cls2 = null;
            try {
                cls2 = Class.forName(cls).asSubclass(b.class);
            } catch (ClassNotFoundException unused) {
            }
            if (cls2 != null) {
                try {
                    Constructor<? extends U> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{Context.class, b.a.class, Bundle.class});
                    declaredConstructor.setAccessible(true);
                    Context a10 = h0.a(context);
                    if (a10 == null) {
                        a10 = context;
                    }
                    a((b) declaredConstructor.newInstance(new Object[]{a10, aVar, bundle}));
                    z10 = true;
                } catch (Throwable unused2) {
                }
            }
        }
        return z10;
    }
}
