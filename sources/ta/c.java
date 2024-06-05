package ta;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: AudioServiceConfig */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f22748a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22749b;

    /* renamed from: c  reason: collision with root package name */
    public String f22750c = this.f22748a.getString("androidNotificationChannelId", (String) null);

    /* renamed from: d  reason: collision with root package name */
    public String f22751d = this.f22748a.getString("androidNotificationChannelName", (String) null);

    /* renamed from: e  reason: collision with root package name */
    public String f22752e = this.f22748a.getString("androidNotificationChannelDescription", (String) null);

    /* renamed from: f  reason: collision with root package name */
    public int f22753f = this.f22748a.getInt("notificationColor", -1);

    /* renamed from: g  reason: collision with root package name */
    public String f22754g = this.f22748a.getString("androidNotificationIcon", "mipmap/ic_launcher");

    /* renamed from: h  reason: collision with root package name */
    public boolean f22755h = this.f22748a.getBoolean("androidShowNotificationBadge", false);

    /* renamed from: i  reason: collision with root package name */
    public boolean f22756i = this.f22748a.getBoolean("androidNotificationClickStartsActivity", true);

    /* renamed from: j  reason: collision with root package name */
    public boolean f22757j = this.f22748a.getBoolean("androidNotificationOngoing", false);

    /* renamed from: k  reason: collision with root package name */
    public boolean f22758k = this.f22748a.getBoolean("androidStopForegroundOnPause", true);

    /* renamed from: l  reason: collision with root package name */
    public int f22759l = this.f22748a.getInt("artDownscaleWidth", -1);

    /* renamed from: m  reason: collision with root package name */
    public int f22760m = this.f22748a.getInt("artDownscaleHeight", -1);

    /* renamed from: n  reason: collision with root package name */
    public String f22761n = this.f22748a.getString("activityClassName", (String) null);

    /* renamed from: o  reason: collision with root package name */
    public String f22762o = this.f22748a.getString("androidBrowsableRootExtras", (String) null);

    public c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.f22748a = sharedPreferences;
        this.f22749b = sharedPreferences.getBoolean("androidResumeOnClick", true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:7|8|9|10|11|12|13|14|15|16|17|28|22|5) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f22762o
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x005a }
            java.lang.String r2 = r8.f22762o     // Catch:{ Exception -> 0x005a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x005a }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x005a }
            r2.<init>()     // Catch:{ Exception -> 0x005a }
            java.util.Iterator r3 = r0.keys()     // Catch:{ Exception -> 0x005a }
        L_0x0016:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x005a }
            int r5 = r0.getInt(r4)     // Catch:{ Exception -> 0x002a }
            r2.putInt(r4, r5)     // Catch:{ Exception -> 0x002a }
            goto L_0x0016
        L_0x002a:
            boolean r5 = r0.getBoolean(r4)     // Catch:{ Exception -> 0x0032 }
            r2.putBoolean(r4, r5)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0016
        L_0x0032:
            double r5 = r0.getDouble(r4)     // Catch:{ Exception -> 0x003a }
            r2.putDouble(r4, r5)     // Catch:{ Exception -> 0x003a }
            goto L_0x0016
        L_0x003a:
            java.lang.String r5 = r0.getString(r4)     // Catch:{ Exception -> 0x0042 }
            r2.putString(r4, r5)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0016
        L_0x0042:
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ Exception -> 0x005a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005a }
            r6.<init>()     // Catch:{ Exception -> 0x005a }
            java.lang.String r7 = "Unsupported extras value for key "
            r6.append(r7)     // Catch:{ Exception -> 0x005a }
            r6.append(r4)     // Catch:{ Exception -> 0x005a }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x005a }
            r5.println(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x0016
        L_0x0059:
            return r2
        L_0x005a:
            r0 = move-exception
            r0.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.c.a():android.os.Bundle");
    }

    public void b() {
        this.f22748a.edit().putBoolean("androidResumeOnClick", this.f22749b).putString("androidNotificationChannelId", this.f22750c).putString("androidNotificationChannelName", this.f22751d).putString("androidNotificationChannelDescription", this.f22752e).putInt("notificationColor", this.f22753f).putString("androidNotificationIcon", this.f22754g).putBoolean("androidShowNotificationBadge", this.f22755h).putBoolean("androidNotificationClickStartsActivity", this.f22756i).putBoolean("androidNotificationOngoing", this.f22757j).putBoolean("androidStopForegroundOnPause", this.f22758k).putInt("artDownscaleWidth", this.f22759l).putInt("artDownscaleHeight", this.f22760m).putString("activityClassName", this.f22761n).putString("androidBrowsableRootExtras", this.f22762o).apply();
    }

    public void c(Map<?, ?> map) {
        if (map != null) {
            this.f22762o = new JSONObject(map).toString();
        } else {
            this.f22762o = null;
        }
    }
}
