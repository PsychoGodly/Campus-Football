package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public interface IntegrityManager {
    Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest);
}
