package v5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import h5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class e extends zab implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 3:
                b bVar = (b) zac.zaa(parcel, b.CREATOR);
                b bVar2 = (b) zac.zaa(parcel, b.CREATOR);
                break;
            case 4:
                Status status = (Status) zac.zaa(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                Q0((l) zac.zaa(parcel, l.CREATOR));
                break;
            case 9:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
