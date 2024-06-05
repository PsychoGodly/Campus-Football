package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;

@ExperimentalWindowApi
/* compiled from: WindowMetricsCalculator.kt */
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    WindowMetricsCalculator decorate(WindowMetricsCalculator windowMetricsCalculator);
}
