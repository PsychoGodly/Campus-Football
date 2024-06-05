package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class qa extends ak {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f10899c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    private final CharsetDecoder f10900a = Charsets.UTF_8.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f10901b = Charsets.ISO_8859_1.newDecoder();

    /* access modifiers changed from: protected */
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        String a10 = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a10 == null) {
            return new we(new sa(bArr, (String) null, (String) null));
        }
        Matcher matcher = f10899c.matcher(a10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.hashCode();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new we(new sa(bArr, str, str2));
    }

    /* JADX INFO: finally extract failed */
    private String a(ByteBuffer byteBuffer) {
        try {
            return this.f10900a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f10901b.decode(byteBuffer).toString();
                this.f10901b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f10901b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f10901b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f10900a.reset();
            byteBuffer.rewind();
        }
    }
}
