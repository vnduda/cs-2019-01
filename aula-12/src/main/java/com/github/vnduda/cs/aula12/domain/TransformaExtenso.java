package com.github.vnduda.cs.aula12.domain;

public class TransformaExtenso {

    private String unidade, dezena, centena, numeroUnico;

    public void escreveUnidade(int unidade){
        switch (unidade){
            case 0: this.unidade = " "; break;
            case 1: this.unidade = " um"; break;
            case 2: this.unidade = " dois"; break;
            case 3: this.unidade = " três"; break;
            case 4: this.unidade = " quatro"; break;
            case 5: this.unidade = " cinco"; break;
            case 6: this.unidade = " seis"; break;
            case 7: this.unidade = " sete"; break;
            case 8: this.unidade = " oito"; break;
            case 9: this.unidade = " nove"; break;
            
        }
    }
    
    public void escreveNumeroUnico(int numeroUnico){
        switch(numeroUnico){
            case 1: this.numeroUnico = " onze"; break;
            case 2: this.numeroUnico = " doze"; break;
            case 3: this.numeroUnico = " treze"; break;
            case 4: this.numeroUnico = " quatorze"; break;
            case 5: this.numeroUnico = " quinze"; break;
            case 6: this.numeroUnico = " dezesseis"; break;
            case 7: this.numeroUnico = " dezesete"; break;
            case 8: this.numeroUnico = " dezoito"; break;
            case 9: this.numeroUnico = " dezenove"; break;			
        }
    }
    
    public void escreveDezena(int dezena){
        switch (dezena){
            case 1: this.dezena = " dez"; break;
            case 2: this.dezena = " vinte"; break;
            case 3: this.dezena = " trinta"; break;
            case 4: this.dezena = " quarenta"; break;
            case 5: this.dezena = " cinquenta"; break;
            case 6: this.dezena = " sessenta"; break;
            case 7: this.dezena = " setenta"; break;
            case 8: this.dezena = " oitenta"; break;
            case 9: this.dezena = " noventa"; break;
        }
    }
    
    public void escreveCentena(int centena){
        switch(centena){
            case 1: this.centena = " cento"; break;
            case 2: this.centena = " duzentos"; break;
            case 3: this.centena = " trezentos"; break;
            case 4: this.centena = " quatrocentos"; break;
            case 5: this.centena = " quinhentos"; break;
            case 6: this.centena = " seissentos"; break;
            case 7: this.centena = " setecentos"; break;
            case 8: this.centena = " oitocentos"; break;
            case 9: this.centena = " novecentos"; break;
        }
    }
    
    public void recuperaString(int a){
            if(a == 0){
                JOptionPane.showMessageDialog(null, "Zero.");
            }
            else if(a < 10){
                escreveUnidade(a);
                JOptionPane.showMessageDialog(null, "Número = " + unidade);
            }
            else if(a < 20){
                int num = a % 10;
                escreveNumeroUnico(num);
                JOptionPane.showMessageDialog(null, "Número = " + numeroUnico);
            }
            else if (a < 100){
                int u = a % 10;
                int d = a / 10;
                String num;
                if (d == 1){
                    escreveNumeroUnico(u);
                    num = this.numeroUnico;
                }
                else{
                    escreveDezena(d);
                    escreveUnidade(u);
                    num = this.dezena + this.unidade;
                }
                
                JOptionPane.showMessageDialog(null, "Número = " + num);			
            }
            else if(a < 1000){
                int u = a % 10;
                int d = (a / 10) % 10;
                int c = (a / 10) / 10;
                String num;
                if (d == 1){
                    escreveCentena(c);
                    escreveNumeroUnico(u);
                    num = this.centena + " e" + this.numeroUnico;
                }
                else if (d==0){
                    escreveCentena(c);
                    num = this.centena;
                }
                else{
                    escreveCentena(c);
                    escreveDezena(d);
                    escreveUnidade(u);
                    num = this.centena + " e" + this.dezena + this.unidade;
                }
                
                JOptionPane.showMessageDialog(null, "Número = " + num);
            }
            else if(a == 1000){
                JOptionPane.showMessageDialog(null, "Mil.");
            }
    }
}