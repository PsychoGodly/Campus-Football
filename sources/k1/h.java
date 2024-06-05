package k1;

import android.content.Context;
import android.os.Build;
import androidx.work.p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19576a = p.f("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f19577b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        String str;
        File b10 = b(context);
        if (Build.VERSION.SDK_INT >= 23 && b10.exists()) {
            p.c().a(f19576a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f10 = f(context);
            for (File next : f10.keySet()) {
                File file = f10.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        p.c().h(f19576a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    p.c().a(f19576a, str, new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b10 = b(context);
            File a10 = a(context);
            hashMap.put(b10, a10);
            for (String str : f19577b) {
                hashMap.put(new File(b10.getPath() + str), new File(a10.getPath() + str));
            }
        }
        return hashMap;
    }
}
