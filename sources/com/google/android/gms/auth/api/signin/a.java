package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import i5.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y10 = b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < y10) {
            int r10 = b.r(parcel);
            switch (b.l(r10)) {
                case 1:
                    i10 = b.t(parcel2, r10);
                    break;
                case 2:
                    str = b.f(parcel2, r10);
                    break;
                case 3:
                    str2 = b.f(parcel2, r10);
                    break;
                case 4:
                    str3 = b.f(parcel2, r10);
                    break;
                case 5:
                    str4 = b.f(parcel2, r10);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel2, r10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.f(parcel2, r10);
                    break;
                case 8:
                    j10 = b.u(parcel2, r10);
                    break;
                case 9:
                    str6 = b.f(parcel2, r10);
                    break;
                case 10:
                    arrayList = b.j(parcel2, r10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.f(parcel2, r10);
                    break;
                case 12:
                    str8 = b.f(parcel2, r10);
                    break;
                default:
                    b.x(parcel2, r10);
                    break;
            }
        }
        b.k(parcel2, y10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
