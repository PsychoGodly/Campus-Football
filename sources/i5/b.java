package i5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class b {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private static void A(Parcel parcel, int i10, int i11) {
        int w10 = w(parcel, i10);
        if (w10 != i11) {
            String hexString = Integer.toHexString(w10);
            throw new a("Expected size " + i11 + " got " + w10 + " (0x" + hexString + ")", parcel);
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + w10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + w10);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + w10);
        return createIntArray;
    }

    public static ArrayList<Integer> d(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + w10);
        return arrayList;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + w10);
        return t10;
    }

    public static String f(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + w10);
        return readString;
    }

    public static String[] g(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + w10);
        return createStringArray;
    }

    public static ArrayList<String> h(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + w10);
        return createStringArrayList;
    }

    public static <T> T[] i(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + w10);
        return createTypedArray;
    }

    public static <T> ArrayList<T> j(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + w10);
        return createTypedArrayList;
    }

    public static void k(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a("Overread allowed size end=" + i10, parcel);
        }
    }

    public static int l(int i10) {
        return (char) i10;
    }

    public static boolean m(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (w10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + w10);
        return readStrongBinder;
    }

    public static int t(Parcel parcel, int i10) {
        A(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i10) {
        A(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i10) {
        int w10 = w(parcel, i10);
        if (w10 == 0) {
            return null;
        }
        z(parcel, i10, w10, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i10) {
        return (i10 & -65536) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i10));
    }

    public static int y(Parcel parcel) {
        int r10 = r(parcel);
        int w10 = w(parcel, r10);
        int dataPosition = parcel.dataPosition();
        if (l(r10) == 20293) {
            int i10 = w10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(r10))), parcel);
    }

    private static void z(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
        }
    }
}
