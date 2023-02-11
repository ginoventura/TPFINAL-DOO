package ubp.doo.vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.PedidoControlador;
import ubp.doo.dao.PedidoDaoImp;
import ubp.doo.dto.ClienteDto;
import ubp.doo.dto.DetalleDto;
import ubp.doo.dto.EntregaDto;
import ubp.doo.dto.ProductoDto;

public class GestionarPedidos extends javax.swing.JFrame implements InterfazVistaPed {
    
    private static final long serialVersionUID = 1L;
    
    private final DefaultTableModel modeloTblPedidos;
    private PedidoControlador controlador;
    DetalleDto detalle = new DetalleDto();
    EntregaDto entrega = new EntregaDto();
    
    DefaultTableModel modeloTblDetalle = new DefaultTableModel();

    public GestionarPedidos(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ubp/doo/imgs/fire.png")).getImage());
        this.modeloTblPedidos = (DefaultTableModel) this.tblPedidos.getModel();
        tblDetalle.setModel(modeloTblDetalle);
        agregarColumnas();
        llenarCmbClientes();
        llenarCmbProductos();
        desactivarSpins();
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        txtNroPedido = new javax.swing.JTextField();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtZona = new javax.swing.JTextField();
        panelProductos = new javax.swing.JPanel();
        imgGarrafa = new javax.swing.JLabel();
        lblCantGarrafa = new javax.swing.JLabel();
        spinCantGarrafa = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinCantGranel = new javax.swing.JSpinner();
        lblCantGranel = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtFechaEntrega = new javax.swing.JTextField();
        btnGenerarFecYHora = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        panelDetalle = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        txtMontoTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btnEliminarProducto = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnCancelarPedido = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Monto total del pedido:     $");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Pedidos - SuperGas S.A");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Pedidos");

        tblPedidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Pedido", "Apellido", "Nombre", "Telefono", "Domicilio", "Zona", "Fecha Entrega", "Medio de Pago", "Monto del pedido", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPedidos.setFocusable(false);
        jScrollPane1.setViewportView(tblPedidos);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/orden2.png"))); // NOI18N

        panelDatos.setBackground(new java.awt.Color(46, 46, 68));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cliente");

        cmbCliente.setName("cmbCliente");
        cmbCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        txtNroPedido.setEditable(false);
        txtNroPedido.setBackground(new java.awt.Color(64, 64, 88));

