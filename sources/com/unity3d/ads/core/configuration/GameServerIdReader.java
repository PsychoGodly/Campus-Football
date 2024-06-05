package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: GameServerIdReader.kt */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion((h) null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* compiled from: GameServerIdReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        m.e(jsonStorage, "jsonStorage");
    }
}
