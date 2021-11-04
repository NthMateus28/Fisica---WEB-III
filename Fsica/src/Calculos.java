import java.lang.Math;

public class Calculos {
    
    public float forcaPeco(float n1, float n2){
        return n1 * n2;
    }

    public float forcaCentripeta(float n1, float n2, float n3){
        return (float) (n1 * (Math.pow(n2,2)/n3));
    }

    public float impulso(float n1, float n2){
        return n1 * n2;
    }

        public float ForcaElastica(float n1, float n2){
            return n1 * n2;
    }

    public float velocidadeMedia(float n1, float n2, float n3, float n4){
        return (n1 - n2) / (n3 - n4);
    }

    public float mru(float n1, float n2){
        return n1 / n2;
}

public float mruv(float n1, float n2, float n3){
    return n1 + n2 * n3;
}
}
