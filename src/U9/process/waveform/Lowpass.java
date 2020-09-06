package U9.process.waveform;

public class Lowpass extends Filter {
    double cutoff;
    public Lowpass(double cutoff){this.cutoff = cutoff;}
    public Waveform process(Waveform input){
        return input;
    }

}
