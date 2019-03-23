package com.jiang.designpatterns.adapter;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 13:31
 * @Description:
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        return;
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 audio file " + fileName);
    }
}
