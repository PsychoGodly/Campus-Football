package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: IMediaSession */
public interface a extends IInterface {

    /* renamed from: androidx.media2.session.a$a  reason: collision with other inner class name */
    /* compiled from: IMediaSession */
    public static abstract class C0069a extends Binder implements a {

        /* renamed from: androidx.media2.session.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaSession */
        private static class C0070a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4260a;

            C0070a(IBinder iBinder) {
                this.f4260a = iBinder;
            }

            public IBinder asBinder() {
                return this.f4260a;
            }
        }

        public static a M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0070a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }
}
