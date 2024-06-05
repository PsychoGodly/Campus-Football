package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import fe.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import ne.c;
import org.json.JSONObject;
import sd.w;
import se.k0;
import se.v;

/* compiled from: Storage.kt */
public final class Storage extends JsonStorage {
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public static final v<List<l<StorageEventInfo, w>>> onStorageEventCallbacks = k0.a(q.d());
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* compiled from: Storage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final void addStorageEventCallback(l<? super StorageEventInfo, w> lVar) {
            Object value;
            m.e(lVar, "callback");
            v access$getOnStorageEventCallbacks$cp = Storage.onStorageEventCallbacks;
            do {
                value = access$getOnStorageEventCallbacks$cp.getValue();
            } while (!access$getOnStorageEventCallbacks$cp.a(value, y.D((List) value, lVar)));
        }

        public final void removeStorageEventCallback(l<? super StorageEventInfo, w> lVar) {
            Object value;
            m.e(lVar, "callback");
            v access$getOnStorageEventCallbacks$cp = Storage.onStorageEventCallbacks;
            do {
                value = access$getOnStorageEventCallbacks$cp.getValue();
            } while (!access$getOnStorageEventCallbacks$cp.a(value, y.B((List) value, lVar)));
        }
    }

    public Storage(String str, StorageManager.StorageType storageType) {
        m.e(str, "_targetFileName");
        m.e(storageType, "type");
        this._targetFileName = str;
        this.type = storageType;
    }

    public final synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public final synchronized boolean readStorage() {
        boolean z10;
        z10 = true;
        try {
            byte[] readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            if (readFileBytes == null) {
                return false;
            }
            setData(new JSONObject(new String(readFileBytes, c.f36512b)));
        } catch (FileNotFoundException e10) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e10);
        } catch (Exception e11) {
            DeviceLog.debug("Failed to read storage JSON file:", e11);
        }
        z10 = false;
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void sendEvent(com.unity3d.services.core.device.StorageEvent r7, java.lang.Object r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            se.v<java.util.List<fe.l<com.unity3d.services.core.device.StorageEventInfo, sd.w>>> r0 = onStorageEventCallbacks     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0058 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0058 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0058 }
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0031
            com.unity3d.services.core.device.StorageEventInfo r1 = new com.unity3d.services.core.device.StorageEventInfo     // Catch:{ all -> 0x0058 }
            kotlin.jvm.internal.m.b(r7)     // Catch:{ all -> 0x0058 }
            com.unity3d.services.core.device.StorageManager$StorageType r2 = r6.type     // Catch:{ all -> 0x0058 }
            r1.<init>(r7, r2, r8)     // Catch:{ all -> 0x0058 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0058 }
        L_0x001f:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x002f
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0058 }
            fe.l r8 = (fe.l) r8     // Catch:{ all -> 0x0058 }
            r8.invoke(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r6)
            return
        L_0x0031:
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x0058 }
            r1 = 0
            if (r0 == 0) goto L_0x004f
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x0058 }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.STORAGE     // Catch:{ all -> 0x0058 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0058 }
            com.unity3d.services.core.device.StorageManager$StorageType r5 = r6.type     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = r5.name()     // Catch:{ all -> 0x0058 }
            r4[r1] = r5     // Catch:{ all -> 0x0058 }
            r4[r2] = r8     // Catch:{ all -> 0x0058 }
            boolean r1 = r0.sendEvent(r3, r7, r4)     // Catch:{ all -> 0x0058 }
        L_0x004f:
            if (r1 != 0) goto L_0x0056
            java.lang.String r7 = "Couldn't send storage event to WebApp"
            com.unity3d.services.core.log.DeviceLog.debug(r7)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r6)
            return
        L_0x0058:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.Storage.sendEvent(com.unity3d.services.core.device.StorageEvent, java.lang.Object):void");
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public final synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
