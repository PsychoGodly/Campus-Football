package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: AndroidStorageManager.kt */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion((h) null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    /* compiled from: AndroidStorageManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public void addStorageLocation(StorageManager.StorageType storageType, String str) {
        m.e(storageType, "type");
        m.e(str, "fileName");
        StorageManager.addStorageLocation(storageType, str);
    }

    public Storage getStorage(StorageManager.StorageType storageType) {
        m.e(storageType, "type");
        Storage storage = StorageManager.getStorage(storageType);
        m.d(storage, "getStorage(type)");
        return storage;
    }

    public void hasInitialized() {
        Storage storage = getStorage(StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    public boolean hasStorage(StorageManager.StorageType storageType) {
        m.e(storageType, "type");
        return StorageManager.hasStorage(storageType);
    }

    public boolean init(Context context) {
        m.e(context, "context");
        return StorageManager.init(context);
    }

    public void initStorage(StorageManager.StorageType storageType) {
        m.e(storageType, "type");
        StorageManager.initStorage(storageType);
    }

    public void removeStorage(StorageManager.StorageType storageType) {
        m.e(storageType, "type");
        StorageManager.removeStorage(storageType);
    }
}
