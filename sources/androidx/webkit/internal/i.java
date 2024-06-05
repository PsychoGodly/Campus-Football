package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: ApiHelperForTiramisu */
public class i {
    static ServiceInfo a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    static PackageManager.ComponentInfoFlags b(long j10) {
        return PackageManager.ComponentInfoFlags.of(j10);
    }
}
