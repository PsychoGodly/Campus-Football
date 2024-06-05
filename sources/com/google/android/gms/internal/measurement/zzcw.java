package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zzcw extends zzbu implements zzcu {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(23, a_);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzb(9, a_);
    }

    public final void clearMeasurementEnabled(long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(43, a_);
    }

    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(24, a_);
    }

    public final void generateEventId(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(22, a_);
    }

    public final void getAppInstanceId(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(20, a_);
    }

    public final void getCachedAppInstanceId(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(19, a_);
    }

    public final void getConditionalUserProperties(String str, String str2, zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(10, a_);
    }

    public final void getCurrentScreenClass(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(17, a_);
    }

    public final void getCurrentScreenName(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(16, a_);
    }

    public final void getGmpAppId(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(21, a_);
    }

    public final void getMaxUserProperties(String str, zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(6, a_);
    }

    public final void getSessionId(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(46, a_);
    }

    public final void getTestFlag(zzcv zzcv, int i10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        a_.writeInt(i10);
        zzb(38, a_);
    }

    public final void getUserProperties(String str, String str2, boolean z10, zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(5, a_);
    }

    public final void initForTests(Map map) throws RemoteException {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    public final void initialize(a aVar, zzdd zzdd, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (Parcelable) zzdd);
        a_.writeLong(j10);
        zzb(1, a_);
    }

    public final void isDataCollectionEnabled(zzcv zzcv) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzcv);
        zzb(40, a_);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, z10);
        zzbw.zza(a_, z11);
        a_.writeLong(j10);
        zzb(2, a_);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (IInterface) zzcv);
        a_.writeLong(j10);
        zzb(3, a_);
    }

    public final void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i10);
        a_.writeString(str);
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (IInterface) aVar2);
        zzbw.zza(a_, (IInterface) aVar3);
        zzb(33, a_);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(27, a_);
    }

    public final void onActivityDestroyed(a aVar, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(28, a_);
    }

    public final void onActivityPaused(a aVar, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(29, a_);
    }

    public final void onActivityResumed(a aVar, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(30, a_);
    }

    public final void onActivitySaveInstanceState(a aVar, zzcv zzcv, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, (IInterface) zzcv);
        a_.writeLong(j10);
        zzb(31, a_);
    }

    public final void onActivityStarted(a aVar, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(25, a_);
    }

    public final void onActivityStopped(a aVar, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeLong(j10);
        zzb(26, a_);
    }

    public final void performAction(Bundle bundle, zzcv zzcv, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzbw.zza(a_, (IInterface) zzcv);
        a_.writeLong(j10);
        zzb(32, a_);
    }

    public final void registerOnMeasurementEventListener(zzda zzda) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzda);
        zzb(35, a_);
    }

    public final void resetAnalyticsData(long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(12, a_);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(8, a_);
    }

    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(44, a_);
    }

    public final void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        a_.writeLong(j10);
        zzb(45, a_);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) aVar);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j10);
        zzb(15, a_);
    }

    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z10);
        zzb(39, a_);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (Parcelable) bundle);
        zzb(42, a_);
    }

    public final void setEventInterceptor(zzda zzda) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzda);
        zzb(34, a_);
    }

    public final void setInstanceIdProvider(zzdb zzdb) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzdb);
        zzb(18, a_);
    }

    public final void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z10);
        a_.writeLong(j10);
        zzb(11, a_);
    }

    public final void setMinimumSessionDuration(long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(13, a_);
    }

    public final void setSessionTimeoutDuration(long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j10);
        zzb(14, a_);
    }

    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j10);
        zzb(7, a_);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, (IInterface) aVar);
        zzbw.zza(a_, z10);
        a_.writeLong(j10);
        zzb(4, a_);
    }

    public final void unregisterOnMeasurementEventListener(zzda zzda) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, (IInterface) zzda);
        zzb(36, a_);
    }
}
