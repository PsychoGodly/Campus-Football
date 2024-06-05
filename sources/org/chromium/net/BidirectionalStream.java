package org.chromium.net;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

public abstract class BidirectionalStream {

    public static abstract class Builder {
        public static final int STREAM_PRIORITY_HIGHEST = 4;
        public static final int STREAM_PRIORITY_IDLE = 0;
        public static final int STREAM_PRIORITY_LOW = 2;
        public static final int STREAM_PRIORITY_LOWEST = 1;
        public static final int STREAM_PRIORITY_MEDIUM = 3;

        public abstract Builder addHeader(String str, String str2);

        public abstract BidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z10);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i10);
    }

    public static abstract class Callback {
        public void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        }

        public abstract void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException);

        public abstract void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z10);

        public abstract void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        public void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        }

        public abstract void onStreamReady(BidirectionalStream bidirectionalStream);

        public abstract void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo);

        public abstract void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z10);
    }

    public abstract void cancel();

    public abstract void flush();

    public abstract boolean isDone();

    public abstract void read(ByteBuffer byteBuffer);

    public abstract void start();

    public abstract void write(ByteBuffer byteBuffer, boolean z10);
}
