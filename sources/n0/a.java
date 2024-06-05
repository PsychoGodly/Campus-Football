package n0;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* compiled from: WakefulBroadcastReceiver */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f20116a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static int f20117b = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f20116a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f20116a;
        synchronized (sparseArray) {
            int i10 = f20117b;
            int i11 = i10 + 1;
            f20117b = i11;
            if (i11 <= 0) {
                f20117b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            sparseArray.put(i10, newWakeLock);
            return startService;
        }
    }
}
