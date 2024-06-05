package com.unity3d.services.core.log;

import com.applovin.mediation.MaxReward;

class DeviceLogEntry {
    private DeviceLogLevel _logLevel = null;
    private String _originalMessage = null;
    private StackTraceElement _stackTraceElement = null;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        int i10;
        String str;
        String str2;
        String str3 = this._originalMessage;
        StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            str2 = stackTraceElement.getClassName();
            str = this._stackTraceElement.getMethodName();
            i10 = this._stackTraceElement.getLineNumber();
        } else {
            str2 = "UnknownClass";
            str = "unknownMethod";
            i10 = -1;
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: " + str3;
        }
        if (str3 == null) {
            str3 = MaxReward.DEFAULT_LABEL;
        }
        return str2 + "." + str + "()" + (" (line:" + i10 + ")") + str3;
    }
}
