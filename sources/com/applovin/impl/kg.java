package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

public class kg {

    /* renamed from: a  reason: collision with root package name */
    private final View f9010a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendlyObstructionPurpose f9011b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9012c;

    public kg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f9010a = view;
        this.f9011b = friendlyObstructionPurpose;
        this.f9012c = str;
    }

    public String a() {
        return this.f9012c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f9011b;
    }

    public View c() {
        return this.f9010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kg kgVar = (kg) obj;
        View view = this.f9010a;
        if (view == null ? kgVar.f9010a != null : !view.equals(kgVar.f9010a)) {
            return false;
        }
        if (this.f9011b != kgVar.f9011b) {
            return false;
        }
        String str = this.f9012c;
        String str2 = kgVar.f9012c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        View view = this.f9010a;
        int i10 = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f9011b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f9012c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }
}
