package com.unity3d.services.core.device.reader;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;

public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID randomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(randomUUID.getMostSignificantBits()) + Long.toString(randomUUID.getLeastSignificantBits())).replace("-", MaxReward.DEFAULT_LABEL).substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                if (_instance == null) {
                    _instance = new GameSessionIdReader();
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (StorageManager.init(ClientProperties.getApplicationContext()) && (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) != null) {
            storage.set(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
            storage.writeStorage();
        }
    }

    public synchronized Long getGameSessionId() {
        if (this.gameSessionId == null) {
            generate();
        }
        return this.gameSessionId;
    }

    public synchronized Long getGameSessionIdAndStore() {
        if (this.gameSessionId == null) {
            generate();
            store();
        }
        return this.gameSessionId;
    }
}
