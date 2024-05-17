package Exercicio1;


public class Progressões {
    public double a = 1;
    public double b;
    public double c;
    private int quantidade;

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }
    public void Progressão(int quantidade, double a){
        if (quantidade <= 0){
            System.out.println("a quantidade de vezes da progressão não foi definida");
        }else{
            System.out.println("inciando progressão aritimética");
            for (int i = 0;i<quantidade; i++ ){
                c = a + b;
                System.out.println(i+" A:"+a+" + B:"+b+" = C:"+c);
                b += 1;
                

            }
        }
    }
}