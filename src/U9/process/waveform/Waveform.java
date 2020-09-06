package U9.process.waveform;
//为啥要拿滤波器举例子，搞不懂。
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "waveform " + id;}
}
