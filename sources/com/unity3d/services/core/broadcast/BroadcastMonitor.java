package com.unity3d.services.core.broadcast;

import android.content.Context;
import android.content.IntentFilter;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.HashMap;
import java.util.Map;

public class BroadcastMonitor {
    private static BroadcastMonitor _instance;
    private final Context _context;
    private Map<String, BroadcastEventReceiver> _eventReceivers;

    private BroadcastMonitor(Context context) {
        this._context = context;
    }

    public static synchronized BroadcastMonitor getInstance() {
        BroadcastMonitor broadcastMonitor;
        synchronized (BroadcastMonitor.class) {
            if (_instance == null) {
                _instance = new BroadcastMonitor(ClientProperties.getApplicationContext());
            }
            broadcastMonitor = _instance;
        }
        return broadcastMonitor;
    }

    public void addBroadcastListener(String str, String str2, String[] strArr) {
        removeBroadcastListener(str);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
        }
        if (str2 != null) {
            intentFilter.addDataScheme(str2);
        }
        if (this._eventReceivers == null) {
            this._eventReceivers = new HashMap();
        }
        BroadcastEventReceiver broadcastEventReceiver = new BroadcastEventReceiver(str);
        this._eventReceivers.put(str, broadcastEventReceiver);
        this._context.registerReceiver(broadcastEventReceiver, intentFilter);
    }

    public void removeAllBroadcastListeners() {
        Map<String, BroadcastEventReceiver> map = this._eventReceivers;
        if (map != null) {
            for (String str : map.keySet()) {
                this._context.unregisterReceiver(this._eventReceivers.get(str));
            }
            this._eventReceivers = null;
        }
    }

    public void removeBroadcastListener(String str) {
        Map<String, BroadcastEventReceiver> map = this._eventReceivers;
        if (map != null && map.containsKey(str)) {
            this._context.unregisterReceiver(this._eventReceivers.get(str));
            this._eventReceivers.remove(str);
        }
    }
}
