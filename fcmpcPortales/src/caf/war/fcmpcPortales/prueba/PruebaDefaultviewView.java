/**
 * 
 */
package caf.war.fcmpcPortales.prueba;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;
import com.webmethods.caf.faces.data.calendar.CalendarEvent;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "PruebaDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Prueba/default", beanType = BeanType.PAGE)
public class PruebaDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.fcmpcPortales.prueba.Prueba prueba = null;
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 generaMLogico_1 = null;
	private static final String[][] GENERAMLOGICO_1_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraMLogico_1.authCredentials.authenticationMethod}", "1"},
		{"#{GeneraMLogico_1.authCredentials.requiresAuth}", "true"},
		{"#{GeneraMLogico_1.autoRefresh}", "false"},
	};
	private java.lang.String mes;
	private java.lang.String anyo;
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
			Date inicio = new Date();
			 Date fin = new Date();
			 this.setMes("11");
			 this.setAnyo("2015");
			 SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
			 inicio = formateador.parse("01/11/2015");
				fin = formateador.parse("10/11/2015");
			//	this.getCalendar().setCalendarStartDate(inicio);
			//	this.getCalendar().setCalendarEndDate(fin);
		//		this.getCalendar().setInitialDate(inicio);
			 inicio = formateador.parse("11/11/2015");
				fin = formateador.parse("16/11/2015");
			com.webmethods.caf.faces.data.calendar.CalendarEvent[] une= new com.webmethods.caf.faces.data.calendar.CalendarEvent[2]  ;
			une[0] = com.webmethods.caf.faces.data.calendar.CalendarEvent.create(inicio, fin, true, "inicio", "Este es el dato", "valido");
			 inicio = formateador.parse("23/11/2015");
				fin = formateador.parse("26/11/2015");
			une[1] = com.webmethods.caf.faces.data.calendar.CalendarEvent.create(inicio, fin, true, "homero", "Cualquier Dato", "valido");
	//		this.getCalendar().setEvents(une);
	//		this.getCalendar().setEventVar("une");
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.fcmpcPortales.prueba.Prueba getPrueba()  {
		if (prueba == null) {
		    prueba = (caf.war.fcmpcPortales.prueba.Prueba)resolveExpression("#{Prueba}");
		}
		return prueba;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 getGeneraMLogico_1()  {
		if (generaMLogico_1 == null) {
		    generaMLogico_1 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1)resolveExpression("#{GeneraMLogico_1}");
		}
	
	    resolveDataBinding(GENERAMLOGICO_1_PROPERTY_BINDINGS, generaMLogico_1, "generaMLogico_1", false, false);
		return generaMLogico_1;
	}

	public String actionPrueba() {
	    // TODO: implement java method
		Date inicio = new Date();
		 Date fin = new Date();
		 
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		try{
	        
				inicio = formateador.parse("01/11/2015");
				fin = formateador.parse("30/11/2015");
		 //   this.getCalendar().
	 //   this.getMesid().setValue("Diciembre");
	    inicio = formateador.parse("11/11/2015");
		fin = formateador.parse("16/11/2015");
	    com.webmethods.caf.faces.data.calendar.ICalendarEvent [] eventos = new com.webmethods.caf.faces.data.calendar.CalendarEvent[2];
	  // this.getEventListProvider().createRow();
	//   this.getEventListProvider().setArray(arg0);
	    eventos[0] = CalendarEvent.create(inicio, fin, true, "visita", "Alguin Visita", "unico");
	    inicio = formateador.parse("23/11/2015");
		fin = formateador.parse("20/11/2015");
	    eventos[1] = CalendarEvent.create(inicio, fin, true, "visita", "Alguin Visita", "unico");
	 
	    //  this.getCalendar().setEvents(eventos); 
	 //    this.getEventProviderCalendario().setEndDate(fin);
	    //  this.getEventProviderCalendario().new  setEventList(Arrays.asList(eventos));
	//    this.getEventProviderCalendario().setDescription("Prueba Calendario");
	//    this.getEventProviderCalendario().setLabel("PROBANDO");
	   
	  //  this.getUnitProvider().getObject().
		}catch (Exception g){}
		return null;
	}

	public java.lang.String getMes()  {
		
		return mes;
	}

	public void setMes(java.lang.String mes)  {
		this.mes = mes;
	}

	public java.lang.String getAnyo()  {
		
		return anyo;
	}

	public void setAnyo(java.lang.String anyo)  {
		this.anyo = anyo;
	}

	/**
	 * Getter method for the control with id='defaultForm:calendar'
	 */
	
	
}