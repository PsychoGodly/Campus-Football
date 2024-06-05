package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

public abstract class CronetEngine {
    /* access modifiers changed from: private */
    public static final String TAG = "CronetEngine";

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        protected final ICronetEngineBuilder mBuilderDelegate;

        public static abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        static class a implements Comparator<CronetProvider> {
            a() {
            }

            /* renamed from: a */
            public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
                    return 1;
                }
                if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
                    return -1;
                }
                return -Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
            }
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i10 = 0;
            while (i10 < split.length && i10 < split2.length) {
                try {
                    int parseInt = Integer.parseInt(split[i10]);
                    int parseInt2 = Integer.parseInt(split2[i10]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i10++;
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i10] + " & " + split2[i10], e10);
                }
            }
            return Integer.signum(split.length - split2.length);
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            CronetProvider cronetProvider = getEnabledCronetProviders(context, new ArrayList(CronetProvider.getAllProviders(context))).get(0);
            if (Log.isLoggable(CronetEngine.TAG, 3)) {
                Log.d(CronetEngine.TAG, String.format("Using '%s' provider for creating CronetEngine.Builder.", new Object[]{cronetProvider}));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        static List<CronetProvider> getEnabledCronetProviders(Context context, List<CronetProvider> list) {
            if (list.size() != 0) {
                Iterator<CronetProvider> it = list.iterator();
                while (it.hasNext()) {
                    if (!it.next().isEnabled()) {
                        it.remove();
                    }
                }
                if (list.size() != 0) {
                    Collections.sort(list, new a());
                    return list;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z10, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z10, date);
            return this;
        }

        public Builder addQuicHint(String str, int i10, int i11) {
            this.mBuilderDelegate.addQuicHint(str, i10, i11);
            return this;
        }

        public CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z10) {
            this.mBuilderDelegate.enableBrotli(z10);
            return this;
        }

        public Builder enableHttp2(boolean z10) {
            this.mBuilderDelegate.enableHttp2(z10);
            return this;
        }

        public Builder enableHttpCache(int i10, long j10) {
            this.mBuilderDelegate.enableHttpCache(i10, j10);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z10) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z10);
            return this;
        }

        public Builder enableQuic(boolean z10) {
            this.mBuilderDelegate.enableQuic(z10);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z10) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url) throws IOException;

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z10);

    public abstract void stopNetLog();
}
