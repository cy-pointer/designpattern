package org.ting.pattern.adapter;

import org.ting.pattern.adapter.media.AudioPlayer;

/**
 * 使用AudioPlayer来播放不同类型的音频格式
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:27
 **/
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mid me.avi");
    }
}
