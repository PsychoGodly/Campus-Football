package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;

@ExperimentalWindowApi
/* compiled from: EmbeddingInterfaceCompat.kt */
public interface EmbeddingInterfaceCompat {

    /* compiled from: EmbeddingInterfaceCompat.kt */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(Set<? extends EmbeddingRule> set);
}
