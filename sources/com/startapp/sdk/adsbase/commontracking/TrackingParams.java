package com.startapp.sdk.adsbase.commontracking;

import com.applovin.mediation.MaxReward;
import com.startapp.j9;
import com.startapp.p0;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.t7;
import java.io.Serializable;

/* compiled from: Sta */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 1;
    private String adTag;
    private String clientSessionId;
    private boolean isPubImp;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this((String) null);
    }

    public String a() {
        return this.adTag;
    }

    public int b() {
        return this.offset;
    }

    public String c() {
        if (this.offset <= 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        StringBuilder a10 = p0.a("&offset=");
        a10.append(this.offset);
        return a10.toString();
    }

    public String d() {
        return this.profileId;
    }

    public String e() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        String str4 = this.adTag;
        String str5 = MaxReward.DEFAULT_LABEL;
        if (str4 == null || str4.equals(str5)) {
            str = str5;
        } else {
            int i10 = 200;
            if (this.adTag.length() < 200) {
                i10 = this.adTag.length();
            }
            StringBuilder a10 = p0.a("&adTag=");
            a10.append(j9.a(this.adTag.substring(0, i10)));
            str = a10.toString();
        }
        sb2.append(str);
        if (this.clientSessionId != null) {
            StringBuilder a11 = p0.a("&clientSessionId=");
            a11.append(j9.a(this.clientSessionId));
            str2 = a11.toString();
        } else {
            str2 = str5;
        }
        sb2.append(str2);
        if (this.profileId != null) {
            StringBuilder a12 = p0.a("&profileId=");
            a12.append(j9.a(this.profileId));
            str3 = a12.toString();
        } else {
            str3 = str5;
        }
        sb2.append(str3);
        sb2.append(c());
        String str6 = this.nonImpressionReason;
        if (str6 != null && !str6.equals(str5)) {
            StringBuilder a13 = p0.a("&isShown=false&reason=");
            a13.append(j9.a(this.nonImpressionReason));
            str5 = a13.toString();
        }
        sb2.append(str5);
        return sb2.toString();
    }

    public boolean f() {
        return this.isPubImp;
    }

    public TrackingParams(String str, boolean z10) {
        this(str);
        this.isPubImp = z10;
    }

    public TrackingParams a(int i10) {
        this.offset = i10;
        return this;
    }

    public TrackingParams a(String str) {
        this.nonImpressionReason = str;
        return this;
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = t7.f17299d.a();
        this.profileId = MetaData.w().F();
        this.offset = 0;
    }
}
