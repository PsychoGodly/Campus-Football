package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import com.applovin.mediation.MaxReward;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: ProfileInstaller */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final c f4300a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final c f4301b = new b();

    /* compiled from: ProfileInstaller */
    class a implements c {
        a() {
        }

        public void a(int i10, Object obj) {
        }

        public void b(int i10, Object obj) {
        }
    }

    /* compiled from: ProfileInstaller */
    class b implements c {
        b() {
        }

        public void a(int i10, Object obj) {
            Log.d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MaxReward.DEFAULT_LABEL : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        public void b(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = MaxReward.DEFAULT_LABEL;
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* compiled from: ProfileInstaller */
    public interface c {
        void a(int i10, Object obj);

        void b(int i10, Object obj);
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, (Object) null);
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z10 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z10 = true;
            }
            if (z10) {
                cVar.b(2, (Object) null);
            }
            return z10;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void f(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void g(Executor executor, c cVar, int i10, Object obj) {
        executor.execute(new h(cVar, i10, obj));
    }

    private static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        if (Build.VERSION.SDK_INT < 19) {
            g(executor, cVar, 3, (Object) null);
            return false;
        }
        String str3 = str;
        c cVar2 = new c(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!cVar2.e()) {
            return false;
        }
        boolean n10 = cVar2.i().m().n();
        if (n10) {
            f(packageInfo, file);
        }
        return n10;
    }

    public static void i(Context context) {
        j(context, g.f4296a, f4300a);
    }

    public static void j(Context context, Executor executor, c cVar) {
        k(context, executor, cVar, false);
    }

    static void k(Context context, Executor executor, c cVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z10 || !d(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
                if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z10) {
                    z11 = true;
                }
                o.c(context, z11);
                return;
            }
            Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
            o.c(context, false);
        } catch (PackageManager.NameNotFoundException e10) {
            cVar.b(7, e10);
            o.c(context, false);
        }
    }

    static void l(Context context, Executor executor, c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e10) {
            g(executor, cVar, 7, e10);
        }
    }
}
