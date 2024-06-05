package na;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ShortcutBadger */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends a>> f29479a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f29480b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static a f29481c;

    /* renamed from: d  reason: collision with root package name */
    private static ComponentName f29482d;

    static {
        LinkedList linkedList = new LinkedList();
        f29479a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    public static void a(Context context, int i10) throws b {
        if (f29481c != null || b(context)) {
            try {
                f29481c.b(context, f29482d, i10);
            } catch (Exception e10) {
                throw new b("Unable to execute badge", e10);
            }
        } else {
            throw new b("No default launcher available");
        }
    }

    private static boolean b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f29482d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends a>> it = f29479a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a aVar = null;
            try {
                aVar = (a) it.next().newInstance();
            } catch (Exception unused) {
            }
            if (aVar != null && aVar.a().contains(str)) {
                f29481c = aVar;
                break;
            }
        }
        if (f29481c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f29481c = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f29481c = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f29481c = new VivoHomeBadger();
            return true;
        } else {
            f29481c = new DefaultBadger();
            return true;
        }
    }
}
