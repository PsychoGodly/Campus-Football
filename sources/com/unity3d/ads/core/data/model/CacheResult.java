package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: CacheResult.kt */
public abstract class CacheResult {

    /* compiled from: CacheResult.kt */
    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final CacheSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(CacheError cacheError, CacheSource cacheSource) {
            super((h) null);
            m.e(cacheError, "error");
            m.e(cacheSource, "source");
            this.error = cacheError;
            this.source = cacheSource;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i10 & 2) != 0) {
                cacheSource = failure.source;
            }
            return failure.copy(cacheError, cacheSource);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Failure copy(CacheError cacheError, CacheSource cacheSource) {
            m.e(cacheError, "error");
            m.e(cacheSource, "source");
            return new Failure(cacheError, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source;
        }

        public final CacheError getError() {
            return this.error;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, int i10, h hVar) {
            this(cacheError, (i10 & 2) != 0 ? CacheSource.LOCAL : cacheSource);
        }
    }

    /* compiled from: CacheResult.kt */
    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(CachedFile cachedFile2, CacheSource cacheSource) {
            super((h) null);
            m.e(cachedFile2, "cachedFile");
            m.e(cacheSource, "source");
            this.cachedFile = cachedFile2;
            this.source = cacheSource;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile2, CacheSource cacheSource, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cachedFile2 = success.cachedFile;
            }
            if ((i10 & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile2, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile2, CacheSource cacheSource) {
            m.e(cachedFile2, "cachedFile");
            m.e(cacheSource, "source");
            return new Success(cachedFile2, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return m.a(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return (this.cachedFile.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    private CacheResult() {
    }

    public /* synthetic */ CacheResult(h hVar) {
        this();
    }
}
