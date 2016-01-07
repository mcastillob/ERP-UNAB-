/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.frames;

import cl.unab.erp.projectManager.controller.ActividadController;
import cl.unab.erp.projectManager.controller.ClienteController;
import cl.unab.erp.projectManager.controller.ProjectController;
import cl.unab.erp.projectManager.controller.RecursosController;
import cl.unab.erp.projectManager.controller.ReportesController;
import cl.unab.erp.projectManager.model.Actividad;
import cl.unab.erp.projectManager.model.Cliente;
import cl.unab.erp.projectManager.model.Empleado;
import cl.unab.erp.projectManager.model.Proyecto;
import cl.unab.erp.projectManager.util.ActividadUtils;
import cl.unab.erp.projectManager.util.CargoUtils;
import cl.unab.erp.projectManager.util.ClienteUtils;
import cl.unab.erp.projectManager.util.ComboManagerUtil;
import cl.unab.erp.projectManager.util.EmpleadoUtils;
import cl.unab.erp.projectManager.util.ProyectoUtils;
import cl.unab.erp.projectManager.util.TableManagerUtil;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mcamilettimellado
 */
public class Index extends javax.swing.JFrame {

    private ProjectController projectController;
    private RecursosController recursosController;
    private ActividadController actividadController;
    private ClienteController clienteController;
    private ReportesController reporteController;
    private Login login;

    public Index() {
        initComponents();
        this.setLocation(180, 140);
        this.init();
        this.doCombos();
        this.doTables();

    }

    private void reLoad() {
        this.doCombos();
        this.doTables();
    }

    private void init() {
        //Inicializando arreglos
        CargoUtils.init();
        EmpleadoUtils.init();
        ClienteUtils.init();
        ProyectoUtils.init();
        ActividadUtils.init();
        //Inicializando Controladores
        ControllerInit();
        initButton();
        initSesion();
    }

    private void ControllerInit() {
        this.projectController = new ProjectController();
        this.recursosController = new RecursosController();
        this.actividadController = new ActividadController();
        this.clienteController = new ClienteController();
        this.reporteController=new ReportesController();
    }

    private void doTables() {
        //Llena las tablas
        TableManagerUtil.doTableClientes(jTableClientes);
        TableManagerUtil.doTableRecursos(jTableRecursos);
        TableManagerUtil.doTableProyectos(jTableProject);
        TableManagerUtil.doTableActividades(jTableActividades, ProyectoUtils.proyectos.get(jComboProyectoActividad.getSelectedIndex()).getId());

    }

    private void initButton() {
        jButtonEditProject.setEnabled(false);
        jButtonEditRecursos.setEnabled(false);
        jButtonDeleteRecurso.setEnabled(false);
        jButtonDeleteProject.setEnabled(false);
        jButtonEditActividad.setEnabled(false);
        jButtonDeleteActividad.setEnabled(false);
        jButtonEditCliente.setEnabled(false);
        jButtonDeleteCliente.setEnabled(false);
jButtonPDFProject.setEnabled(false);
    }

    private void initSesion() {
        jTabPrincipal.setEnabled(false);
        jTabPrincipal.setVisible(false);
        jMenuCerrarSesion.setVisible(false);

    }

    private void doCombos() {
        //llena combobox
        ComboManagerUtil.doComboCargo(jComboCargoRecursos);
        ComboManagerUtil.doComboJefeProject(jComboJefeProyectoProject);
        ComboManagerUtil.doComboProject(jComboProyectoActividad);
        ComboManagerUtil.doComboProject(jComboProyectoActividadNueva);
        ComboManagerUtil.doComboCliente(jComboClienteProject);
        ComboManagerUtil.doComboEmpleados(jComboRecursoActividad);
    }

    private void cleanFieldProject() {
        jTextNombreProject.setText("");
        jTextInicioProject.setText("");
        jTextTerminoProject.setText("");
        jTextJefeProyectoClienteProject.setText("");
        jTextResumenProject.setText("");
    }

    private void cleanFieldActividad() {
        jTextNombreActividad.setText("");
        jTextInicioActividad.setText("");
        jTextTerminoActividad.setText("");
    }

    private void cleanFieldRecursos() {
        jTextRutRecurso.setText("");
        jTextRutRecurso.setEnabled(true);
        jTextNombreRecursos.setText("");
        jTextApellidosRecursos.setText("");
        jTextDireccionRecursos.setText("");
        jTextEmailRecursos.setText("");
        jTextFonoRecursos.setText("");
    }

