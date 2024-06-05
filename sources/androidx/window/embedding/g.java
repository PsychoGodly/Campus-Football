package androidx.window.embedding;

import androidx.window.embedding.ExtensionEmbeddingBackend;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ExtensionEmbeddingBackend.SplitListenerWrapper f5077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f5078b;

    public /* synthetic */ g(ExtensionEmbeddingBackend.SplitListenerWrapper splitListenerWrapper, List list) {
        this.f5077a = splitListenerWrapper;
        this.f5078b = list;
    }

    public final void run() {
        ExtensionEmbeddingBackend.SplitListenerWrapper.m5accept$lambda1(this.f5077a, this.f5078b);
    }
}
