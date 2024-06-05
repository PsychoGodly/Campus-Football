package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.e;

/* compiled from: PermissionChecker */
public final class c {
    public static int a(Context context, String str, int i10, int i11, String str2) {
        int i12;
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String c10 = e.c(str);
        if (c10 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i11 && androidx.core.util.c.a(context.getPackageName(), str2)) {
            i12 = e.a(context, i11, c10, str2);
        } else {
            i12 = e.b(context, c10, str2);
        }
        if (i12 == 0) {
            return 0;
        }
        return -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
