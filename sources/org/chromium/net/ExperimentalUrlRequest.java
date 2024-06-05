package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

public abstract class ExperimentalUrlRequest extends UrlRequest {

    public static abstract class Builder extends UrlRequest.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        public abstract ExperimentalUrlRequest build();

        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i10);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i10) {
            return this;
        }

        public Builder setTrafficStatsUid(int i10) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
