package harvardMIT;

/*Harvard-MIT Math Tournament 2018/2019 
Compute the smallest positive integer n for which 
√(100 + √n) + √(100 - √n) is an integer.*/

public class HarvardMIT {

    public static void main(String[] args) {
        
        double resultado;
        double resto;
        boolean valida = false;
        int k = 1;
        
    do{
        //Calculo da soma das raizes 
        resultado = Math.sqrt((100 + Math.sqrt(k))) + Math.sqrt((100 - Math.sqrt(k)));
        //Verifica se o resto da divisão do resultado por 1 é 0, se for 0 o resultado é um númeor inteiro
        resto = (resultado % 1);
        
        
        if(resto == 0){
        //Imprime o valor na tela juntamente com o resultado 
        System.out.println("Menor valor possivel e " + k + " que tem como resultado " + (int)resultado ); 
        //Valida resve true para encerrar a repetição
        valida = true;
        } 
        //Incrementa 1 a K para repetição do laço
        k++;
    }while(valida != true);
}
}
