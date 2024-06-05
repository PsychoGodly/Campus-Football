package com.unity3d.services.core.log;

import android.util.Log;
import com.applovin.mediation.MaxReward;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

public class DeviceLog {
    private static boolean FORCE_DEBUG_LOG = true;
    public static final int LOGLEVEL_DEBUG = 8;
    private static final int LOGLEVEL_ERROR = 1;
    public static final int LOGLEVEL_INFO = 4;
    private static final int LOGLEVEL_WARNING = 2;
    private static boolean LOG_DEBUG = true;
    private static boolean LOG_ERROR = true;
    private static boolean LOG_INFO = true;
    private static boolean LOG_WARNING = true;
    private static final int MAX_DEBUG_MSG_LENGTH = 3072;
    private static final HashMap<UnityAdsLogLevel, DeviceLogLevel> _deviceLogLevel;

    /* renamed from: com.unity3d.services.core.log.DeviceLog$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel[] r0 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel = r0
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.services.core.log.DeviceLog$UnityAdsLogLevel r1 = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.log.DeviceLog.AnonymousClass1.<clinit>():void");
        }
    }

    public enum UnityAdsLogLevel {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<UnityAdsLogLevel, DeviceLogLevel> hashMap = new HashMap<>();
        _deviceLogLevel = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(UnityAdsLogLevel.INFO, new DeviceLogLevel("i"));
            hashMap.put(UnityAdsLogLevel.DEBUG, new DeviceLogLevel("d"));
            hashMap.put(UnityAdsLogLevel.WARNING, new DeviceLogLevel("w"));
            hashMap.put(UnityAdsLogLevel.ERROR, new DeviceLogLevel("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
        }
    }

    private static String checkMessage(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    private static DeviceLogEntry createLogEntry(UnityAdsLogLevel unityAdsLogLevel, String str) {
        Class<DeviceLog> cls = DeviceLog.class;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        DeviceLogLevel logLevel = getLogLevel(unityAdsLogLevel);
        if (logLevel == null) {
            return null;
        }
        int i10 = 0;
        boolean z10 = false;
        while (i10 < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (stackTraceElement.getClassName().equals(cls.getName())) {
                z10 = true;
            }
            if (!stackTraceElement.getClassName().equals(cls.getName()) && z10) {
                break;
            }
            i10++;
        }
        StackTraceElement stackTraceElement2 = i10 < stackTrace.length ? stackTrace[i10] : null;
        if (stackTraceElement2 != null) {
            return new DeviceLogEntry(logLevel, str, stackTraceElement2);
        }
        return null;
    }

    public static void debug(String str) {
        if (isDebugEnabled()) {
            if (str.length() > MAX_DEBUG_MSG_LENGTH) {
                debug(str.substring(0, MAX_DEBUG_MSG_LENGTH));
                if (str.length() < 30720) {
                    debug(str.substring(MAX_DEBUG_MSG_LENGTH));
                    return;
                }
                return;
            }
            write(UnityAdsLogLevel.DEBUG, checkMessage(str));
        }
    }

    public static void entered() {
        debug("ENTERED METHOD");
    }

    public static void error(String str) {
        write(UnityAdsLogLevel.ERROR, checkMessage(str));
    }

    public static void exception(String str, Exception exc) {
        String str2 = MaxReward.DEFAULT_LABEL;
        if (str != null) {
            str2 = str2 + str;
        }
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (!(exc == null || exc.getCause() == null)) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        write(UnityAdsLogLevel.ERROR, str2);
    }

    private static DeviceLogLevel getLogLevel(UnityAdsLogLevel unityAdsLogLevel) {
        return _deviceLogLevel.get(unityAdsLogLevel);
    }

    public static void info(String str) {
        write(UnityAdsLogLevel.INFO, checkMessage(str));
    }

    private static boolean isDebugEnabled() {
        return LOG_DEBUG || FORCE_DEBUG_LOG;
    }

    public static void setLogLevel(int i10) {
        if (i10 >= 8) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = true;
        } else if (i10 >= 4) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = true;
            LOG_DEBUG = false;
        } else if (i10 >= 2) {
            LOG_ERROR = true;
            LOG_WARNING = true;
            LOG_INFO = false;
            LOG_DEBUG = false;
        } else if (i10 >= 1) {
            LOG_ERROR = true;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
        } else {
            LOG_ERROR = false;
            LOG_WARNING = false;
            LOG_INFO = false;
            LOG_DEBUG = false;
        }
    }

    public static void warning(String str) {
        write(UnityAdsLogLevel.WARNING, checkMessage(str));
    }

    private static void write(UnityAdsLogLevel unityAdsLogLevel, String str) {
        boolean z10;
        int i10 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$log$DeviceLog$UnityAdsLogLevel[unityAdsLogLevel.ordinal()];
        boolean z11 = true;
        if (i10 == 1) {
            z10 = LOG_INFO;
        } else if (i10 == 2) {
            z10 = LOG_DEBUG;
        } else if (i10 == 3) {
            z10 = LOG_WARNING;
        } else if (i10 != 4) {
            z10 = true;
        } else {
            z10 = LOG_ERROR;
        }
        if (!FORCE_DEBUG_LOG) {
            z11 = z10;
        }
        if (z11) {
            writeToLog(createLogEntry(unityAdsLogLevel, str));
        }
    }

    private static void writeToLog(DeviceLogEntry deviceLogEntry) {
        Method method;
        Class<String> cls = String.class;
        if (deviceLogEntry != null && deviceLogEntry.getLogLevel() != null) {
            try {
                method = Log.class.getMethod(deviceLogEntry.getLogLevel().getReceivingMethodName(), new Class[]{cls, cls});
            } catch (Exception e10) {
                Log.e("UnityAds", "Writing to log failed!", e10);
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{deviceLogEntry.getLogLevel().getLogTag(), deviceLogEntry.getParsedMessage()});
                } catch (Exception e11) {
                    Log.e("UnityAds", "Writing to log failed!", e11);
                }
            }
        }
    }

    public static void error(String str, Object... objArr) {
        error(String.format(str, objArr));
    }

    public static void info(String str, Object... objArr) {
        info(String.format(str, objArr));
    }

    public static void warning(String str, Object... objArr) {
        warning(String.format(str, objArr));
    }

    public static void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            debug(String.format(str, objArr));
        }
    }
}