    private void cleanFieldCliente() {
        jTextRutCliente.setText("");
        jTextRazonSocialCliente.setText("");
        jTextDireccionCliente.setText("");
        jTextEmailCliente.setText("");
        jTextFonoCliente.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTabPrincipal = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProject = new javax.swing.JTable();
        jTextNombreProject = new javax.swing.JTextField();
        jTextInicioProject = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboClienteProject = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboJefeProyectoProject = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextResumenProject = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButtonGuardarProject = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextJefeProyectoClienteProject = new javax.swing.JTextField();
        jTextTerminoProject = new javax.swing.JTextField();
        jButtonDeleteProject = new javax.swing.JButton();
        jButtonEditProject = new javax.swing.JButton();
        jButtonNewProject = new javax.swing.JButton();
        jButtonPDFProject = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableActividades = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jComboProyectoActividad = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextNombreActividad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboRecursoActividad = new javax.swing.JComboBox();
        jTextTerminoActividad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextInicioActividad = new javax.swing.JTextField();
        jButtonGuardarActividad = new javax.swing.JButton();
        jComboProyectoActividadNueva = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButtonDeleteActividad = new javax.swing.JButton();
        jButtonEditActividad = new javax.swing.JButton();
        jButtonNewActividad2 = new javax.swing.JButton();
        jCheckBoxEstadoActividad = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableRecursos = new javax.swing.JTable();
        jTextRutRecurso = new javax.swing.JTextField();
        jTextNombreRecursos = new javax.swing.JTextField();
        jComboCargoRecursos = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonGuardarRecursos = new javax.swing.JButton();
        jTextApellidosRecursos = new javax.swing.JTextField();
        jTextDireccionRecursos = new javax.swing.JTextField();
        jTextEmailRecursos = new javax.swing.JTextField();
        jTextFonoRecursos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButtonNewRecurso = new javax.swing.JButton();
        jButtonDeleteRecurso = new javax.swing.JButton();
        jButtonEditRecursos = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextRutCliente = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextRazonSocialCliente = new javax.swing.JTextField();
        jTextFonoCliente = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextEmailCliente = new javax.swing.JTextField();
        jTextDireccionCliente = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButtonGuardarCliente = new javax.swing.JButton();
        jButtonEditCliente = new javax.swing.JButton();
        jButtonDeleteCliente = new javax.swing.JButton();
        jButtonNewCliente = new javax.swing.JButton();
        jMenuBarInitSesion = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuInitSesion = new javax.swing.JMenuItem();
        jMenuCerrarSesion = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "INICIO", "TERMINO", "CLIENTE", "JPLOCAL", "JPCLIENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProject.getTableHeader().setReorderingAllowed(false);
        jTableProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProjectMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableProjectMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProject);
        if (jTableProject.getColumnModel().getColumnCount() > 0) {
            jTableProject.getColumnModel().getColumn(2).setResizable(false);
            jTableProject.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 34, 750, 110));
        jPanel3.add(jTextNombreProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 151, -1));
        jPanel3.add(jTextInicioProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 151, -1));

        jLabel2.setText("Nombre Proyecto:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

        jLabel3.setText("Cliente");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 87, -1));

        jLabel4.setText("Inicio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, -1));

        jLabel5.setText("Termino:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 20));

        jComboClienteProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Redbanc", "Induras S.A", "Falabella" }));
        jPanel3.add(jComboClienteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, -1));

        jLabel6.setText("Jefe de Proyecto Cliente:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, -1));

        jComboJefeProyectoProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mario Soto", "Pablo Gomez", "Estefania Perez" }));
        jPanel3.add(jComboJefeProyectoProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 160, -1));

        jTextResumenProject.setColumns(20);
        jTextResumenProject.setLineWrap(true);
        jTextResumenProject.setRows(5);
        jScrollPane2.setViewportView(jTextResumenProject);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 364, 70));

        jLabel7.setText("Resumen del Proyecto:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 140, -1));

        jButtonGuardarProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/saveButton.png"))); // NOI18N
        jButtonGuardarProject.setText("Guardar");
        jButtonGuardarProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarProjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonGuardarProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Todos los Proyectos:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, -1));

        jLabel26.setText("Jefe de Proyecto Empresa:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 160, -1));
        jPanel3.add(jTextJefeProyectoClienteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 160, -1));
        jPanel3.add(jTextTerminoProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 150, -1));

        jButtonDeleteProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/eliminar.png"))); // NOI18N
        jButtonDeleteProject.setText("Eliminar");
        jButtonDeleteProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteProjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDeleteProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 120, 40));

        jButtonEditProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/editar.png"))); // NOI18N
        jButtonEditProject.setText("Editar");
        jButtonEditProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditProjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 40));

        jButtonNewProject.setText("Nuevo Proyecto:");
        jButtonNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewProjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonNewProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        jButtonPDFProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/pdfButton.png"))); // NOI18N
        jButtonPDFProject.setText("Guardar En...");
        jButtonPDFProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFProjectActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPDFProject, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 150, 40));

        jTabPrincipal.addTab("PROYECTOS", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Actividad", "Inicio", "Termino", "Recurso", "Ejecutada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableActividadesMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableActividades);
        if (jTableActividades.getColumnModel().getColumnCount() > 0) {
            jTableActividades.getColumnModel().getColumn(0).setResizable(false);
            jTableActividades.getColumnModel().getColumn(1).setResizable(false);
            jTableActividades.getColumnModel().getColumn(2).setResizable(false);
            jTableActividades.getColumnModel().getColumn(3).setResizable(false);
            jTableActividades.getColumnModel().getColumn(4).setResizable(false);
            jTableActividades.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 750, 120));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("PROYECTO:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        jComboProyectoActividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Proyecto1", "proyecto2", "proyeto3" }));
        jComboProyectoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProyectoActividadActionPerformed(evt);
            }
        });
        jPanel4.add(jComboProyectoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 270, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Agregar/ Editar Actividad");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 20));
        jPanel4.add(jTextNombreActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 180, -1));

        jLabel11.setText("Nombre Actividad:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, -1));

        jLabel12.setText("Inicio:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, -1));

        jLabel13.setText("Termino:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, -1));

        jComboRecursoActividad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboRecursoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 180, -1));
        jPanel4.add(jTextTerminoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 180, -1));

        jLabel14.setText("Recurso Asociado:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 110, -1));
        jPanel4.add(jTextInicioActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 180, -1));

        jButtonGuardarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/saveButton.png"))); // NOI18N
        jButtonGuardarActividad.setText("Guardar");
        jButtonGuardarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActividadActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGuardarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 120, 40));

        jComboProyectoActividadNueva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboProyectoActividadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, 30));

        jLabel15.setText("Proyecto:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, -1));

        jButtonDeleteActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/eliminar.png"))); // NOI18N
        jButtonDeleteActividad.setText("Eliminar");
        jButtonDeleteActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActividadActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDeleteActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 120, 40));

        jButtonEditActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/editar.png"))); // NOI18N
        jButtonEditActividad.setText("Editar");
        jButtonEditActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActividadActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonEditActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 40));

        jButtonNewActividad2.setText("Nueva Actividad:");
        jButtonNewActividad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActividad2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonNewActividad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, 20));

        jCheckBoxEstadoActividad.setText("EJECUTADA");
        jPanel4.add(jCheckBoxEstadoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel30.setText("Estado:");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 20));

        jTabPrincipal.addTab("ACTIVIDADES", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableRecursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombres", "Apellidos", "Dirección", "Email", "Fono", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRecursos.getTableHeader().setReorderingAllowed(false);
        jTableRecursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableRecursosMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTableRecursos);
        if (jTableRecursos.getColumnModel().getColumnCount() > 0) {
            jTableRecursos.getColumnModel().getColumn(0).setResizable(false);
            jTableRecursos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 750, 91));
        jPanel5.add(jTextRutRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 140, -1));
        jPanel5.add(jTextNombreRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, -1));

        jComboCargoRecursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboCargoRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 190, -1));

        jLabel16.setText("Rut:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 40, -1));

        jLabel17.setText("Nombres:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, -1));

        jLabel18.setText("Cargo:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Empleados");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Agregar / Editar Empleado");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, -1));

        jButtonGuardarRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/saveButton.png"))); // NOI18N
        jButtonGuardarRecursos.setText("Guardar");
        jButtonGuardarRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRecursosActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonGuardarRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 120, 40));
        jPanel5.add(jTextApellidosRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 190, -1));
        jPanel5.add(jTextDireccionRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 210, -1));

        jTextEmailRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailRecursosActionPerformed(evt);
            }
        });
        jPanel5.add(jTextEmailRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 210, -1));
        jPanel5.add(jTextFonoRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 110, -1));

        jLabel21.setText("Apellidos:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 60, 20));

        jLabel22.setText("Dirección:");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 60, 30));

        jLabel23.setText("Email:");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 40, -1));

        jLabel24.setText("Fono:");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 40, -1));

        jButtonNewRecurso.setText("Nuevo Empleado:");
        jButtonNewRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewRecursoActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonNewRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jButtonDeleteRecurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/eliminar.png"))); // NOI18N
        jButtonDeleteRecurso.setText("Eliminar");
        jButtonDeleteRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteRecursoActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonDeleteRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 120, 40));

        jButtonEditRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/editar.png"))); // NOI18N
        jButtonEditRecursos.setText("Editar");
        jButtonEditRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditRecursosActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonEditRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, 40));

        jTabPrincipal.addTab("RECURSOS", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/pdfButton.png"))); // NOI18N
        jButton1.setText("Guardar En...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Generación de Reportes:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Reporte de Clientes", "Reporte de Proyectos", "Reportes de Empleados" }));
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 200, 40));

        jTabPrincipal.addTab("REPORTES", jPanel6);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Razón Social", "Dirección", "Email", "Fono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableClientesMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTableClientes);
        if (jTableClientes.getColumnModel().getColumnCount() > 0) {
            jTableClientes.getColumnModel().getColumn(0).setResizable(false);
            jTableClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, 750, 100));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Clientes");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 30, 80, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Agregar / Editar Cliente");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, -1));
        jPanel2.add(jTextRutCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, -1));

        jLabel28.setText("Rut:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, -1));

        jLabel29.setText("Razón Social:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 72, -1));
        jPanel2.add(jTextRazonSocialCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, -1));
        jPanel2.add(jTextFonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 110, -1));

        jLabel31.setText("Fono:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 50, -1));

        jLabel32.setText("Email:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 50, -1));

        jTextEmailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jTextEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 210, -1));
        jPanel2.add(jTextDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 210, -1));

        jLabel33.setText("Dirección:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 56, 30));

        jButtonGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/saveButton.png"))); // NOI18N
        jButtonGuardarCliente.setText("Guardar");
        jButtonGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, 40));

        jButtonEditCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/editar.png"))); // NOI18N
        jButtonEditCliente.setText("Editar");
        jButtonEditCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 40));

        jButtonDeleteCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/eliminar.png"))); // NOI18N
        jButtonDeleteCliente.setText("Eliminar");
        jButtonDeleteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDeleteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 120, 40));

        jButtonNewCliente.setText("Nuevo Cliente:");
        jButtonNewCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewClienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNewCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jTabPrincipal.addTab("CLIENTES", jPanel2);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/homeButton.png"))); // NOI18N
        jMenu1.setText("Inicio");

        jMenuInitSesion.setText("Iniciar sesión");
        jMenuInitSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInitSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuInitSesion);

        jMenuCerrarSesion.setText("Cerrar sesión");
        jMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCerrarSesion);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSalir);

        jMenuBarInitSesion.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/unab/erp/projectManager/util/img/configButton.png"))); // NOI18N
        jMenu2.setText("Configuración");

        jMenu3.setText("Parametros");
        jMenu2.add(jMenu3);

        jMenuBarInitSesion.add(jMenu2);

        setJMenuBar(jMenuBarInitSesion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuInitSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInitSesionActionPerformed
        if (login == null || login.isClosed()) {
            login = new Login();
            jPanelPrincipal.add(login);
            login.setVisible(true);
            login.setLocation(240, 90);
        }
    }//GEN-LAST:event_jMenuInitSesionActionPerformed

    private void jTextEmailRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailRecursosActionPerformed

    }//GEN-LAST:event_jTextEmailRecursosActionPerformed

    private void jTextEmailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailClienteActionPerformed

    }//GEN-LAST:event_jTextEmailClienteActionPerformed

    private void jTableProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProjectMouseClicked

    }//GEN-LAST:event_jTableProjectMouseClicked

    private void jButtonGuardarProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarProjectActionPerformed
        if (this.validateFieldProject()) {
            Proyecto proyecto = new Proyecto(null, jTextNombreProject.getText(), jTextInicioProject.getText(), jTextTerminoProject.getText(), EmpleadoUtils.getJefesProyecto().get(jComboJefeProyectoProject.getSelectedIndex()).getRut(), jTextJefeProyectoClienteProject.getText(), ClienteUtils.clientes.get(jComboClienteProject.getSelectedIndex()).getRut());
            proyecto.setDescripcion(jTextResumenProject.getText());
            projectController.save(proyecto);
            this.reLoad();
            this.cleanFieldProject();
            JOptionPane.showMessageDialog(rootPane, "Registro agregado correctamente", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos", "Advertencia", 2);
        }
    }//GEN-LAST:event_jButtonGuardarProjectActionPerformed

    private void jButtonDeleteProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteProjectActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Seguro que quiere eliminar este registro?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String idProject = jTableProject.getValueAt(jTableProject.getSelectedRow(), 0).toString();
            projectController.delete(idProject);
             this.reLoad();
            this.cleanFieldProject();
            jButtonEditProject.setEnabled(false);
            jButtonDeleteProject.setEnabled(false);
            jButtonGuardarProject.setEnabled(true);
            jButtonPDFProject.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonDeleteProjectActionPerformed

    private void jTableProjectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProjectMousePressed
        jTextNombreProject.setText(jTableProject.getValueAt(jTableProject.getSelectedRow(), 1).toString());
        jTextInicioProject.setText(jTableProject.getValueAt(jTableProject.getSelectedRow(), 2).toString());
        jTextTerminoProject.setText(jTableProject.getValueAt(jTableProject.getSelectedRow(), 3).toString());
        jTextJefeProyectoClienteProject.setText(jTableProject.getValueAt(jTableProject.getSelectedRow(), 6).toString());
        jComboJefeProyectoProject.setSelectedItem(jTableProject.getValueAt(jTableProject.getSelectedRow(), 5).toString());
        jComboClienteProject.setSelectedItem(jTableProject.getValueAt(jTableProject.getSelectedRow(), 4).toString());
        jTextResumenProject.setText(ProyectoUtils.getDescriptProjectById(jTableProject.getValueAt(jTableProject.getSelectedRow(), 0).toString()));
        jButtonEditProject.setEnabled(true);
        jButtonGuardarProject.setEnabled(false);
        jButtonDeleteProject.setEnabled(true);
        jButtonPDFProject.setEnabled(true);
       
    }//GEN-LAST:event_jTableProjectMousePressed

    private void jButtonEditProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditProjectActionPerformed
        String idProject = jTableProject.getValueAt(jTableProject.getSelectedRow(), 0).toString();
        Proyecto proyecto = new Proyecto(idProject, jTextNombreProject.getText(), jTextInicioProject.getText(), jTextTerminoProject.getText(), EmpleadoUtils.getJefesProyecto().get(jComboJefeProyectoProject.getSelectedIndex()).getRut(), jTextJefeProyectoClienteProject.getText(), ClienteUtils.clientes.get(jComboClienteProject.getSelectedIndex()).getRut());
        proyecto.setDescripcion(jTextResumenProject.getText());
        projectController.edit(proyecto);
        this.reLoad();
        this.cleanFieldProject();
        jButtonEditProject.setEnabled(false);
        jButtonDeleteProject.setEnabled(false);
        jButtonGuardarProject.setEnabled(true);
        jButtonPDFProject.setEnabled(false);
        JOptionPane.showMessageDialog(rootPane, "Registro editado correctamente", "Exito", 1);
    }//GEN-LAST:event_jButtonEditProjectActionPerformed

    private void jButtonNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewProjectActionPerformed
        jButtonEditProject.setEnabled(false);
        jButtonGuardarProject.setEnabled(true);
        jButtonDeleteProject.setEnabled(false);
        jTableProject.clearSelection();
        this.cleanFieldProject();
    }//GEN-LAST:event_jButtonNewProjectActionPerformed

    private void jTableRecursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRecursosMousePressed
        jTextRutRecurso.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 0).toString());
        jTextNombreRecursos.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 1).toString());
        jTextApellidosRecursos.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 2).toString());
        jTextDireccionRecursos.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 3).toString());
        jTextEmailRecursos.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 4).toString());
        jTextFonoRecursos.setText(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 5).toString());
        jComboCargoRecursos.setSelectedItem(jTableRecursos.getValueAt(jTableRecursos.getSelectedRow(), 6).toString());
        jButtonEditRecursos.setEnabled(true);
        jButtonDeleteRecurso.setEnabled(true);
        jButtonGuardarRecursos.setEnabled(false);
        jTextRutRecurso.setEnabled(false);
    }//GEN-LAST:event_jTableRecursosMousePressed

    private void jButtonNewRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewRecursoActionPerformed
        this.cleanFieldRecursos();
        jTableRecursos.clearSelection();
        jButtonEditRecursos.setEnabled(false);
        jButtonGuardarRecursos.setEnabled(true);
        jButtonDeleteRecurso.setEnabled(false);
        jTextRutRecurso.setEnabled(true);
    }//GEN-LAST:event_jButtonNewRecursoActionPerformed

    private void jButtonDeleteRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteRecursoActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Seguro que quiere eliminar este registro?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String idRecurso = jTextRutRecurso.getText();
            recursosController.delete(idRecurso);
             this.reLoad();
            this.cleanFieldRecursos();
            jButtonEditRecursos.setEnabled(false);
            jButtonDeleteRecurso.setEnabled(false);
            jButtonGuardarRecursos.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDeleteRecursoActionPerformed

    private void jButtonEditRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditRecursosActionPerformed
        String idRecurso = jTextRutRecurso.getText();
        Empleado emp = new Empleado(idRecurso, jTextNombreRecursos.getText(), jTextApellidosRecursos.getText(), jTextDireccionRecursos.getText(), jTextEmailRecursos.getText(), jTextFonoRecursos.getText(), CargoUtils.cargos.get(jComboCargoRecursos.getSelectedIndex()));
        recursosController.edit(emp);
        this.reLoad();
        this.cleanFieldRecursos();
        jButtonEditRecursos.setEnabled(false);
        jButtonDeleteRecurso.setEnabled(false);
        jButtonGuardarRecursos.setEnabled(true);
        JOptionPane.showMessageDialog(rootPane, "Registro editado correctamente", "Exito", 1);
    }//GEN-LAST:event_jButtonEditRecursosActionPerformed

    private void jButtonGuardarRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRecursosActionPerformed
        if (this.validateFieldRecursos()) {
            Empleado emp = new Empleado(jTextRutRecurso.getText(), jTextNombreRecursos.getText(), jTextApellidosRecursos.getText(), jTextDireccionRecursos.getText(), jTextEmailRecursos.getText(), jTextFonoRecursos.getText(), CargoUtils.cargos.get(jComboCargoRecursos.getSelectedIndex()));
            recursosController.save(emp);
             this.reLoad();
            this.cleanFieldRecursos();
            JOptionPane.showMessageDialog(rootPane, "Registro agregado correctamente", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos", "Advertencia", 2);
        }

    }//GEN-LAST:event_jButtonGuardarRecursosActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarSesionActionPerformed
        initSesion();
    }//GEN-LAST:event_jMenuCerrarSesionActionPerformed

    private void jTableActividadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableActividadesMousePressed
        jTextNombreActividad.setText(jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 1).toString());
        jTextInicioActividad.setText(jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 2).toString());
        jTextTerminoActividad.setText(jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 3).toString());
        jComboProyectoActividadNueva.setSelectedItem(jComboProyectoActividad.getSelectedItem());
        jComboProyectoActividadNueva.setEnabled(false);
        jComboRecursoActividad.setSelectedItem(jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 4).toString());
        jButtonEditActividad.setEnabled(true);
        jButtonGuardarActividad.setEnabled(false);
        jButtonDeleteActividad.setEnabled(true);
        jCheckBoxEstadoActividad.setSelected((boolean) jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 5));
    }//GEN-LAST:event_jTableActividadesMousePressed

    private void jButtonDeleteActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActividadActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Seguro que quiere eliminar este registro?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String idActividad = jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 0).toString();
            actividadController.delete(idActividad);
            TableManagerUtil.doTableActividades(jTableActividades, ProyectoUtils.proyectos.get(jComboProyectoActividadNueva.getSelectedIndex()).getId());
            jButtonDeleteActividad.setEnabled(false);
            jButtonEditActividad.setEnabled(false);
            jButtonGuardarActividad.setEnabled(true);
            jComboProyectoActividadNueva.setEnabled(true);
            jCheckBoxEstadoActividad.setSelected(false);
            this.cleanFieldActividad();
        }
    }//GEN-LAST:event_jButtonDeleteActividadActionPerformed

    private void jButtonEditActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActividadActionPerformed
        String idActividad = jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 0).toString();
        Actividad actividad = new Actividad(idActividad, jTextNombreActividad.getText(), jTextInicioActividad.getText(), jTextTerminoActividad.getText(), ProyectoUtils.proyectos.get(jComboProyectoActividadNueva.getSelectedIndex()).getId(), EmpleadoUtils.empleados.get(jComboRecursoActividad.getSelectedIndex()).getRut(), jCheckBoxEstadoActividad.isSelected());
        actividadController.edit(actividad);
        TableManagerUtil.doTableActividades(jTableActividades, ProyectoUtils.proyectos.get(jComboProyectoActividadNueva.getSelectedIndex()).getId());
        this.cleanFieldActividad();
        jButtonDeleteActividad.setEnabled(false);
        jButtonEditActividad.setEnabled(false);
        jButtonGuardarActividad.setEnabled(true);
        jComboProyectoActividadNueva.setEnabled(true);
        jCheckBoxEstadoActividad.setSelected(false);
        JOptionPane.showMessageDialog(rootPane, "Registro editado correctamente", "Exito", 1);

    }//GEN-LAST:event_jButtonEditActividadActionPerformed

    private void jComboProyectoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProyectoActividadActionPerformed
        TableManagerUtil.doTableActividades(jTableActividades, ProyectoUtils.proyectos.get(jComboProyectoActividad.getSelectedIndex()).getId());
        jComboProyectoActividadNueva.setSelectedIndex(jComboProyectoActividad.getSelectedIndex());
        jButtonGuardarActividad.setEnabled(true);
        jButtonDeleteActividad.setEnabled(false);
        jButtonEditActividad.setEnabled(false);
        jComboProyectoActividadNueva.setEnabled(true);
        jCheckBoxEstadoActividad.setSelected(false);
        jComboProyectoActividadNueva.setEnabled(true);
        jCheckBoxEstadoActividad.setSelected(false);
        this.cleanFieldActividad();
    }//GEN-LAST:event_jComboProyectoActividadActionPerformed

    private void jButtonNewActividad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActividad2ActionPerformed
        jButtonGuardarActividad.setEnabled(true);
        jButtonDeleteActividad.setEnabled(false);
        jButtonEditActividad.setEnabled(false);
        jComboProyectoActividadNueva.setEnabled(true);
        jCheckBoxEstadoActividad.setSelected(false);
        jTableActividades.clearSelection();
        this.cleanFieldActividad();
    }//GEN-LAST:event_jButtonNewActividad2ActionPerformed

    private void jButtonGuardarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActividadActionPerformed
        if (this.validateFieldActividad()) {
            Actividad actividad = new Actividad(null, jTextNombreActividad.getText(), jTextInicioActividad.getText(), jTextTerminoActividad.getText(), ProyectoUtils.proyectos.get(jComboProyectoActividadNueva.getSelectedIndex()).getId(), EmpleadoUtils.empleados.get(jComboRecursoActividad.getSelectedIndex()).getRut(), jCheckBoxEstadoActividad.isSelected());
            actividadController.save(actividad);
            TableManagerUtil.doTableActividades(jTableActividades, ProyectoUtils.proyectos.get(jComboProyectoActividadNueva.getSelectedIndex()).getId());
            jComboProyectoActividad.setSelectedIndex(jComboProyectoActividadNueva.getSelectedIndex());
            this.cleanFieldActividad();
            JOptionPane.showMessageDialog(rootPane, "Registro agregado correctamente", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Complete todos los campos", "Advertencia", 2);
        }
    }//GEN-LAST:event_jButtonGuardarActividadActionPerformed

    private void jTableClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMousePressed
        jTextRutCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 0).toString());
        jTextRazonSocialCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 1).toString());
        jTextDireccionCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 2).toString());
        jTextEmailCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 3).toString());
        jTextFonoCliente.setText(jTableClientes.getValueAt(jTableClientes.getSelectedRow(), 4).toString());
        jTextRutCliente.setEnabled(false);
        jButtonEditCliente.setEnabled(true);
        jButtonDeleteCliente.setEnabled(true);
        jButtonGuardarCliente.setEnabled(false);
    }//GEN-LAST:event_jTableClientesMousePressed

    private void jButtonEditClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditClienteActionPerformed
        Cliente cliente = new Cliente(jTextRutCliente.getText(), jTextRazonSocialCliente.getText(), jTextDireccionCliente.getText(), jTextEmailCliente.getText(), jTextFonoCliente.getText());
        clienteController.edit(cliente);
        cleanFieldCliente();
      this.reLoad();
        jTextRutCliente.setEnabled(true);
        jButtonEditCliente.setEnabled(false);
        jButtonDeleteCliente.setEnabled(false);
        jButtonGuardarCliente.setEnabled(true);
         JOptionPane.showMessageDialog(rootPane, "Registro editado correctamente", "Exito", 1);
    }//GEN-LAST:event_jButtonEditClienteActionPerformed

    private void jButtonDeleteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteClienteActionPerformed
  if (JOptionPane.showConfirmDialog(null, "Seguro que quiere eliminar este registro?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        clienteController.delete(jTextRutCliente.getText());
        cleanFieldCliente();
        this.reLoad();
        jTextRutCliente.setEnabled(true);
        jButtonEditCliente.setEnabled(false);
        jButtonDeleteCliente.setEnabled(false);
        jButtonGuardarCliente.setEnabled(true);}
    }//GEN-LAST:event_jButtonDeleteClienteActionPerformed

    private void jButtonGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarClienteActionPerformed
        Cliente cliente = new Cliente(jTextRutCliente.getText(), jTextRazonSocialCliente.getText(), jTextDireccionCliente.getText(), jTextEmailCliente.getText(), jTextFonoCliente.getText());
        clienteController.save(cliente);
        cleanFieldCliente();
        this.reLoad();
    }//GEN-LAST:event_jButtonGuardarClienteActionPerformed

    private void jButtonNewClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewClienteActionPerformed
        jTextRutCliente.setEnabled(true);
        jButtonEditCliente.setEnabled(false);
        jButtonDeleteCliente.setEnabled(false);
        jButtonGuardarCliente.setEnabled(true);
        this.cleanFieldCliente();
        jTableClientes.clearSelection();
    }//GEN-LAST:event_jButtonNewClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      JFileChooser chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("Seleccione donde guardar el Reporte");
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      reporteController.generateReportProyecto(ProyectoUtils.getProject(jTableProject.getValueAt(jTableProject.getSelectedRow(), 1).toString()),  chooser.getCurrentDirectory().getPath());
      }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonPDFProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFProjectActionPerformed
        JFileChooser chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("Seleccione donde guardar el Reporte");
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      reporteController.generateReportProyecto(ProyectoUtils.getProject(jTableProject.getValueAt(jTableProject.getSelectedRow(), 0).toString()),  chooser.getCurrentDirectory().getPath());
      }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_jButtonPDFProjectActionPerformed
    private boolean validateFieldProject() {
        return !(jTextNombreProject.getText().equals("") || jTextInicioProject.getText().equals("") || jTextTerminoProject.getText().equals("") || jTextJefeProyectoClienteProject.getText().equals(""));
    }

    private boolean validateFieldRecursos() {
        return !(jTextRutRecurso.getText().equals("") || jTextNombreRecursos.getText().equals("") || jTextApellidosRecursos.getText().equals("") || jTextEmailRecursos.getText().equals("") || jTextDireccionRecursos.getText().equals("") || jTextFonoRecursos.getText().equals(""));
    }

    private boolean validateFieldActividad() {
        return !(jTextNombreActividad.getText().equals("") || jTextInicioActividad.getText().equals("") || jTextTerminoActividad.getText().equals(""));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeleteActividad;
    private javax.swing.JButton jButtonDeleteCliente;
    private javax.swing.JButton jButtonDeleteProject;
    private javax.swing.JButton jButtonDeleteRecurso;
    private javax.swing.JButton jButtonEditActividad;
    private javax.swing.JButton jButtonEditCliente;
    private javax.swing.JButton jButtonEditProject;
    private javax.swing.JButton jButtonEditRecursos;
    private javax.swing.JButton jButtonGuardarActividad;
    private javax.swing.JButton jButtonGuardarCliente;
    private javax.swing.JButton jButtonGuardarProject;
    private javax.swing.JButton jButtonGuardarRecursos;
    private javax.swing.JButton jButtonNewActividad2;
    private javax.swing.JButton jButtonNewCliente;
    private javax.swing.JButton jButtonNewProject;
    private javax.swing.JButton jButtonNewRecurso;
    private javax.swing.JButton jButtonPDFProject;
    private javax.swing.JCheckBox jCheckBoxEstadoActividad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox jComboCargoRecursos;
    private javax.swing.JComboBox jComboClienteProject;
    private javax.swing.JComboBox jComboJefeProyectoProject;
    private javax.swing.JComboBox jComboProyectoActividad;
    private javax.swing.JComboBox jComboProyectoActividadNueva;
    private javax.swing.JComboBox jComboRecursoActividad;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBarInitSesion;
    public static javax.swing.JMenuItem jMenuCerrarSesion;
    public static javax.swing.JMenuItem jMenuInitSesion;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTabbedPane jTabPrincipal;
    private javax.swing.JTable jTableActividades;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProject;
    private javax.swing.JTable jTableRecursos;
    private javax.swing.JTextField jTextApellidosRecursos;
    private javax.swing.JTextField jTextDireccionCliente;
    private javax.swing.JTextField jTextDireccionRecursos;
    private javax.swing.JTextField jTextEmailCliente;
    private javax.swing.JTextField jTextEmailRecursos;
    private javax.swing.JTextField jTextFonoCliente;
    private javax.swing.JTextField jTextFonoRecursos;
    private javax.swing.JTextField jTextInicioActividad;
    private javax.swing.JTextField jTextInicioProject;
    private javax.swing.JTextField jTextJefeProyectoClienteProject;
    private javax.swing.JTextField jTextNombreActividad;
    private javax.swing.JTextField jTextNombreProject;
    private javax.swing.JTextField jTextNombreRecursos;
    private javax.swing.JTextField jTextRazonSocialCliente;
    private javax.swing.JTextArea jTextResumenProject;
    private javax.swing.JTextField jTextRutCliente;
    private javax.swing.JTextField jTextRutRecurso;
    private javax.swing.JTextField jTextTerminoActividad;
    private javax.swing.JTextField jTextTerminoProject;
    // End of variables declaration//GEN-END:variables
}
