package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class AdSDKNotificationManager {
    private static final List<AdSDKNotificationListener> sNotificationListeners = Collections.synchronizedList(new ArrayList());

    public static void addSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener) {
        List<AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.add(adSDKNotificationListener);
        }
    }

    public static List<AdSDKNotificationListener> getNotificationListeners() {
        return sNotificationListeners;
    }

    public static void removeSDKNotificationListener(AdSDKNotificationListener adSDKNotificationListener) {
        List<AdSDKNotificationListener> list = sNotificationListeners;
        synchronized (list) {
            list.remove(adSDKNotificationListener);
        }
    }
}
