package com.jiang.designpatterns.adapter;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 14:01
 * @Description:
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if ("vlc".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if ("vlc".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
