package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.a;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.w;

@ExperimentalWindowApi
/* compiled from: SplitController.kt */
public final class SplitController {
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public static volatile SplitController globalInstance = null;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    public static final boolean sDebug = false;
    private final EmbeddingBackend embeddingBackend;
    private Set<? extends EmbeddingRule> staticSplitRules;

    /* compiled from: SplitController.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SplitController getInstance() {
            if (SplitController.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = SplitController.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (SplitController.globalInstance == null) {
                        Companion companion = SplitController.Companion;
                        SplitController.globalInstance = new SplitController((h) null);
                    }
                    w wVar = w.f38141a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            SplitController access$getGlobalInstance$cp = SplitController.globalInstance;
            m.b(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        public final void initialize(Context context, int i10) {
            m.e(context, "context");
            Set<EmbeddingRule> parseSplitRules$window_release = new SplitRuleParser().parseSplitRules$window_release(context, i10);
            SplitController instance = getInstance();
            if (parseSplitRules$window_release == null) {
                parseSplitRules$window_release = q0.b();
            }
            instance.setStaticSplitRules(parseSplitRules$window_release);
        }
    }

    private SplitController() {
        this.embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
        this.staticSplitRules = q0.b();
    }

    public /* synthetic */ SplitController(h hVar) {
        this();
    }

    public static final SplitController getInstance() {
        return Companion.getInstance();
    }

    public static final void initialize(Context context, int i10) {
        Companion.initialize(context, i10);
    }

    /* access modifiers changed from: private */
    public final void setStaticSplitRules(Set<? extends EmbeddingRule> set) {
        this.staticSplitRules = set;
        this.embeddingBackend.setSplitRules(set);
    }

    public final void addSplitListener(Activity activity, Executor executor, a<List<SplitInfo>> aVar) {
        m.e(activity, "activity");
        m.e(executor, "executor");
        m.e(aVar, "consumer");
        this.embeddingBackend.registerSplitListenerForActivity(activity, executor, aVar);
    }

    public final void clearRegisteredRules() {
        this.embeddingBackend.setSplitRules(this.staticSplitRules);
    }

    public final Set<EmbeddingRule> getSplitRules() {
        return y.P(this.embeddingBackend.getSplitRules());
    }

    public final boolean isSplitSupported() {
        return this.embeddingBackend.isSplitSupported();
    }

    public final void registerRule(EmbeddingRule embeddingRule) {
        m.e(embeddingRule, "rule");
        this.embeddingBackend.registerRule(embeddingRule);
    }

    public final void removeSplitListener(a<List<SplitInfo>> aVar) {
        m.e(aVar, "consumer");
        this.embeddingBackend.unregisterSplitListenerForActivity(aVar);
    }

    public final void unregisterRule(EmbeddingRule embeddingRule) {
        m.e(embeddingRule, "rule");
        this.embeddingBackend.unregisterRule(embeddingRule);
    }
}
