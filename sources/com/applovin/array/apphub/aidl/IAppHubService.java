package com.applovin.array.apphub.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;

public interface IAppHubService extends IInterface {
    public static final String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubService";

    public static class Default implements IAppHubService {
        public IBinder asBinder() {
            return null;
        }

        public void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }

        public void dismissDirectDownloadAppDetails(String str) throws RemoteException {
        }

        public long getAppHubVersionCode() throws RemoteException {
            return 0;
        }

        public Bundle getEnabledFeatures() throws RemoteException {
            return null;
        }

        public String getRandomUserToken() throws RemoteException {
            return null;
        }

        public void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }

        public void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAppHubService {
        static final int TRANSACTION_directInstall = 7;
        static final int TRANSACTION_dismissDirectDownloadAppDetails = 5;
        static final int TRANSACTION_getAppHubVersionCode = 2;
        static final int TRANSACTION_getEnabledFeatures = 3;
        static final int TRANSACTION_getRandomUserToken = 1;
        static final int TRANSACTION_showDirectDownloadAppDetails = 4;
        static final int TRANSACTION_showDirectDownloadAppDetailsWithExtra = 6;

        private static class Proxy implements IAppHubService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void dismissDirectDownloadAppDetails(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getAppHubVersionCode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Bundle getEnabledFeatures() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(obtain2, Bundle.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAppHubService.DESCRIPTOR;
            }

            public String getRandomUserToken() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHubService.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHubService.DESCRIPTOR);
        }

        public static IAppHubService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHubService.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHubService)) {
                return new Proxy(iBinder);
            }
            return (IAppHubService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(IAppHubService.DESCRIPTOR);
            }
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        String randomUserToken = getRandomUserToken();
                        parcel2.writeNoException();
                        parcel2.writeString(randomUserToken);
                        break;
                    case 2:
                        long appHubVersionCode = getAppHubVersionCode();
                        parcel2.writeNoException();
                        parcel2.writeLong(appHubVersionCode);
                        break;
                    case 3:
                        Bundle enabledFeatures = getEnabledFeatures();
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, enabledFeatures, 1);
                        break;
                    case 4:
                        showDirectDownloadAppDetails(parcel.readString(), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 5:
                        dismissDirectDownloadAppDetails(parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 6:
                        showDirectDownloadAppDetailsWithExtra(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 7:
                        directInstall(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
                return true;
            }
            parcel2.writeString(IAppHubService.DESCRIPTOR);
            return true;
        }
    }

    public static class _Parcel {
        /* access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t10, int i10) {
            if (t10 != null) {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void directInstall(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void dismissDirectDownloadAppDetails(String str) throws RemoteException;

    long getAppHubVersionCode() throws RemoteException;

    Bundle getEnabledFeatures() throws RemoteException;

    String getRandomUserToken() throws RemoteException;

    void showDirectDownloadAppDetails(String str, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;

    void showDirectDownloadAppDetailsWithExtra(String str, Bundle bundle, IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws RemoteException;
}
