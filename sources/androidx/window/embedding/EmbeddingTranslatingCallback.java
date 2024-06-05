package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.m;

@ExperimentalWindowApi
/* compiled from: EmbeddingTranslatingCallback.kt */
public final class EmbeddingTranslatingCallback implements Consumer<List<? extends SplitInfo>> {
    private final EmbeddingAdapter adapter;
    private final EmbeddingInterfaceCompat.EmbeddingCallbackInterface callback;

    public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingAdapter embeddingAdapter) {
        m.e(embeddingCallbackInterface, "callback");
        m.e(embeddingAdapter, "adapter");
        this.callback = embeddingCallbackInterface;
        this.adapter = embeddingAdapter;
    }

    public void accept(List<? extends SplitInfo> list) {
        m.e(list, "splitInfoList");
        this.callback.onSplitInfoChanged(this.adapter.translate(list));
    }
}
