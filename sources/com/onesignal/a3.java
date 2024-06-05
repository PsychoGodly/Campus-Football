package com.onesignal;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: OSTaskRemoteController */
class a3 extends z2 {

    /* renamed from: f  reason: collision with root package name */
    static final HashSet<String> f27552f = new HashSet<>(Arrays.asList(new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));

    /* renamed from: e  reason: collision with root package name */
    private final o2 f27553e;

    a3(o2 o2Var, v1 v1Var) {
        super(v1Var);
        this.f27553e = o2Var;
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        return !this.f27553e.l() && f27552f.contains(str);
    }
}
