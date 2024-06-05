package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;
import androidx.window.layout.WindowMetricsCalculator;

/* compiled from: WindowMetricsCalculator.kt */
public final /* synthetic */ class d {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    public static WindowMetricsCalculator a() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    @ExperimentalWindowApi
    public static void b(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    @ExperimentalWindowApi
    public static void c() {
        WindowMetricsCalculator.Companion.reset();
    }
}
