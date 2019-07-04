package org.ting.pattern.adapter.media;

import org.ting.pattern.adapter.inter.MediaPlayer;

/**
 * 实现了MediaPlayer接口的实体类
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:21
 **/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file.Name:" + fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
        || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else {
            System.out.println("Invalid media." + audioType + " format not supported");
        }
    }
}
