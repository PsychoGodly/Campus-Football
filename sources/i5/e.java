package i5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import m5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class e {
    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        q.k(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t10 = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return t10;
    }

    public static <T extends d> T b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static <T extends d> T c(String str, Parcelable.Creator<T> creator) {
        return a(c.a(str), creator);
    }

    public static <T extends d> byte[] d(T t10) {
        Parcel obtain = Parcel.obtain();
        t10.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends d> void e(T t10, Intent intent, String str) {
        intent.putExtra(str, d(t10));
    }

    public static <T extends d> String f(T t10) {
        return c.d(d(t10));
    }
}
