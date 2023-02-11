package ubp.doo.vista;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.ClienteControlador;
import ubp.doo.controlador.Controlador;

public class ConsultarCliente extends javax.swing.JFrame implements InterfazVistaAbm {

    private static final long serialVersionUID = 1L;

    private final DefaultTableModel modeloTblClientes;
    private ClienteControlador controlador;

    public ConsultarCliente(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ubp/doo/imgs/fire.png")).getImage());
        
        this.modeloTblClientes = (DefaultTableModel) this.tblClientes.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNroDoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDepto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPiso = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        cmbBarrio = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtidCliente = new javax.swing.JTextField();
        btnLimpiarCampos = new javax.swing.JButton();
        cmbTipoDoc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Cliente - SuperGas S.A.");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Clientes");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/rating2.png"))); // NOI18N

        tblClientes.setName("tblClientes");
        tblClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Cliente", "Tipo Documento", "Nro. Documento", "Apellido", "Nombre", "Teléfono", "Barrio", "Zona", "Calle", "Depto", "Piso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tblClientes.setFocusable(false);
        tblClientes.getTableHeader().setReorderingAllowed(false);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        btnGuardar.setName("btnGuardar");
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/registrarcliente.png"))); // NOI18N
        btnGuardar.setText("Nuevo Cliente");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setName("btnModificar");
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/editarcliente.png"))); // NOI18N
        btnModificar.setText("Editar Cliente");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setName("btnEliminar");
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/eliminarcliente.png"))); // NOI18N
        btnEliminar.setText("Eliminar Cliente");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo Doc. ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número Doc.");

        txtNroDoc.setName("txtNroDoc");
        txtNroDoc.setForeground(new java.awt.Color(255, 255, 255));
        txtNroDoc.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtNroDoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDocKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");

        txtApellido.setName("txtApellido");
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");

        txtNombre.setName("txtNombre");
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono");

