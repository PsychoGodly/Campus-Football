package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class n0 implements Parcelable.Creator<m0> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y10 = b.y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            int l10 = b.l(r10);
            if (l10 == 1) {
                i10 = b.t(parcel, r10);
            } else if (l10 == 2) {
                account = (Account) b.e(parcel, r10, Account.CREATOR);
            } else if (l10 == 3) {
                i11 = b.t(parcel, r10);
            } else if (l10 != 4) {
                b.x(parcel, r10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.e(parcel, r10, GoogleSignInAccount.CREATOR);
            }
        }
        b.k(parcel, y10);
        return new m0(i10, account, i11, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new m0[i10];
    }
}
