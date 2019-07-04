package org.ting.pattern.adapter.entity;

import org.ting.pattern.adapter.inter.AdvancedMediaPlayer;

/**
 * vlc播放器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:12
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}
