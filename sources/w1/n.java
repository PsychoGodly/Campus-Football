package w1;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import lc.m;
import lc.p;

/* compiled from: PermissionManager */
final class n implements m, p {

    /* renamed from: a  reason: collision with root package name */
    private b f23512a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f23513b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f23514c;

    /* renamed from: d  reason: collision with root package name */
    private int f23515d;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Integer> f23516f;

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface a {
        void a(int i10);
    }

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* compiled from: PermissionManager */
    interface c {
        void a(boolean z10);
    }

    public n(Context context) {
        this.f23514c = context;
    }

    private int a() {
        List<String> c10 = o.c(this.f23514c, 21);
        if (!(c10 == null || c10.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b() {
        if (Build.VERSION.SDK_INT < 33) {
            if (o.e(this.f23514c).a()) {
                return 1;
            }
            return 0;
        } else if (this.f23514c.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        } else {
            return o.b(this.f23513b, "android.permission.POST_NOTIFICATIONS");
        }
    }

    private int d(int i10) {
        if (i10 == 17) {
            return b();
        }
        if (i10 == 21) {
            return a();
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a();
        }
        if ((i10 == 37 || i10 == 0) && !e()) {
            return 0;
        }
        List<String> c10 = o.c(this.f23514c, i10);
        if (c10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        } else if (c10.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + c10 + i10);
            if (i10 == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i10 == 22 && Build.VERSION.SDK_INT < 30) {
                return 2;
            }
            if (Build.VERSION.SDK_INT < 23) {
                return 1;
            }
            return 0;
        } else {
            if (this.f23514c.getApplicationInfo().targetSdkVersion >= 23) {
                HashSet hashSet = new HashSet();
                for (String next : c10) {
                    if (i10 == 16) {
                        String packageName = this.f23514c.getPackageName();
                        PowerManager powerManager = (PowerManager) this.f23514c.getSystemService("power");
                        if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                            hashSet.add(0);
                        } else {
                            hashSet.add(1);
                        }
                    } else if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            hashSet.add(2);
                        }
                        hashSet.add(Integer.valueOf(Environment.isExternalStorageManager() ? 1 : 0));
                    } else if (i10 == 23) {
                        hashSet.add(Integer.valueOf(Settings.canDrawOverlays(this.f23514c) ? 1 : 0));
                    } else if (i10 == 24) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            hashSet.add(Integer.valueOf(this.f23514c.getPackageManager().canRequestPackageInstalls() ? 1 : 0));
                        }
                    } else if (i10 == 27) {
                        hashSet.add(Integer.valueOf(((NotificationManager) this.f23514c.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0));
                    } else if (i10 == 34) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            hashSet.add(Integer.valueOf(((AlarmManager) this.f23514c.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0));
                        } else {
                            hashSet.add(1);
                        }
                    } else if (androidx.core.content.a.checkSelfPermission(this.f23514c, next) != 0) {
                        hashSet.add(Integer.valueOf(o.b(this.f23513b, next)));
                    }
                }
                if (!hashSet.isEmpty()) {
                    return o.j(hashSet).intValue();
                }
            }
            return 1;
        }
    }

    private boolean e() {
        List<String> c10 = o.c(this.f23514c, 37);
        boolean z10 = c10 != null && c10.contains("android.permission.READ_CALENDAR");
        boolean z11 = c10 != null && c10.contains("android.permission.WRITE_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        return false;
    }

    private void f(String str, int i10) {
        if (this.f23513b != null) {
            Intent intent = new Intent(str);
            if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
                intent.setData(Uri.parse("package:" + this.f23513b.getPackageName()));
            }
            this.f23513b.startActivityForResult(intent, i10);
            this.f23515d++;
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int i10, a aVar) {
        aVar.a(d(i10));
    }

    /* access modifiers changed from: package-private */
    public void g(List<Integer> list, b bVar, b bVar2) {
        if (this.f23515d > 0) {
            bVar2.onError("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
        } else if (this.f23513b == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar2.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
        } else {
            this.f23512a = bVar;
            this.f23516f = new HashMap();
            this.f23515d = 0;
            ArrayList arrayList = new ArrayList();
            for (Integer next : list) {
                if (d(next.intValue()) != 1) {
                    List<String> c10 = o.c(this.f23513b, next.intValue());
                    if (c10 != null && !c10.isEmpty()) {
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 23 && next.intValue() == 16) {
                            f("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", 209);
                        } else if (i10 >= 30 && next.intValue() == 22) {
                            f("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", 210);
                        } else if (i10 >= 23 && next.intValue() == 23) {
                            f("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                        } else if (i10 >= 26 && next.intValue() == 24) {
                            f("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                        } else if (i10 >= 23 && next.intValue() == 27) {
                            f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                        } else if (i10 >= 31 && next.intValue() == 34) {
                            f("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", 214);
                        } else if (next.intValue() != 37 && next.intValue() != 0) {
                            arrayList.addAll(c10);
                            this.f23515d += c10.size();
                        } else if (e()) {
                            arrayList.add("android.permission.READ_CALENDAR");
                            arrayList.add("android.permission.WRITE_CALENDAR");
                            this.f23515d += 2;
                        } else {
                            this.f23516f.put(next, 0);
                        }
                    } else if (!this.f23516f.containsKey(next)) {
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            this.f23516f.put(next, 0);
                        } else {
                            this.f23516f.put(next, 2);
                        }
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            this.f23516f.put(next, 0);
                        } else {
                            this.f23516f.put(next, 2);
                        }
                    }
                } else if (!this.f23516f.containsKey(next)) {
                    this.f23516f.put(next, 1);
                }
            }
            if (arrayList.size() > 0) {
                androidx.core.app.b.g(this.f23513b, (String[]) arrayList.toArray(new String[0]), 24);
            }
            b bVar3 = this.f23512a;
            if (bVar3 != null && this.f23515d == 0) {
                bVar3.a(this.f23516f);
            }
        }
    }

    public void h(Activity activity) {
        this.f23513b = activity;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10, c cVar, b bVar) {
        Activity activity = this.f23513b;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> c10 = o.c(activity, i10);
        if (c10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
        } else if (c10.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
            cVar.a(false);
        } else {
            cVar.a(androidx.core.app.b.j(this.f23513b, c10.get(0)));
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Activity activity = this.f23513b;
        if (activity == null) {
            return false;
        }
        boolean z10 = i11 == -1;
        int i12 = 23;
        if (i10 == 209) {
            i12 = 16;
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z10 = Environment.isExternalStorageManager();
            i12 = 22;
        } else if (i10 == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z10 = Settings.canDrawOverlays(activity);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z10 = activity.getPackageManager().canRequestPackageInstalls();
            i12 = 24;
        } else if (i10 == 213) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z10 = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i12 = 27;
        } else if (i10 != 214 || Build.VERSION.SDK_INT < 31) {
            return false;
        } else {
            z10 = ((AlarmManager) activity.getSystemService("alarm")).canScheduleExactAlarms();
            i12 = 34;
        }
        this.f23516f.put(Integer.valueOf(i12), Integer.valueOf(z10 ? 1 : 0));
        int i13 = this.f23515d - 1;
        this.f23515d = i13;
        b bVar = this.f23512a;
        if (bVar != null && i13 == 0) {
            bVar.a(this.f23516f);
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int g10;
        if (i10 != 24) {
            this.f23515d = 0;
            return false;
        } else if (this.f23516f == null) {
            return false;
        } else {
            if (strArr.length == 0 && iArr.length == 0) {
                Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                return false;
            }
            List asList = Arrays.asList(strArr);
            int indexOf = asList.indexOf("android.permission.READ_CALENDAR");
            int indexOf2 = asList.indexOf("android.permission.WRITE_CALENDAR");
            if (indexOf >= 0) {
                int k10 = o.k(this.f23513b, "android.permission.READ_CALENDAR", iArr[indexOf]);
                this.f23516f.put(36, Integer.valueOf(k10));
                if (indexOf2 >= 0) {
                    int intValue = o.i(Integer.valueOf(k10), Integer.valueOf(o.k(this.f23513b, "android.permission.WRITE_CALENDAR", iArr[indexOf2]))).intValue();
                    this.f23516f.put(37, Integer.valueOf(intValue));
                    this.f23516f.put(0, Integer.valueOf(intValue));
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str = strArr[i11];
                if (!str.equals("android.permission.READ_CALENDAR") && !str.equals("android.permission.WRITE_CALENDAR") && (g10 = o.g(str)) != 20) {
                    int i12 = iArr[i11];
                    if (g10 == 8) {
                        this.f23516f.put(8, o.i(this.f23516f.get(8), Integer.valueOf(o.k(this.f23513b, str, i12))));
                    } else if (g10 == 7) {
                        if (!this.f23516f.containsKey(7)) {
                            this.f23516f.put(7, Integer.valueOf(o.k(this.f23513b, str, i12)));
                        }
                        if (!this.f23516f.containsKey(14)) {
                            this.f23516f.put(14, Integer.valueOf(o.k(this.f23513b, str, i12)));
                        }
                    } else if (g10 == 4) {
                        int k11 = o.k(this.f23513b, str, i12);
                        if (!this.f23516f.containsKey(4)) {
                            this.f23516f.put(4, Integer.valueOf(k11));
                        }
                    } else if (g10 == 3) {
                        int k12 = o.k(this.f23513b, str, i12);
                        if (Build.VERSION.SDK_INT < 29 && !this.f23516f.containsKey(4)) {
                            this.f23516f.put(4, Integer.valueOf(k12));
                        }
                        if (!this.f23516f.containsKey(5)) {
                            this.f23516f.put(5, Integer.valueOf(k12));
                        }
                        this.f23516f.put(Integer.valueOf(g10), Integer.valueOf(k12));
                    } else if (!this.f23516f.containsKey(Integer.valueOf(g10))) {
                        this.f23516f.put(Integer.valueOf(g10), Integer.valueOf(o.k(this.f23513b, str, i12)));
                    }
                }
            }
            int length = this.f23515d - iArr.length;
            this.f23515d = length;
            b bVar = this.f23512a;
            if (bVar == null || length != 0) {
                return true;
            }
            bVar.a(this.f23516f);
            return true;
        }
    }
}
