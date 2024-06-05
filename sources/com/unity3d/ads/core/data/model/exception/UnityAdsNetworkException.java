package com.unity3d.ads.core.data.model.exception;

import com.unity3d.ads.core.data.model.OperationType;
import kotlin.jvm.internal.m;

/* compiled from: UnityAdsNetworkException.kt */
public final class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UnityAdsNetworkException(java.lang.String r8, com.unity3d.ads.core.data.model.OperationType r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.String r14, int r15, kotlin.jvm.internal.h r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0007
            com.unity3d.ads.core.data.model.OperationType r0 = com.unity3d.ads.core.data.model.OperationType.UNKNOWN
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r1 = r15 & 4
            r2 = 0
            if (r1 == 0) goto L_0x000f
            r1 = r2
            goto L_0x0010
        L_0x000f:
            r1 = r10
        L_0x0010:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0016
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r11
        L_0x0017:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001d
            r4 = r2
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0024
            r5 = r2
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r2 = r14
        L_0x002b:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException.<init>(java.lang.String, com.unity3d.ads.core.data.model.OperationType, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.h):void");
    }

    public static /* synthetic */ UnityAdsNetworkException copy$default(UnityAdsNetworkException unityAdsNetworkException, String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = unityAdsNetworkException.getMessage();
        }
        if ((i10 & 2) != 0) {
            operationType = unityAdsNetworkException.type;
        }
        OperationType operationType2 = operationType;
        if ((i10 & 4) != 0) {
            num = unityAdsNetworkException.code;
        }
        Integer num3 = num;
        if ((i10 & 8) != 0) {
            str2 = unityAdsNetworkException.url;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = unityAdsNetworkException.protocol;
        }
        String str6 = str3;
        if ((i10 & 32) != 0) {
            num2 = unityAdsNetworkException.cronetCode;
        }
        Integer num4 = num2;
        if ((i10 & 64) != 0) {
            str4 = unityAdsNetworkException.client;
        }
        return unityAdsNetworkException.copy(str, operationType2, num3, str5, str6, num4, str4);
    }

    public final String component1() {
        return getMessage();
    }

    public final OperationType component2() {
        return this.type;
    }

    public final Integer component3() {
        return this.code;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.protocol;
    }

    public final Integer component6() {
        return this.cronetCode;
    }

    public final String component7() {
        return this.client;
    }

    public final UnityAdsNetworkException copy(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        m.e(str, "message");
        m.e(operationType, "type");
        return new UnityAdsNetworkException(str, operationType, num, str2, str3, num2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnityAdsNetworkException)) {
            return false;
        }
        UnityAdsNetworkException unityAdsNetworkException = (UnityAdsNetworkException) obj;
        return m.a(getMessage(), unityAdsNetworkException.getMessage()) && this.type == unityAdsNetworkException.type && m.a(this.code, unityAdsNetworkException.code) && m.a(this.url, unityAdsNetworkException.url) && m.a(this.protocol, unityAdsNetworkException.protocol) && m.a(this.cronetCode, unityAdsNetworkException.cronetCode) && m.a(this.client, unityAdsNetworkException.client);
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((getMessage().hashCode() * 31) + this.type.hashCode()) * 31;
        Integer num = this.code;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.protocol;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.cronetCode;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.client;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        return "UnityAdsNetworkException(message=" + getMessage() + ", type=" + this.type + ", code=" + this.code + ", url=" + this.url + ", protocol=" + this.protocol + ", cronetCode=" + this.cronetCode + ", client=" + this.client + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str);
        m.e(str, "message");
        m.e(operationType, "type");
        this.message = str;
        this.type = operationType;
        this.code = num;
        this.url = str2;
        this.protocol = str3;
        this.cronetCode = num2;
        this.client = str4;
    }
}
