package caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Web Service Client bean generated for 
 * caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.crearImportacion.
 */
@ManagedBean(name = "CrearImportacion")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class CrearImportacion1 extends com.webmethods.caf.faces.data.ws.wss.WSSContentProvider {

	private static final long serialVersionUID = 1380683821476668416L;
	
	/**
	 * Constructor
	 */
	public CrearImportacion1() {
		super(caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.class,  // port type proxy class
			"crearImportacion", // method to invoke
			new String[] { "crearImportacion", } // method parameter names
		);
		
		// init wsclient
		initParams();
		
		
		// parameters bean
		parameters = new Parameters();
			
		// initial result
		result = null;
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters implements Serializable {

		private static final long serialVersionUID = 855030748359695360L;
		
		public Parameters() {
		}
	
	  
		private caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionE crearImportacion  = new  caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionE() ;

		public caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionE getCrearImportacion() {
			return crearImportacion;
		}

		public void setCrearImportacion(caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionE crearImportacion) {
			this.crearImportacion = crearImportacion;
		}
		
	}
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result bean
	 */
	public caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionResponseE getResult() {
		return (caf.war.CMPC.wsclient.cmpc.proceso.servicios.crearimportacion_wsd.CMPCProcesoServiciosCrearImportacion_WSDStub.CrearImportacionResponseE)result;
	}
	
	
}