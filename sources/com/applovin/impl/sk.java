package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

public final class sk extends pk {
    public static final Parcelable.Creator<sk> CREATOR = new a();

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public sk[] newArray(int i10) {
            return new sk[i10];
        }

        /* renamed from: a */
        public sk createFromParcel(Parcel parcel) {
            return new sk();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
    }
}
