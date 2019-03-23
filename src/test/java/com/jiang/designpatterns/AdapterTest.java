package com.jiang.designpatterns;

import com.jiang.designpatterns.adapter.AudioPlayer;
import com.jiang.designpatterns.adapter.MediaPlayer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @Auther: jiangxl
 * @Date: 2019/3/20 14:29
 * @Description:
 */
@RunWith(JUnit4.class)
public class AdapterTest {

    @Before
    public void before() {
        System.out.println("准备测试......");
    }

    @Test
    public void testA() {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "往后余生.mp3");

        mediaPlayer.play("mp4", "追光者.mp4");

        mediaPlayer.play("vlc", "成都.vlc");

        mediaPlayer.play("avi", "当真.avi");
    }

    @After
    public void after() {
        System.out.println("测试完成！！！");
    }

}
