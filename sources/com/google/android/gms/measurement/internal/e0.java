package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzgk;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r5.f;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class e0 {
    public static final h4<Long> A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, n0.f24843a);
    public static final h4<Boolean> A0;
    public static final h4<Long> B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, q0.f24953a);
    public static final h4<Boolean> B0;
    public static final h4<Long> C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, p0.f24910a);
    public static final h4<Boolean> C0;
    public static final h4<Long> D = a("measurement.upload.retry_time", 1800000L, 1800000L, r0.f24988a);
    public static final h4<Boolean> D0;
    public static final h4<Integer> E = a("measurement.upload.retry_count", 6, 6, u0.f25089a);
    public static final h4<Boolean> E0;
    public static final h4<Long> F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, t0.f25063a);
    public static final h4<Boolean> F0;
    public static final h4<Integer> G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, v0.f25113a);
    public static final h4<Boolean> G0;
    public static final h4<Integer> H = a("measurement.audience.filter_result_max_count", 200, 200, z0.f25310a);
    public static final h4<Boolean> H0;
    public static final h4<Integer> I = a("measurement.upload.max_public_user_properties", 25, 25, (g4) null);
    public static final h4<Boolean> I0;
    public static final h4<Integer> J;
    public static final h4<Boolean> J0;
    public static final h4<Integer> K = a("measurement.upload.max_public_event_params", 25, 25, (g4) null);
    public static final h4<Boolean> K0;
    public static final h4<Long> L;
    public static final h4<Boolean> L0;
    public static final h4<Boolean> M;
    public static final h4<Boolean> M0;
    public static final h4<String> N = a("measurement.test.string_flag", "---", "---", a1.f24348a);
    public static final h4<Boolean> N0;
    public static final h4<Long> O = a("measurement.test.long_flag", -1L, -1L, d1.f24461a);
    public static final h4<Boolean> O0;
    public static final h4<Integer> P = a("measurement.test.int_flag", -2, -2, f1.f24572a);
    private static final h4<Boolean> P0;
    public static final h4<Double> Q;
    public static final h4<Boolean> Q0;
    public static final h4<Integer> R = a("measurement.experiment.max_ids", 50, 50, h1.f24612a);
    public static final h4<Boolean> R0;
    public static final h4<Integer> S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, g1.f24594a);
    public static final h4<Boolean> S0;
    private static final h4<Integer> T = a("measurement.upload.max_event_parameter_value_length", 100, 100, i1.f24649a);
    public static final h4<Boolean> T0;
    public static final h4<Integer> U = a("measurement.max_bundles_per_iteration", 100, 100, l1.f24757a);
    public static final h4<Boolean> U0;
    public static final h4<Long> V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, k1.f24738a);
    public static final h4<Boolean> V0;
    public static final h4<Long> W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, n1.f24844a);
    public static final h4<Boolean> W0;
    public static final h4<Integer> X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, m1.f24817a);
    public static final h4<Boolean> X0;
    public static final h4<String> Y = a("measurement.rb.attribution.uri_scheme", HttpRequest.DEFAULT_SCHEME, HttpRequest.DEFAULT_SCHEME, o1.f24878a);
    public static final h4<Boolean> Y0;
    public static final h4<String> Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", r1.f24989a);
    public static final h4<Boolean> Z0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<h4<?>> f24490a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final h4<String> f24491a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", q1.f24954a);

    /* renamed from: a1  reason: collision with root package name */
    public static final h4<Boolean> f24492a1;

    /* renamed from: b  reason: collision with root package name */
    private static final Set<h4<?>> f24493b = Collections.synchronizedSet(new HashSet());

    /* renamed from: b0  reason: collision with root package name */
    public static final h4<String> f24494b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", t1.f25064a);

    /* renamed from: b1  reason: collision with root package name */
    public static h4<Boolean> f24495b1;

    /* renamed from: c  reason: collision with root package name */
    public static final h4<Long> f24496c;

    /* renamed from: c0  reason: collision with root package name */
    public static final h4<String> f24497c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", s1.f25040a);

    /* renamed from: d  reason: collision with root package name */
    public static final h4<Long> f24498d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, k0.f24737a);

    /* renamed from: d0  reason: collision with root package name */
    public static final h4<String> f24499d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", u1.f25090a);

    /* renamed from: e  reason: collision with root package name */
    public static final h4<Long> f24500e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, x0.f25225a);

    /* renamed from: e0  reason: collision with root package name */
    public static final h4<String> f24501e0 = a("measurement.rb.attribution.query_parameters_to_remove", MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL, y1.f25261a);

    /* renamed from: f  reason: collision with root package name */
    public static final h4<Long> f24502f = a("measurement.config.cache_time", 86400000L, 3600000L, j1.f24716a);

    /* renamed from: f0  reason: collision with root package name */
    public static final h4<Boolean> f24503f0;

    /* renamed from: g  reason: collision with root package name */
    public static final h4<String> f24504g = a("measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME, HttpRequest.DEFAULT_SCHEME, v1.f25114a);

    /* renamed from: g0  reason: collision with root package name */
    public static final h4<Boolean> f24505g0;

    /* renamed from: h  reason: collision with root package name */
    public static final h4<String> f24506h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", i2.f24650a);

    /* renamed from: h0  reason: collision with root package name */
    public static final h4<Boolean> f24507h0;

    /* renamed from: i  reason: collision with root package name */
    public static final h4<Integer> f24508i = a("measurement.upload.max_bundles", 100, 100, u2.f25091a);

    /* renamed from: i0  reason: collision with root package name */
    public static final h4<Boolean> f24509i0;

    /* renamed from: j  reason: collision with root package name */
    public static final h4<Integer> f24510j = a("measurement.upload.max_batch_size", 65536, 65536, h3.f24614a);

    /* renamed from: j0  reason: collision with root package name */
    public static final h4<Boolean> f24511j0;

    /* renamed from: k  reason: collision with root package name */
    public static final h4<Integer> f24512k = a("measurement.upload.max_bundle_size", 65536, 65536, t3.f25066a);

    /* renamed from: k0  reason: collision with root package name */
    public static final h4<Boolean> f24513k0;

    /* renamed from: l  reason: collision with root package name */
    public static final h4<Integer> f24514l = a("measurement.upload.max_events_per_bundle", 1000, 1000, i0.f24648a);

    /* renamed from: l0  reason: collision with root package name */
    public static final h4<Boolean> f24515l0;

    /* renamed from: m  reason: collision with root package name */
    public static final h4<Integer> f24516m = a("measurement.upload.max_events_per_day", 100000, 100000, s0.f25039a);

    /* renamed from: m0  reason: collision with root package name */
    public static final h4<Boolean> f24517m0;

    /* renamed from: n  reason: collision with root package name */
    public static final h4<Integer> f24518n = a("measurement.upload.max_error_events_per_day", 1000, 1000, c1.f24423a);

    /* renamed from: n0  reason: collision with root package name */
    public static final h4<Boolean> f24519n0;

    /* renamed from: o  reason: collision with root package name */
    public static final h4<Integer> f24520o = a("measurement.upload.max_public_events_per_day", 50000, 50000, p1.f24911a);

    /* renamed from: o0  reason: collision with root package name */
    public static final h4<Boolean> f24521o0;

    /* renamed from: p  reason: collision with root package name */
    public static final h4<Integer> f24522p = a("measurement.upload.max_conversions_per_day", 10000, 10000, z1.f25311a);

    /* renamed from: p0  reason: collision with root package name */
    public static final h4<Boolean> f24523p0;

    /* renamed from: q  reason: collision with root package name */
    public static final h4<Integer> f24524q = a("measurement.upload.max_realtime_events_per_day", 10, 10, m2.f24818a);

    /* renamed from: q0  reason: collision with root package name */
    public static final h4<Boolean> f24525q0;

    /* renamed from: r  reason: collision with root package name */
    public static final h4<Integer> f24526r = a("measurement.store.max_stored_events_per_app", 100000, 100000, v2.f25115a);

    /* renamed from: r0  reason: collision with root package name */
    public static final h4<Integer> f24527r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, l2.f24758a);

    /* renamed from: s  reason: collision with root package name */
    public static final h4<String> f24528s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", j3.f24718a);

    /* renamed from: s0  reason: collision with root package name */
    private static final h4<Boolean> f24529s0;

    /* renamed from: t  reason: collision with root package name */
    public static final h4<Long> f24530t = a("measurement.upload.backoff_period", 43200000L, 43200000L, s3.f25042a);

    /* renamed from: t0  reason: collision with root package name */
    private static final h4<Boolean> f24531t0;

    /* renamed from: u  reason: collision with root package name */
    public static final h4<Long> f24532u = a("measurement.upload.window_interval", 3600000L, 3600000L, f0.f24571a);

    /* renamed from: u0  reason: collision with root package name */
    public static final h4<Boolean> f24533u0;

    /* renamed from: v  reason: collision with root package name */
    public static final h4<Long> f24534v = a("measurement.upload.interval", 3600000L, 3600000L, h0.f24611a);

    /* renamed from: v0  reason: collision with root package name */
    public static final h4<Boolean> f24535v0;

    /* renamed from: w  reason: collision with root package name */
    public static final h4<Long> f24536w;

    /* renamed from: w0  reason: collision with root package name */
    public static final h4<Boolean> f24537w0;

    /* renamed from: x  reason: collision with root package name */
    public static final h4<Long> f24538x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, m0.f24816a);

    /* renamed from: x0  reason: collision with root package name */
    public static final h4<Boolean> f24539x0;

    /* renamed from: y  reason: collision with root package name */
    public static final h4<Long> f24540y = a("measurement.upload.minimum_delay", 500L, 500L, l0.f24756a);

    /* renamed from: y0  reason: collision with root package name */
    public static final h4<Boolean> f24541y0;

    /* renamed from: z  reason: collision with root package name */
    public static final h4<Long> f24542z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, o0.f24877a);

    /* renamed from: z0  reason: collision with root package name */
    private static final h4<Boolean> f24543z0;

    static {
        Long valueOf = Long.valueOf(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
        f24496c = a("measurement.ad_id_cache_time", valueOf, valueOf, g0.f24593a);
        f24536w = a("measurement.upload.realtime_upload_interval", valueOf, valueOf, j0.f24715a);
        Integer valueOf2 = Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        J = a("measurement.upload.max_event_name_cardinality", valueOf2, valueOf2, (g4) null);
        Long valueOf3 = Long.valueOf(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS);
        L = a("measurement.service_client.idle_disconnect_millis", valueOf3, valueOf3, y0.f25260a);
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, b1.f24377a);
        Double valueOf4 = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf4, valueOf4, e1.f24544a);
        Boolean bool2 = Boolean.TRUE;
        f24503f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, w1.f25180a);
        f24505g0 = a("measurement.quality.checksum", bool, bool, (g4) null);
        f24507h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, a2.f24349a);
        f24509i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, c2.f24424a);
        f24511j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, b2.f24378a);
        f24513k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, e2.f24545a);
        f24515l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, d2.f24462a);
        f24517m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, g2.f24595a);
        f24519n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, f2.f24573a);
        f24521o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, h2.f24613a);
        f24523p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, k2.f24739a);
        f24525q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, j2.f24717a);
        f24529s0 = a("measurement.client.click_identifier_control.dev", bool, bool, o2.f24879a);
        f24531t0 = a("measurement.service.click_identifier_control", bool, bool, n2.f24845a);
        f24533u0 = a("measurement.service.store_null_safelist", bool2, bool2, q2.f24955a);
        f24535v0 = a("measurement.service.store_safelist", bool2, bool2, p2.f24912a);
        f24537w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, s2.f25041a);
        f24539x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, r2.f24990a);
        f24541y0 = a("measurement.session_stitching_token_enabled", bool, bool, t2.f25065a);
        f24543z0 = a("measurement.sgtm.client.dev", bool, bool, w2.f25181a);
        A0 = a("measurement.sgtm.service", bool, bool, z2.f25312a);
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, x2.f25229a);
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, b3.f24379a);
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, a3.f24350a);
        E0 = a("measurement.sfmc.client", bool2, bool2, d3.f24463a);
        F0 = a("measurement.sfmc.service", bool2, bool2, c3.f24425a);
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, f3.f24574a);
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, e3.f24546a);
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, g3.f24596a);
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, i3.f24651a);
        K0 = a("measurement.remove_app_background.client", bool, bool, l3.f24759a);
        L0 = a("measurement.rb.attribution.service", bool, bool, k3.f24740a);
        M0 = a("measurement.rb.attribution.client2", bool, bool, n3.f24846a);
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, m3.f24819a);
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, p3.f24913a);
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, o3.f24880a);
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, r3.f24991a);
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, q3.f24956a);
        S0 = a("measurement.dma_consent.client", bool, bool, v3.f25116a);
        T0 = a("measurement.dma_consent.service", bool, bool, u3.f25092a);
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, x3.f25230a);
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, w3.f25182a);
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, a4.f24351a);
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, y3.f25263a);
        Y0 = a("measurement.service.deferred_first_open", bool, bool, c4.f24426a);
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, b4.f24380a);
        f24492a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, e4.f24547a);
        f24495b1 = a("measurement.increase_param_lengths", bool, bool, d4.f24464a);
    }

    private static <V> h4<V> a(String str, V v10, V v11, g4<V> g4Var) {
        h4 h4Var = new h4(str, v10, v11, g4Var);
        f24490a.add(h4Var);
        return h4Var;
    }

    public static Map<String, String> c(Context context) {
        zzfy zza = zzfy.zza(context.getContentResolver(), zzgk.zza("com.google.android.gms.measurement"), f.f29767a);
        return zza == null ? Collections.emptyMap() : zza.zza();
    }
}
