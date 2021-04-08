/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelDominio.Empresa;
import modelDominio.Usuario;

/**
 *
 * @author be_ha
 */
public class ConexaoController {
    
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int idUnico;

    public ConexaoController(ObjectOutputStream out, ObjectInputStream in, int idUnico) {
        this.out = out;
        this.in = in;
        this.idUnico = idUnico;
    }
    
    /* Empresa */
    
    public Boolean empresaInserir(Empresa empresa) {
        String msg = "";
        try{
            out.writeObject("EmpresaInserir");
            msg = (String) in.readObject();
            out.writeObject(empresa);
            msg = (String) in.readObject(); 
            if (msg.equals("ok")) {
                return true;
            } else {
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public Boolean empresaEsiste(Empresa empresa) {
        String msg = "";
        try {
            out.writeObject("EmpresaExiste");
            msg = (String) in.readObject();
            out.writeObject(empresa);
            boolean existe = (boolean) in.readObject();
            
            return existe;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public Empresa efetuarLogin(Empresa empresa) {
        String msg = "";
        try{
            out.writeObject("EmpresaEfetuarLogin");
            msg = (String) in.readObject();
            
            out.writeObject(empresa);
            return (Empresa) in.readObject(); 
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    /* Usuario */
    
    public Boolean usuarioInserir(Usuario usr) {
        String msg = "";
        try {
            out.writeObject("UsuarioInserir");
            msg = (String) in.readObject();
            out.writeObject(usr);
            msg = (String) in.readObject();
            return msg.equals("ok");
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public Usuario buscarUsuario(Usuario usr) {
        String msg;
        try {
            out.writeObject("UsuarioEfetuarLogin");
            msg = (String) in.readObject();
            
            out.writeObject(usr);
            Usuario usrselecionado = (Usuario) in.readObject();
            return usrselecionado;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
