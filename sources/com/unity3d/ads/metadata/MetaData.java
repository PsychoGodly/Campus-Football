package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    private synchronized boolean set(String str, boolean z10) {
        return set(str, (Object) Boolean.valueOf(z10));
    }

    public void commit() {
        if (StorageManager.init(this._context)) {
            Storage storage = StorageManager.getStorage(StorageManager.StorageType.PUBLIC);
            if (getData() != null && storage != null) {
                Iterator<String> keys = getData().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = get(next);
                    if (storage.get(next) != null && (storage.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                        try {
                            obj = Utilities.mergeJsonObjects((JSONObject) obj, (JSONObject) storage.get(next));
                        } catch (Exception e10) {
                            DeviceLog.exception("Exception merging JSONs", e10);
                        }
                    }
                    storage.set(next, obj);
                }
                storage.writeStorage();
                storage.sendEvent(StorageEvent.SET, getData());
                return;
            }
            return;
        }
        DeviceLog.error("Unity Ads could not commit metadata due to storage error");
    }

    public String getCategory() {
        return this._category;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    /* access modifiers changed from: protected */
    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i10) {
        return set(str, (Object) Integer.valueOf(i10));
    }

    private synchronized boolean set(String str, long j10) {
        return set(str, (Object) Long.valueOf(j10));
    }

    public synchronized boolean set(String str, Object obj) {
        boolean z10;
        initData();
        z10 = false;
        if (super.set(getActualKey(str) + ".value", obj)) {
            if (super.set(getActualKey(str) + ".ts", Long.valueOf(System.currentTimeMillis()))) {
                z10 = true;
            }
        }
        return z10;
    }
}
