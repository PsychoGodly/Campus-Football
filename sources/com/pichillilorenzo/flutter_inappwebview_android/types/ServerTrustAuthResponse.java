package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class ServerTrustAuthResponse {
    private Integer action;

    public ServerTrustAuthResponse(Integer num) {
        this.action = num;
    }

    public static ServerTrustAuthResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ServerTrustAuthResponse((Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = ((ServerTrustAuthResponse) obj).action;
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

    public int hashCode() {
        Integer num = this.action;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public String toString() {
        return "ServerTrustAuthResponse{action=" + this.action + '}';
    }
}
