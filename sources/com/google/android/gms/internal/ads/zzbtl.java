package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.t;
import i5.a;
import i5.c;
import i5.d;
import java.io.DataInputStream;
import java.io.IOException;
import m5.k;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbtl extends a {
    public static final Parcelable.Creator<zzbtl> CREATOR = new zzbtm();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbtl(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        zzbzn.zza.execute(new zzbtk(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e10) {
                        e = e10;
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                    zzbza.zzh("Error transporting the ad response", e);
                    t.q().zzu(e, "LargeParcelTeleporter.pipeData.2");
                    k.a(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int a10 = c.a(parcel);
                    c.p(parcel, 2, this.zza, i10, false);
                    c.b(parcel, a10);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a102 = c.a(parcel);
        c.p(parcel, 2, this.zza, i10, false);
        c.b(parcel, a102);
    }

    /* JADX INFO: finally extract failed */
    public final d zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                zzbza.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                k.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.zzb = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.zzc = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e10) {
                zzbza.zzh("Could not read from parcel file descriptor", e10);
                k.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                k.a(dataInputStream);
                throw th2;
            }
        }
        return (d) this.zzb;
    }
}
