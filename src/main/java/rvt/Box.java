package rvt;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box {
    private double Maxcap;
    ArrayList<Packable> BList = new ArrayList<>();

    public Box(double Maxcap) {
        this.Maxcap = Maxcap;
    }

    public void add(Packable packable){
        BList.add(packable);
    }

    
}
