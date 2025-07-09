package train.bo.train;

import java.util.List;

import train.bo.Voyage;

public interface ITrain {

    String getDescription();

    public List<Voyage> getVoyages();

    public String getNumero();

}
