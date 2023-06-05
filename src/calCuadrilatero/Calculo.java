
package calCuadrilatero;

public class Calculo {
    
    //Atributo 
    private float lado1;
    
    private float lado2;
    
    //Metodos
    
    public Calculo(float lado1, float _lado2){
        this.lado1 =lado1;
        lado2 =_lado2;
    }
    
    public Calculo (float lado1){
        this.lado1=this.lado2= lado1;
    }
    
    public float getArea(){
        float area= (lado1*lado2);
        return area;
    }
    public float getPerimetro(){
        float perimetro = (lado1+lado2)*4;
        return perimetro;
    }
    
}
