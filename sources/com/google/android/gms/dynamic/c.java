package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.q;
import h5.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class c<T> {
    private final String zza;
    private Object zzb;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.zza = str;
    }

    /* access modifiers changed from: protected */
    public abstract T getRemoteCreator(IBinder iBinder);

    /* access modifiers changed from: protected */
    public final T getRemoteCreatorInstance(Context context) throws a {
        if (this.zzb == null) {
            q.k(context);
            Context e10 = j.e(context);
            if (e10 != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) e10.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e11) {
                    throw new a("Could not load creator class.", e11);
                } catch (InstantiationException e12) {
                    throw new a("Could not instantiate creator.", e12);
                } catch (IllegalAccessException e13) {
                    throw new a("Could not access creator.", e13);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.zzb;
    }
}
