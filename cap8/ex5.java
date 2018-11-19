package cap8;

public class ex5 {

    public double compute(double value,double factor){
        assert factor!=0.0: "o valor de factor é zero";
        return (value*value)/factor;
    }

}
