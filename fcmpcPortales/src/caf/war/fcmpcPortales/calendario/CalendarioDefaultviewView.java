/**
 * 
 */
package caf.war.fcmpcPortales.calendario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
import com.webmethods.caf.faces.component.panel.StaticRow;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "CalendarioDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Calendario/default", beanType = BeanType.PAGE)
public class CalendarioDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private com.webmethods.caf.faces.component.panel.StaticRow nuevo = new com.webmethods.caf.faces.component.panel.StaticRow();
	private com.webmethods.caf.faces.component.panel.StaticCell otro = new com.webmethods.caf.faces.component.panel.StaticCell();
	private com.webmethods.caf.faces.component.standard.HtmlOutputText eli = new com.webmethods.caf.faces.component.standard.HtmlOutputText();
	
	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private transient caf.war.fcmpcPortales.calendario.Calendario calendario = null;
	private java.lang.String lunes;
	private java.lang.String martes;
	private java.lang.String miercoles;
	private java.lang.String jueves;
	private java.lang.String viernes;
	private java.lang.String sabado;
	private java.lang.String domingo;
	private transient caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.GeneraCalendario generaCalendario = null;
	private static final String[][] GENERACALENDARIO_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraCalendario.authCredentials.authenticationMethod}", "1"},
		{"#{GeneraCalendario.authCredentials.requiresAuth}", "true"},
		{"#{GeneraCalendario.autoRefresh}", "false"},
	};
	private java.lang.String nmes;
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
			
			this.getGeneraCalendario().getParameters().getGeneraCalendario().getGeneraCalendario().getEntrada().setAnyo(this.getCalendario().getAnyo());
			this.getGeneraCalendario().getParameters().getGeneraCalendario().getGeneraCalendario().getEntrada().setMes(this.getCalendario().getMes());
			this.getGeneraCalendario().refresh();
			 int month = Integer.parseInt(this.getCalendario().getMes());
			 String monthString;
		        switch (month) {
		            case 1:  monthString = "Enero";
		                     break;
		            case 2:  monthString = "Febrero";
		                     break;
		            case 3:  monthString = "Marzo";
		                     break;
		            case 4:  monthString = "Abril";
		                     break;
		            case 5:  monthString = "Mayo";
		                     break;
		            case 6:  monthString = "Junio";
		                     break;
		            case 7:  monthString = "Julio";
		                     break;
		            case 8:  monthString = "Agosto";
		                     break;
		            case 9:  monthString = "Septiembre";
		                     break;
		            case 10: monthString = "Octubre";
		                     break;
		            case 11: monthString = "Noviembre";
		                     break;
		            case 12: monthString = "Deciembre";
		                     break;
		            default: monthString = "valor invalido";
		                     break;
		        }
		        this.setNmes(monthString);
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.fcmpcPortales.calendario.Calendario getCalendario()  {
		if (calendario == null) {
		    calendario = (caf.war.fcmpcPortales.calendario.Calendario)resolveExpression("#{Calendario}");
		}
		return calendario;
	}

	public java.lang.String getLunes()  {
		
		return lunes;
	}

	public void setLunes(java.lang.String lunes)  {
		this.lunes = lunes;
	}

	public java.lang.String getMartes()  {
		
		return martes;
	}

	public void setMartes(java.lang.String martes)  {
		this.martes = martes;
	}

	public java.lang.String getMiercoles()  {
		
		return miercoles;
	}

	public void setMiercoles(java.lang.String miercoles)  {
		this.miercoles = miercoles;
	}

	public java.lang.String getJueves()  {
		
		return jueves;
	}

	public void setJueves(java.lang.String jueves)  {
		this.jueves = jueves;
	}

	public java.lang.String getViernes()  {
		
		return viernes;
	}

	public void setViernes(java.lang.String viernes)  {
		this.viernes = viernes;
	}

	public java.lang.String getSabado()  {
		
		return sabado;
	}

	public void setSabado(java.lang.String sabado)  {
		this.sabado = sabado;
	}

	public java.lang.String getDomingo()  {
		
		return domingo;
	}

	public void setDomingo(java.lang.String domingo)  {
		this.domingo = domingo;
	}

	public caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.GeneraCalendario getGeneraCalendario()  {
		if (generaCalendario == null) {
		    generaCalendario = (caf.war.fcmpcPortales.wsclient.calendario.service.generacalendario_wsd.GeneraCalendario)resolveExpression("#{GeneraCalendario}");
		}
	
	    resolveDataBinding(GENERACALENDARIO_PROPERTY_BINDINGS, generaCalendario, "generaCalendario", false, false);
		return generaCalendario;
	}

	public java.lang.String getNmes()  {
		
		return nmes;
	}

	public void setNmes(java.lang.String nmes)  {
		this.nmes = nmes;
	}
	
}