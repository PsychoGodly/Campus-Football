package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class JsBeforeUnloadResponse {
    private Integer action;
    private String cancelButtonTitle;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;

    public JsBeforeUnloadResponse(String str, String str2, String str3, boolean z10, Integer num) {
        this.message = str;
        this.confirmButtonTitle = str2;
        this.cancelButtonTitle = str3;
        this.handledByClient = z10;
        this.action = num;
    }

    public static JsBeforeUnloadResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsBeforeUnloadResponse((String) map.get("message"), (String) map.get("confirmButtonTitle"), (String) map.get("cancelButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsBeforeUnloadResponse jsBeforeUnloadResponse = (JsBeforeUnloadResponse) obj;
        if (this.handledByClient != jsBeforeUnloadResponse.handledByClient) {
            return false;
        }
        String str = this.message;
        if (str == null ? jsBeforeUnloadResponse.message != null : !str.equals(jsBeforeUnloadResponse.message)) {
            return false;
        }
        String str2 = this.confirmButtonTitle;
        if (str2 == null ? jsBeforeUnloadResponse.confirmButtonTitle != null : !str2.equals(jsBeforeUnloadResponse.confirmButtonTitle)) {
            return false;
        }
        String str3 = this.cancelButtonTitle;
        if (str3 == null ? jsBeforeUnloadResponse.cancelButtonTitle != null : !str3.equals(jsBeforeUnloadResponse.cancelButtonTitle)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = jsBeforeUnloadResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 == null) {
            return true;
        }
        return false;
    }

    public Integer getAction() {
        return this.action;
    }

    public String getCancelButtonTitle() {
        return this.cancelButtonTitle;
    }

    public String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.confirmButtonTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cancelButtonTitle;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
        Integer num = this.action;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode3 + i10;
    }

    public boolean isHandledByClient() {
        return this.handledByClient;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setCancelButtonTitle(String str) {
        this.cancelButtonTitle = str;
    }

    public void setConfirmButtonTitle(String str) {
        this.confirmButtonTitle = str;
    }

    public void setHandledByClient(boolean z10) {
        this.handledByClient = z10;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "JsConfirmResponse{message='" + this.message + '\'' + ", confirmButtonTitle='" + this.confirmButtonTitle + '\'' + ", cancelButtonTitle='" + this.cancelButtonTitle + '\'' + ", handledByClient=" + this.handledByClient + ", action=" + this.action + '}';
    }
}
