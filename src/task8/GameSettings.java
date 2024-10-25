package task8;

import java.io.Serializable;

public class GameSettings implements Serializable {
    private static final long serialVersionUID = 1L;

    private String playerName;
    private int volume;
    private boolean fullscreen;

    public GameSettings(String playerName, int volume, boolean fullscreen) {
        this.playerName = playerName;
        this.volume = volume;
        this.fullscreen = fullscreen;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    @Override
    public String toString() {
        return "GameSettings{" +
                "playerName=\"" + playerName + "\"" + // Исправлено здесь
                ", volume=" + volume +
                ", fullscreen=" + fullscreen +
                '}';
    }
}
