import java.util.Scanner;

public class Folhapagamento {
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);   
    
    //variaveis    
    
    double horas;
    double valorhora;
    double salariobruto;
    double inss;
    double IR;
    double fgts;
    double totaldedescontos;
    double salarioliquido;
    
    //desenvolvimento 
    
        System.out.println("Digite as horas trabalhadas:");
        horas = input.nextDouble();
        System.out.println("Digite o valor das horas trabalhados:");
        valorhora = input.nextDouble();
        salariobruto = horas * valorhora;
        
        
        
        if (salariobruto <= 900){
            System.out.println("não terá descontos"); 
            
        } else if (salariobruto <= 1500 ) {
            IR = (salariobruto / 100) * 5;
            inss = (salariobruto / 100) * 10;
            fgts = (salariobruto / 100) * 11;
            totaldedescontos = IR + inss; 
            salarioliquido = (salariobruto - IR) - inss; 
            
            //menu final
        System.out.println("Salario bruto:" + salariobruto);        
        System.out.println("IR:" + IR);
        System.out.println("inss:" + inss);
        System.out.println("fgts:" + fgts);
        System.out.println("total de descontos:" + totaldedescontos);
        System.out.println("salário liquido:" + salarioliquido);
       
        } else if (salariobruto  <= 2500 ) {
            IR = (salariobruto / 100) * 10;
            inss = (salariobruto / 100) * 10;
            fgts = (salariobruto / 100) * 11;
            totaldedescontos = IR + inss; 
            salarioliquido = (salariobruto - IR) - inss; 
           
            //menu final
        System.out.println("Salario bruto:" + salariobruto);        
        System.out.println("IR:" + IR);
        System.out.println("inss:" + inss);
        System.out.println("fgts:" + fgts);
        System.out.println("total de descontos:" + totaldedescontos);
        System.out.println("salário liquido:" + salarioliquido);
            
        } else if (salariobruto > 2500 ) {
            IR = (salariobruto / 100) * 20;
            inss = (salariobruto / 100) * 10;
            fgts = (salariobruto / 100) * 11;
            totaldedescontos = IR + inss; 
            salarioliquido = (salariobruto - IR) - inss;                                                                                                                                
        
        //menu final
        System.out.println("Salario bruto:" + salariobruto);        
        System.out.println("IR:" + IR);
        System.out.println("inss:" + inss);
        System.out.println("fgts:" + fgts);
        System.out.println("total de descontos:" + totaldedescontos);
        System.out.println("salário liquido:" + salarioliquido);
        
        
        
        
        
            
            
        
    }
    
}
}
