package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class m0 extends a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: a  reason: collision with root package name */
    final int f15434a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f15435b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15436c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleSignInAccount f15437d;

    m0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f15434a = i10;
        this.f15435b = account;
        this.f15436c = i11;
        this.f15437d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.f15434a);
        c.p(parcel, 2, this.f15435b, i10, false);
        c.k(parcel, 3, this.f15436c);
        c.p(parcel, 4, this.f15437d, i10, false);
        c.b(parcel, a10);
    }

    public m0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
