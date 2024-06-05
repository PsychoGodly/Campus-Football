package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* compiled from: IMediaControllerCallback */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0007a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaControllerCallback */
        private static class C0008a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f656b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f657a;

            C0008a(IBinder iBinder) {
                this.f657a = iBinder;
            }

            public void G0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f657a.transact(2, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().G0();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void J0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f657a.transact(4, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().J0(mediaMetadataCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void V(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    if (this.f657a.transact(5, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().V(list);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void V0(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i10);
                    if (this.f657a.transact(12, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().V0(i10);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f657a;
            }

            public void m0(boolean z10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z10 ? 1 : 0);
                    if (this.f657a.transact(11, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().m0(z10);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void p(int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i10);
                    if (this.f657a.transact(9, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().p(i10);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void v1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f657a.transact(3, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().v1(playbackStateCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f657a.transact(8, obtain, (Parcel) null, 1) || C0007a.A1() == null) {
                        obtain.recycle();
                    } else {
                        C0007a.A1().z1(parcelableVolumeInfo);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0007a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a A1() {
            return C0008a.f656b;
        }

        public static a M0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0008a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                r4.Q()
                return r1
            L_0x0019:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.V0(r5)
                return r1
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = 1
            L_0x002e:
                r4.m0(r0)
                return r1
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.y0(r0)
                return r1
            L_0x0040:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.p(r5)
                return r1
            L_0x004b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.z1(r3)
                return r1
            L_0x0061:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.R(r3)
                return r1
            L_0x0077:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.A0(r3)
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.V(r5)
                return r1
            L_0x009a:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.J0(r3)
                return r1
            L_0x00b0:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.v1(r3)
                return r1
            L_0x00c6:
                r6.enforceInterface(r2)
                r4.G0()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.w1(r5, r3)
                return r1
            L_0x00e7:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.C0007a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void A0(CharSequence charSequence) throws RemoteException;

    void G0() throws RemoteException;

    void J0(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void Q() throws RemoteException;

    void R(Bundle bundle) throws RemoteException;

    void V(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void V0(int i10) throws RemoteException;

    void m0(boolean z10) throws RemoteException;

    void p(int i10) throws RemoteException;

    void v1(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void w1(String str, Bundle bundle) throws RemoteException;

    void y0(boolean z10) throws RemoteException;

    void z1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;
}
