package r5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.measurement.internal.d;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.hb;
import com.google.android.gms.measurement.internal.lb;
import com.google.android.gms.measurement.internal.na;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public abstract class h extends zzbx implements i {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zzbw.zzb(parcel);
                h0((d0) zzbw.zza(parcel, d0.CREATOR), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzbw.zzb(parcel);
                t1((hb) zzbw.zza(parcel, hb.CREATOR), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                zzbw.zzb(parcel);
                p0((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbw.zzb(parcel);
                c1((d0) zzbw.zza(parcel, d0.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbw.zzb(parcel);
                N((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zzc = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List<hb> j12 = j1((lb) zzbw.zza(parcel, lb.CREATOR), zzc);
                parcel2.writeNoException();
                parcel2.writeTypedList(j12);
                return true;
            case 9:
                String readString3 = parcel.readString();
                zzbw.zzb(parcel);
                byte[] n02 = n0((d0) zzbw.zza(parcel, d0.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(n02);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbw.zzb(parcel);
                l0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbw.zzb(parcel);
                String Z = Z((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(Z);
                return true;
            case 12:
                zzbw.zzb(parcel);
                r1((d) zzbw.zza(parcel, d.CREATOR), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzbw.zzb(parcel);
                O0((d) zzbw.zza(parcel, d.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zzbw.zzb(parcel);
                List<hb> Y0 = Y0(parcel.readString(), parcel.readString(), zzbw.zzc(parcel), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(Y0);
                return true;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean zzc2 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                List<hb> G = G(readString7, readString8, readString9, zzc2);
                parcel2.writeNoException();
                parcel2.writeTypedList(G);
                return true;
            case 16:
                zzbw.zzb(parcel);
                List<d> n10 = n(parcel.readString(), parcel.readString(), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(n10);
                return true;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzbw.zzb(parcel);
                List<d> q02 = q0(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(q02);
                return true;
            case 18:
                zzbw.zzb(parcel);
                s((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                zzbw.zzb(parcel);
                M((Bundle) zzbw.zza(parcel, Bundle.CREATOR), (lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                zzbw.zzb(parcel);
                L((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                zzbw.zzb(parcel);
                c S0 = S0((lb) zzbw.zza(parcel, lb.CREATOR));
                parcel2.writeNoException();
                zzbw.zzb(parcel2, S0);
                return true;
            case 24:
                zzbw.zzb(parcel);
                List<na> e12 = e1((lb) zzbw.zza(parcel, lb.CREATOR), (Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(e12);
                return true;
            default:
                return false;
        }
    }
}
