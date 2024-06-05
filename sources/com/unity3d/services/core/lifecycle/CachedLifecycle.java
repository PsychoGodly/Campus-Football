package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.properties.ClientProperties;

public class CachedLifecycle {
    private static LifecycleCache _listener;

    public static LifecycleCache getLifecycleListener() {
        return _listener;
    }

    public static void register() {
        if (ClientProperties.getApplication() != null && getLifecycleListener() == null) {
            setLifecycleListener(new LifecycleCache(new ConfigurationReader()));
            ClientProperties.getApplication().registerActivityLifecycleCallbacks(getLifecycleListener());
        }
    }

    public static void setLifecycleListener(LifecycleCache lifecycleCache) {
        _listener = lifecycleCache;
    }

    public static void unregister() {
        if (ClientProperties.getApplication() != null && getLifecycleListener() != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(getLifecycleListener());
            setLifecycleListener((LifecycleCache) null);
        }
    }
}
