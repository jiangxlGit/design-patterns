package com.jiang.designpatterns.adapter;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 13:31
 * @Description:
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc audio file " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        return;
    }
}
