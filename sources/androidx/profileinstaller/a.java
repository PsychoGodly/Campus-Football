package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation */
class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* compiled from: BenchmarkOperation */
    private static class C0071a {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation */
    private static class b {
        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    static boolean a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z10 = true;
            for (int i10 = 0; i10 < length; i10++) {
                z10 = a(listFiles[i10]) && z10;
            }
            return z10;
        }
        file.delete();
        return true;
    }

    static void b(Context context, ProfileInstallReceiver.a aVar) {
        File file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            file = b.a(context);
        } else if (i10 >= 23) {
            file = C0071a.a(context);
        } else {
            file = context.getCacheDir();
        }
        if (a(file)) {
            aVar.b(14, (Object) null);
        } else {
            aVar.b(15, (Object) null);
        }
    }
}
