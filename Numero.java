
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {

    
    public ArrayList numero; 
    public String listar;

    public Numero() { 
      numero = new ArrayList(1);        
    }
    
    //create - adicionar  
    public void salvar(String item){
        numero.add(item); 
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }
    //read - listar 
    public String listar (){ 
    String res = ""; 
        if (!numero.isEmpty()) {
        for (int i=0; i<numero.size(); i++){
         res+=(i+1) + "- "+numero.get(i)+ "\n";
        }
        }else{ 
            res = "Lista vazia!"; 
    }
        return res; 
    }
    //deletar
    public void excluir (int indice){
        if (!numero.isEmpty()){
          if (indice>0 && indice<=numero.size()) {
              numero.remove(indice-1);
          JOptionPane.showMessageDialog(null,"Excluido com sucesso!!"); 
        }else{
            JOptionPane.showMessageDialog(null,"Código não existe!!"); 
        }
        }else{  
            JOptionPane.showMessageDialog(null,"Impossível excluir a lista vazia!");
        }
    }
    
    public void alterar (int indice, String elemento){
         if (!numero.isEmpty()){
          if (indice>0 && indice<=numero.size()) {
              numero.set(indice-1, elemento);
         JOptionPane.showMessageDialog(null,"Alterado com sucesso!!"); 
    }else{
          JOptionPane.showMessageDialog(null,"Código não existe!!");
        }
        }else{  
            JOptionPane.showMessageDialog(null,"Impossível alterar a lista vazia!");
        }    
    }

    
    public double calcularMedia() {
        if (numero.size() == 0) { 
            return 0; 
        }
        double soma = 0;
        for (Object valor : numero) {
            soma += Double.parseDouble((String) valor); 
        }
        return soma / numero.size();
    
    }
    
    public int encontrarMenor() {
        if (numero.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        int menor = (int) numero.get(0);
        for (Object numero : numero) { 
        }
        return menor;
    }
    
    public int encontrarMaior() {
        if (numero.isEmpty()) {
            throw new IllegalStateException("A lista está vazia");
        }
        int menor = (int) numero.get(0);
        for (Object numero : numero) { 
        }
        return menor; 
    }
}
