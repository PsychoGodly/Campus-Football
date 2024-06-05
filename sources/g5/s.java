package g5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class s {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f18149a;

    /* renamed from: b  reason: collision with root package name */
    private final i f18150b;

    s(IBinder iBinder) throws RemoteException {
        String str;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f18149a = new Messenger(iBinder);
            this.f18150b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f18150b = new i(iBinder);
            this.f18149a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str = "Invalid interface descriptor: ".concat(valueOf);
            } else {
                str = new String("Invalid interface descriptor: ");
            }
            Log.w("MessengerIpcClient", str);
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.f18149a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        i iVar = this.f18150b;
        if (iVar != null) {
            iVar.d(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
