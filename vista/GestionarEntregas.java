package ubp.doo.vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.EntregaControlador;
import ubp.doo.dao.EntregaDaoImp;

public class GestionarEntregas extends javax.swing.JFrame implements InterfazVistaAbm {

    private static final long serialVersionUID = 1L;
    
    private final DefaultTableModel modeloTblEntregas;
    private final DefaultTableModel modeloTblDetalle;
    private EntregaControlador controlador;
    
    public GestionarEntregas(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ubp/doo/imgs/fire.png")).getImage());
    
        this.modeloTblEntregas = (DefaultTableModel) this.tblEntregas.getModel();
        this.modeloTblDetalle = (DefaultTableModel) this.tblDetalle.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEntregas = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnTodasEntregas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cmbZona = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnConfirmarEntrega = new javax.swing.JButton();
        btnPosponerEntrega = new javax.swing.JButton();
        btnGenerarListo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnPedidosPendientes = new javax.swing.JButton();
        btnPedidosListos = new javax.swing.JButton();
        btnPedidosEntregados = new javax.swing.JButton();
        btnImprimirFactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Entregas - SuperGas S.A.");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(46, 46, 68));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gestionar Entregas");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/enviado2.png"))); // NOI18N

        tblEntregas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblEntregas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro. Pedido", "Apellido", "Nombre", "Telefono", "Domicilio", "Zona", "Fecha Entrega", "Medio Pago", "Monto Total", "Empleado", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEntregas.setFocusable(false);
        tblEntregas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEntregasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblEntregas);

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

        btnTodasEntregas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTodasEntregas.setForeground(new java.awt.Color(255, 255, 255));
        btnTodasEntregas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cargo.png"))); // NOI18N
        btnTodasEntregas.setText("Mostrar todas las entregas");
        btnTodasEntregas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodasEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasEntregasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zona");

        cmbZona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbZona.setForeground(new java.awt.Color(255, 255, 255));
        cmbZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una zona", "TODAS LAS ZONAS", "CENTRO", "NORTE", "ESTE", "SUR", "OESTE" }));
        cmbZona.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(46, 46, 68));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Detalle del pedido");

        tblDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Descripción", "Precio Unit.", "Cantidad", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDetalle);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));

        btnConfirmarEntrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirmarEntrega.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/handshake.png"))); // NOI18N
        btnConfirmarEntrega.setText("Confirmar Entrega");
        btnConfirmarEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEntregaActionPerformed(evt);
            }
        });

        btnPosponerEntrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPosponerEntrega.setForeground(new java.awt.Color(255, 255, 255));
        btnPosponerEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/fecha-limite.png"))); // NOI18N
        btnPosponerEntrega.setText("Posponer Entrega");
        btnPosponerEntrega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPosponerEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPosponerEntregaActionPerformed(evt);
            }
        });

        btnGenerarListo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarListo.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/ready-stock.png"))); // NOI18N
        btnGenerarListo.setText("Generar pedidos \"Listos para entregar\"");
        btnGenerarListo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnConfirmarEntrega)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPosponerEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarListo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarEntrega)
                    .addComponent(btnPosponerEntrega)
                    .addComponent(btnGenerarListo)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(46, 46, 68));

        btnPedidosPendientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidosPendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidosPendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/delivery-truck.png"))); // NOI18N
        btnPedidosPendientes.setText("Pedidos pendientes");
        btnPedidosPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidosPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosPendientesActionPerformed(evt);
            }
        });

        btnPedidosListos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidosListos.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidosListos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/tracking.png"))); // NOI18N
        btnPedidosListos.setText("Pedidos listos para entregar");
        btnPedidosListos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidosListos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosListosActionPerformed(evt);
            }
        });

        btnPedidosEntregados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPedidosEntregados.setForeground(new java.awt.Color(255, 255, 255));
        btnPedidosEntregados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/enviado2.png"))); // NOI18N
        btnPedidosEntregados.setText("Pedidos entregados");
        btnPedidosEntregados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidosEntregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosEntregadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnPedidosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidosListos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidosEntregados, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPedidosPendientes)
                    .addComponent(btnPedidosListos)
                    .addComponent(btnPedidosEntregados))
                .addGap(30, 30, 30))
        );

        btnImprimirFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImprimirFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/printer.png"))); // NOI18N
        btnImprimirFactura.setText("Imprimir Factura");
        btnImprimirFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(243, 243, 243)
                        .addComponent(btnImprimirFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnTodasEntregas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTodasEntregas)
                            .addComponent(jLabel8)
                            .addComponent(cmbZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver)
                            .addComponent(btnImprimirFactura)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEntregaActionPerformed
        if (this.getTblEntregas().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
            return;
        }
        Integer idPedido = (Integer) this.modeloTblEntregas.getValueAt(this.getTblEntregas().getSelectedRow(), 0);
        String estado = this.modeloTblEntregas.getValueAt(this.getTblEntregas().getSelectedRow(), 10).toString();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea confirmar la entrega del pedido?", "Confirmar entrega", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (respuesta == JOptionPane.OK_OPTION) {
                if (estado.equals("LISTO PARA ENTREGAR")) {
                        boolean resultado = controlador.confirmarEntrega(idPedido);
                        actualizarPedidoEntregado(idPedido);
                    if (resultado) {
                        actualizaTabla();
                        JOptionPane.showMessageDialog(null, "Entrega confirmada con éxito.", "Entrega confirmada.", JOptionPane.INFORMATION_MESSAGE); 
                    }
                } else {
                imprimeMensaje(new Exception("El estado del pedido debe ser LISTO PARA ENTREGAR."));
            }
        }
    }//GEN-LAST:event_btnConfirmarEntregaActionPerformed

    private void btnPedidosEntregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosEntregadosActionPerformed
        limpiarTablaDetalle();
        String estado = "ENTREGADO";
        
        switch (cmbZona.getSelectedIndex()) {
            case 0:
                imprimeMensaje(new Exception("Seleccione una zona para la cual mostrar entregas."));
                break;
            case 1:
                controlador.cargarEntregados(modeloTblEntregas);
                verificarFilas();
                break;
            default:
                String zona = (String) cmbZona.getSelectedItem();
                controlador.cargarEstadoPorZona(modeloTblEntregas, zona, estado);
                verificarFilas();
                break;
        }  
    }//GEN-LAST:event_btnPedidosEntregadosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnTodasEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasEntregasActionPerformed
        limpiarTablaDetalle();
        switch (cmbZona.getSelectedIndex()) {
            case 0:
                imprimeMensaje(new Exception("Seleccione una zona para la cual mostrar entregas."));
                break;
            case 1:
                controlador.cargarTodos(modeloTblEntregas);
                verificarFilas();
                break;
            default:
                String zona = (String) cmbZona.getSelectedItem();
                controlador.cargarTodosPorZona(modeloTblEntregas, zona);
                verificarFilas();
                break;
        }
    }//GEN-LAST:event_btnTodasEntregasActionPerformed

    private void btnPedidosListosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosListosActionPerformed
        limpiarTablaDetalle();
        String estado = "LISTO PARA ENTREGAR";
        
        switch (cmbZona.getSelectedIndex()) {
            case 0:
                imprimeMensaje(new Exception("Seleccione una zona para la cual mostrar entregas."));
                break;
            case 1:
                controlador.cargarListos(modeloTblEntregas);
                verificarFilas();
                break;
            default:
                String zona = (String) cmbZona.getSelectedItem();
                controlador.cargarEstadoPorZona(modeloTblEntregas, zona, estado);
                verificarFilas();
                break;
        }  
    }//GEN-LAST:event_btnPedidosListosActionPerformed

    private void btnPedidosPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosPendientesActionPerformed
        limpiarTablaDetalle();
        String estado = "PENDIENTE";
        
        switch (cmbZona.getSelectedIndex()) {
            case 0:
                imprimeMensaje(new Exception("Seleccione una zona para la cual mostrar entregas."));
                break;
            case 1:
                controlador.cargarPendientes(modeloTblEntregas);
                verificarFilas();
                break;
            default:
                String zona = (String) cmbZona.getSelectedItem();
                controlador.cargarEstadoPorZona(modeloTblEntregas, zona, estado);
                verificarFilas();
                break;
        }  
    }//GEN-LAST:event_btnPedidosPendientesActionPerformed

    private void tblEntregasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEntregasMouseClicked
        if (evt.getSource() instanceof JTable) {
            Integer idPedido = (Integer) this.modeloTblEntregas.getValueAt(this.getTblEntregas().getSelectedRow(), 0);
            
            controlador.cargarDetalle(modeloTblDetalle, idPedido);
        }
    }//GEN-LAST:event_tblEntregasMouseClicked

    private void btnGenerarListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarListoActionPerformed
            
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea generar el listado de pedidos Listos para entregar?", "Pedidos listos para entregar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        for (int i = 0; i < modeloTblEntregas.getRowCount(); i++) {
            int idAnterior = Integer.parseInt(modeloTblEntregas.getValueAt(i, 0).toString());
            String apellido = modeloTblEntregas.getValueAt(i, 1).toString();
            String nombre = modeloTblEntregas.getValueAt(i, 2).toString();
            String telefono = modeloTblEntregas.getValueAt(i, 3).toString();
            String calle = modeloTblEntregas.getValueAt(i, 4).toString();
            String zona = modeloTblEntregas.getValueAt(i, 5).toString();
            String fechaEntrega = modeloTblEntregas.getValueAt(i, 6).toString();
            String medioPago = modeloTblEntregas.getValueAt(i, 7).toString();
            String monto = modeloTblEntregas.getValueAt(i, 8).toString();
            String empleado = modeloTblEntregas.getValueAt(i, 9).toString();
            String estado = modeloTblEntregas.getValueAt(i, 10).toString();
        
        if(respuesta == JOptionPane.OK_OPTION) {
            boolean resultado, resultado1;
            resultado = controlador.actualizarListo(idAnterior, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, empleado, estado);
            resultado1 = controlador.actualizarPedidos(idAnterior, apellido, nombre, telefono, calle, zona, fechaEntrega, medioPago, monto, estado);
            if (resultado) {
                actualizaTabla();
                }
            } else {
                imprimeMensaje(new Exception("Todos los campos son obligatorios"));
            }
        }
    }//GEN-LAST:event_btnGenerarListoActionPerformed

    private void btnPosponerEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPosponerEntregaActionPerformed
        if (this.getTblEntregas().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
            return;
        }
        Integer idPedido = (Integer) this.modeloTblEntregas.getValueAt(this.getTblEntregas().getSelectedRow(), 0);
        String estado = this.modeloTblEntregas.getValueAt(this.getTblEntregas().getSelectedRow(), 10).toString();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea posponer la entrega del pedido?", "Posponer entrega", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
            if (respuesta == JOptionPane.OK_OPTION) {
                if (estado.equals("LISTO PARA ENTREGAR")) {
                        boolean resultado = controlador.cancelarEntrega(idPedido);
                        actualizarPedidoCancelado(idPedido);
                    if (resultado) {
                        actualizaTabla();
                        JOptionPane.showMessageDialog(null, "Entrega pospuesta con éxito.", "Entrega pospuesta.", JOptionPane.INFORMATION_MESSAGE); 
                    }
                } else {
                imprimeMensaje(new Exception("El estado del pedido debe ser LISTO PARA ENTREGAR."));
            }
        }
    }//GEN-LAST:event_btnPosponerEntregaActionPerformed

    private void btnImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFacturaActionPerformed
        if (this.getTblDetalle().getRowCount() == 0) {
            imprimeMensaje(new Exception("Seleccione un pedido para poder imprimir la factura."));
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Impresión de factura en curso.", "Imprimiendo factura.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirFacturaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmarEntrega;
    public javax.swing.JButton btnGenerarListo;
    public javax.swing.JButton btnImprimirFactura;
    public javax.swing.JButton btnPedidosEntregados;
    public javax.swing.JButton btnPedidosListos;
    public javax.swing.JButton btnPedidosPendientes;
    public javax.swing.JButton btnPosponerEntrega;
    public javax.swing.JButton btnTodasEntregas;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cmbZona;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tblDetalle;
    public javax.swing.JTable tblEntregas;
    // End of variables declaration//GEN-END:variables

    public void limpiarTablaDetalle() {
        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            modeloTblDetalle.removeRow(i);
            i-=1;
        }
    }
    
    public void actualizarPedidoEntregado(int idPedido) {
        EntregaDaoImp ent = new EntregaDaoImp();
        ent.actualizarPedidoEntregado(idPedido);
    }
    
    public void actualizarPedidoCancelado(int idPedido) {
        EntregaDaoImp ent = new EntregaDaoImp();
        ent.actualizarPedidoPospuesto(idPedido);
    }
    
    @Override
    public void actualizaTabla() {
        controlador.cargarTodos(modeloTblEntregas);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (EntregaControlador) c;
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
    
    }
    
    public void verificarFilas() {
        if(this.modeloTblEntregas.getRowCount() == 0) {
            imprimeMensaje(new Exception("No existen pedidos para los filtros establecidos."));
        }
    }
    
    public JButton getBtnConfirmarEntrega() {
        return btnConfirmarEntrega;
    }

    public void setBtnConfirmarEntrega(JButton btnConfirmarEntrega) {
        this.btnConfirmarEntrega = btnConfirmarEntrega;
    }

    public JButton getBtnPedidosEntregados() {
        return btnPedidosEntregados;
    }

    public void setBtnPedidosEntregados(JButton btnPedidosEntregados) {
        this.btnPedidosEntregados = btnPedidosEntregados;
    }

    public JButton getBtnPedidosPendientes() {
        return btnPedidosListos;
    }

    public void setBtnPedidosPendientes(JButton btnPedidosPendientes) {
        this.btnPedidosListos = btnPedidosPendientes;
    }

    public JButton getBtnTodasEntregas() {
        return btnTodasEntregas;
    }

    public void setBtnTodasEntregas(JButton btnTodasEntregas) {
        this.btnTodasEntregas = btnTodasEntregas;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JComboBox<String> getCmbZona() {
        return cmbZona;
    }

    public void setCmbZona(JComboBox<String> cmbZona) {
        this.cmbZona = cmbZona;
    }

    public JTable getTblDetalle() {
        return tblDetalle;
    }

    public void setTblDetalle(JTable tblDetalle) {
        this.tblDetalle = tblDetalle;
    }

    public JTable getTblEntregas() {
        return tblEntregas;
    }

    public void setTblEntregas(JTable tblEntregas) {
        this.tblEntregas = tblEntregas;
    }
}
