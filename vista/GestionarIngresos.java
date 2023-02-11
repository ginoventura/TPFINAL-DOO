package ubp.doo.vista;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.InformeControlador;

public class GestionarIngresos extends javax.swing.JFrame implements InterfazVistaAbm {
    
    private static final long serialVersionUID = 1L;
    
    private final DefaultTableModel modeloTblInforme;
    private InformeControlador controlador;

    public GestionarIngresos(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ubp/doo/imgs/fire.png")).getImage());
        cmbPeriodo.setEnabled(false);
        this.modeloTblInforme = (DefaultTableModel) this.tblInforme.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDiarios = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPeriodo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblInforme = new javax.swing.JTable();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtMontoTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPromedio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbPeriodo = new javax.swing.JComboBox<>();
        btnLimpiarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Ingresos - SuperGas S.A.");
        setBackground(new java.awt.Color(46, 46, 68));
        setResizable(false);

        btnDiarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDiarios.setForeground(new java.awt.Color(255, 255, 255));
        btnDiarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/schedule.png"))); // NOI18N
        btnDiarios.setText("Generar Listado de Ingresos Diarios");
        btnDiarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiariosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zona");

        cmbZona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbZona.setForeground(new java.awt.Color(255, 255, 255));
        cmbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una zona", "TODAS LAS ZONAS", "CENTRO", "NORTE", "ESTE", "SUR", "OESTE" }));
        cmbZona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestionar Ingresos");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/ingresos2.png"))); // NOI18N

        btnPeriodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/periodo.png"))); // NOI18N
        btnPeriodo.setText("Generar Listado de Ingresos por Período");
        btnPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });

        tblInforme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro. Pedido", "Zona", "Medio Pago", "Monto Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInforme.setFocusable(false);
        jScrollPane3.setViewportView(tblInforme);

        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setDateFormatString("dd/MM/y");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha");

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Monto total de todos los pedidos:      $");

        txtMontoTotal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtMontoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoTotal.setText("0");
        txtMontoTotal.setEnabled(false);
        txtMontoTotal.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Monto total promedio:                         $");

        txtPromedio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPromedio.setForeground(new java.awt.Color(255, 255, 255));
        txtPromedio.setText("0");
        txtPromedio.setEnabled(false);
        txtPromedio.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad de pedidos:");

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setText("0");
        txtCantidad.setEnabled(false);
        txtCantidad.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Período");

        cmbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un período", "TODOS LOS PERIODOS", "VERANO", "OTOÑO", "INVIERNO", "PRIMAVERA" }));
        cmbPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/escoba.png"))); // NOI18N
        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDiarios)
                        .addGap(18, 18, 18)
                        .addComponent(btnPeriodo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiarCampos)
                                .addGap(89, 89, 89)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiarios, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCampos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiariosActionPerformed
        String fecha;
        try {                      
            switch (cmbZona.getSelectedIndex()) {
                case 0:
                    imprimeMensaje(new Exception("Seleccione una zona para la cual mostrar ingresos."));
                    break;
                case 1:
                    if (txtFecha.getDate()!=null) {
                        fecha = obtenerFecha();
                        controlador.cargarDiario(modeloTblInforme, fecha);
                        verificarFilas();
                        break;
                    } else {
                        imprimeMensaje(new Exception("Seleccione una fecha para la cual mostrar ingresos."));
                        break;
                    }
                default:
                    String zona = (String) cmbZona.getSelectedItem();
                    if (txtFecha.getDate()!=null) {
                        fecha = obtenerFecha();
                        controlador.cargarDiarioPorZona(modeloTblInforme, fecha, zona);
                        verificarFilas();
                        break;
                    } else {
                        imprimeMensaje(new Exception("Seleccione una fecha para la cual mostrar ingresos."));
                        break;
                    }
            }  
        } catch (ParseException ex) {
            Logger.getLogger(GestionarIngresos.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_btnDiariosActionPerformed

    private void btnPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoActionPerformed
        imprimeMensaje(new Exception("Lo sentimos, esta funcionalidad aún no está disponible."));
    }//GEN-LAST:event_btnPeriodoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiaVista();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnDiarios;
    public javax.swing.JButton btnLimpiarCampos;
    javax.swing.JButton btnPeriodo;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cmbPeriodo;
    public javax.swing.JComboBox<String> cmbZona;
    public javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tblInforme;
    public javax.swing.JTextField txtCantidad;
    public com.toedter.calendar.JDateChooser txtFecha;
    public javax.swing.JTextField txtMontoTotal;
    public javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
    
    public String obtenerFecha() throws ParseException {
        
        String dia = Integer.toString(txtFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(txtFecha.getCalendar().get(Calendar.MONTH)+1);
        String año = Integer.toString(txtFecha.getCalendar().get(Calendar.YEAR));
               
        String jdCfecha = (dia + "/" + mes + "/" + año);
        
        DateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat inputFormat = new SimpleDateFormat("d/MM/yyyy");
        
        Date date = inputFormat.parse(jdCfecha);
        
        String outputText = outputFormat.format(date);
            
        return outputText;
    }
    
    public void verificarFilas() {
        if(this.modeloTblInforme.getRowCount() == 0) {
            imprimeMensaje(new Exception("No existen ingresos para los filtros establecidos."));
        } else {
        int montoTot = 0, fila = 0;
        float prom = 0;
        
            for (int n = 0; n < modeloTblInforme.getRowCount(); n++) {
                fila = Integer.parseInt(modeloTblInforme.getValueAt(n, 3).toString());
                montoTot += fila;
            }
            prom = montoTot/modeloTblInforme.getRowCount();
            
            String montoTotal = Integer.toString(montoTot);
            txtMontoTotal.setText(montoTotal);
            String cantPedidos = Integer.toString(modeloTblInforme.getRowCount());
            txtCantidad.setText(cantPedidos);
            String promedio = Double.toString(prom);
            txtPromedio.setText(promedio);
        }
    }
    
    @Override
    public void actualizaTabla() {
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (InformeControlador) c;
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        if (e.length > 0) {
            JOptionPane.showMessageDialog(this, "" + e[0].getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void limpiaVista() {
        cmbZona.setSelectedIndex(0);
        txtFecha.setCalendar(null);
        txtCantidad.setText("0");
        txtMontoTotal.setText("0");
        txtPromedio.setText("0");
        for (int i = 0; i < tblInforme.getRowCount(); i++) {
            modeloTblInforme.removeRow(i);
            i-=1;
        }
    }

    public JComboBox<String> getCmbPeriodo() {
        return cmbPeriodo;
    }

    public void setCmbPeriodo(JComboBox<String> cmbPeriodo) {
        this.cmbPeriodo = cmbPeriodo;
    }

    public JComboBox<String> getCmbZona() {
        return cmbZona;
    }

    public void setCmbZona(JComboBox<String> cmbZona) {
        this.cmbZona = cmbZona;
    }

    public JTable getTblInforme() {
        return tblInforme;
    }

    public void setTblInforme(JTable tblInforme) {
        this.tblInforme = tblInforme;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
    }

    public void setTxtFecha(JDateChooser txtFecha) {
        this.txtFecha = txtFecha;
    }

    public JTextField getTxtMontoTotal() {
        return txtMontoTotal;
    }

    public void setTxtMontoTotal(JTextField txtMontoTotal) {
        this.txtMontoTotal = txtMontoTotal;
    }

    public JTextField getTxtPromedio() {
        return txtPromedio;
    }

    public void setTxtPromedio(JTextField txtPromedio) {
        this.txtPromedio = txtPromedio;
    }    
}
