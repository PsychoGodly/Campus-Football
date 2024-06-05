package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: EmbeddingCompat.kt */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion((h) null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    /* compiled from: EmbeddingCompat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (!isEmbeddingAvailable()) {
                return new EmptyEmbeddingComponent();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            if (activityEmbeddingComponent == null) {
                return new EmptyEmbeddingComponent();
            }
            return activityEmbeddingComponent;
        }

        public final Integer getExtensionApiLevel() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return false;
            }
        }
    }

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter) {
        m.e(activityEmbeddingComponent, "embeddingExtension");
        m.e(embeddingAdapter, "adapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
    }

    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        m.e(embeddingCallbackInterface, "embeddingCallback");
        this.embeddingExtension.setSplitInfoCallback(new EmbeddingTranslatingCallback(embeddingCallbackInterface, this.adapter));
    }

    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        m.e(set, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(set));
    }

    public EmbeddingCompat() {
        this(Companion.embeddingComponent(), new EmbeddingAdapter());
    }
}
