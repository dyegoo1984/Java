package calculadora_construcao;

import java.util.Scanner;
public class Calculadora_construcao {
    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          
          float m2CasaEucalipto = 1000;
          float m2CasaCedro = 1500;
          float m2CasaAlvenaria = 2000;
          float m2SobradoEucalipto = 1300;
          float m2SobradoCedro = 1800;
          float m2SobradoAlvenaria = 2300;
          float sanitario = 5000;
          float lavanderia = 5000;
          float escadaMadeira = 3000;
          float escadaAlvenaria = 5000;
          
          int area, numSanitario, numLavanderia, tipoConstrucao, tipoMaterial;
          float custoFinal;
          
        do{          
            System.out.print(
                    "           <<< Orçamento >>>\n"+
                    "\n"+
                    "*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n"+
                    "||-Escolha o tipo de construção: \n"+
                    "||     (1) Casa \n"+
                    "||     (2) Sobrado\n"+
                    "||> "
                    );
                    tipoConstrucao = entrada.nextInt();
          
                if(tipoConstrucao == 1){
                    System.out.print(
                    "||-Escolha o tipo de Material: \n"+
                    "||     (1) Eucalipto \n"+
                    "||     (2) Cedro \n"+
                    "||     (3) Alvenaria\n"+
                    "||> "
                    );                  
                    tipoMaterial = entrada.nextInt();
                    
                    switch(tipoMaterial){
                        case 1:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            custoFinal = area*m2CasaEucalipto + numSanitario*sanitario + numLavanderia*lavanderia;
                            System.out.println("||-Casa em Eucalipito R$"+custoFinal);
                            break;
                        case 2:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            
                            custoFinal = area*m2CasaCedro + numSanitario*sanitario + numLavanderia*lavanderia;
                            System.out.println("||-Casa em Cedro R$"+custoFinal);
                            break;
                            
                        case 3:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            
                            custoFinal = area*m2CasaAlvenaria + numSanitario*sanitario + numLavanderia*lavanderia;
                            System.out.println("||-Casa em Alvenaria R$"+custoFinal);
                            break;
                    }
                
                }
                else if(tipoConstrucao == 2){
                    System.out.print(
                    "||-Escolha o tipo de Material: \n"+
                    "||     (1) Eucalipto \n"+
                    "||     (2) Cedro \n"+
                    "||     (3) Alvenaria\n"+
                    "||> "
                    );
                    tipoMaterial = entrada.nextInt();
                    switch(tipoMaterial){
                        case 1:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            custoFinal = area*m2SobradoEucalipto + numSanitario*sanitario + numLavanderia*lavanderia + escadaMadeira;
                            System.out.println("||-Sobrado em Eucalipito R$"+custoFinal);
                            break;
                        case 2:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            
                            custoFinal = area*m2SobradoCedro + numSanitario*sanitario + numLavanderia*lavanderia + escadaMadeira;
                            System.out.println("||-Sobrado em Cedro R$"+custoFinal);
                            break;
                        case 3:
                            System.out.print(
                            "||-Digite a área da construção(m2): ");
                            area = entrada.nextInt();
                            System.out.print("||-Digite a quantidade de sanitários: ");
                            numSanitario = entrada.nextInt();
                            System.out.print("||-Possui lavanderia? (1-Sim || 0-não): ");
                            numLavanderia = entrada.nextInt();
                            
                            custoFinal = area*m2SobradoAlvenaria + numSanitario*sanitario + numLavanderia*lavanderia + escadaAlvenaria;
                            System.out.println("||-Sobrado em Alvenaria R$"+custoFinal);
                            break;
                    }
                }
                else{
                    System.out.println("  ***Opção Inválida!***   ");
                }
        }
        while(tipoConstrucao != 1 && tipoConstrucao != 2); 
    }
    
}
