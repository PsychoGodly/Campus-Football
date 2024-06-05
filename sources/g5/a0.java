package g5;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class a0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a0 f18107a = new a0();

    private /* synthetic */ a0() {
    }

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.getException());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
