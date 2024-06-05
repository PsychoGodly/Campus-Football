package com.unity3d.ads.core.data.model;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.File;
import kotlin.jvm.internal.m;
import nf.b;

/* compiled from: CachedFile.kt */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String str, String str2, String str3, File file2, String str4, long j10, String str5, int i10) {
        m.e(str, "objectId");
        m.e(str2, "url");
        m.e(str3, MediationMetaData.KEY_NAME);
        m.e(str5, "protocol");
        this.objectId = str;
        this.url = str2;
        this.name = str3;
        this.file = file2;
        this.extension = str4;
        this.contentLength = j10;
        this.protocol = str5;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file2, String str4, long j10, String str5, int i10, int i11, Object obj) {
        CachedFile cachedFile2 = cachedFile;
        int i12 = i11;
        return cachedFile.copy((i12 & 1) != 0 ? cachedFile2.objectId : str, (i12 & 2) != 0 ? cachedFile2.url : str2, (i12 & 4) != 0 ? cachedFile2.name : str3, (i12 & 8) != 0 ? cachedFile2.file : file2, (i12 & 16) != 0 ? cachedFile2.extension : str4, (i12 & 32) != 0 ? cachedFile2.contentLength : j10, (i12 & 64) != 0 ? cachedFile2.protocol : str5, (i12 & 128) != 0 ? cachedFile2.priority : i10);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String str, String str2, String str3, File file2, String str4, long j10, String str5, int i10) {
        m.e(str, "objectId");
        m.e(str2, "url");
        m.e(str3, MediationMetaData.KEY_NAME);
        String str6 = str5;
        m.e(str6, "protocol");
        return new CachedFile(str, str2, str3, file2, str4, j10, str6, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return m.a(this.objectId, cachedFile.objectId) && m.a(this.url, cachedFile.url) && m.a(this.name, cachedFile.name) && m.a(this.file, cachedFile.file) && m.a(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && m.a(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((this.objectId.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode()) * 31;
        File file2 = this.file;
        int i10 = 0;
        int hashCode2 = (hashCode + (file2 == null ? 0 : file2.hashCode())) * 31;
        String str = this.extension;
        if (str != null) {
            i10 = str.hashCode();
        }
        return ((((((hashCode2 + i10) * 31) + b.a(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CachedFile(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.io.File r16, java.lang.String r17, long r18, java.lang.String r20, int r21, int r22, kotlin.jvm.internal.h r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r6 = r1
            goto L_0x000b
        L_0x0009:
            r6 = r16
        L_0x000b:
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0013
            r7 = r2
            goto L_0x0015
        L_0x0013:
            r7 = r17
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001d
            r3 = -1
            r8 = r3
            goto L_0x001f
        L_0x001d:
            r8 = r18
        L_0x001f:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0025
            r10 = r2
            goto L_0x0027
        L_0x0025:
            r10 = r20
        L_0x0027:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0032
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0034
        L_0x0032:
            r11 = r21
        L_0x0034:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.CachedFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.io.File, java.lang.String, long, java.lang.String, int, int, kotlin.jvm.internal.h):void");
    }
}
