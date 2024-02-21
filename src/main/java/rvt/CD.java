package rvt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CD implements Packable{
    private String artist;
    private String CDName;
    private int year;
    private Double weight;
    
    public CD (String artist, String CDName, int year){
        this.artist = artist;
        this.CDName = CDName;
        this.year = year;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.artist + "/" + this.CDName + "/" + this.year;
    }
}
