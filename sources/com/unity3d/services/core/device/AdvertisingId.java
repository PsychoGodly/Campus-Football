package com.unity3d.services.core.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.unity3d.services.core.log.DeviceLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AdvertisingId {
    private static final String ADVERTISING_ID_SERVICE_NAME = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    private static AdvertisingId instance;
    private String advertisingIdentifier = null;
    private boolean limitedAdvertisingTracking = false;

    private interface GoogleAdvertisingInfo extends IInterface {

        public static abstract class GoogleAdvertisingInfoBinder extends Binder implements GoogleAdvertisingInfo {

            private static class GoogleAdvertisingInfoImplementation implements GoogleAdvertisingInfo {
                private final IBinder _binder;

                GoogleAdvertisingInfoImplementation(IBinder iBinder) {
                    this._binder = iBinder;
                }

                public IBinder asBinder() {
                    return this._binder;
                }

                public boolean getEnabled(boolean z10) throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        boolean z11 = true;
                        obtain.writeInt(z10 ? 1 : 0);
                        this._binder.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z11 = false;
                        }
                        return z11;
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }

                public String getId() throws RemoteException {
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                        this._binder.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        return obtain2.readString();
                    } finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                }
            }

            public static GoogleAdvertisingInfo create(IBinder iBinder) {
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof GoogleAdvertisingInfo)) {
                    return new GoogleAdvertisingInfoImplementation(iBinder);
                }
                return (GoogleAdvertisingInfo) queryLocalInterface;
            }

            public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
                if (i10 == 1) {
                    parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    String id2 = getId();
                    parcel2.writeNoException();
                    parcel2.writeString(id2);
                    return true;
                } else if (i10 != 2) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    parcel.enforceInterface(AdvertisingId.ADVERTISING_ID_SERVICE_NAME);
                    boolean enabled = getEnabled(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(enabled ? 1 : 0);
                    return true;
                }
            }
        }

        boolean getEnabled(boolean z10) throws RemoteException;

        String getId() throws RemoteException;
    }

    private class GoogleAdvertisingServiceConnection implements ServiceConnection {
        private final BlockingQueue<IBinder> _binderQueue;
        boolean _consumed;

        private GoogleAdvertisingServiceConnection() {
            this._consumed = false;
            this._binderQueue = new LinkedBlockingQueue();
        }

        public IBinder getBinder() throws InterruptedException {
            if (!this._consumed) {
                this._consumed = true;
                return this._binderQueue.take();
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this._binderQueue.put(iBinder);
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't put service to binder que");
                Thread.currentThread().interrupt();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    private void fetchAdvertisingId(Context context) {
        boolean z10;
        GoogleAdvertisingServiceConnection googleAdvertisingServiceConnection = new GoogleAdvertisingServiceConnection();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            z10 = context.bindService(intent, googleAdvertisingServiceConnection, 1);
        } catch (Exception e10) {
            DeviceLog.exception("Couldn't bind to identifier service intent", e10);
            z10 = false;
        }
        if (z10) {
            try {
                GoogleAdvertisingInfo create = GoogleAdvertisingInfo.GoogleAdvertisingInfoBinder.create(googleAdvertisingServiceConnection.getBinder());
                this.advertisingIdentifier = create.getId();
                this.limitedAdvertisingTracking = create.getEnabled(true);
            } catch (Exception e11) {
                DeviceLog.exception("Couldn't get advertising info", e11);
                if (!z10) {
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    context.unbindService(googleAdvertisingServiceConnection);
                }
                throw th;
            }
        }
        if (!z10) {
            return;
        }
        context.unbindService(googleAdvertisingServiceConnection);
    }

    public static String getAdvertisingTrackingId() {
        return getInstance().advertisingIdentifier;
    }

    private static AdvertisingId getInstance() {
        if (instance == null) {
            instance = new AdvertisingId();
        }
        return instance;
    }

    public static boolean getLimitedAdTracking() {
        return getInstance().limitedAdvertisingTracking;
    }

    public static void init(Context context) {
        getInstance().fetchAdvertisingId(context);
    }
}
