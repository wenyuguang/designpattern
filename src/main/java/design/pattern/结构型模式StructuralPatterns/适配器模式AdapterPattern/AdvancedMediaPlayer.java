package design.pattern.结构型模式StructuralPatterns.适配器模式AdapterPattern;

public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}