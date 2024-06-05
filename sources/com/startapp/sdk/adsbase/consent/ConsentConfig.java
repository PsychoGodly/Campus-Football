package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentConfig implements Serializable {
    private static final long serialVersionUID = 8363121715420063423L;
    private boolean allowCT;
    private String clickUrl;
    private Integer consentType;
    @d9(complex = true)
    private ConsentTypeInfoConfig consentTypeInfo;
    private String dParam;
    private boolean detectConsentCovering;
    private String impressionUrl;
    private String template;
    private Integer templateId;
    private Integer templateName;
    private long timeStamp = 0;

    public String a() {
        return this.clickUrl;
    }

    public Integer b() {
        return this.consentType;
    }

    public ConsentTypeInfoConfig c() {
        return this.consentTypeInfo;
    }

    public String d() {
        return this.dParam;
    }

    public String e() {
        return this.impressionUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentConfig.class != obj.getClass()) {
            return false;
        }
        ConsentConfig consentConfig = (ConsentConfig) obj;
        if (this.allowCT != consentConfig.allowCT || this.detectConsentCovering != consentConfig.detectConsentCovering || this.timeStamp != consentConfig.timeStamp || !j9.a(this.template, consentConfig.template) || !j9.a(this.impressionUrl, consentConfig.impressionUrl) || !j9.a(this.clickUrl, consentConfig.clickUrl) || !j9.a(this.templateName, consentConfig.templateName) || !j9.a(this.templateId, consentConfig.templateId) || !j9.a(this.dParam, consentConfig.dParam) || !j9.a(this.consentTypeInfo, consentConfig.consentTypeInfo)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.template;
    }

    public Integer g() {
        return this.templateId;
    }

    public Integer h() {
        return this.templateName;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.allowCT), Boolean.valueOf(this.detectConsentCovering), this.template, Long.valueOf(this.timeStamp), this.impressionUrl, this.clickUrl, this.templateName, this.templateId, this.dParam, this.consentTypeInfo};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public long i() {
        return this.timeStamp;
    }

    public boolean j() {
        return this.detectConsentCovering;
    }

    public boolean k() {
        return this.allowCT;
    }
}