        cmbProducto.setName("cmbProducto");
        cmbProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("N° Pedido");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Producto");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Zona");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Calle");

        txtTelefono.setName("txtTelefono");
        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(64, 64, 88));

        txtCalle.setName("txtCalle");
        txtCalle.setEditable(false);
        txtCalle.setBackground(new java.awt.Color(64, 64, 88));

        txtZona.setName("txtZona");
        txtZona.setEditable(false);
        txtZona.setBackground(new java.awt.Color(64, 64, 88));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel11)))
                        .addGap(6, 6, 6)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNroPedido)
                            .addComponent(cmbProducto, 0, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtCalle)
                    .addComponent(txtZona))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(6, 6, 6)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel11))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProductos.setBackground(new java.awt.Color(46, 46, 68));

        imgGarrafa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/botella-con-gas.png"))); // NOI18N

        lblCantGarrafa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantGarrafa.setForeground(new java.awt.Color(255, 255, 255));
        lblCantGarrafa.setText("Cantidad");

        spinCantGarrafa.setName("spinCantGarrafa");
        spinCantGarrafa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/tuberia-de-gas.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("m3");

        spinCantGranel.setName("spinCantGranel");
        spinCantGranel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblCantGranel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantGranel.setForeground(new java.awt.Color(255, 255, 255));
        lblCantGranel.setText("Cantidad");

        btnAgregar.setName("btnAgregar");
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/carrito-de-compras.png"))); // NOI18N
        btnAgregar.setText("Añadir al pedido");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtFechaEntrega.setName("txtFechaEntrega");
        txtFechaEntrega.setEditable(false);
        txtFechaEntrega.setBackground(new java.awt.Color(64, 64, 88));

        btnGenerarFecYHora.setName("btnGenerarFecYHora");
        btnGenerarFecYHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerarFecYHora.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarFecYHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/fecha-limite.png"))); // NOI18N
        btnGenerarFecYHora.setText("Generar fecha y hora de entrega");
        btnGenerarFecYHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarFecYHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFecYHoraActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha y hora de entrega del pedido");

        btnConfirmar.setName("btnConfirmar");
        btnConfirmar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/confirmar.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setName("btnCancelar");
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(imgGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantGarrafa)
                            .addComponent(spinCantGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinCantGranel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCantGranel))
                        .addGap(16, 16, 16))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductosLayout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGenerarFecYHora, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantGranel)
                            .addComponent(lblCantGarrafa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinCantGarrafa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinCantGranel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(imgGarrafa)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarFecYHora, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        panelDetalle.setBackground(new java.awt.Color(46, 46, 68));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Detalle del pedido");

        tblDetalle.setName("tblDetalle");
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

        txtMontoTotal.setName("txtMontoTotal");
        txtMontoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMontoTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoTotal.setText("0");
        txtMontoTotal.setEnabled(false);
        txtMontoTotal.setMargin(new java.awt.Insets(2, 12, 2, 2));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Monto total del pedido:     $");

        cmbMetodo.setName("cmbMetodo");
        cmbMetodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un método de pago", "CONTADO", "CHEQUE", "TRANSFERENCIA", "MERCADO PAGO" }));
        cmbMetodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Medio de pago");

        btnEliminarProducto.setName("btnEliminarProducto");
        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/removecart.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar producto");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                        .addComponent(btnEliminarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(btnEliminarProducto))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(46, 46, 68));

        btnCancelarPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/cancelarpedido.png"))); // NOI18N
        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
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

        btnLimpiarCampos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/escoba.png"))); // NOI18N
        btnLimpiarCampos.setText("Limpiar pantalla");
        btnLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 662, Short.MAX_VALUE)
                .addComponent(btnLimpiarCampos)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarPedido)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPedido)
                    .addComponent(btnVolver)
                    .addComponent(btnLimpiarCampos))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1214, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarFecYHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarFecYHoraActionPerformed
        calcularFechaEntrega();
    }//GEN-LAST:event_btnGenerarFecYHoraActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        if (this.getTblPedidos().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
            return;
        }
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea cancelar este pedido?", "Cancelar pedido", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            int idPedido = Integer.parseInt(modeloTblPedidos.getValueAt(this.getTblPedidos().getSelectedRow(), 0).toString());
            boolean resultado = controlador.cancelar(idPedido);
            boolean resultado2 = controlador.eliminarDetalle(idPedido);
            boolean resultado3 = controlador.eliminarEntrega(idPedido);
            if (resultado && resultado2) {
                actualizaTabla();
            } else {
                imprimeMensaje(new Exception("Ocurrió un error al cancelar al cancelar el pedido."));
            }
        limpiaVista();
        }
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String no = cmbCliente.getSelectedItem().toString();
        String[] nom = no.split(" ");
        String nombre = nom[3];
        String ap = cmbCliente.getSelectedItem().toString();
        String[] apell = ap.split(" ");
        String apellido = apell[2];
        String telefono = this.getTxtTelefono().getText();
        String calle = this.getTxtCalle().getText();
        String zona = this.getTxtZona().getText();
        String fechaHora = this.getTxtFechaEntrega().getText();
        String montoTotal = this.getTxtMontoTotal().getText();
        String medioPago = this.getCmbMetodo().getSelectedItem().toString();
             
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea registrar este pedido?", "Registrar pedido", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            if (!medioPago.equals("Seleccione un método de pago") && !fechaHora.equals("") && !montoTotal.equals("0")) {
                    boolean resultado;
                    resultado = controlador.confirmar(apellido.toUpperCase(), nombre.toUpperCase(), telefono, calle.toUpperCase(), zona.toUpperCase(), fechaHora.toUpperCase(), medioPago.toUpperCase(), montoTotal);
                    int idPedido = obtenerIdPedido();
                if (resultado) {
                    actualizaTabla();
                    registrarDetalle(idPedido);
                    registrarEntrega(idPedido, apellido, nombre, telefono, calle, zona, fechaHora, medioPago, montoTotal);
                }
                limpiaVista();
            } else {
                if (medioPago.equals("Seleccione un método de pago")) {
                    imprimeMensaje(new Exception("Seleccione un método de pago."));
                } else if (fechaHora.equals("")) {
                    imprimeMensaje(new Exception("Genere una fecha y hora para el pedido."));
                } else if (montoTotal.equals("0")) {
                    imprimeMensaje(new Exception("El pedido no puede estar vacío."));
                }
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiaVista();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        obtenerDatosCliente();
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        verificarProducto();
    }//GEN-LAST:event_cmbProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        obtenerDetallesProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        eliminarProducto();
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiaVista();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelarPedido;
    public javax.swing.JButton btnConfirmar;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnGenerarFecYHora;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<ClienteDto> cmbCliente;
    public javax.swing.JComboBox<String> cmbMetodo;
    public javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel imgGarrafa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantGarrafa;
    private javax.swing.JLabel lblCantGranel;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelProductos;
    public javax.swing.JSpinner spinCantGarrafa;
    public javax.swing.JSpinner spinCantGranel;
    public javax.swing.JTable tblDetalle;
    public javax.swing.JTable tblPedidos;
    public javax.swing.JTextField txtCalle;
    public javax.swing.JTextField txtFechaEntrega;
    public javax.swing.JTextField txtMontoTotal;
    public javax.swing.JTextField txtNroPedido;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void calcularFechaEntrega() {
        LocalDateTime fechaActual = LocalDateTime.now();

        int dias = (int)(Math.random()*7+1);
        int horas = (int)(Math.random()*24+1);
        int minutos = (int)(Math.random()*59+1);

        LocalDateTime fechaEntrega = fechaActual.plusDays(dias);
        fechaEntrega = fechaEntrega.plusHours(horas);
        fechaEntrega = fechaEntrega.plusMinutes(minutos);

        if(fechaEntrega.getHour() >= 20) {
            fechaEntrega = fechaEntrega.plusHours(12);
            DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            txtFechaEntrega.setText(fechaEntrega.format(esDateFormat));
        } else if (fechaEntrega.getHour() >= 0 && fechaEntrega.getHour() <= 8) {
            fechaEntrega = fechaEntrega.plusHours(12);
            DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            txtFechaEntrega.setText(fechaEntrega.format(esDateFormat));
        } else {
            DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            txtFechaEntrega.setText(fechaEntrega.format(esDateFormat));
        }
    }
    
    @Override
    public void llenarCmbClientes() {
        PedidoDaoImp modClientes = new PedidoDaoImp();
        ArrayList<ClienteDto> listaClientes = modClientes.getClientes();
        
        cmbCliente.removeAllItems();
        
        for(int i = 0; i < listaClientes.size(); i++){
            cmbCliente.addItem(new ClienteDto(listaClientes.get(i).getIdCliente(), listaClientes.get(i).getApellido(), listaClientes.get(i).getNombre()));
        }
    }
    
    @Override
    public void llenarCmbProductos() {
        PedidoDaoImp modProductos = new PedidoDaoImp();
        ArrayList<ProductoDto> listaProductos = modProductos.getProductos();
        
        cmbProducto.removeAllItems();
        
        for(int i = 0; i < listaProductos.size(); i++){
            cmbProducto.addItem(new ProductoDto(listaProductos.get(i).getNombre()).toString());
        }
    }
    
    @Override
    public void obtenerDatosCliente() {
                
        String idCli = cmbCliente.getSelectedItem().toString();
        String[] id = idCli.split(" ");
        String idClientePed = id[0];
               
        PedidoDaoImp ped = new PedidoDaoImp();
        String telCliente = ped.buscarTelefono(idClientePed);     
        txtTelefono.setText(telCliente);
        
        String calleCliente = ped.buscarCalle(idClientePed);     
        txtCalle.setText(calleCliente);
        
        String zonaCliente = ped.buscarZona(idClientePed);     
        txtZona.setText(zonaCliente);
    }
    
    @Override
    public void obtenerDetallesProducto() {
        
        int cantidad;
        
        if (cmbProducto.getSelectedItem().equals("GRANEL")) {
            cantidad = (int) spinCantGranel.getValue();
        } else {
            cantidad = (int) spinCantGarrafa.getValue();    
        } 
        if (cantidad > 0) {
            String nomProducto = cmbProducto.getSelectedItem().toString();
                
            for (int i = 0; i < modeloTblDetalle.getRowCount(); i++) {
                String nombreProductoDet = (String) modeloTblDetalle.getValueAt(i, 0);
                    if (nomProducto.equals(nombreProductoDet)) {
                        JOptionPane.showMessageDialog(null, "El producto seleccionado ya fue añadido al pedido,\n intente con otro o elimínelo.", "Atención", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                
            PedidoDaoImp ped = new PedidoDaoImp();
            String descripcion = ped.buscarDescripcionProd(nomProducto); 

            String precioUnit = ped.buscarPrecioUnit(nomProducto);
            int precioUnitario = Integer.parseInt(precioUnit);

            int precioTotal = precioUnitario*cantidad;
                
            Object[] datoAgregar = {nomProducto, descripcion, precioUnitario, cantidad, precioTotal};
            modeloTblDetalle.addRow(datoAgregar);
            JOptionPane.showMessageDialog(null, "Producto añadido al pedido con éxito.", "Producto añadido.", JOptionPane.INFORMATION_MESSAGE);            
            spinCantGarrafa.setValue(0);
            spinCantGranel.setValue(0);
            
            actualizarMontoTotal();
            
        } else {
            imprimeMensaje(new Exception("La cantidad debe ser mayor a 0."));
            }
        }
    
    @Override
    public void eliminarProducto() {
        
        if (this.getTblDetalle().getSelectedRow() >= 0) {
            DefaultTableModel tm = (DefaultTableModel)tblDetalle.getModel();
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar este producto del carrito?", "Eliminar producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            tm.removeRow(tblDetalle.getSelectedRow());
            actualizarMontoTotal();
            }
        } else {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
        }
    }
    
    @Override
    public void actualizarMontoTotal() {
        int montoTot = 0;
        
        for (int n = 0; n < modeloTblDetalle.getRowCount(); n++) {
            montoTot = (int) modeloTblDetalle.getValueAt(n, 4) + montoTot;
        }
        String montoTotal = Integer.toString(montoTot);
        txtMontoTotal.setText(montoTotal);
    }
    
    @Override
    public void registrarDetalle(int idPedido) {
        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            String nombre = tblDetalle.getValueAt(i, 0).toString();
            String descripcion = tblDetalle.getValueAt(i, 1).toString();
            int precioUnit = (int) tblDetalle.getValueAt(i, 2);
            int cantidad = (int) tblDetalle.getValueAt(i, 3);           
            int precioTotal = (int) tblDetalle.getValueAt(i, 4);
            
            detalle.setNombreProducto(nombre);
            detalle.setDescripcion(descripcion);
            detalle.setPrecioUnit(precioUnit);
            detalle.setCantidad(cantidad);
            detalle.setPrecioTotal(precioTotal);
            detalle.setIdPedido(idPedido);
            
            PedidoDaoImp detalleV = new PedidoDaoImp();
            detalleV.registrarDetalle(detalle);
        }
    }
    
    @Override
    public void registrarEntrega(int idPedido, String apellido, String nombre, String telefono, String domicilio, String zona, String fecha, String medioPago, String montoTotal) {
        PedidoDaoImp entregaV = new PedidoDaoImp();
        String empleado = entregaV.buscarEmpleadoEntrega(zona);
        
        entrega.setIdPedido(idPedido);
        entrega.setApellido(apellido);
        entrega.setNombre(nombre);
        entrega.setTelefono(telefono);
        entrega.setDomicilio(domicilio);
        entrega.setZona(zona);
        entrega.setFechaEntrega(fecha);
        entrega.setMedioPago(medioPago);
        entrega.setMonto(montoTotal);
        entrega.setEmpleado(empleado);
        entrega.setEstado("PENDIENTE");
        
        entregaV.registrarEntrega(entrega);
    }
    
    @Override
    public int obtenerIdPedido() {
        PedidoDaoImp ped = new PedidoDaoImp();
        int idPedido = ped.getIdPedido(); 
        
        return idPedido;
    }
    
    @Override
    public void verificarProducto() {
        if (cmbProducto.getSelectedItem().equals("GRANEL")) {
            spinCantGranel.setEnabled(true);
            spinCantGarrafa.setEnabled(false);
            spinCantGarrafa.setValue(0);
        } else {
            spinCantGarrafa.setEnabled(true);
            spinCantGranel.setEnabled(false);
            spinCantGranel.setValue(0);
        }
    }
    
    @Override
    public void desactivarSpins() {
        spinCantGranel.setEnabled(false);
        spinCantGarrafa.setEnabled(false);
    }
    
    @Override
    public void agregarColumnas() {
        modeloTblDetalle.addColumn("Nombre");
        modeloTblDetalle.addColumn("Descripción");
        modeloTblDetalle.addColumn("Precio Unit.");
        modeloTblDetalle.addColumn("Cantidad");
        modeloTblDetalle.addColumn("Precio Total");
    }
    
    @Override
    public void limpiarTablaDetalle() {
        for (int i = 0; i < tblDetalle.getRowCount(); i++) {
            modeloTblDetalle.removeRow(i);
            i-=1;
        }
    }
       
    @Override
    public void actualizaTabla() {
        controlador.cargarTodos(modeloTblPedidos);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (PedidoControlador) c;
        this.controlador.cargarTodos(modeloTblPedidos);
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
        this.cmbCliente.setSelectedIndex(0);
        this.cmbProducto.setSelectedIndex(0);
        this.cmbMetodo.setSelectedIndex(0);
        desactivarSpins();
        this.txtFechaEntrega.setText("");
        this.txtMontoTotal.setText("0");
        limpiarTablaDetalle();
        this.tblPedidos.clearSelection();
    }
    
    public DefaultTableModel getModeloTblPedidos() {
        return modeloTblPedidos;
    }
    
    public DefaultTableModel getModeloTblDetalle() {
        return modeloTblDetalle;
    }
    
    public JTable getTblPedidos() {
        return tblPedidos;
    }

    public void setTblPedidos(JTable tblPedidos) {
        this.tblPedidos = tblPedidos;
    }
    
    public JComboBox<ClienteDto> getCmbCliente() {
        return cmbCliente;
    }

    public void setCmbCliente(JComboBox<ClienteDto> cmbCliente) {
        this.cmbCliente = cmbCliente;
    }

    public JComboBox<String> getCmbMetodo() {
        return cmbMetodo;
    }

    public void setCmbMetodo(JComboBox<String> cmbMetodo) {
        this.cmbMetodo = cmbMetodo;
    }

    public JComboBox<String> getCmbProducto() {
        return cmbProducto;
    }

    public void setCmbProducto(JComboBox<String> cmbProducto) {
        this.cmbProducto = cmbProducto;
    }

    public JSpinner getSpinCantGarrafa() {
        return spinCantGarrafa;
    }

    public void setSpinCantGarrafa(JSpinner spinCantGarrafa) {
        this.spinCantGarrafa = spinCantGarrafa;
    }

    public JSpinner getSpinCantGranel() {
        return spinCantGranel;
    }

    public void setSpinCantGranel(JSpinner spinCantGranel) {
        this.spinCantGranel = spinCantGranel;
    }

    public JTable getTblDetalle() {
        return tblDetalle;
    }

    public void setTblDetalle(JTable tblDetalle) {
        this.tblDetalle = tblDetalle;
    }

    public JTextField getTxtCalle() {
        return txtCalle;
    }

    public void setTxtCalle(JTextField txtCalle) {
        this.txtCalle = txtCalle;
    }

    public JTextField getTxtFechaEntrega() {
        return txtFechaEntrega;
    }

    public void setTxtFechaEntrega(JTextField txtFechaEntrega) {
        this.txtFechaEntrega = txtFechaEntrega;
    }

    public JTextField getTxtMontoTotal() {
        return txtMontoTotal;
    }

    public void setTxtMontoTotal(JTextField txtMontoTotal) {
        this.txtMontoTotal = txtMontoTotal;
    }

    public JTextField getTxtNroPedido() {
        return txtNroPedido;
    }

    public void setTxtNroPedido(JTextField txtNroPedido) {
        this.txtNroPedido = txtNroPedido;
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
}
