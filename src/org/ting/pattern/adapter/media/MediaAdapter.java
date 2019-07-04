package org.ting.pattern.adapter.media;

import org.ting.pattern.adapter.entity.Mp4Player;
import org.ting.pattern.adapter.entity.VlcPlayer;
import org.ting.pattern.adapter.inter.AdvancedMediaPlayer;
import org.ting.pattern.adapter.inter.MediaPlayer;

/**
 * 实现MediaPlayer接口的媒体播放器适配器类
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:15
 **/
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer=new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
