package oa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;
import na.b;

/* compiled from: BroadcastHelper */
public class a {
    public static boolean a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }

    public static List<ResolveInfo> b(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    public static void c(Context context, Intent intent) throws b {
        List<ResolveInfo> b10 = b(context, intent);
        if (b10.size() != 0) {
            for (ResolveInfo next : b10) {
                Intent intent2 = new Intent(intent);
                if (next != null) {
                    intent2.setPackage(next.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }
}
