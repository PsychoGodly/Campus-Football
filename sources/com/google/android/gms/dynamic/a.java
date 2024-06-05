package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface a extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class C0158a extends zzb implements a {
        public C0158a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new d(iBinder);
        }
    }
}
