/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.model.Proyecto;
import cl.unab.erp.projectManager.util.ClienteUtils;
import cl.unab.erp.projectManager.util.EmpleadoUtils;
import cl.unab.erp.projectManager.util.ProyectoUtils;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author mcamilettimellado
 */
public class ReportesController {

    private String ruta;
    
    public void generateReportProyecto(Proyecto proyecto,String ruta) {
        this.setRuta(ruta);
        Map values = new HashMap();
        values.put("nombre", proyecto.getNombre());
        values.put("cliente", ClienteUtils.getClienteByRut(proyecto.getIdCliente()));
        values.put("fechaInicio", proyecto.getInicio());
        values.put("jp", "Jefe Proyecto Local: " + EmpleadoUtils.getEmpleadoById(proyecto.getRutJpLocal()));
        values.put("empleado", "Jefe Proyecto Cliente: " + proyecto.getJpCliente());
        this.doPDF("reporteProyectos.jrxml", "Reporte_Proyectos.pdf", values);
    }

 
    private void doPDF(String template, String namePdf, Map values) {
        try {
            JasperReport report = JasperCompileManager
                    .compileReport(System.getProperty("user.dir") + "\\src\\cl\\unab\\erp\\projectManager\\reportes\\" + template);

            JasperPrint print = JasperFillManager.fillReport(report, values,
                    new JREmptyDataSource());
          //  JasperViewer.viewReport(print, false);
            JasperExportManager.exportReportToPdfFile(print,
                   this.getRuta()+"\\"+namePdf);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
