package io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.p0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: FlutterFirebaseMessagingUtils */
class g {
    static FirebaseMessaging a(Map<String, Object> map) {
        return FirebaseMessaging.r();
    }

    static p0 b(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        p0.b bVar = new p0.b((String) obj2);
        String str = (String) map2.get("collapseKey");
        String str2 = (String) map2.get("messageId");
        String str3 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get(JsonStorageKeyNames.DATA_KEY);
        if (str != null) {
            bVar.b(str);
        }
        if (str3 != null) {
            bVar.e(str3);
        }
        if (str2 != null) {
            bVar.d(str2);
        }
        if (num != null) {
            bVar.f(num.intValue());
        }
        if (map3 != null) {
            bVar.c(map3);
        }
        return bVar.a();
    }

    static Map<String, Object> c(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("notification") == null) {
            return null;
        }
        return (Map) map2.get("notification");
    }

    static boolean d(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && next.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> e(p0.c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.p() != null) {
            hashMap.put("title", cVar.p());
        }
        if (cVar.r() != null) {
            hashMap.put("titleLocKey", cVar.r());
        }
        if (cVar.q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.q()));
        }
        if (cVar.a() != null) {
            hashMap.put("body", cVar.a());
        }
        if (cVar.c() != null) {
            hashMap.put("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.b()));
        }
        if (cVar.d() != null) {
            hashMap2.put("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            hashMap2.put("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            hashMap2.put("color", cVar.f());
        }
        if (cVar.g() != null) {
            hashMap2.put("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            hashMap2.put("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            hashMap2.put("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            hashMap2.put("count", cVar.k());
        }
        if (cVar.l() != null) {
            hashMap2.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, cVar.l());
        }
        if (cVar.m() != null) {
            hashMap2.put("sound", cVar.m());
        }
        if (cVar.o() != null) {
            hashMap2.put("ticker", cVar.o());
        }
        if (cVar.s() != null) {
            hashMap2.put("visibility", cVar.s());
        }
        if (cVar.n() != null) {
            hashMap2.put("tag", cVar.n());
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    static Map<String, Object> f(p0 p0Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (p0Var.v() != null) {
            hashMap.put("collapseKey", p0Var.v());
        }
        if (p0Var.x() != null) {
            hashMap.put("from", p0Var.x());
        }
        if (p0Var.K() != null) {
            hashMap.put("to", p0Var.K());
        }
        if (p0Var.y() != null) {
            hashMap.put("messageId", p0Var.y());
        }
        if (p0Var.B() != null) {
            hashMap.put("messageType", p0Var.B());
        }
        if (p0Var.w().size() > 0) {
            for (Map.Entry next : p0Var.w().entrySet()) {
                hashMap2.put((String) next.getKey(), next.getValue());
            }
        }
        hashMap.put(JsonStorageKeyNames.DATA_KEY, hashMap2);
        hashMap.put("ttl", Integer.valueOf(p0Var.L()));
        hashMap.put("sentTime", Long.valueOf(p0Var.J()));
        if (p0Var.C() != null) {
            hashMap.put("notification", e(p0Var.C()));
        }
        return hashMap;
    }
}
