package com.startapp.sdk.adsbase.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.d9;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
public class AdDetails implements Serializable, Parcelable {
    public static final Parcelable.Creator<AdDetails> CREATOR = new a();
    private static final long serialVersionUID = 3187184359567678542L;
    private String adId;
    @d9(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private boolean app;
    private String appPresencePackage;
    private boolean belowMinCPM;
    private String bidToken;
    private String callToAction;
    private String category;
    private String clickUrl;
    private String closeUrl;
    private Long delayImpressionInSeconds;
    private String description;
    @d9(type = ArrayList.class)
    private List<String> externalClickUrls;
    @d9(type = ArrayList.class)
    private List<String> externalImpressionUrls;
    private String imageUrl;
    private String installs;
    private String intentDetails;
    private String intentPackageName;
    private int minAppVersion;
    private String packageName;
    private float rating;
    private String secondaryImageUrl;
    private Boolean sendRedirectHops;
    private boolean smartRedirect;
    private boolean startappBrowserEnabled;
    private String template;
    private String title;
    private String trackingClickUrl;
    private String trackingUrl;
    private Long ttl;

    /* compiled from: Sta */
    public class a implements Parcelable.Creator<AdDetails> {
        public Object createFromParcel(Parcel parcel) {
            return new AdDetails(parcel);
        }

        public Object[] newArray(int i10) {
            return new AdDetails[i10];
        }
    }

    public AdDetails() {
        this.rating = 5.0f;
        this.belowMinCPM = false;
    }

    public boolean A() {
        return this.smartRedirect;
    }

    public boolean B() {
        return this.startappBrowserEnabled;
    }

    public Boolean C() {
        return this.sendRedirectHops;
    }

    public String a() {
        return this.adId;
    }

    public List<VerificationDetails> b() {
        return this.adVerifications;
    }

    public String c() {
        return this.appPresencePackage;
    }

    public String d() {
        return this.bidToken;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.callToAction;
    }

    public String f() {
        return this.category;
    }

    public String g() {
        return this.clickUrl;
    }

    public Long h() {
        return this.delayImpressionInSeconds;
    }

    public String i() {
        return this.description;
    }

    public String j() {
        return this.imageUrl;
    }

    public String k() {
        return this.installs;
    }

    public String l() {
        return this.intentDetails;
    }

    public String m() {
        return this.intentPackageName;
    }

    public boolean n() {
        return this.belowMinCPM;
    }

    public int o() {
        return this.minAppVersion;
    }

    public String p() {
        return this.packageName;
    }

    public float q() {
        return this.rating;
    }

    public String r() {
        return this.secondaryImageUrl;
    }

    public String s() {
        return this.template;
    }

    public String t() {
        return this.title;
    }

    public String toString() {
        return super.toString();
    }

    public String[] u() {
        if (this.externalClickUrls != null) {
            ArrayList arrayList = new ArrayList(this.externalClickUrls);
            arrayList.add(this.trackingClickUrl);
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{this.trackingClickUrl};
    }

    public String v() {
        return this.closeUrl;
    }

    public String[] w() {
        if (this.externalImpressionUrls != null) {
            ArrayList arrayList = new ArrayList(this.externalImpressionUrls);
            arrayList.add(this.trackingUrl);
            return (String[]) arrayList.toArray(new String[0]);
        }
        return new String[]{this.trackingUrl};
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.bidToken);
        parcel.writeString(this.adId);
        parcel.writeString(this.clickUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.trackingClickUrl);
        parcel.writeString(this.closeUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.secondaryImageUrl);
        parcel.writeFloat(this.rating);
        boolean z10 = this.smartRedirect;
        boolean z11 = this.startappBrowserEnabled;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(z11 ? 1 : 0);
        parcel.writeString(this.template);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appPresencePackage);
        parcel.writeString(this.intentPackageName);
        parcel.writeString(this.intentDetails);
        parcel.writeInt(this.minAppVersion);
        parcel.writeString(this.installs);
        parcel.writeString(this.category);
        parcel.writeInt(this.app ? 1 : 0);
        parcel.writeInt(this.belowMinCPM ? 1 : 0);
        Long l10 = this.ttl;
        if (l10 != null) {
            parcel.writeLong(l10.longValue());
        } else {
            parcel.writeLong(-1);
        }
        Long l11 = this.delayImpressionInSeconds;
        if (l11 != null) {
            parcel.writeLong(l11.longValue());
        } else {
            parcel.writeLong(-1);
        }
        Boolean bool = this.sendRedirectHops;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bool.booleanValue() ? 1 : -1);
        }
        parcel.writeList(this.externalImpressionUrls);
        parcel.writeList(this.externalClickUrls);
        parcel.writeString(this.callToAction);
    }

    public Long x() {
        return this.ttl;
    }

    public boolean y() {
        return this.app;
    }

    public boolean z() {
        return this.intentPackageName != null;
    }

    public AdDetails(Parcel parcel) {
        Class<String> cls = String.class;
        this.rating = 5.0f;
        boolean z10 = false;
        this.belowMinCPM = false;
        this.bidToken = parcel.readString();
        this.adId = parcel.readString();
        this.clickUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.trackingClickUrl = parcel.readString();
        this.closeUrl = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.imageUrl = parcel.readString();
        this.secondaryImageUrl = parcel.readString();
        this.rating = parcel.readFloat();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.smartRedirect = readInt == 1;
        this.startappBrowserEnabled = readInt2 != 0;
        this.template = parcel.readString();
        this.packageName = parcel.readString();
        this.appPresencePackage = parcel.readString();
        this.intentPackageName = parcel.readString();
        this.intentDetails = parcel.readString();
        this.minAppVersion = parcel.readInt();
        this.installs = parcel.readString();
        this.category = parcel.readString();
        this.app = parcel.readInt() == 1;
        this.belowMinCPM = parcel.readInt() == 1;
        Long valueOf = Long.valueOf(parcel.readLong());
        this.ttl = valueOf;
        if (valueOf.longValue() == -1) {
            this.ttl = null;
        }
        Long valueOf2 = Long.valueOf(parcel.readLong());
        this.delayImpressionInSeconds = valueOf2;
        if (valueOf2.longValue() == -1) {
            this.delayImpressionInSeconds = null;
        }
        int readInt3 = parcel.readInt();
        if (readInt3 == 0) {
            this.sendRedirectHops = null;
        } else {
            this.sendRedirectHops = Boolean.valueOf(readInt3 == 1 ? true : z10);
        }
        this.externalImpressionUrls = parcel.readArrayList(cls.getClassLoader());
        this.externalClickUrls = parcel.readArrayList(cls.getClassLoader());
        this.callToAction = parcel.readString();
    }
}
