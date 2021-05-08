/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.PratoPedido;

/**
 *
 * @author be_ha
 */
public class PratoPedidoTableModel extends AbstractTableModel{
    private ArrayList<PratoPedido> listaPratosPedido;

    public PratoPedidoTableModel(ArrayList<PratoPedido> listaPratoPedidos) {
        System.out.println("listaPRatoPedidos");
        System.out.println(listaPratoPedidos);
        this.listaPratosPedido = listaPratoPedidos;
    }
        
    @Override
    public int getRowCount() {
        return listaPratosPedido.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PratoPedido pratoPedido = listaPratosPedido.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return pratoPedido.getNomePrato();
            case 1: 
                return pratoPedido.getQuantidadePratoPedido();
            case 2: 
                return pratoPedido.getValorUnidadePratoPedido();
            default: 
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Nome";
            case 1 : return "Quantidade";
            case 2 : return "Preço";
            default : return "";
        }
    }
    
    public PratoPedido getPratoPedido(int row) {
        return listaPratosPedido.get(row);
    }
}
