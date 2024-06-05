package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import h5.d;
import i5.b;
import i5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class i1 implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, fVar.f15383a);
        c.k(parcel, 2, fVar.f15384b);
        c.k(parcel, 3, fVar.f15385c);
        c.q(parcel, 4, fVar.f15386d, false);
        c.j(parcel, 5, fVar.f15387f, false);
        c.t(parcel, 6, fVar.f15388g, i10, false);
        c.e(parcel, 7, fVar.f15389h, false);
        c.p(parcel, 8, fVar.f15390i, i10, false);
        c.t(parcel, 10, fVar.f15391j, i10, false);
        c.t(parcel, 11, fVar.f15392k, i10, false);
        c.c(parcel, 12, fVar.f15393l);
        c.k(parcel, 13, fVar.f15394m);
        c.c(parcel, 14, fVar.f15395n);
        c.q(parcel, 15, fVar.zza(), false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        Scope[] scopeArr = f.f15381p;
        Bundle bundle = new Bundle();
        d[] dVarArr = f.f15382q;
        d[] dVarArr2 = dVarArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    i11 = b.t(parcel2, r10);
                    break;
                case 3:
                    i12 = b.t(parcel2, r10);
                    break;
                case 4:
                    str = b.f(parcel2, r10);
                    break;
                case 5:
                    iBinder = b.s(parcel2, r10);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.i(parcel2, r10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, r10);
                    break;
                case 8:
                    account = (Account) b.e(parcel2, r10, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (d[]) b.i(parcel2, r10, d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (d[]) b.i(parcel2, r10, d.CREATOR);
                    break;
                case 12:
                    z10 = b.m(parcel2, r10);
                    break;
                case 13:
                    i13 = b.t(parcel2, r10);
                    break;
                case 14:
                    z11 = b.m(parcel2, r10);
                    break;
                case 15:
                    str2 = b.f(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