        txtTelefono.setName("txtTelefono");
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setMargin(new java.awt.Insets(2, 12, 2, 2));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtDepto.setName("txtDepto");
        txtDepto.setForeground(new java.awt.Color(255, 255, 255));
        txtDepto.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Depto");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Piso");

        txtPiso.setName("txtPiso");
        txtPiso.setForeground(new java.awt.Color(255, 255, 255));
        txtPiso.setMargin(new java.awt.Insets(2, 12, 2, 2));

        txtCalle.setName("txtCalle");
        txtCalle.setForeground(new java.awt.Color(255, 255, 255));
        txtCalle.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Calle");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Zona");

        txtZona.setEditable(false);
        txtZona.setForeground(new java.awt.Color(255, 255, 255));
        txtZona.setMargin(new java.awt.Insets(2, 12, 2, 2));

        cmbBarrio.setName("cmbBarrio");
        cmbBarrio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbBarrio.setForeground(new java.awt.Color(255, 255, 255));
        cmbBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un barrio", "ALBERDI", "BELLA VISTA", "CENTRO", "GÜEMES", "NVA. CÓRDOBA", "20 DE JUNIO", "ALTA CÓRDOBA", "COFICO", "GRAL. BUSTOS", "INDEPENDENCIA", "COLÓN", "GRAL. PAZ", "LA FLORESTA", "LOS PINOS", "YAPEYÚ", "VÉLEZ SÁRSFIELD", "HORIZONTE", "GRAL. ARTIGAS", "JARDÍN", "VILLA SAN ISIDRO", "CASEROS", "CHATEAU CARRERAS", "LAS ROSAS", "LOMAS DEL SUQUÍA", "SAN IGNACIO" }));
        cmbBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBarrioActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Barrio");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nro. Cliente");

        txtidCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtidCliente.setEnabled(false);
        txtidCliente.setMargin(new java.awt.Insets(2, 12, 2, 2));

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

        cmbTipoDoc.setName("cmbTipoDoc");
        cmbTipoDoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbTipoDoc.setForeground(new java.awt.Color(255, 255, 255));
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo de documento", "DNI", "CUIT", "PASAPORTE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(txtNroDoc, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtidCliente)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnLimpiarCampos)
                                        .addGap(65, 65, 65)
                                        .addComponent(btnGuardar)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTelefono)
                                            .addComponent(cmbBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPiso))
                                            .addComponent(txtZona)
                                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(btnModificar)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnEliminar)))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(cmbBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiarCampos)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (this.getTblClientes().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila"));
            return;
        }
        
        int idAnterior = Integer.parseInt(modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 0).toString());
        String tipoDocumento = (String)this.getCmbTipoDoc().getSelectedItem();
        String nroDocumento = this.getTxtNroDoc().getText();
        String apellido = this.getTxtApellido().getText();
        String nombre = this.getTxtNombre().getText();
        String telefono = this.getTxtTelefono().getText();
        String barrio = (String)this.getCmbBarrio().getSelectedItem();
        String zona = this.getTxtZona().getText();
        String calle = this.getTxtCalle().getText();
        String depto = this.getTxtDepto().getText();
        String piso = this.getTxtPiso().getText();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea modificar este cliente?", "Modificar cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            if (!tipoDocumento.equals("Seleccione un tipo de documento") && !nombre.equals("") && !apellido.equals("") && !telefono.equals("") && 
                !barrio.equals("Seleccione un barrio") && !zona.equals("") && !calle.equals("")) {
                    boolean resultado;
                    resultado = controlador.modificar(idAnterior, tipoDocumento.toUpperCase(), nroDocumento, apellido.toUpperCase(), nombre.toUpperCase(), telefono, barrio.toUpperCase(), zona.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
                if (resultado) {
                    actualizaTabla();
                }
                limpiaVista();
            } else {
                imprimeMensaje(new Exception("Todos los campos son obligatorios"));
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String idCliente = this.getTxtidCliente().getText();
        String tipoDocumento = (String)this.getCmbTipoDoc().getSelectedItem();
        String nroDocumento = this.getTxtNroDoc().getText();
        String apellido = this.getTxtApellido().getText();
        String nombre = this.getTxtNombre().getText();
        String telefono = this.getTxtTelefono().getText();
        String barrio = (String)this.getCmbBarrio().getSelectedItem();
        String zona = this.getTxtZona().getText();      
        String calle = this.getTxtCalle().getText();
        String depto = this.getTxtDepto().getText();
        String piso = this.getTxtPiso().getText();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea registrar este cliente?", "Registrar cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            if (!tipoDocumento.equals("Seleccione un tipo de documento") && !nombre.equals("") && !apellido.equals("") && !telefono.equals("") && 
                !barrio.equals("Seleccione un barrio") && !zona.equals("") && !calle.equals("")) {
                    boolean resultado;
                    resultado = controlador.guardar(tipoDocumento.toUpperCase(), nroDocumento, apellido.toUpperCase(), nombre.toUpperCase(), telefono, barrio, zona.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
                if (resultado) {
                actualizaTabla();
                }
                limpiaVista();
            } else {
            imprimeMensaje(new Exception("Todos los campos son obligatorios"));
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.getTblClientes().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
            return;
        }
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar este cliente?", "Eliminar cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            int idCliente = Integer.parseInt(modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 0).toString());
            boolean resultado = controlador.borrar(idCliente);
            if (resultado) {
                actualizaTabla();
            } else {
                imprimeMensaje(new Exception("Ocurrió un error al eliminar el cliente."));
            }
        limpiaVista();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiaVista();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        if (evt.getSource() instanceof JTable) {
            Integer idCliente = (Integer) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 0);
            this.getTxtidCliente().setText(idCliente.toString());
            String tipoDoc = (String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 1);
            cmbTipoDoc.setSelectedItem(tipoDoc);
            this.getTxtNroDoc().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 2));
            this.getTxtApellido().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 3));
            this.getTxtNombre().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 4));
            this.getTxtTelefono().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 5));
            String barrio = (String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 6);
            cmbBarrio.setSelectedItem(barrio);
            this.getTxtZona().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 7));
            this.getTxtCalle().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 8));
            this.getTxtDepto().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 9));
            this.getTxtPiso().setText((String) this.modeloTblClientes.getValueAt(this.getTblClientes().getSelectedRow(), 10));
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void cmbBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBarrioActionPerformed
        establecerZona();
    }//GEN-LAST:event_cmbBarrioActionPerformed

    private void txtNroDocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDocKeyTyped
        verificarTeclas(evt);
    }//GEN-LAST:event_txtNroDocKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        verificarTeclas(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cmbBarrio;
    public javax.swing.JComboBox<String> cmbTipoDoc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblClientes;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtDepto;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNroDoc;
    public javax.swing.JTextField txtPiso;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtZona;
    public javax.swing.JTextField txtidCliente;
    // End of variables declaration//GEN-END:variables
    
    public void establecerZona() {
    if (cmbBarrio.getSelectedIndex() == 0) {
            txtZona.setText("");
        } else
        if (cmbBarrio.getSelectedIndex() > 0 && cmbBarrio.getSelectedIndex() <= 5) {
            txtZona.setText("CENTRO");
        } else if (cmbBarrio.getSelectedIndex() > 5 && cmbBarrio.getSelectedIndex() <= 10) {
            txtZona.setText("NORTE");
        } else if (cmbBarrio.getSelectedIndex() > 10 && cmbBarrio.getSelectedIndex() <= 15) {
            txtZona.setText("ESTE");
        } else if (cmbBarrio.getSelectedIndex() > 15 && cmbBarrio.getSelectedIndex() <= 20) {
            txtZona.setText("SUR");
        } else if (cmbBarrio.getSelectedIndex() > 20 && cmbBarrio.getSelectedIndex() <= 25) {
            txtZona.setText("OESTE");
        }
    }
    
    public void verificarTeclas(KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key == 8;
        
        if (!(numeros || borrar)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Sólo se permiten ingresar números.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void actualizaTabla() {
        controlador.cargarTodos(modeloTblClientes);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (ClienteControlador) c;
        this.controlador.cargarTodos(modeloTblClientes);
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
        this.txtTelefono.transferFocus();
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
        this.txtidCliente.setText("");
        this.txtNroDoc.setText("");
        this.txtApellido.setText("");
        this.txtNombre.setText("");
        this.txtTelefono.setText("");
        this.txtCalle.setText("");
        this.txtDepto.setText("");
        this.txtPiso.setText("");
        this.txtZona.setText("");
        this.cmbTipoDoc.setSelectedIndex(0);
        this.cmbBarrio.setSelectedIndex(0);
        this.tblClientes.clearSelection();
    }
    
    public DefaultTableModel getModeloTblClientes() {
        return modeloTblClientes;
    }
    
    public JTable getTblClientes() {
        return tblClientes;
    }

    public void setTblClientes(JTable tblClientes) {
        this.tblClientes = tblClientes;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtDepto() {
        return txtDepto;
    }

    public void setTxtDepto(JTextField txtDepto) {
        this.txtDepto = txtDepto;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNroDoc() {
        return txtNroDoc;
    }

    public void setTxtNroDoc(JTextField txtNroDoc) {
        this.txtNroDoc = txtNroDoc;
    }

    public JTextField getTxtPiso() {
        return txtPiso;
    }

    public void setTxtPiso(JTextField txtPiso) {
        this.txtPiso = txtPiso;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JTextField getTxtZona() {
        return txtZona;
    }

    public void setTxtZona(JTextField txtZona) {
        this.txtZona = txtZona;
    }

    public JTextField getTxtidCliente() {
        return txtidCliente;
    }

    public void setTxtidCliente(JTextField txtidCliente) {
        this.txtidCliente = txtidCliente;
    }

    public JComboBox<String> getCmbBarrio() {
        return cmbBarrio;
    }

    public void setCmbBarrio(JComboBox<String> cmbBarrio) {
        this.cmbBarrio = cmbBarrio;
    }

    public JComboBox<String> getCmbTipoDoc() {
        return cmbTipoDoc;
    }

    public void setCmbTipoDoc(JComboBox<String> cmbTipoDoc) {
        this.cmbTipoDoc = cmbTipoDoc;
    }   
}