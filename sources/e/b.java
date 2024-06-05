package e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import e.a;

/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f17745a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f17746b = null;

    /* renamed from: c  reason: collision with root package name */
    a f17747c;

    /* compiled from: ResultReceiver */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: e.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    class C0181b extends a.C0179a {
        C0181b() {
        }

        public void y1(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f17746b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f17749a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f17750b;

        c(int i10, Bundle bundle) {
            this.f17749a = i10;
            this.f17750b = bundle;
        }

        public void run() {
            b.this.a(this.f17749a, this.f17750b);
        }
    }

    b(Parcel parcel) {
        this.f17747c = a.C0179a.M0(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i10, Bundle bundle) {
    }

    public void b(int i10, Bundle bundle) {
        if (this.f17745a) {
            Handler handler = this.f17746b;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                a(i10, bundle);
            }
        } else {
            a aVar = this.f17747c;
            if (aVar != null) {
                try {
                    aVar.y1(i10, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f17747c == null) {
                this.f17747c = new C0181b();
            }
            parcel.writeStrongBinder(this.f17747c.asBinder());
        }
    }
}
