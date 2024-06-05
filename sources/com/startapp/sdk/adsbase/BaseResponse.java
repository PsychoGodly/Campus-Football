package com.startapp.sdk.adsbase;

import com.startapp.p0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Sta */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 1;
    private String errorMessage = null;
    public Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;

    public String a() {
        return this.errorMessage;
    }

    public boolean b() {
        return this.validResponse;
    }

    public String toString() {
        StringBuilder a10 = p0.a("BaseResponse [parameters=");
        a10.append(this.parameters);
        a10.append(", validResponse=");
        a10.append(this.validResponse);
        a10.append(", errorMessage=");
        a10.append(this.errorMessage);
        a10.append("]");
        return a10.toString();
    }
}
