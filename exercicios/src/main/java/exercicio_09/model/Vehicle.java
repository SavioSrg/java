package exercicio_09.model;

public class Vehicle {
    private Double speed = 0.0;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        if (speed == null || speed <= 0) {
            System.err.println("Erro: Valor de velocidade incompatível");
            return;
        }

        this.speed = speed;
    }

    public double speedUp(double incremento){
        setSpeed(this.speed + incremento);
        return this.speed;
    };
}
