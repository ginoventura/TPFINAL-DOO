package ubp.doo.vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ubp.doo.controlador.Controlador;
import ubp.doo.controlador.ProductoControlador;

public class GestionarProductos extends javax.swing.JFrame implements InterfazVistaAbm {

    private static final long serialVersionUID = 1L;
    
    private final DefaultTableModel modeloTblProductos;
    private ProductoControlador controlador;
    
    public GestionarProductos(java.awt.Frame parent, boolean modal) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/ubp/doo/imgs/fire.png")).getImage());
        this.modeloTblProductos = (DefaultTableModel) this.tblProductos.getModel();
        ocultarNuevoProducto();
        ocultarModificarProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotalFilasTabla = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnNuevoProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnActualizarPrecio = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        panelNuevoProducto = new javax.swing.JPanel();
        lblNuevoProducto1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        lblUnidad = new javax.swing.JLabel();
        txtUnidadMedida = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        panelModificarProducto = new javax.swing.JPanel();
        lblNuevoProducto3 = new javax.swing.JLabel();
        lblCodigo2 = new javax.swing.JLabel();
        txtCodModificar = new javax.swing.JTextField();
        lblNombre2 = new javax.swing.JLabel();
        txtNombreModificar = new javax.swing.JTextField();
        lblDescripcion2 = new javax.swing.JLabel();
        txtDescripcionModificar = new javax.swing.JTextField();
        lblUnidad2 = new javax.swing.JLabel();
        txtUnidadModificar = new javax.swing.JTextField();
        lblStock2 = new javax.swing.JLabel();
        txtCantidadModificar = new javax.swing.JTextField();
        lblPrecio2 = new javax.swing.JLabel();
        txtPrecioModificar = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnGuardarModificacion = new javax.swing.JButton();

