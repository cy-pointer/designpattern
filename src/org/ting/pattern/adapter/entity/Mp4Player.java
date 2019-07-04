package org.ting.pattern.adapter.entity;

import org.ting.pattern.adapter.inter.AdvancedMediaPlayer;

/**
 * Mp4播放器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:13
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // 什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:" + fileName);
    }
}
