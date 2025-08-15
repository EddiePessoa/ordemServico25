
package jdbc;

import javax.swing.JOptionPane;

public class TesteConexao {
    public static void main(String[] args){
        try{
            ModuloConexao.conectar();
            System.out.println();
        
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: "+ erro);
        }
                
    }
    
    
}
