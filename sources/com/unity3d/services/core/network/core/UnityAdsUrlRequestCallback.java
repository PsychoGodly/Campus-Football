package com.unity3d.services.core.network.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import lf.d;
import lf.l;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: UnityAdsUrlRequestCallback.kt */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 65536;
    public static final Companion Companion = new Companion((h) null);
    private final ByteArrayOutputStream bytesReceived;
    private final File file;
    private final WritableByteChannel receiveChannel;
    private d sink;

    /* compiled from: UnityAdsUrlRequestCallback.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public UnityAdsUrlRequestCallback(File file2) {
        this.file = file2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    public final File getFile() {
        return this.file;
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        m.e(urlRequest, "request");
        m.e(urlResponseInfo, "info");
        m.e(byteBuffer, "byteBuffer");
        byteBuffer.flip();
        File file2 = this.file;
        boolean z10 = true;
        if (file2 == null || !file2.exists()) {
            z10 = false;
        }
        if (z10) {
            d dVar = this.sink;
            if (dVar == null) {
                m.t("sink");
                dVar = null;
            }
            dVar.write(byteBuffer);
        } else {
            this.receiveChannel.write(byteBuffer);
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        m.e(urlRequest, "request");
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        m.e(urlRequest, "request");
        m.e(urlResponseInfo, "info");
        File file2 = this.file;
        boolean z10 = true;
        if (file2 == null || !file2.exists()) {
            z10 = false;
        }
        if (z10) {
            d a10 = l.a(l.d(this.file));
            m.d(a10, "buffer(Okio.sink(file))");
            this.sink = a10;
        }
        urlRequest.read(ByteBuffer.allocateDirect(BYTE_BUFFER_CAPACITY_BYTES));
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        m.e(urlRequest, "request");
        m.e(urlResponseInfo, "info");
        byte[] byteArray = this.bytesReceived.toByteArray();
        File file2 = this.file;
        if (file2 != null && file2.exists()) {
            d dVar = this.sink;
            if (dVar == null) {
                m.t("sink");
                dVar = null;
            }
            dVar.close();
        }
        m.d(byteArray, "bodyBytes");
        onSucceeded(urlRequest, urlResponseInfo, byteArray);
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);
}
