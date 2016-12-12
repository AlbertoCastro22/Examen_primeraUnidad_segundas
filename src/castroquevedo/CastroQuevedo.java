/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castroquevedo;

/**
 *
 * @author Usersone
 */
public class CastroQuevedo<T> {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      
        Lista<Integer> miLista=new Lista<Integer>();
         Lista<Integer> miLista2=new Lista<Integer>();
        miLista.AgregarInicio(1);
        miLista.AgregarInicio(1);
        miLista.AgregarInicio(1);
        miLista.AgregarInicio(1);
        miLista.AgregarInicio(1);
        System.out.println(miLista);
        
        
        miLista.detectaLopp(miLista.getInicio());
        
        miLista2.InsertarFinal(1);
        miLista2.AgregarInicio(2);
        miLista2.AgregarInicio(3);
        miLista2.AgregarInicio(3);
       
        Nodo<Integer> aux = null;
        aux = miLista2.getInicio();
         System.out.println(miLista2);
        while(aux.getSiguiente()!= null){    
        
            aux = aux.getSiguiente();
         
        
       
      
         miLista2.detectaLopp(aux);
      
           aux.setSiguiente(miLista2.getInicio());
        break;
        }
        
         
       
        
     
      
       
        
        
    }
    
}
