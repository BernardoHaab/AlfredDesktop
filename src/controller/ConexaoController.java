/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelDominio.Avaliacao;
import modelDominio.Categoria;
import modelDominio.Cidade;
import modelDominio.Empresa;
import modelDominio.Estado;
import modelDominio.Pedido;
import modelDominio.Prato;
import modelDominio.PratoPedido;
import modelDominio.Usuario;

/**
 *
 * @author be_ha
 */
public class ConexaoController {
    
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private int idUnico;
    public Empresa empresa;

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
            if (msg.equals("ok")) {
                out.writeObject(empresa);
                msg = (String) in.readObject();
                return msg.equals("ok");
            } else {
                throw new Exception("Erro ao inserir empresa");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public Boolean empresaExiste(Empresa empresa) {
        String msg = "";
        try {
            out.writeObject("EmpresaExiste");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa);
                return (boolean) in.readObject();
            } else {
                throw new Exception("Erro ao testar se empresa existe");
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    //Mudar pare o efetuarLogin
    public Empresa efetuarLogin(Usuario usuario) {
        String msg = "";
        try{
            out.writeObject("EmpresaEfetuarLogin");
            msg = (String) in.readObject();
            System.out.println("msg = " + msg);
            if (msg.equals("ok")) {
                out.writeObject(usuario);
                return (Empresa) in.readObject(); 
            } else {
                throw new Exception("Erro ao efetuar login Empresa");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public String empresaAlterar(Empresa empresa) {
        String msg = "";
        try{
            out.writeObject("EmpresaAlterar");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(empresa);
                msg = (String) in.readObject();
                return msg;
            } else {
                throw new Exception("Erro ao inserir empresa");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public String abrirFecharempresa(Empresa empresa) {
        String msg = "";
        try{
            out.writeObject("AbrirFecharempresa");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(empresa);
                msg = (String) in.readObject();
                return msg;
            } else {
                throw new Exception("Erro ao abrir/fechar empresa");
            }
            
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
            
            if (msg.equals("ok")) {
                out.writeObject(usr);
                msg = (String) in.readObject();
                return msg.equals("ok");
            } else {
                throw new Exception("Erro ao inserir Usuario");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public Usuario buscarUsuario(Usuario usr) {
        String msg;
        try {
            out.writeObject("BuscarUsuario");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(usr);
                return (Usuario) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista Usuario");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String usuarioAlterar(Usuario usr) {
        String msg = "";
        try{
            out.writeObject("UsuarioAlterar");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(usr);
                msg = (String) in.readObject();
                return msg;
            } else {
                throw new Exception("Erro ao inserir empresa");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public double buscarPrecoMedioEmpresa() {
        String msg;
        try {
            out.writeObject("BuscarPrecoMedioEmpresa");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa.getCodEmpresa());
                return (double) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista Usuario");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    /* Categoria */
    
    public ArrayList<Categoria> categoriaLista() {
        String msg;
        try {
            out.writeObject("CategoriaLista");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                return (ArrayList<Categoria>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Categorias");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /* Cidade */
    
    public ArrayList<Cidade> getListaCidadesEstado(Estado est) {
        String msg;
        try {
            out.writeObject("ListaCidadesEstado");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(est);
                return (ArrayList<Cidade>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Cidades");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public Cidade buscarCidade(Cidade cid) {
        String msg;
        try {
            out.writeObject("BuscarCidade");
            msg = (String) in.readObject();
            System.out.println("msg= " + msg);
            if (msg.equals("ok")) {
                out.writeObject(cid);
                return (Cidade) in.readObject();
            } else {
                throw new Exception("Erro ao buscar Cidade");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /* Estado */
    
    public ArrayList<Estado> getListaEstados() {
        String msg;
        try {
            out.writeObject("ListaEstados");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                return (ArrayList<Estado>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de getListaEstados");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /* Prato */
    
    public Boolean pratoInserir(Prato prato) {
        String msg = "";
        try{
            out.writeObject("PratoInserir");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(prato);
                msg = (String) in.readObject();
                return msg.equals("ok");
            } else {
                throw new Exception("Erro ao inserir prato");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    public ArrayList<Prato> pratoListaEmpresa(int codEmp) {
        String msg;
        try {
            out.writeObject("PratoListaEmpresa");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(codEmp);
                return (ArrayList<Prato>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Pratos");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Prato> pratoListaEmpresaNome(int codEmp, String nomeEmpresa) {
        String msg;
        try {
            out.writeObject("PratoListaEmpresaNome");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(codEmp);
                out.writeObject(nomeEmpresa);
                return (ArrayList<Prato>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Pratos");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Boolean pratoAlterar(Prato prato) {
        String msg = "";
        try{
            out.writeObject("PratoAlterar");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(prato);
                msg = (String) in.readObject();
                return msg.equals("ok");
            } else {
                throw new Exception("Erro ao inserir prato");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
        
    /* Avaliações */
    
    public ArrayList<Avaliacao> listaAvaliacoesEmpresa() {
        String msg;
        try {
            out.writeObject("ListaAvaliacoesEmpresa");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa.getCodEmpresa());
                return (ArrayList<Avaliacao>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Categorias");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /* Pedido */
    
    public ArrayList<Pedido> listaPedidosAnalise() {
        String msg;
        try {
            out.writeObject("PedidoEmpresaAnaliseLista");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa.getCodEmpresa());
                return (ArrayList<Pedido>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Pedidos em analise");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Pedido> listaPedidosAprovados() {
        String msg;
        try {
            out.writeObject("PedidoEmpresaAprovadoLista");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa.getCodEmpresa());
                return (ArrayList<Pedido>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Pedidos aprovados");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Pedido> listaPedidosReprovados() {
        String msg;
        try {
            out.writeObject("PedidoEmpresaReprovadoLista");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(empresa.getCodEmpresa());
                return (ArrayList<Pedido>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de Pedidos reprovados");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String pedidoAlterar(Pedido pedido) {
        String msg = "";
        try{
            out.writeObject("PedidoAlterar");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(pedido);
                msg = (String) in.readObject();
                return msg;
            } else {
                throw new Exception("Erro ao inserir empresa");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    /* PratoPedido */
    
    public ArrayList<PratoPedido> listaPratosPedido(int codPedido) {
        String msg;
        try {
            out.writeObject("ListaPratosPedido");
            msg = (String) in.readObject();
            
            if (msg.equals("ok")) {
                out.writeObject(codPedido);
                out.writeObject(empresa.getCodEmpresa());
                return (ArrayList<PratoPedido>) in.readObject();
            } else {
                throw new Exception("Erro ao buscar lista de PratosPedido");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String RecuperarSenha(String email) {
        String msg = "";
        try{
            out.writeObject("RecuperarSenha");
            msg = (String) in.readObject();
            if (msg.equals("ok")) {
                out.writeObject(email);
                msg = (String) in.readObject();
                return msg;
            } else {
                throw new Exception("Erro ao recuperar senha");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }  
    }
    
    /* FIM */
    
    public void fim(){
         String msg;
        try{
            out.writeObject("fim");
            in.close();
            out.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
     }
}
