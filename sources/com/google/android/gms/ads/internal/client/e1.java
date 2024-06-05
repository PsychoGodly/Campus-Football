package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class e1 extends zzasw implements f1 {
    public e1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzbnf zzf = zzbne.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzasx.zzc(parcel);
                u0 y10 = y(a.C0158a.M0(parcel.readStrongBinder()), (z4) zzasx.zza(parcel, z4.CREATOR), readString, zzf, readInt);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, y10);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbnf zzf2 = zzbne.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzasx.zzc(parcel);
                u0 S = S(a.C0158a.M0(parcel.readStrongBinder()), (z4) zzasx.zza(parcel, z4.CREATOR), readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, S);
                return true;
            case 3:
                a M0 = a.C0158a.M0(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbnf zzf3 = zzbne.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzasx.zzc(parcel);
                q0 n12 = n1(M0, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, n12);
                return true;
            case 4:
                a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, (IInterface) null);
                return true;
            case 5:
                a M02 = a.C0158a.M0(parcel.readStrongBinder());
                a M03 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbeb I0 = I0(M02, M03);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, I0);
                return true;
            case 6:
                a M04 = a.C0158a.M0(parcel.readStrongBinder());
                zzbnf zzf4 = zzbne.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbug f02 = f0(M04, zzf4, readInt4);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, f02);
                return true;
            case 7:
                a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, (IInterface) null);
                return true;
            case 8:
                a M05 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbrc zzm = zzm(M05);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzm);
                return true;
            case 9:
                a M06 = a.C0158a.M0(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzasx.zzc(parcel);
                p1 zzg = zzg(M06, readInt5);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, zzg);
                return true;
            case 10:
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzasx.zzc(parcel);
                u0 z02 = z0(a.C0158a.M0(parcel.readStrongBinder()), (z4) zzasx.zza(parcel, z4.CREATOR), readString4, readInt6);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, z02);
                return true;
            case 11:
                a M07 = a.C0158a.M0(parcel.readStrongBinder());
                a M08 = a.C0158a.M0(parcel.readStrongBinder());
                a M09 = a.C0158a.M0(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbeh K0 = K0(M07, M08, M09);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, K0);
                return true;
            case 12:
                a M010 = a.C0158a.M0(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbnf zzf5 = zzbne.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbuw s02 = s0(M010, readString5, zzf5, readInt7);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, s02);
                return true;
            case 13:
                String readString6 = parcel.readString();
                zzbnf zzf6 = zzbne.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzasx.zzc(parcel);
                u0 t02 = t0(a.C0158a.M0(parcel.readStrongBinder()), (z4) zzasx.zza(parcel, z4.CREATOR), readString6, zzf6, readInt8);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, t02);
                return true;
            case 14:
                a M011 = a.C0158a.M0(parcel.readStrongBinder());
                zzbnf zzf7 = zzbne.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbxr u10 = u(M011, zzf7, readInt9);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, u10);
                return true;
            case 15:
                a M012 = a.C0158a.M0(parcel.readStrongBinder());
                zzbnf zzf8 = zzbne.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzasx.zzc(parcel);
                zzbqv D0 = D0(M012, zzf8, readInt10);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, D0);
                return true;
            case 16:
                a M013 = a.C0158a.M0(parcel.readStrongBinder());
                zzbnf zzf9 = zzbne.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbim zzc = zzbil.zzc(parcel.readStrongBinder());
                zzasx.zzc(parcel);
                zzbip T = T(M013, zzf9, readInt11, zzc);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, T);
                return true;
            case 17:
                a M014 = a.C0158a.M0(parcel.readStrongBinder());
                zzbnf zzf10 = zzbne.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzasx.zzc(parcel);
                l2 o10 = o(M014, zzf10, readInt12);
                parcel2.writeNoException();
                zzasx.zzg(parcel2, o10);
                return true;
            default:
                return false;
        }
    }
}
