package g5;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import g5.c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    Messenger f18128a;

    /* renamed from: b  reason: collision with root package name */
    c f18129b;

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f18128a = new Messenger(iBinder);
        } else {
            this.f18129b = new c.a(iBinder);
        }
    }

    public final IBinder c() {
        Messenger messenger = this.f18128a;
        return messenger != null ? messenger.getBinder() : this.f18129b.asBinder();
    }

    public final void d(Message message) throws RemoteException {
        Messenger messenger = this.f18128a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f18129b.E(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return c().equals(((i) obj).c());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f18128a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f18129b.asBinder());
        }
    }
}
