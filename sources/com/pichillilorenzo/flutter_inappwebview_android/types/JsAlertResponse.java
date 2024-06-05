package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class JsAlertResponse {
    private Integer action;
    private String confirmButtonTitle;
    private boolean handledByClient;
    private String message;

    public JsAlertResponse(String str, String str2, boolean z10, Integer num) {
        this.message = str;
        this.confirmButtonTitle = str2;
        this.handledByClient = z10;
        this.action = num;
    }

    public static JsAlertResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new JsAlertResponse((String) map.get("message"), (String) map.get("confirmButtonTitle"), ((Boolean) map.get("handledByClient")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsAlertResponse jsAlertResponse = (JsAlertResponse) obj;
        if (this.handledByClient != jsAlertResponse.handledByClient) {
            return false;
        }
        String str = this.message;
        if (str == null ? jsAlertResponse.message != null : !str.equals(jsAlertResponse.message)) {
            return false;
        }
        String str2 = this.confirmButtonTitle;
        if (str2 == null ? jsAlertResponse.confirmButtonTitle != null : !str2.equals(jsAlertResponse.confirmButtonTitle)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = jsAlertResponse.action;
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
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.handledByClient ? 1 : 0)) * 31;
        Integer num = this.action;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode2 + i10;
    }

    public boolean isHandledByClient() {
        return this.handledByClient;
    }

    public void setAction(Integer num) {
        this.action = num;
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
        return "JsAlertResponse{message='" + this.message + '\'' + ", confirmButtonTitle='" + this.confirmButtonTitle + '\'' + ", handledByClient=" + this.handledByClient + ", action=" + this.action + '}';
    }
}
