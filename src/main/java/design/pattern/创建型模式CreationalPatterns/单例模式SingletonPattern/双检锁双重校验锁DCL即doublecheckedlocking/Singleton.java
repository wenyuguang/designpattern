package design.pattern.创建型模式CreationalPatterns.单例模式SingletonPattern.双检锁双重校验锁DCL即doublecheckedlocking;

/**
 * JDK 版本：JDK1.5 起<p>
 是否 Lazy 初始化：是<p>
 是否多线程安全：是<p>
 实现难度：较复杂<p>
 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。<p>
 getInstance() 的性能对应用程序很关键。
 */
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}