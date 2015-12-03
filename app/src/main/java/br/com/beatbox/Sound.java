package br.com.beatbox;

/**
 * Created by mauro on 10/11/15.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String path){
        mAssetPath = path;
        String[] components = path.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