        lblTotalFilasTabla.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotalFilasTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalFilasTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalFilasTabla.setText("Total de Filas: 5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Gestionar Productos - SuperGas S.A.");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 46, 68));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Productos");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/inventario2.png"))); // NOI18N

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Producto ", "Nombre de Producto", "Descripción ", "Unidad de medida", "Cantidad", "Precio Unitario "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        btnNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/inventario2.png"))); // NOI18N
        btnNuevoProducto.setText("Nuevo Producto");
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        btnEditarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/editarcliente.png"))); // NOI18N
        btnEditarProducto.setText("Editar Producto");
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/agotado.png"))); // NOI18N
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnActualizarPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActualizarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/actualizado.png"))); // NOI18N
        btnActualizarPrecio.setText("Actualizar Precio");
        btnActualizarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPrecioActionPerformed(evt);
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

        panelNuevoProducto.setBackground(new java.awt.Color(46, 46, 68));
        panelNuevoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNuevoProducto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNuevoProducto1.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoProducto1.setText("Registrar nuevo producto");
        panelNuevoProducto.add(lblNuevoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Cod. Producto");
        panelNuevoProducto.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 45, -1, -1));

        txtCodProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtCodProducto.setEnabled(false);
        txtCodProducto.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 39, 350, 30));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre producto");
        panelNuevoProducto.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 87, -1, -1));

        txtNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreProducto.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 81, 350, 30));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción");
        panelNuevoProducto.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 129, -1, -1));

        txtDescripcionProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionProducto.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 123, 350, 30));

        lblUnidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUnidad.setForeground(new java.awt.Color(255, 255, 255));
        lblUnidad.setText("Unidad de medida");
        panelNuevoProducto.add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 171, -1, -1));

        txtUnidadMedida.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidadMedida.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtUnidadMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 165, 350, 30));

        lblStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));
        lblStock.setText("Stock inicial");
        panelNuevoProducto.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 213, -1, -1));

        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 207, 350, 30));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio unitario   $");
        panelNuevoProducto.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 255, -1, -1));

        txtPrecioUnitario.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioUnitario.setMargin(new java.awt.Insets(2, 12, 2, 2));
        panelNuevoProducto.add(txtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 249, 350, 30));

        panelModificarProducto.setBackground(new java.awt.Color(46, 46, 68));

        lblNuevoProducto3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNuevoProducto3.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoProducto3.setText("Modificar producto");

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo2.setText("Cod. Producto");

        txtCodModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtCodModificar.setEnabled(false);
        txtCodModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Nombre producto");

        txtNombreModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        lblDescripcion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion2.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion2.setText("Descripción");

        txtDescripcionModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        lblUnidad2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUnidad2.setForeground(new java.awt.Color(255, 255, 255));
        lblUnidad2.setText("Unidad de medida");

        txtUnidadModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidadModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        lblStock2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStock2.setForeground(new java.awt.Color(255, 255, 255));
        lblStock2.setText("Stock");

        txtCantidadModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        lblPrecio2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio2.setText("Precio unitario   $");

        txtPrecioModificar.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioModificar.setMargin(new java.awt.Insets(2, 12, 2, 2));

        javax.swing.GroupLayout panelModificarProductoLayout = new javax.swing.GroupLayout(panelModificarProducto);
        panelModificarProducto.setLayout(panelModificarProductoLayout);
        panelModificarProductoLayout.setHorizontalGroup(
            panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNuevoProducto3))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCodigo2)
                .addGap(12, 12, 12)
                .addComponent(txtCodModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblNombre2)
                .addGap(12, 12, 12)
                .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblDescripcion2)
                .addGap(12, 12, 12)
                .addComponent(txtDescripcionModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblUnidad2)
                .addGap(12, 12, 12)
                .addComponent(txtUnidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblStock2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblPrecio2)
                .addGap(12, 12, 12)
                .addComponent(txtPrecioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelModificarProductoLayout.setVerticalGroup(
            panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModificarProductoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNuevoProducto3)
                .addGap(11, 11, 11)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCodigo2))
                    .addComponent(txtCodModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombre2))
                    .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblDescripcion2))
                    .addComponent(txtDescripcionModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblUnidad2))
                    .addComponent(txtUnidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock2))
                .addGap(12, 12, 12)
                .addGroup(panelModificarProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModificarProductoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPrecio2))
                    .addComponent(txtPrecioModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnGuardarProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/guardar.png"))); // NOI18N
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnGuardarModificacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarModificacion.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarModificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ubp/doo/imgs/guardar.png"))); // NOI18N
        btnGuardarModificacion.setText("Guardar");
        btnGuardarModificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(134, 134, 134)
                        .addComponent(btnGuardarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarModificacion)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(panelNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addGap(763, 763, 763)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarProducto)
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProducto)
                    .addComponent(btnEditarProducto)
                    .addComponent(btnEliminarProducto)
                    .addComponent(btnActualizarPrecio)
                    .addComponent(btnLimpiarCampos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        ocultarModificarProducto();
        mostrarNuevoProducto();
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        if (this.getTblProductos().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila"));
            return;
        } else {
            ocultarNuevoProducto();
            ocultarActualizarPrecio();
            mostrarModificarProducto();
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (this.getTblProductos().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila."));
            return;
        }
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea eliminar este producto?", "Eliminar producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            int idProducto = Integer.parseInt(modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 0).toString());
            boolean resultado = controlador.borrar(idProducto);
            if (resultado) {
                actualizaTabla();
            } else {
                imprimeMensaje(new Exception("Ocurrió un error al eliminar el producto."));
            }
        limpiaVista();
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnActualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPrecioActionPerformed
        if (this.getTblProductos().getSelectedRow() == -1) {
            imprimeMensaje(new Exception("Debe seleccionar una fila"));
            return;
        } else {
            ocultarNuevoProducto();
            ocultarModificarProducto();
            mostrarActualizarPrecio();
        }        
    }//GEN-LAST:event_btnActualizarPrecioActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiaVista();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        String idProducto = this.getTxtCodProducto().getText();
        String nombreProducto = this.getTxtNombreProducto().getText();
        String descripcionProducto = this.getTxtDescripcionProducto().getText();
        String unidadMedida = this.getTxtUnidadMedida().getText();
        String stock = this.getTxtCantidad().getText();
        int stockInicial = Integer.parseInt(stock);
        String precio = this.getTxtPrecioUnitario().getText();
        int precioUnitario = Integer.parseInt(precio);
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea registrar este prodcuto?", "Registrar producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            if (!nombreProducto.equals("") && !descripcionProducto.equals("") && !unidadMedida.equals("") && !stock.equals("") && !precio.equals("")) {
                    boolean resultado;
                    resultado = controlador.guardar(nombreProducto.toUpperCase(), descripcionProducto.toUpperCase(), unidadMedida.toUpperCase(), stockInicial, precioUnitario);
                if (resultado) {
                actualizaTabla();
                }
                limpiaVista();
            } else {
            imprimeMensaje(new Exception("Todos los campos son obligatorios"));
            }
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnGuardarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModificacionActionPerformed
        int idAnterior = Integer.parseInt(modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 0).toString());
        String nombreProducto = this.getTxtNombreModificar().getText();
        String descripcionProducto = this.getTxtDescripcionModificar().getText();
        String unidadMedida = this.getTxtUnidadModificar().getText();
        String stock = this.getTxtCantidadModificar().getText();
        int stockInicial = Integer.parseInt(stock);
        String precio = this.getTxtPrecioModificar().getText();
        int precioUnitario = Integer.parseInt(precio);
        
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro desea guardar los cambios?", "Modificar producto", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.OK_OPTION) {
            if (!nombreProducto.equals("") && !descripcionProducto.equals("") && !unidadMedida.equals("") && !stock.equals("") && !precio.equals("")) {
                    boolean resultado;
                    resultado = controlador.modificar(idAnterior, nombreProducto.toUpperCase(), descripcionProducto.toUpperCase(), unidadMedida.toUpperCase(), stockInicial, precioUnitario);
                if (resultado) {
                    actualizaTabla();
                }
                limpiaVista();
            } else {
                imprimeMensaje(new Exception("Todos los campos son obligatorios"));
            }
        }
    }//GEN-LAST:event_btnGuardarModificacionActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        if (evt.getSource() instanceof JTable) {
            Integer idProducto = (Integer) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 0);
            this.getTxtCodModificar().setText(idProducto.toString());
            this.getTxtNombreModificar().setText((String) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 1));
            this.getTxtDescripcionModificar().setText((String) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 2));
            this.getTxtUnidadModificar().setText((String) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 3));
            Integer stock = (Integer) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 4);
            this.getTxtCantidadModificar().setText(stock.toString());
            Integer precio = (Integer) this.modeloTblProductos.getValueAt(this.getTblProductos().getSelectedRow(), 5);
            this.getTxtPrecioModificar().setText(precio.toString());
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarPrecio;
    public javax.swing.JButton btnEditarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnGuardarModificacion;
    public javax.swing.JButton btnGuardarProducto;
    public javax.swing.JButton btnLimpiarCampos;
    public javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNuevoProducto1;
    private javax.swing.JLabel lblNuevoProducto3;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStock2;
    public javax.swing.JLabel lblTotalFilasTabla;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JLabel lblUnidad2;
    private javax.swing.JPanel panelModificarProducto;
    private javax.swing.JPanel panelNuevoProducto;
    public javax.swing.JTable tblProductos;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCantidadModificar;
    public javax.swing.JTextField txtCodModificar;
    public javax.swing.JTextField txtCodProducto;
    public javax.swing.JTextField txtDescripcionModificar;
    public javax.swing.JTextField txtDescripcionProducto;
    public javax.swing.JTextField txtNombreModificar;
    public javax.swing.JTextField txtNombreProducto;
    public javax.swing.JTextField txtPrecioModificar;
    public javax.swing.JTextField txtPrecioUnitario;
    public javax.swing.JTextField txtUnidadMedida;
    public javax.swing.JTextField txtUnidadModificar;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel getModeloTblProductos() {
        return modeloTblProductos;
    }
    
    @Override
    public void actualizaTabla() {
        controlador.cargarTodos(modeloTblProductos);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (ProductoControlador) c;
        this.controlador.cargarTodos(modeloTblProductos);
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
        ocultarNuevoProducto();
        ocultarModificarProducto();
        this.tblProductos.clearSelection();
    }
    
    public void ocultarNuevoProducto() {
        panelNuevoProducto.setVisible(false);
        btnGuardarProducto.setVisible(false);
    }
    
    public void mostrarNuevoProducto() {
        panelNuevoProducto.setVisible(true);
        btnGuardarProducto.setVisible(true);
    }
    
    public void ocultarModificarProducto(){
        panelModificarProducto.setVisible(false);
        btnGuardarModificacion.setVisible(false);
    }
    
    public void mostrarModificarProducto() {
        panelModificarProducto.setVisible(true);
        btnGuardarModificacion.setVisible(true);
    }
    
    public void mostrarActualizarPrecio() {
        panelModificarProducto.setVisible(true);
        btnGuardarModificacion.setVisible(true);
        txtNombreModificar.setEnabled(false);
        txtDescripcionModificar.setEnabled(false);
        txtUnidadModificar.setEnabled(false);
        txtCantidadModificar.setEnabled(false);
        txtPrecioModificar.requestFocus();
    }
    
    public void ocultarActualizarPrecio() {
        panelModificarProducto.setVisible(false);
        btnGuardarModificacion.setVisible(false);
        txtNombreModificar.setEnabled(true);
        txtDescripcionModificar.setEnabled(true);
        txtUnidadModificar.setEnabled(true);
        txtCantidadModificar.setEnabled(true);
        txtPrecioModificar.requestFocus();
    }
    
    public JTable getTblProductos() {
        return tblProductos;
    }
    
    public void setTblProductos(JTable tblProductos) {
        this.tblProductos = tblProductos;
    }

    public JTextField getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(JTextField txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    public JTextField getTxtCantidadModificar() {
        return txtCantidadModificar;
    }

    public void setTxtCantidadModificar(JTextField txtCantidadModificar) {
        this.txtCantidadModificar = txtCantidadModificar;
    }

    public JTextField getTxtCodModificar() {
        return txtCodModificar;
    }

    public void setTxtCodModificar(JTextField txtCodModificar) {
        this.txtCodModificar = txtCodModificar;
    }

    public JTextField getTxtCodProducto() {
        return txtCodProducto;
    }

    public void setTxtCodProducto(JTextField txtCodProducto) {
        this.txtCodProducto = txtCodProducto;
    }

    public JTextField getTxtDescripcionModificar() {
        return txtDescripcionModificar;
    }

    public void setTxtDescripcionModificar(JTextField txtDescripcionModificar) {
        this.txtDescripcionModificar = txtDescripcionModificar;
    }

    public JTextField getTxtDescripcionProducto() {
        return txtDescripcionProducto;
    }

    public void setTxtDescripcionProducto(JTextField txtDescripcionProducto) {
        this.txtDescripcionProducto = txtDescripcionProducto;
    }

    public JTextField getTxtNombreModificar() {
        return txtNombreModificar;
    }

    public void setTxtNombreModificar(JTextField txtNombreModificar) {
        this.txtNombreModificar = txtNombreModificar;
    }

    public JTextField getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public void setTxtNombreProducto(JTextField txtNombreProducto) {
        this.txtNombreProducto = txtNombreProducto;
    }

    public JTextField getTxtPrecioModificar() {
        return txtPrecioModificar;
    }

    public void setTxtPrecioModificar(JTextField txtPrecioModificar) {
        this.txtPrecioModificar = txtPrecioModificar;
    }

    public JTextField getTxtPrecioUnitario() {
        return txtPrecioUnitario;
    }

    public void setTxtPrecioUnitario(JTextField txtPrecioUnitario) {
        this.txtPrecioUnitario = txtPrecioUnitario;
    }

    public JTextField getTxtUnidadMedida() {
        return txtUnidadMedida;
    }

    public void setTxtUnidadMedida(JTextField txtUnidadMedida) {
        this.txtUnidadMedida = txtUnidadMedida;
    }

    public JTextField getTxtUnidadModificar() {
        return txtUnidadModificar;
    }

    public void setTxtUnidadModificar(JTextField txtUnidadModificar) {
        this.txtUnidadModificar = txtUnidadModificar;
    }   
}
