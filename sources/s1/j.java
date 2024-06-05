package s1;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.p;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f22316a = p.f("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<PowerManager.WakeLock, String> f22317b = new WeakHashMap<>();

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f22317b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                p.c().h(f22316a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f22317b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
