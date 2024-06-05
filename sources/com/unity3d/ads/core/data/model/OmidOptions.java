package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import x9.f;
import x9.i;
import x9.k;

/* compiled from: OmidOptions.kt */
public final class OmidOptions {
    private final f creativeType;
    private final String customReferenceData;
    private final k impressionOwner;
    private final i impressionType;
    private final boolean isolateVerificationScripts;
    private final k mediaEventsOwner;
    private final k videoEventsOwner;

    public OmidOptions() {
        this(false, (k) null, (k) null, (String) null, (i) null, (f) null, (k) null, 127, (h) null);
    }

    public OmidOptions(boolean z10, k kVar, k kVar2, String str, i iVar, f fVar, k kVar3) {
        this.isolateVerificationScripts = z10;
        this.impressionOwner = kVar;
        this.videoEventsOwner = kVar2;
        this.customReferenceData = str;
        this.impressionType = iVar;
        this.creativeType = fVar;
        this.mediaEventsOwner = kVar3;
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z10, k kVar, k kVar2, String str, i iVar, f fVar, k kVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = omidOptions.isolateVerificationScripts;
        }
        if ((i10 & 2) != 0) {
            kVar = omidOptions.impressionOwner;
        }
        k kVar4 = kVar;
        if ((i10 & 4) != 0) {
            kVar2 = omidOptions.videoEventsOwner;
        }
        k kVar5 = kVar2;
        if ((i10 & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            iVar = omidOptions.impressionType;
        }
        i iVar2 = iVar;
        if ((i10 & 32) != 0) {
            fVar = omidOptions.creativeType;
        }
        f fVar2 = fVar;
        if ((i10 & 64) != 0) {
            kVar3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z10, kVar4, kVar5, str2, iVar2, fVar2, kVar3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final k component2() {
        return this.impressionOwner;
    }

    public final k component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final i component5() {
        return this.impressionType;
    }

    public final f component6() {
        return this.creativeType;
    }

    public final k component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z10, k kVar, k kVar2, String str, i iVar, f fVar, k kVar3) {
        return new OmidOptions(z10, kVar, kVar2, str, iVar, fVar, kVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && m.a(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public final f getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final k getImpressionOwner() {
        return this.impressionOwner;
    }

    public final i getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final k getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final k getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    public int hashCode() {
        boolean z10 = this.isolateVerificationScripts;
        if (z10) {
            z10 = true;
        }
        int i10 = (z10 ? 1 : 0) * true;
        k kVar = this.impressionOwner;
        int i11 = 0;
        int hashCode = (i10 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.videoEventsOwner;
        int hashCode2 = (hashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        String str = this.customReferenceData;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.impressionType;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f fVar = this.creativeType;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        k kVar3 = this.mediaEventsOwner;
        if (kVar3 != null) {
            i11 = kVar3.hashCode();
        }
        return hashCode5 + i11;
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OmidOptions(boolean r6, x9.k r7, x9.k r8, java.lang.String r9, x9.i r10, x9.f r11, x9.k r12, int r13, kotlin.jvm.internal.h r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L_0x000c
            r14 = r0
            goto L_0x000d
        L_0x000c:
            r14 = r7
        L_0x000d:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r8
        L_0x0014:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            r2 = r0
            goto L_0x001b
        L_0x001a:
            r2 = r9
        L_0x001b:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r10
        L_0x0022:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            r4 = r0
            goto L_0x0029
        L_0x0028:
            r4 = r11
        L_0x0029:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r12
        L_0x002f:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.OmidOptions.<init>(boolean, x9.k, x9.k, java.lang.String, x9.i, x9.f, x9.k, int, kotlin.jvm.internal.h):void");
    }
}
