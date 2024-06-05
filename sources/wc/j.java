package wc;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import bd.b;
import dc.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import lc.c;
import wc.a;

/* compiled from: PathProviderPlugin */
public class j implements dc.a, a.b {

    /* renamed from: a  reason: collision with root package name */
    private Context f39216a;

    /* compiled from: PathProviderPlugin */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f39217a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                wc.a$c[] r0 = wc.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39217a = r0
                wc.a$c r1 = wc.a.c.ROOT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x001d }
                wc.a$c r1 = wc.a.c.MUSIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0028 }
                wc.a$c r1 = wc.a.c.PODCASTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0033 }
                wc.a$c r1 = wc.a.c.RINGTONES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x003e }
                wc.a$c r1 = wc.a.c.ALARMS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0049 }
                wc.a$c r1 = wc.a.c.NOTIFICATIONS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0054 }
                wc.a$c r1 = wc.a.c.PICTURES     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0060 }
                wc.a$c r1 = wc.a.c.MOVIES     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x006c }
                wc.a$c r1 = wc.a.c.DOWNLOADS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0078 }
                wc.a$c r1 = wc.a.c.DCIM     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f39217a     // Catch:{ NoSuchFieldError -> 0x0084 }
                wc.a$c r1 = wc.a.c.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wc.j.a.<clinit>():void");
        }
    }

    private String h() {
        return b.d(this.f39216a);
    }

    private String i() {
        return b.c(this.f39216a);
    }

    private List<String> j() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f39216a.getExternalCacheDirs()) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalCacheDir = this.f39216a.getExternalCacheDir();
            if (externalCacheDir != null) {
                arrayList.add(externalCacheDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> k(a.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.f39216a.getExternalFilesDirs(n(cVar))) {
                if (file != null) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
        } else {
            File externalFilesDir = this.f39216a.getExternalFilesDir(n(cVar));
            if (externalFilesDir != null) {
                arrayList.add(externalFilesDir.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String l() {
        File externalFilesDir = this.f39216a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String m() {
        return this.f39216a.getCacheDir().getPath();
    }

    private String n(a.c cVar) {
        switch (a.f39217a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void o(c cVar, Context context) {
        try {
            i.p(cVar, this);
        } catch (Exception e10) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e10);
        }
        this.f39216a = context;
    }

    public List<String> a() {
        return j();
    }

    public String b() {
        return l();
    }

    public String c() {
        return m();
    }

    public String d() {
        return this.f39216a.getCacheDir().getPath();
    }

    public String e() {
        return i();
    }

    public String f() {
        return h();
    }

    public List<String> g(a.c cVar) {
        return k(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        o(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        i.p(bVar.b(), (a.b) null);
    }
}
