package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;
import r5.c;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class j4 extends zzbu implements i {
    j4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<hb> G(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzbw.zza(a_, z10);
        Parcel zza = zza(15, a_);
        ArrayList<hb> createTypedArrayList = zza.createTypedArrayList(hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void L(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(20, a_);
    }

    public final void M(Bundle bundle, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(19, a_);
    }

    public final void N(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(6, a_);
    }

    public final void O0(d dVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) dVar);
        zzb(13, a_);
    }

    public final c S0(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        Parcel zza = zza(21, a_);
        c cVar = (c) zzbw.zza(zza, c.CREATOR);
        zza.recycle();
        return cVar;
    }

    public final List<hb> Y0(String str, String str2, boolean z10, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, (Parcelable) lbVar);
        Parcel zza = zza(14, a_);
        ArrayList<hb> createTypedArrayList = zza.createTypedArrayList(hb.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final String Z(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        Parcel zza = zza(11, a_);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final void c1(d0 d0Var, String str, String str2) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d0Var);
        a_.writeString(str);
        a_.writeString(str2);
        zzb(5, a_);
    }

    public final List<na> e1(lb lbVar, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        zzbw.zza(a_, (Parcelable) bundle);
        Parcel zza = zza(24, a_);
        ArrayList<na> createTypedArrayList = zza.createTypedArrayList(na.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void h0(d0 d0Var, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d0Var);
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(1, a_);
    }

    public final void l0(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j10);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        zzb(10, a_);
    }

    public final List<d> n(String str, String str2, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) lbVar);
        Parcel zza = zza(16, a_);
        ArrayList<d> createTypedArrayList = zza.createTypedArrayList(d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final byte[] n0(d0 d0Var, String str) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) d0Var);
        a_.writeString(str);
        Parcel zza = zza(9, a_);
        byte[] createByteArray = zza.createByteArray();
        zza.recycle();
        return createByteArray;
    }

    public final void p0(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(4, a_);
    }

    public final List<d> q0(String str, String str2, String str3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeString(str3);
        Parcel zza = zza(17, a_);
        ArrayList<d> createTypedArrayList = zza.createTypedArrayList(d.CREATOR);
        zza.recycle();
        return createTypedArrayList;
    }

    public final void r1(d dVar, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) dVar);
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(12, a_);
    }

    public final void s(lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(18, a_);
    }

    public final void t1(hb hbVar, lb lbVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) hbVar);
        zzbw.zza(a_, (Parcelable) lbVar);
        zzb(2, a_);
    }
}
