package androidx.media2.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParcelImplListSlice implements Parcelable {
    public static final Parcelable.Creator<ParcelImplListSlice> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    final List<ParcelImpl> f4158a;

    class a extends Binder {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4159a;

        a(int i10) {
            this.f4159a = i10;
        }

        /* access modifiers changed from: protected */
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            int readInt = parcel.readInt();
            while (readInt < this.f4159a && parcel2.dataSize() < 65536) {
                parcel2.writeInt(1);
                parcel2.writeParcelable(ParcelImplListSlice.this.f4158a.get(readInt), i11);
                readInt++;
            }
            if (readInt < this.f4159a) {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    class b implements Parcelable.Creator<ParcelImplListSlice> {
        b() {
        }

        /* renamed from: a */
        public ParcelImplListSlice createFromParcel(Parcel parcel) {
            return new ParcelImplListSlice(parcel);
        }

        /* renamed from: b */
        public ParcelImplListSlice[] newArray(int i10) {
            return new ParcelImplListSlice[i10];
        }
    }

    public ParcelImplListSlice(List<ParcelImpl> list) {
        Objects.requireNonNull(list, "list shouldn't be null");
        this.f4158a = list;
    }

    public List<ParcelImpl> c() {
        return this.f4158a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f4158a.size();
        parcel.writeInt(size);
        if (size > 0) {
            int i11 = 0;
            while (i11 < size && i11 < 1 && parcel.dataSize() < 65536) {
                parcel.writeInt(1);
                parcel.writeParcelable(this.f4158a.get(i11), i10);
                i11++;
            }
            if (i11 < size) {
                parcel.writeInt(0);
                parcel.writeStrongBinder(new a(size));
            }
        }
    }

    ParcelImplListSlice(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f4158a = new ArrayList(readInt);
        if (readInt > 0) {
            int i10 = 0;
            while (i10 < readInt && parcel.readInt() != 0) {
                this.f4158a.add((ParcelImpl) parcel.readParcelable(ParcelImpl.class.getClassLoader()));
                i10++;
            }
            if (i10 < readInt) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                while (i10 < readInt) {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInt(i10);
                        readStrongBinder.transact(1, obtain, obtain2, 0);
                        while (i10 < readInt) {
                            if (obtain2.readInt() == 0) {
                                break;
                            }
                            this.f4158a.add((ParcelImpl) obtain2.readParcelable(ParcelImpl.class.getClassLoader()));
                            i10++;
                        }
                    } catch (RemoteException e10) {
                        Log.w("ParcelImplListSlice", "Failure retrieving array; only received " + i10 + " of " + readInt, e10);
                        return;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }
        }
    }
}
