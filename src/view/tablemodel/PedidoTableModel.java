/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Pedido;

/**
 *
 * @author be_ha
 */
public class PedidoTableModel extends AbstractTableModel{
    
    private ArrayList<Pedido> listaPedidos;

    public PedidoTableModel(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
        
    @Override
    public int getRowCount() {
        return listaPedidos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pedido pedido = listaPedidos.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return pedido.getCliente().getNomeCliente();
            case 1: 
                return pedido.getValorTotal();
            case 2: 
                return pedido.getEnderecoCliente();
            default: 
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Cliente";
            case 1 : return "Valor Total";
            case 2 : return "Endereço";
            default : return "";
        }
    }
    
    public Pedido getPedido(int row) {
        return listaPedidos.get(row);
    }
}
