/*
 *   The Flexible Modelling Framework is a Social Science application for 
 *   synthesising individual level populations
 *   Copyright (C) 2013  Kirk Harland
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Contact email: k.harland@leeds.ac.uk
 */

package uk.ac.leeds.mass.fmf.data_management;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import uk.ac.leeds.mass.fmf.shared_objects.FMFTable;

/**
 *
 * @author  Kirk Harland k.harland98@leeds.ac.uk
 */
public class TableView extends javax.swing.JPanel implements TableModelListener{


    private TableModel model;

    /** Creates new form TableView */
    private TableView() {
        initComponents();
    }
    
    public TableView(FMFTable table){
        model = new TableModel(table);

        model.addTableModelListener(this);
        initComponents();
        dataView.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        
        this.lblRows.setText( "Rows: " + Integer.toString( model.getRowCount() ) );
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TablePopup = new javax.swing.JPopupMenu();
        addRow = new javax.swing.JMenuItem();
        deleteRow = new javax.swing.JMenuItem();
        tableScrollPane = new javax.swing.JScrollPane();
        dataView = new javax.swing.JTable();
        lblRows = new javax.swing.JLabel();

        addRow.setText("add row");
        addRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowActionPerformed(evt);
            }
        });
        TablePopup.add(addRow);

        deleteRow.setText("Delete row");
        deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowActionPerformed(evt);
            }
        });
        deleteRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteRowMousePressed(evt);
            }
        });
        TablePopup.add(deleteRow);

        tableScrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableScrollPaneMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableScrollPaneMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableScrollPaneMouseReleased(evt);
            }
        });

        dataView.setModel(model);
        dataView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataViewMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dataViewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dataViewMouseReleased(evt);
            }
        });
        tableScrollPane.setViewportView(dataView);

        lblRows.setText("Rows: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblRows, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRows))
        );
    }// </editor-fold>//GEN-END:initComponents

private void tableScrollPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableScrollPaneMouseClicked

}//GEN-LAST:event_tableScrollPaneMouseClicked

private void addRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowActionPerformed
    model.addRow();
}//GEN-LAST:event_addRowActionPerformed

private void dataViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataViewMouseClicked

}//GEN-LAST:event_dataViewMouseClicked

private void dataViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataViewMousePressed
    if (evt.isPopupTrigger()){
        TablePopup.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}//GEN-LAST:event_dataViewMousePressed

private void dataViewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataViewMouseReleased
    if (evt.isPopupTrigger()){
        TablePopup.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}//GEN-LAST:event_dataViewMouseReleased

private void tableScrollPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableScrollPaneMousePressed
    if (evt.isPopupTrigger()){
        TablePopup.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}//GEN-LAST:event_tableScrollPaneMousePressed

private void tableScrollPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableScrollPaneMouseReleased
    if (evt.isPopupTrigger()){
        TablePopup.show(evt.getComponent(), evt.getX(), evt.getY());
    }
}//GEN-LAST:event_tableScrollPaneMouseReleased

private void deleteRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteRowMousePressed
    // TODO add your handling code here:
}//GEN-LAST:event_deleteRowMousePressed

private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
    int[] rows = dataView.getSelectedRows();
    for (int i = 0; i < rows.length; i++) {
        model.deleteRow(rows[i]);
    }
}//GEN-LAST:event_deleteRowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu TablePopup;
    private javax.swing.JMenuItem addRow;
    private javax.swing.JTable dataView;
    private javax.swing.JMenuItem deleteRow;
    private javax.swing.JLabel lblRows;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        lblRows.setText( Integer.toString(model.getRowCount()) );
    }



}
