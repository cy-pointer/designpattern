package org.ting.pattern.adapter.inter;

/**
 * 高级媒体播放器
 *
 * @author 张韧炼
 * @create 2019-07-04 下午2:10
 **/
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
