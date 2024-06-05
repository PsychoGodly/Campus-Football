package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.qi;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAdSize;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class oj implements Comparable {
    public static final oj A = a("mei", -1);
    public static final oj A0;
    public static final oj A1 = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
    public static final oj A2 = a("mute_button_margin", 10);
    public static final oj A3;
    public static final oj A4;
    public static final oj A5;
    public static final oj A6;
    public static final oj B = a("md", MaxReward.DEFAULT_LABEL);
    public static final oj B0;
    public static final oj B1 = a("close_button_touch_area", 0);
    public static final oj B2 = a("mute_button_gravity", 85);
    public static final oj B3 = a("ad_session_minutes", 60);
    public static final oj B4 = a("ncrs", "4,5,6,7,8,11,16");
    public static final oj B5;
    public static final oj B6 = a("ps_ftri_ms", -1L);
    public static final oj C;
    public static final oj C0;
    public static final oj C1 = a("close_button_outside_touch_area", 0);
    public static final oj C2 = a("progress_bar_step", 25L);
    public static final oj C3;
    public static final oj C4 = a("dcttl_1_seconds", 5);
    public static final oj C5;
    public static final oj C6;
    public static final oj D;
    public static final oj D0;
    public static final oj D1;
    public static final oj D2 = a("progress_bar_scale", 10000);
    public static final oj D3 = a("session_tracking_resumed_cooldown_minutes", 90L);
    public static final oj D4 = a("dcttl_2_seconds", 30);
    public static final oj D5;
    public static final oj D6;
    public static final oj E;
    public static final oj E0 = a("ttc_edge_buffer_dp", 0);
    public static final oj E1;
    public static final oj E2 = a("progress_bar_vertical_padding", -8);
    public static final oj E3 = a("session_tracking_paused_cooldown_minutes", 90L);
    public static final oj E4;
    public static final oj E5 = a("server_timestamp_ms", (Object) null);
    public static final oj E6;
    public static final oj F;
    public static final oj F0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
    public static final oj F1;
    public static final oj F2 = a("vs_buffer_indicator_size", 50);
    public static final oj F3;
    public static final oj F4;
    public static final oj F5 = a("device_timestamp_ms", (Object) null);
    public static final oj F6;
    public static final oj G = a("malaera", -1);
    public static final oj G0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
    public static final oj G1;
    public static final oj G2;
    public static final oj G3;
    public static final oj G4 = a("dcttl_5_seconds", Integer.valueOf((int) TimeUnit.HOURS.toSeconds(1)));
    public static final oj G5 = a("gzip_min_length", (Object) null);
    public static final oj H = a("eralaf", MaxReward.DEFAULT_LABEL);
    public static final oj H0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
    public static final oj H1;
    public static final oj H2 = a("set_poststitial_muted_initial_delay_ms", 500L);
    public static final oj H3;
    public static final oj H4;
    public static final oj H5;
    public static final oj I;
    public static final oj I0 = a("adserver_endpoint", "https://a.applovin.com/");
    public static final oj I1 = a("viewability_adview_banner_min_width", 320);
    public static final oj I2;
    public static final oj I3;
    public static final oj I4;
    public static final oj I5;
    public static final oj J = a("ps_atu", MaxReward.DEFAULT_LABEL);
    public static final oj J0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
    public static final oj J1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
    public static final oj J2;
    public static final oj J3;
    public static final oj J4 = a("lccdm", 10L);
    public static final oj J5;
    public static final oj K;
    public static final oj K0 = a("api_endpoint", "https://d.applovin.com/");
    public static final oj K1;
    public static final oj K2;
    public static final oj K3;
    public static final oj K4 = a("lmfd", 2);
    public static final oj K5;
    public static final oj L = a("tla_ms", -1L);
    public static final oj L0 = a("api_backup_endpoint", "https://d.applvn.com/");
    public static final oj L1;
    public static final oj L2 = a("postitial_progress_bar_step_ms", 25L);
    public static final oj L3;
    public static final oj L4;
    public static final oj L5;
    public static final oj M;
    public static final oj M0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
    public static final oj M1 = a("viewability_adview_leader_min_width", 728);
    public static final oj M2;
    public static final oj M3;
    public static final oj M4;
    public static final oj M5;
    public static final oj N;
    public static final oj N0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
    public static final oj N1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
    public static final oj N2 = a("postitial_progress_bar_vertical_padding", -8);
    public static final oj N3;
    public static final oj N4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
    public static final oj N5;
    public static final oj O = a("stps", 2);
    public static final oj O0 = a("token_type_prefixes_r", "4!");
    public static final oj O1 = a("viewability_adview_native_min_width", 0);
    public static final oj O2 = a("postitial_progress_bar_scale", 10000);
    public static final oj O3;
    public static final oj O4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
    public static final oj O5;
    public static final oj P = a("auxiliary_operations_threads", 1);
    public static final oj P0 = a("token_type_prefixes_arj", "json_v3!");
    public static final oj P1 = a("viewability_adview_native_min_height", 0);
    public static final oj P2;
    public static final oj P3;
    public static final oj P4 = a("vast_max_response_length", 640000);
    public static final oj P5;
    public static final oj Q;
    public static final oj Q0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
    public static final oj Q1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
    public static final oj Q2;
    public static final oj Q3;
    public static final oj Q4 = a("vast_max_wrapper_depth", 5);
    public static final oj Q5;
    public static final oj R = a("tmtp", 1);
    public static final oj R0;
    public static final oj R1;
    public static final oj R2;
    public static final oj R3;
    public static final oj R4 = a("vast_unsupported_video_extensions", "ogv,flv");
    public static final oj R5;
    public static final oj S = a("network_thread_count", 2);
    public static final oj S0;
    public static final oj S1 = a("viewability_timer_interval_ms", 100L);
    public static final oj S2;
    public static final oj S3;
    public static final oj S4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
    public static final oj S5;
    public static final oj T = a("ntp", 5);
    public static final oj T0 = a("super_property_string_max_length", 1024);
    public static final oj T1 = a("expandable_close_button_size", 27);
    public static final oj T2;
    public static final oj T3;
    public static final oj T4;
    public static final oj T5;
    public static final oj U;
    public static final oj U0 = a("super_property_url_max_length", 1024);
    public static final oj U1 = a("expandable_h_close_button_margin", 10);
    public static final oj U2 = a("submit_postback_retries", 4);
    public static final oj U3;
    public static final oj U4 = a("vast_wrapper_resolution_retry_count_v1", 1);
    public static final oj U5 = a("anr_trigger_millis", 4000L);
    public static final oj V = a("coretc", 1);
    public static final oj V0;
    public static final oj V1 = a("expandable_t_close_button_margin", 10);
    public static final oj V2 = a("max_postback_attempts", 3);
    public static final oj V3;
    public static final oj V4;
    public static final oj V5 = a("anr_touch_millis", 3000L);
    public static final oj W = a("cachetc", 1);
    public static final oj W0 = a("cache_max_size_mb", -1);
    public static final oj W1;
    public static final oj W2 = a("max_persisted_postbacks", 100);
    public static final oj W3;
    public static final oj W4 = a("vast_industry_icon_max_size", 20);
    public static final oj W5 = a("anr_check_millis", 3000L);
    public static final oj X = a("mtc", 1);
    public static final oj X0 = a("precache_delimiters", ")]', ");
    public static final oj X1 = a("expandable_close_button_touch_area", 0);
    public static final oj X2;
    public static final oj X3;
    public static final oj X4 = a("vast_industry_icon_margin", 12);
    public static final oj X5;
    public static final oj Y = a("ttc", 1);
    public static final oj Y0;
    public static final oj Y1;
    public static final oj Y2;
    public static final oj Y3;
    public static final oj Y4 = a("vast_industry_icon_gravity", 85);
    public static final oj Y5;
    public static final oj Z = a("otc", 1);
    public static final oj Z0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
    public static final oj Z1 = a("js_tag_schemes", "applovin,mopub");
    public static final oj Z2;
    public static final oj Z3;
    public static final oj Z4 = a("vast_native_mute_button_size", 24);
    public static final oj Z5 = a("bvdidm", 1000L);

    /* renamed from: a0  reason: collision with root package name */
    public static final oj f10258a0;

    /* renamed from: a1  reason: collision with root package name */
    public static final oj f10259a1 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");

    /* renamed from: a2  reason: collision with root package name */
    public static final oj f10260a2 = a("js_tag_load_success_hosts", "load,load_succeeded");

    /* renamed from: a3  reason: collision with root package name */
    public static final oj f10261a3;

    /* renamed from: a4  reason: collision with root package name */
    public static final oj f10262a4;

    /* renamed from: a5  reason: collision with root package name */
    public static final oj f10263a5 = a("vast_native_play_pause_button_size", 24);

    /* renamed from: a6  reason: collision with root package name */
    public static final oj f10264a6 = a("bvdim", 4000L);

    /* renamed from: b0  reason: collision with root package name */
    public static final oj f10265b0;

    /* renamed from: b1  reason: collision with root package name */
    public static final oj f10266b1 = a("resource_max_filename_length", 255);

    /* renamed from: b2  reason: collision with root package name */
    public static final oj f10267b2 = a("js_tag_load_failure_hosts", "failLoad,load_failed");

    /* renamed from: b3  reason: collision with root package name */
    public static final oj f10268b3;

    /* renamed from: b4  reason: collision with root package name */
    public static final oj f10269b4;

    /* renamed from: b5  reason: collision with root package name */
    public static final oj f10270b5 = a("vast_native_video_widget_padding", 6);

    /* renamed from: b6  reason: collision with root package name */
    public static final oj f10271b6 = a("bvdrs", 10);

    /* renamed from: c  reason: collision with root package name */
    private static final List f10272c;

    /* renamed from: c0  reason: collision with root package name */
    public static final oj f10273c0;

    /* renamed from: c1  reason: collision with root package name */
    public static final oj f10274c1;

    /* renamed from: c2  reason: collision with root package name */
    public static final oj f10275c2;

    /* renamed from: c3  reason: collision with root package name */
    public static final oj f10276c3;

    /* renamed from: c4  reason: collision with root package name */
    public static final oj f10277c4;

    /* renamed from: c5  reason: collision with root package name */
    public static final oj f10278c5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));

    /* renamed from: c6  reason: collision with root package name */
    public static final oj f10279c6 = a("bvdct", 230);

    /* renamed from: d  reason: collision with root package name */
    private static final Map f10280d = new HashMap(512);

    /* renamed from: d0  reason: collision with root package name */
    public static final oj f10281d0;

    /* renamed from: d1  reason: collision with root package name */
    public static final oj f10282d1 = a("mcct", 3);

    /* renamed from: d2  reason: collision with root package name */
    public static final oj f10283d2;

    /* renamed from: d3  reason: collision with root package name */
    public static final oj f10284d3;

    /* renamed from: d4  reason: collision with root package name */
    public static final oj f10285d4;

    /* renamed from: d5  reason: collision with root package name */
    public static final oj f10286d5;

    /* renamed from: d6  reason: collision with root package name */
    public static final oj f10287d6 = a("bvdict", 3);

    /* renamed from: e0  reason: collision with root package name */
    public static final oj f10288e0;

    /* renamed from: e1  reason: collision with root package name */
    public static final oj f10289e1 = a("mchct", 3);

    /* renamed from: e2  reason: collision with root package name */
    public static final oj f10290e2;

    /* renamed from: e3  reason: collision with root package name */
    public static final oj f10291e3;

    /* renamed from: e4  reason: collision with root package name */
    public static final oj f10292e4;

    /* renamed from: e5  reason: collision with root package name */
    public static final oj f10293e5;

    /* renamed from: e6  reason: collision with root package name */
    public static final oj f10294e6;

    /* renamed from: f  reason: collision with root package name */
    public static final oj f10295f;

    /* renamed from: f0  reason: collision with root package name */
    public static final oj f10296f0 = a("omsdk_partner_name", "applovin");

    /* renamed from: f1  reason: collision with root package name */
    public static final oj f10297f1;

    /* renamed from: f2  reason: collision with root package name */
    public static final oj f10298f2 = a("close_button_right_margin_video", 4);

    /* renamed from: f3  reason: collision with root package name */
    public static final oj f10299f3 = a("fetch_ad_retry_count_v1", 1);

    /* renamed from: f4  reason: collision with root package name */
    public static final oj f10300f4;

    /* renamed from: f5  reason: collision with root package name */
    public static final oj f10301f5 = a("vast_replay_icon_size", 64);

    /* renamed from: f6  reason: collision with root package name */
    public static final oj f10302f6;

    /* renamed from: g  reason: collision with root package name */
    public static final oj f10303g = a("device_id", MaxReward.DEFAULT_LABEL);

    /* renamed from: g0  reason: collision with root package name */
    public static final oj f10304g0;

    /* renamed from: g1  reason: collision with root package name */
    public static final oj f10305g1;

    /* renamed from: g2  reason: collision with root package name */
    public static final oj f10306g2 = a("close_button_size_video", 30);

    /* renamed from: g3  reason: collision with root package name */
    public static final oj f10307g3;

    /* renamed from: g4  reason: collision with root package name */
    public static final oj f10308g4;

    /* renamed from: g5  reason: collision with root package name */
    public static final oj f10309g5;

    /* renamed from: g6  reason: collision with root package name */
    public static final oj f10310g6;

    /* renamed from: h  reason: collision with root package name */
    public static final oj f10311h;

    /* renamed from: h0  reason: collision with root package name */
    public static final oj f10312h0 = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");

    /* renamed from: h1  reason: collision with root package name */
    public static final oj f10313h1;

    /* renamed from: h2  reason: collision with root package name */
    public static final oj f10314h2 = a("close_button_top_margin_video", 8);

    /* renamed from: h3  reason: collision with root package name */
    public static final oj f10315h3;

    /* renamed from: h4  reason: collision with root package name */
    public static final oj f10316h4;

    /* renamed from: h5  reason: collision with root package name */
    public static final oj f10317h5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");

    /* renamed from: h6  reason: collision with root package name */
    public static final oj f10318h6 = a("bvlmtb", -1L);

    /* renamed from: i  reason: collision with root package name */
    public static final oj f10319i;

    /* renamed from: i0  reason: collision with root package name */
    public static final oj f10320i0;

    /* renamed from: i1  reason: collision with root package name */
    public static final oj f10321i1;

    /* renamed from: i2  reason: collision with root package name */
    public static final oj f10322i2 = a("video_countdown_clock_margin", 10);

    /* renamed from: i3  reason: collision with root package name */
    public static final oj f10323i3 = a("submit_data_retry_count_v1", 1);

    /* renamed from: i4  reason: collision with root package name */
    public static final oj f10324i4 = a("volume_normalization_factor", Float.valueOf(6.6666665f));

    /* renamed from: i5  reason: collision with root package name */
    public static final oj f10325i5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");

    /* renamed from: i6  reason: collision with root package name */
    public static final oj f10326i6;

    /* renamed from: j  reason: collision with root package name */
    public static final oj f10327j;

    /* renamed from: j0  reason: collision with root package name */
    public static final oj f10328j0 = a("consent_dialog_show_from_alert_delay_ms", 450L);

    /* renamed from: j1  reason: collision with root package name */
    public static final oj f10329j1;

    /* renamed from: j2  reason: collision with root package name */
    public static final oj f10330j2 = a("video_countdown_clock_gravity", 83);

    /* renamed from: j3  reason: collision with root package name */
    public static final oj f10331j3 = a("response_buffer_size", 16000);

    /* renamed from: j4  reason: collision with root package name */
    public static final oj f10332j4;

    /* renamed from: j5  reason: collision with root package name */
    public static final oj f10333j5;

    /* renamed from: j6  reason: collision with root package name */
    public static final oj f10334j6;

    /* renamed from: k  reason: collision with root package name */
    public static final oj f10335k = a("device_token", MaxReward.DEFAULT_LABEL);

    /* renamed from: k0  reason: collision with root package name */
    public static final oj f10336k0;

    /* renamed from: k1  reason: collision with root package name */
    public static final oj f10337k1;

    /* renamed from: k2  reason: collision with root package name */
    public static final oj f10338k2 = a("countdown_clock_size", 32);

    /* renamed from: k3  reason: collision with root package name */
    public static final oj f10339k3;

    /* renamed from: k4  reason: collision with root package name */
    public static final oj f10340k4;

    /* renamed from: k5  reason: collision with root package name */
    public static final oj f10341k5;

    /* renamed from: k6  reason: collision with root package name */
    public static final oj f10342k6;

    /* renamed from: l  reason: collision with root package name */
    public static final oj f10343l;

    /* renamed from: l0  reason: collision with root package name */
    public static final oj f10344l0;

    /* renamed from: l1  reason: collision with root package name */
    public static final oj f10345l1;

    /* renamed from: l2  reason: collision with root package name */
    public static final oj f10346l2 = a("countdown_clock_stroke_size", 4);

    /* renamed from: l3  reason: collision with root package name */
    public static final oj f10347l3 = a("fetch_basic_settings_retry_count", 3);

    /* renamed from: l4  reason: collision with root package name */
    public static final oj f10348l4;

    /* renamed from: l5  reason: collision with root package name */
    public static final oj f10349l5;

    /* renamed from: l6  reason: collision with root package name */
    public static final oj f10350l6;

    /* renamed from: m  reason: collision with root package name */
    public static final oj f10351m = a("error_reporter_v1_sample_percent", 100);

    /* renamed from: m0  reason: collision with root package name */
    public static final oj f10352m0;

    /* renamed from: m1  reason: collision with root package name */
    public static final oj f10353m1;

    /* renamed from: m2  reason: collision with root package name */
    public static final oj f10354m2 = a("countdown_clock_text_size", 28);

    /* renamed from: m3  reason: collision with root package name */
    public static final oj f10355m3;

    /* renamed from: m4  reason: collision with root package name */
    public static final oj f10356m4;

    /* renamed from: m5  reason: collision with root package name */
    public static final oj f10357m5;

    /* renamed from: m6  reason: collision with root package name */
    public static final oj f10358m6;

    /* renamed from: n  reason: collision with root package name */
    public static final oj f10359n;

    /* renamed from: n0  reason: collision with root package name */
    public static final oj f10360n0;

    /* renamed from: n1  reason: collision with root package name */
    public static final oj f10361n1;

    /* renamed from: n2  reason: collision with root package name */
    public static final oj f10362n2;

    /* renamed from: n3  reason: collision with root package name */
    public static final oj f10363n3;

    /* renamed from: n4  reason: collision with root package name */
    public static final oj f10364n4;

    /* renamed from: n5  reason: collision with root package name */
    public static final oj f10365n5;

    /* renamed from: n6  reason: collision with root package name */
    public static final oj f10366n6;

    /* renamed from: o  reason: collision with root package name */
    public static final oj f10367o = a("error_reporter_v2_sample_percent", 1);

    /* renamed from: o0  reason: collision with root package name */
    public static final oj f10368o0;

    /* renamed from: o1  reason: collision with root package name */
    public static final oj f10369o1;

    /* renamed from: o2  reason: collision with root package name */
    public static final oj f10370o2 = a("inter_display_delay", 200L);

    /* renamed from: o3  reason: collision with root package name */
    public static final oj f10371o3;

    /* renamed from: o4  reason: collision with root package name */
    public static final oj f10372o4 = a("movement_degradation", Float.valueOf(0.75f));

    /* renamed from: o5  reason: collision with root package name */
    public static final oj f10373o5;

    /* renamed from: o6  reason: collision with root package name */
    public static final oj f10374o6;

    /* renamed from: p  reason: collision with root package name */
    public static final oj f10375p = a("error_reporter_v2_endpoint", "https://docs.applovin.com/1.0/sdk/event");

    /* renamed from: p0  reason: collision with root package name */
    public static final oj f10376p0;

    /* renamed from: p1  reason: collision with root package name */
    public static final oj f10377p1 = a("fsae_ms", -1L);

    /* renamed from: p2  reason: collision with root package name */
    public static final oj f10378p2 = a("maximum_close_button_delay_seconds", 999L);

    /* renamed from: p3  reason: collision with root package name */
    public static final oj f10379p3;

    /* renamed from: p4  reason: collision with root package name */
    public static final oj f10380p4 = a("device_sensor_period_ms", 250);

    /* renamed from: p5  reason: collision with root package name */
    public static final oj f10381p5 = a("reet_msma", Integer.valueOf(qi.a.V2.b()));

    /* renamed from: p6  reason: collision with root package name */
    public static final oj f10382p6;

    /* renamed from: q  reason: collision with root package name */
    public static final oj f10383q = a("sc", MaxReward.DEFAULT_LABEL);

    /* renamed from: q0  reason: collision with root package name */
    public static final oj f10384q0;

    /* renamed from: q1  reason: collision with root package name */
    public static final oj f10385q1;

    /* renamed from: q2  reason: collision with root package name */
    public static final oj f10386q2;

    /* renamed from: q3  reason: collision with root package name */
    public static final oj f10387q3;

    /* renamed from: q4  reason: collision with root package name */
    public static final oj f10388q4;

    /* renamed from: q5  reason: collision with root package name */
    public static final oj f10389q5;

    /* renamed from: q6  reason: collision with root package name */
    public static final oj f10390q6;

    /* renamed from: r  reason: collision with root package name */
    public static final oj f10391r = a("sc2", MaxReward.DEFAULT_LABEL);

    /* renamed from: r0  reason: collision with root package name */
    public static final oj f10392r0;

    /* renamed from: r1  reason: collision with root package name */
    public static final oj f10393r1 = a("vr_retry_count_v1", 1);

    /* renamed from: r2  reason: collision with root package name */
    public static final oj f10394r2;

    /* renamed from: r3  reason: collision with root package name */
    public static final oj f10395r3;

    /* renamed from: r4  reason: collision with root package name */
    public static final oj f10396r4 = a("fetch_basic_settings_delay_ms", 1500);

    /* renamed from: r5  reason: collision with root package name */
    public static final oj f10397r5;

    /* renamed from: r6  reason: collision with root package name */
    public static final oj f10398r6;

    /* renamed from: s  reason: collision with root package name */
    public static final oj f10399s = a("sc3", MaxReward.DEFAULT_LABEL);

    /* renamed from: s0  reason: collision with root package name */
    public static final oj f10400s0;

    /* renamed from: s1  reason: collision with root package name */
    public static final oj f10401s1 = a("cr_retry_count_v1", 1);

    /* renamed from: s2  reason: collision with root package name */
    public static final oj f10402s2;

    /* renamed from: s3  reason: collision with root package name */
    public static final oj f10403s3;

    /* renamed from: s4  reason: collision with root package name */
    public static final oj f10404s4;

    /* renamed from: s5  reason: collision with root package name */
    public static final oj f10405s5;

    /* renamed from: s6  reason: collision with root package name */
    public static final oj f10406s6 = a("config_consent_dialog_state", "unknown");

    /* renamed from: t  reason: collision with root package name */
    public static final oj f10407t = a("server_installed_at", MaxReward.DEFAULT_LABEL);

    /* renamed from: t0  reason: collision with root package name */
    public static final oj f10408t0;

    /* renamed from: t1  reason: collision with root package name */
    public static final oj f10409t1 = a("text_incent_warning_title", "Attention!");

    /* renamed from: t2  reason: collision with root package name */
    public static final oj f10410t2;

    /* renamed from: t3  reason: collision with root package name */
    public static final oj f10411t3 = a("communicator_request_retry_count", 3);

    /* renamed from: t4  reason: collision with root package name */
    public static final oj f10412t4 = a("mpsl", 3);

    /* renamed from: t5  reason: collision with root package name */
    public static final oj f10413t5;

    /* renamed from: t6  reason: collision with root package name */
    public static final oj f10414t6;

    /* renamed from: u  reason: collision with root package name */
    public static final oj f10415u;

    /* renamed from: u0  reason: collision with root package name */
    public static final oj f10416u0 = a("text_alert_consent_title", "Make this App Better and Stay Free!");

    /* renamed from: u1  reason: collision with root package name */
    public static final oj f10417u1 = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");

    /* renamed from: u2  reason: collision with root package name */
    public static final oj f10418u2;

    /* renamed from: u3  reason: collision with root package name */
    public static final oj f10419u3;

    /* renamed from: u4  reason: collision with root package name */
    public static final oj f10420u4 = a("mpis", "com.applovin,dalvik,java,android,com.android");

    /* renamed from: u5  reason: collision with root package name */
    public static final oj f10421u5;

    /* renamed from: u6  reason: collision with root package name */
    public static final oj f10422u6 = a("consent_flow_doc_url", "https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow");

    /* renamed from: v  reason: collision with root package name */
    public static final oj f10423v;

    /* renamed from: v0  reason: collision with root package name */
    public static final oj f10424v0 = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");

    /* renamed from: v1  reason: collision with root package name */
    public static final oj f10425v1 = a("text_incent_warning_close_option", "Close");

    /* renamed from: v2  reason: collision with root package name */
    public static final oj f10426v2;

    /* renamed from: v3  reason: collision with root package name */
    public static final oj f10427v3 = a("rfbsd_ms", -1L);

    /* renamed from: v4  reason: collision with root package name */
    public static final oj f10428v4;

    /* renamed from: v5  reason: collision with root package name */
    public static final oj f10429v5;

    /* renamed from: v6  reason: collision with root package name */
    public static final oj f10430v6 = a("consent_flow_unity_doc_url", "https://developers.applovin.com/en/unity/overview/terms-and-privacy-policy-flow");

    /* renamed from: w  reason: collision with root package name */
    public static final oj f10431w = a("sicd_ms", 0L);

    /* renamed from: w0  reason: collision with root package name */
    public static final oj f10432w0 = a("text_alert_consent_yes_option", "I Agree");

    /* renamed from: w1  reason: collision with root package name */
    public static final oj f10433w1 = a("text_incent_warning_continue_option", "Keep Watching");

    /* renamed from: w2  reason: collision with root package name */
    public static final oj f10434w2;

    /* renamed from: w3  reason: collision with root package name */
    public static final oj f10435w3 = a("ehkpd_ms", 500L);

    /* renamed from: w4  reason: collision with root package name */
    public static final oj f10436w4;

    /* renamed from: w5  reason: collision with root package name */
    public static final oj f10437w5;

    /* renamed from: w6  reason: collision with root package name */
    public static final oj f10438w6 = a("cfadtml", 20);

    /* renamed from: x  reason: collision with root package name */
    public static final oj f10439x = a("logcat_max_line_size", 1000);

    /* renamed from: x0  reason: collision with root package name */
    public static final oj f10440x0 = a("text_alert_consent_no_option", "Cancel");

    /* renamed from: x1  reason: collision with root package name */
    public static final oj f10441x1 = a("text_incent_nonvideo_warning_title", "Attention!");

    /* renamed from: x2  reason: collision with root package name */
    public static final oj f10442x2;

    /* renamed from: x3  reason: collision with root package name */
    public static final oj f10443x3;

    /* renamed from: x4  reason: collision with root package name */
    public static final oj f10444x4;

    /* renamed from: x5  reason: collision with root package name */
    public static final oj f10445x5;

    /* renamed from: x6  reason: collision with root package name */
    public static final oj f10446x6;

    /* renamed from: y  reason: collision with root package name */
    public static final oj f10447y;

    /* renamed from: y0  reason: collision with root package name */
    public static final oj f10448y0;

    /* renamed from: y1  reason: collision with root package name */
    public static final oj f10449y1 = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");

    /* renamed from: y2  reason: collision with root package name */
    public static final oj f10450y2;

    /* renamed from: y3  reason: collision with root package name */
    public static final oj f10451y3;

    /* renamed from: y4  reason: collision with root package name */
    public static final oj f10452y4 = a("webview_package_names", "com.google.android.webview,com.android.webview");

    /* renamed from: y5  reason: collision with root package name */
    public static final oj f10453y5;

    /* renamed from: y6  reason: collision with root package name */
    public static final oj f10454y6 = a("custom_tabs_service_reconnect_delay_ms", -1L);

    /* renamed from: z  reason: collision with root package name */
    public static final oj f10455z = a("aei", -1);

    /* renamed from: z0  reason: collision with root package name */
    public static final oj f10456z0 = a("ttc_max_click_distance_dp", 10);

    /* renamed from: z1  reason: collision with root package name */
    public static final oj f10457z1 = a("text_incent_nonvideo_warning_close_option", "Close");

    /* renamed from: z2  reason: collision with root package name */
    public static final oj f10458z2 = a("mute_button_size", 32);

    /* renamed from: z3  reason: collision with root package name */
    public static final oj f10459z3;

    /* renamed from: z4  reason: collision with root package name */
    public static final oj f10460z4;

    /* renamed from: z5  reason: collision with root package name */
    public static final oj f10461z5;

    /* renamed from: z6  reason: collision with root package name */
    public static final oj f10462z6;

    /* renamed from: a  reason: collision with root package name */
    private final String f10463a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f10464b;

    static {
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        Class<Float> cls4 = Float.class;
        f10272c = Arrays.asList(new Class[]{Boolean.class, cls4, cls3, cls2, cls});
        Boolean bool = Boolean.FALSE;
        f10295f = a("is_disabled", bool);
        Boolean bool2 = Boolean.TRUE;
        f10311h = a("rss", bool2);
        f10319i = a("rssoitf", bool);
        f10327j = a("cpoitf", bool);
        f10343l = a("is_verbose_logging", bool);
        f10359n = a("error_reporter_v2", bool);
        f10415u = a("pnrc", bool);
        f10423v = a("clear_completion_callback_on_failure", bool);
        f10447y = a("exception_handler_enabled", bool2);
        C = a("bdae", bool);
        D = a("tewllm", bool2);
        E = a("tewplosda", bool2);
        F = a("srwbe", bool);
        I = a("eraziie", bool);
        K = a("lsu", bool);
        Object obj = MaxReward.DEFAULT_LABEL;
        M = a("stwr", bool);
        N = a("uactlac", bool);
        Q = a("apsobt", bool2);
        U = a("ueq", bool);
        f10258a0 = a("uaeq", bool);
        f10265b0 = a("ah_cvc", bool2);
        f10273c0 = a("ah_cdde", bool2);
        f10281d0 = a("ah_crut", bool2);
        f10288e0 = a("init_omsdk", bool2);
        f10304g0 = a("publisher_can_show_consent_dialog", bool2);
        f10320i0 = a("consent_dialog_immersive_mode_on", bool);
        f10336k0 = a("alert_consent_for_dialog_rejected", bool);
        f10344l0 = a("alert_consent_for_dialog_closed", bool);
        f10352m0 = a("alert_consent_for_dialog_closed_with_back_button", bool);
        f10360n0 = a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f10368o0 = a("alert_consent_after_init_interval_ms", Long.valueOf(timeUnit.toMillis(5)));
        f10376p0 = a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(timeUnit.toMillis(30)));
        f10384q0 = a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(timeUnit.toMillis(5)));
        f10392r0 = a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(timeUnit.toMillis(5)));
        f10400s0 = a("alert_consent_after_cancel_interval_ms", Long.valueOf(timeUnit.toMillis(10)));
        f10408t0 = a("alert_consent_reschedule_interval_ms", Long.valueOf(timeUnit.toMillis(5)));
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f10448y0 = a("ttc_max_click_duration_ms", Long.valueOf(timeUnit2.toMillis(1)));
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        A0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        B0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        C0 = a("ttc_acrsa", Integer.valueOf(clickRecognitionState.ordinal()));
        D0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        R0 = a("valid_super_property_types", cls.getName() + "," + cls3.getName() + "," + cls2.getName() + "," + Double.class.getName() + "," + cls4.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        S0 = a("persist_super_properties", bool2);
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        V0 = a("cache_file_ttl_seconds", Long.valueOf(timeUnit3.toSeconds(1)));
        Y0 = a("ad_resource_caching_enabled", bool2);
        f10274c1 = a("ccrc", bool);
        f10297f1 = a("dficf", bool);
        f10305g1 = a("dfirf", bool);
        f10313h1 = a("dfipf", bool);
        f10321i1 = a("decr", bool);
        f10329j1 = a("dcrome", bool);
        f10337k1 = a("dcrobs", bool);
        f10345l1 = a("lfeufc", bool);
        f10353m1 = a("pcro", bool);
        f10361n1 = a("efecobt", bool);
        f10369o1 = a("saewib", bool);
        f10385q1 = a("raae", bool);
        D1 = a("creative_debugger_enabled", bool2);
        E1 = a("smdfhcdb", bool2);
        F1 = a("adview_clearview", bool);
        G1 = a("ravip", bool);
        H1 = a("viewability_adview_imp_delay_ms", Long.valueOf(timeUnit2.toMillis(1)));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        K1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        L1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        R1 = a("viewability_timer_min_visible_ms", Long.valueOf(timeUnit2.toMillis(1)));
        W1 = a("expandable_lhs_close_button", bool);
        Y1 = a("iaad", bool);
        f10275c2 = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(timeUnit2.toMillis(10)));
        TimeUnit timeUnit4 = timeUnit;
        f10283d2 = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(timeUnit4.toMillis(2)));
        f10290e2 = a("lhs_close_button_video", bool);
        f10362n2 = a("draw_countdown_clock", bool2);
        f10386q2 = a("respect_close_button", bool2);
        f10394r2 = a("lhs_skip_button", bool2);
        f10402s2 = a("track_app_killed", bool);
        f10410t2 = a("app_closed_time_threshold_for_app_killed_event_ms", Long.valueOf(timeUnit2.toMillis(60)));
        f10418u2 = a("mute_controls_enabled", bool);
        f10426v2 = a("allow_user_muting", bool2);
        f10434w2 = a("mute_videos", bool);
        f10442x2 = a("show_mute_by_default", bool);
        f10450y2 = a("mute_with_user_settings", bool2);
        G2 = a("video_zero_length_as_computed", bool);
        I2 = a("fasuic", bool2);
        J2 = a("fsahrpg", bool2);
        K2 = a("eaafrwsoa", bool2);
        M2 = a("postitial_progress_bar_on_bottom", bool2);
        P2 = a("fahosu", bool);
        Q2 = a("pause_fullscreen_ad_ui_when_app_is_backgrounded", bool);
        R2 = a("forward_javascript_to_webview_video_button", bool);
        S2 = a("nsuttcl", bool);
        T2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10)));
        X2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit2.toMillis(7)));
        Y2 = a("sossp", bool);
        Z2 = a("spp", bool2);
        f10261a3 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10)));
        f10268b3 = a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30)));
        f10276c3 = a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20)));
        f10284d3 = a("force_ssl", bool);
        f10291e3 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30)));
        f10307g3 = a("faer", bool);
        f10315h3 = a("faroae", bool);
        f10339k3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10)));
        f10355m3 = a("fetch_basic_settings_on_reconnect", bool);
        f10363n3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f10371o3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2)));
        f10379p3 = a("idflrwbe", bool);
        f10387q3 = a("falawpr", bool);
        f10395r3 = a("sort_query_parameters", bool);
        f10403s3 = a("communicator_request_timeout_ms", Long.valueOf(timeUnit2.toMillis(10)));
        f10419u3 = a("communicator_request_retry_delay_ms", Long.valueOf(timeUnit2.toMillis(2)));
        f10443x3 = a("rironc", bool);
        f10451y3 = a("rroncbd", bool);
        f10459z3 = a("wverc_ms", Long.valueOf(timeUnit2.toMillis(5)));
        A3 = a("sducifm", bool);
        C3 = a("session_tracking_cooldown_on_event_fire", bool2);
        F3 = a("dc_v2", bool);
        G3 = a("dce", bool2);
        H3 = a("qq", bool);
        I3 = a("qq1", bool2);
        J3 = a("qq2", bool2);
        K3 = a("qq3", bool2);
        L3 = a("qq4", bool2);
        M3 = a("qq5", bool2);
        N3 = a("qq6", bool2);
        O3 = a("qq7", bool2);
        P3 = a("qq8", bool2);
        Q3 = a("qq9", bool);
        R3 = a("qq10", bool2);
        S3 = a("qq11", bool2);
        T3 = a("pui", bool2);
        Object obj2 = obj;
        U3 = a("plugin_version", obj2);
        V3 = a("ccbtbsic", bool);
        W3 = a("hgn", bool2);
        X3 = a("cso", bool2);
        Y3 = a("cfs", bool2);
        Z3 = a("cmi", bool2);
        f10262a4 = a("crat", bool2);
        f10269b4 = a("cvs", bool2);
        f10277c4 = a("caf", bool2);
        f10285d4 = a("cf", bool2);
        f10292e4 = a("cmtl", bool2);
        f10300f4 = a("cnr", bool2);
        f10308g4 = a("ccr", bool);
        f10316h4 = a("adr", bool2);
        f10332j4 = a("system_user_agent_collection_enabled", bool);
        f10340k4 = a("user_agent_collection_enabled", bool);
        f10348l4 = a("collect_device_angle", bool2);
        f10356m4 = a("collect_device_movement", bool2);
        f10364n4 = a("cipc", bool2);
        f10388q4 = a("idcw", bool);
        f10404s4 = a("mps", obj2);
        f10428v4 = a("cmps", bool);
        f10436w4 = a("rmps", bool);
        f10444x4 = a("collect_webview_package_info", bool);
        f10460z4 = a("collect_opengl_version", bool);
        A4 = a("ncre", bool);
        E4 = a("dcttl_3_seconds", Integer.valueOf((int) timeUnit4.toSeconds(1)));
        F4 = a("dcttl_4_seconds", Integer.valueOf((int) timeUnit4.toSeconds(30)));
        H4 = a("dcttl_6_seconds", Integer.valueOf((int) timeUnit3.toSeconds(1)));
        I4 = a("cclia", bool2);
        L4 = a("is_track_ad_info", bool2);
        M4 = a("umsm", bool);
        T4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        V4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30)));
        f10286d5 = a("vast_native_video_widgets_enabled", bool2);
        f10293e5 = a("vast_replay_video_upon_completion", bool2);
        f10309g5 = a("vcjfhr", bool);
        f10333j5 = a("ree", bool2);
        qi.a aVar = qi.a.DEFAULT;
        f10341k5 = a("ree_t", Integer.valueOf(aVar.b()));
        f10349l5 = a("btee", bool2);
        f10357m5 = a("btet", Integer.valueOf(aVar.b()));
        f10365n5 = a("reetoa", bool);
        f10373o5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        f10389q5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f10397r5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f10405s5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f10413t5 = a("reet_aset", Integer.valueOf(aVar.b()));
        f10421u5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f10429v5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f10437w5 = a("apdra", bool);
        f10445x5 = a("apdrfs", bool);
        f10453y5 = a("apdrma", bool);
        f10461z5 = a("apdrmd", bool);
        A5 = a("apdrfa", bool);
        B5 = a("apdrev", bool);
        C5 = a("apdrdi", bool);
        D5 = a("apdrrp", bool);
        H5 = a("gzip_encoding_default", bool);
        I5 = a("fetch_settings_gzip", bool);
        J5 = a("device_init_gzip", bool);
        K5 = a("fetch_ad_gzip", bool);
        L5 = a("event_tracking_gzip", bool);
        M5 = a("reward_postback_gzip", bool);
        N5 = a("handle_render_process_gone", bool2);
        O5 = a("rworpg", bool2);
        P5 = a("fdadaomr", bool2);
        Q5 = a("teorpc", bool);
        R5 = a("set_webview_render_process_client", bool);
        S5 = a("disable_webview_hardware_acceleration", bool);
        T5 = a("anr_detection_enabled", bool);
        X5 = a("uobid", bool2);
        Y5 = a("bvde", bool);
        f10294e6 = a("bvad", bool);
        f10302f6 = a("bvebb", bool2);
        f10310g6 = a("bvscb", bool2);
        f10326i6 = a("dwvvb", bool);
        f10334j6 = a("stcpc", bool2);
        f10342k6 = a("stcic", bool2);
        f10350l6 = a("clacaf", bool);
        f10358m6 = a("qjscwwvl", bool);
        f10366n6 = a("web_contents_debugging_enabled", bool);
        f10374o6 = a("fcioiauiidb", bool2);
        f10382p6 = a("teouauiidb", bool2);
        f10390q6 = a("usc", bool);
        f10398r6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        f10414t6 = a("country_code", obj);
        f10446x6 = a("enable_custom_tabs_service", bool);
        f10462z6 = a("ps_etr", bool);
        A6 = a("ps_tri_ms", Long.valueOf(timeUnit3.toMillis(7)));
        C6 = a("ps_sroftr", bool);
        D6 = a("ps_sroftrof", bool);
        E6 = a("communicator_enabled", bool2);
        F6 = a("adse", bool2);
    }

    public oj(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (obj != null) {
            this.f10463a = str;
            this.f10464b = obj;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    public static Collection c() {
        return Collections.synchronizedCollection(f10280d.values());
    }

    public Object a(Object obj) {
        return this.f10464b.getClass().cast(obj);
    }

    public String b() {
        return this.f10463a;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof oj)) {
            return 0;
        }
        return this.f10463a.compareTo(((oj) obj).b());
    }

    public Object a() {
        return this.f10464b;
    }

    protected static oj a(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f10272c.contains(obj.getClass())) {
            oj ojVar = new oj(str, obj);
            Map map = f10280d;
            if (!map.containsKey(str)) {
                map.put(str, ojVar);
                return ojVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
    }
}
