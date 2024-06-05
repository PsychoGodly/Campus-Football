package com.applovin.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class a5 {
    public ab a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return n2.a(z4.f13751t, (List) (ArrayList) a1.a((Object) readBundle.getParcelableArrayList("c")));
    }
}
