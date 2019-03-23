package com.jiang.designpatterns.adapter;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 13:25
 * @Description:
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType, String fileName) {
        if ("mp3".equalsIgnoreCase(mediaType)) {
            System.out.println("play mp3 audio file " + fileName);
        } else if ("vlc".equalsIgnoreCase(mediaType) || "mp4".equalsIgnoreCase(mediaType)) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }

    }
}
