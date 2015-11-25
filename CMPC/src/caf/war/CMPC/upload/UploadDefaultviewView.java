/**
 * 
 */
package caf.war.CMPC.upload;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import util.FileUploader;

import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author simbius
 *
 */

@ManagedBean(name = "UploadDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Upload/default", beanType = BeanType.PAGE)
public class UploadDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.CMPC.upload.Upload upload = null;
	private org.apache.commons.fileupload.FileItem fileItem = null;
	private static final String[][] FILEITEM_PROPERTY_BINDINGS = new String[][] {
	};
	private java.lang.String idProyecto;
	private transient caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CrearImportacion1 crearImportacion = null;
	private static final String[][] CREARIMPORTACION_PROPERTY_BINDINGS = new String[][] {
		{"#{CrearImportacion.authCredentials.authenticationMethod}", "1"},
		{"#{CrearImportacion.authCredentials.requiresAuth}", "true"},
		{"#{CrearImportacion.autoRefresh}", "false"},
	};
	private transient caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.UploadPlanilla1 uploadPlanilla = null;
	private static final String[][] UPLOADPLANILLA_PROPERTY_BINDINGS = new String[][] {
		{"#{UploadPlanilla.authCredentials.authenticationMethod}", "1"},
		{"#{UploadPlanilla.authCredentials.requiresAuth}", "true"},
		{"#{UploadPlanilla.autoRefresh}", "false"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.CMPC.upload.Upload getUpload()  {
		if (upload == null) {
		    upload = (caf.war.CMPC.upload.Upload)resolveExpression("#{Upload}");
		}
		return upload;
	}

	public org.apache.commons.fileupload.FileItem getFileItem()  {
		if (fileItem == null) {
			//TODO: create/set default value here
		}
	
	    resolveDataBinding(FILEITEM_PROPERTY_BINDINGS, fileItem, "fileItem", false, false);
		return fileItem;
	}

	public void setFileItem(org.apache.commons.fileupload.FileItem fileItem)  {
		this.fileItem = fileItem;
	}

	public String actionUpload() {
		try {
			getCrearImportacion().getParameters().getCrearImportacion().getCrearImportacion().setIdProyecto(getIdProyecto());
			getCrearImportacion().refresh();
			String idImportacion = getCrearImportacion().getResult().getCrearImportacionResponse().getIdImportacion();
			String path = FileUploader.uploadFile(getFileItem().getName(), getFileItem().get());
			
			getUploadPlanilla().getParameters().getUploadPlanilla().getUploadPlanilla().setNombreArchivo(path);
			getUploadPlanilla().getParameters().getUploadPlanilla().getUploadPlanilla().setIdImportacion(idImportacion);
			getUploadPlanilla().refresh();
			String resultado = getUploadPlanilla().getResult().getUploadPlanillaResponse().getResultadoLectura();
			if (!resultado.equalsIgnoreCase("Ok")) {
				getFacesContext().addMessage(null, new FacesMessage(resultado));
			} else {
				getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Archivo subido exitosamente", null));
			}
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			getFacesContext().addMessage(null, new FacesMessage("Error al subir: " + e.getMessage(), sw.toString()));
		}
	    
		return null;
	}

	public java.lang.String getIdProyecto()  {
		
		return idProyecto;
	}

	public void setIdProyecto(java.lang.String idProyecto)  {
		this.idProyecto = idProyecto;
	}

	public caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CrearImportacion1 getCrearImportacion()  {
		if (crearImportacion == null) {
		    crearImportacion = (caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CrearImportacion1)resolveExpression("#{CrearImportacion}");
		}
	
	    resolveDataBinding(CREARIMPORTACION_PROPERTY_BINDINGS, crearImportacion, "crearImportacion", false, false);
		return crearImportacion;
	}

	public caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.UploadPlanilla1 getUploadPlanilla()  {
		if (uploadPlanilla == null) {
		    uploadPlanilla = (caf.war.CMPC.wsclient.cmpc.proceso.servicios.uploadplanilla_wsd.UploadPlanilla1)resolveExpression("#{UploadPlanilla}");
		}
	
	    resolveDataBinding(UPLOADPLANILLA_PROPERTY_BINDINGS, uploadPlanilla, "uploadPlanilla", false, false);
		return uploadPlanilla;
	}

	
}