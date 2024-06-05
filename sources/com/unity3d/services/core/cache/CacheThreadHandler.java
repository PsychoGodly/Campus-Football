package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CacheThreadHandler extends Handler {
    private boolean _active = false;
    private boolean _canceled = false;
    private WebRequest _currentRequest = null;

    CacheThreadHandler() {
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r4v58 */
    /* JADX WARNING: type inference failed for: r4v59 */
    /* JADX WARNING: type inference failed for: r4v60 */
    /* JADX WARNING: type inference failed for: r4v61 */
    /* JADX WARNING: type inference failed for: r4v62 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02be A[SYNTHETIC, Splitter:B:104:0x02be] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0305 A[SYNTHETIC, Splitter:B:115:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x034a A[SYNTHETIC, Splitter:B:126:0x034a] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x036e A[SYNTHETIC, Splitter:B:133:0x036e] */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e9 A[SYNTHETIC, Splitter:B:71:0x01e9] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0230 A[SYNTHETIC, Splitter:B:82:0x0230] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0277 A[SYNTHETIC, Splitter:B:93:0x0277] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void downloadFile(java.lang.String r25, java.lang.String r26, int r27, int r28, int r29, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r30, boolean r31, com.unity3d.services.core.cache.CacheEventSender r32) {
        /*
            r24 = this;
            r14 = r24
            r15 = r25
            r0 = r26
            r1 = r31
            r13 = r32
            java.lang.String r12 = "Error closing stream"
            boolean r2 = r14._canceled
            if (r2 != 0) goto L_0x038b
            if (r15 == 0) goto L_0x038b
            if (r0 != 0) goto L_0x0016
            goto L_0x038b
        L_0x0016:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r2 = " to "
            if (r1 == 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: resuming download "
            r3.append(r4)
            r3.append(r15)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " at "
            r3.append(r0)
            long r6 = r5.length()
            r3.append(r6)
            java.lang.String r0 = " bytes"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            goto L_0x0065
        L_0x004b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: start downloading "
            r3.append(r4)
            r3.append(r15)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
        L_0x0065:
            boolean r0 = com.unity3d.services.core.device.Device.isActiveNetworkConnected()
            r11 = 2
            r10 = 1
            r8 = 0
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "Unity Ads cache: download cancelled, no internet connection available"
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r1 = new java.lang.Object[r11]
            com.unity3d.services.core.cache.CacheError r2 = com.unity3d.services.core.cache.CacheError.NO_INTERNET
            r1[r8] = r2
            r1[r10] = r15
            r13.sendEvent(r0, r1)
            return
        L_0x0081:
            r14._active = r10
            long r2 = android.os.SystemClock.elapsedRealtime()
            r9 = 0
            r6 = 3
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0322, MalformedURLException -> 0x02dd, IOException -> 0x0296, IllegalStateException -> 0x024f, NetworkIOException -> 0x0208, Exception -> 0x01c1, all -> 0x01b4 }
            r7.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x0322, MalformedURLException -> 0x02dd, IOException -> 0x0296, IllegalStateException -> 0x024f, NetworkIOException -> 0x0208, Exception -> 0x01c1, all -> 0x01b4 }
            r0 = r27
            r1 = r28
            r4 = r30
            com.unity3d.services.core.request.WebRequest r0 = r14.getWebRequest(r15, r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            r14._currentRequest = r0     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.cache.CacheThreadHandler$1 r1 = new com.unity3d.services.core.cache.CacheThreadHandler$1     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            r4 = r29
            r1.<init>(r13, r5, r4)     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            r0.setProgressListener(r1)     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.request.WebRequest r0 = r14._currentRequest     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            long r16 = r0.makeStreamRequest(r7)     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            r14._active = r8     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.request.WebRequest r0 = r14._currentRequest     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            long r18 = r0.getContentLength()     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.request.WebRequest r0 = r14._currentRequest     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            boolean r0 = r0.isCanceled()     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.request.WebRequest r1 = r14._currentRequest     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            int r20 = r1.getResponseCode()     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            com.unity3d.services.core.request.WebRequest r1 = r14._currentRequest     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            java.util.Map r21 = r1.getResponseHeaders()     // Catch:{ FileNotFoundException -> 0x01a4, MalformedURLException -> 0x0194, IOException -> 0x0184, IllegalStateException -> 0x0174, NetworkIOException -> 0x0164, Exception -> 0x0154, all -> 0x0143 }
            r1 = r24
            r4 = r25
            r22 = r7
            r15 = 3
            r6 = r16
            r15 = r9
            r8 = r18
            r17 = 1
            r10 = r0
            r18 = 2
            r11 = r20
            r23 = r12
            r12 = r21
            r13 = r32
            r1.postProcessDownload(r2, r4, r5, r6, r8, r10, r11, r12, r13)     // Catch:{ FileNotFoundException -> 0x013a, MalformedURLException -> 0x0131, IOException -> 0x0128, IllegalStateException -> 0x011f, NetworkIOException -> 0x0117, Exception -> 0x010f, all -> 0x0107 }
            r14._currentRequest = r15
            r22.close()     // Catch:{ Exception -> 0x00e7 }
            goto L_0x0366
        L_0x00e7:
            r0 = move-exception
            r1 = r0
            r2 = r23
            com.unity3d.services.core.log.DeviceLog.exception(r2, r1)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4 = 0
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r1 = r32
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x0107:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x014f
        L_0x010f:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x0160
        L_0x0117:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x0170
        L_0x011f:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x0180
        L_0x0128:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x0190
        L_0x0131:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x01a0
        L_0x013a:
            r0 = move-exception
            r1 = r32
            r2 = r23
            r3 = 3
            r4 = 0
            goto L_0x01b0
        L_0x0143:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x014f:
            r5 = r0
            r9 = r22
            goto L_0x036a
        L_0x0154:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0160:
            r9 = r22
            goto L_0x01cb
        L_0x0164:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0170:
            r9 = r22
            goto L_0x0212
        L_0x0174:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0180:
            r9 = r22
            goto L_0x0259
        L_0x0184:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0190:
            r9 = r22
            goto L_0x02a0
        L_0x0194:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x01a0:
            r9 = r22
            goto L_0x02e7
        L_0x01a4:
            r0 = move-exception
            r22 = r7
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x01b0:
            r9 = r22
            goto L_0x032c
        L_0x01b4:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x01be:
            r5 = r0
            goto L_0x036a
        L_0x01c1:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x01cb:
            java.lang.String r5 = "Unknown error"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.UNKNOWN_ERROR     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x01ee }
            goto L_0x0366
        L_0x01ee:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x0208:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0212:
            java.lang.String r5 = "Network error"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.NETWORK_ERROR     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x0235 }
            goto L_0x0366
        L_0x0235:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x024f:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x0259:
            java.lang.String r5 = "Illegal state"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.ILLEGAL_STATE     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x027c }
            goto L_0x0366
        L_0x027c:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x0296:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x02a0:
            java.lang.String r5 = "Couldn't request stream"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x02c3 }
            goto L_0x0366
        L_0x02c3:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x02dd:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x02e7:
            java.lang.String r5 = "Malformed URL"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.MALFORMED_URL     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x0309 }
            goto L_0x0366
        L_0x0309:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
            goto L_0x0366
        L_0x0322:
            r0 = move-exception
            r15 = r9
            r2 = r12
            r1 = r13
            r3 = 3
            r4 = 0
            r17 = 1
            r18 = 2
        L_0x032c:
            java.lang.String r5 = "Couldn't create target file"
            com.unity3d.services.core.log.DeviceLog.exception(r5, r0)     // Catch:{ all -> 0x0367 }
            r14._active = r4     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x0367 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0367 }
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x0367 }
            r6[r4] = r7     // Catch:{ all -> 0x0367 }
            r6[r17] = r25     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0367 }
            r6[r18] = r0     // Catch:{ all -> 0x0367 }
            r1.sendEvent(r5, r6)     // Catch:{ all -> 0x0367 }
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x0366
            r9.close()     // Catch:{ Exception -> 0x034e }
            goto L_0x0366
        L_0x034e:
            r0 = move-exception
            r5 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r5)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r5.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
        L_0x0366:
            return
        L_0x0367:
            r0 = move-exception
            goto L_0x01be
        L_0x036a:
            r14._currentRequest = r15
            if (r9 == 0) goto L_0x038a
            r9.close()     // Catch:{ Exception -> 0x0372 }
            goto L_0x038a
        L_0x0372:
            r0 = move-exception
            r6 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r2, r6)
            com.unity3d.services.core.cache.CacheEvent r0 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r3 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r4] = r3
            r2[r17] = r25
            java.lang.String r3 = r6.getMessage()
            r2[r18] = r3
            r1.sendEvent(r0, r2)
        L_0x038a:
            throw r5
        L_0x038b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean, com.unity3d.services.core.cache.CacheEventSender):void");
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, "GET", hashMap2, i10, i11);
    }

    private void postProcessDownload(long j10, String str, File file, long j11, long j12, boolean z10, int i10, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        String str2 = str;
        CacheEventSender cacheEventSender2 = cacheEventSender;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z10) {
            DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j11 + " bytes downloaded in " + elapsedRealtime + "ms");
            cacheEventSender2.sendEvent(CacheEvent.DOWNLOAD_END, str2, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(elapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        long j13 = j11;
        DeviceLog.debug("Unity Ads cache: downloading of " + str2 + " stopped");
        cacheEventSender2.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str2, Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(elapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    public void handleMessage(Message message) {
        HashMap hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z10 = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap hashMap2 = new HashMap();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z10 && !file.exists()) || (!z10 && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z10), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            downloadFile(string, string2, i10, i11, i12, hashMap, z10, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z10) {
        WebRequest webRequest;
        this._canceled = z10;
        if (z10 && (webRequest = this._currentRequest) != null) {
            this._active = false;
            webRequest.cancel();
        }
    }
}
