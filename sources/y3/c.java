package y3;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import k4.a;
import s6.u;

/* compiled from: CueDecoder */
public final class c {
    public u<b> a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return k4.c.b(b.K, (ArrayList) a.e(readBundle.getParcelableArrayList("c")));
    }
}
