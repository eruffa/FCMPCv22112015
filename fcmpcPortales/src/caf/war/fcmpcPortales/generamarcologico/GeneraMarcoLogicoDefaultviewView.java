/**
 * 
 */
package caf.war.fcmpcPortales.generamarcologico;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */

@ManagedBean(name = "GeneraMarcoLogicoDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "GeneraMarcoLogico/default", beanType = BeanType.PAGE)
public class GeneraMarcoLogicoDefaultviewView  extends   com.webmethods.caf.faces.bean.BasePageBean {

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
	private transient caf.war.fcmpcPortales.generamarcologico.GeneraMarcoLogico generaMarcoLogico = null;
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 generaMLogico_1 = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivoProvider = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosEspecificosProvider = null;
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider osupuestosProvider = null;
	private static final String[][] OSUPUESTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{OsupuestosProvider.rowType}", "java.lang.String"},
		{"#{OsupuestosProvider.rowVariable}", "osupuesto"},
	};
	private static final String[][] OBJETIVOPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{objetivoProvider.rowType}", "caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Objetivo"},
		{"#{objetivoProvider.rowVariable}", "objetivo"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos leeTablaModelos = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider = null;
	private static final String[][] SOLUCIONPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider.rowVariable}", "solucion"},
		{"#{solucionProvider.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaModelos.result.leeTablaModelosResponse.modelos.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo leeTablaObjetivo = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider2 = null;
	private static final String[][] SOLUCIONPROVIDER2_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider2.rowVariable}", "solucion"},
		{"#{solucionProvider2.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider2.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaObjetivo.result.leeTablaObjetivoResponse.rtabla.solucion}"},
	};
	private static final String[][] LEETABLAOBJETIVO_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivo.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivo.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivo.autoRefresh}", "true"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis leeTablaKpis = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider3 = null;
	private static final String[][] SOLUCIONPROVIDER3_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider3.rowVariable}", "solucion"},
		{"#{solucionProvider3.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider3.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaKpis.result.leeTablaKpisResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV leeTablaMV = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider4 = null;
	private static final String[][] SOLUCIONPROVIDER4_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider4.rowVariable}", "solucion"},
		{"#{solucionProvider4.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider4.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaMV.result.leeTablaMVResponse.rtabla.solucion}"},
	};
	private static final String[][] LEETABLAMV_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaMV.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaMV.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaMV.autoRefresh}", "true"},
	};
	private static final String[][] LEETABLAKPIS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaKpis.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaKpis.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaKpis.autoRefresh}", "true"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente leeTablaComponente = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider5 = null;
	private static final String[][] LEETABLACOMPONENTE_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaComponente.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaComponente.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaComponente.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER5_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider5.rowVariable}", "solucion"},
		{"#{solucionProvider5.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider5.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaComponente.result.leeTablaComponenteResponse.rtabla.solucion}"},
	};
	private static final String[][] OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{objetivosEspecificosProvider.rowType}", "caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$ObjetivosEspecificos"},
		{"#{objetivosEspecificosProvider.rowVariable}", "objetivosEspecifico"},
		
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider especificosProvider = null;
	private static final String[][] ESPECIFICOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EspecificosProvider.rowType}", "caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Especificos"},
		{"#{EspecificosProvider.rowVariable}", "especifico"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider rsupuestosProvider = null;
	private static final String[][] RSUPUESTOSPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{RsupuestosProvider.rowType}", "java.lang.String"},
		{"#{RsupuestosProvider.rowVariable}", "rsupuesto"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider estrategiaProvider = null;
	private static final String[][] ESTRATEGIAPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{EstrategiaProvider.rowType}", "caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Estrategia"},
		{"#{EstrategiaProvider.rowVariable}", "estrategia"},
	};
	private static final String[][] GENERAMLOGICO_1_PROPERTY_BINDINGS = new String[][] {
		{"#{generaMLogico_1.authCredentials.authenticationMethod}", "1"},
		{"#{generaMLogico_1.authCredentials.requiresAuth}", "true"},
		{"#{generaMLogico_1.autoRefresh}", "false"},
		{"#{generaMLogico_1.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.objetivo}", "#{GeneraMarcoLogicoDefaultviewView.objetivoProvider.array}"},
		{"#{generaMLogico_1.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.objetivosEspecificos}", "#{GeneraMarcoLogicoDefaultviewView.objetivosEspecificosProvider.array}"},
		//{"#{generaMLogico_1.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.objetivosEspecificos.objetivosEspecifico.estrategia}", "#{GeneraMarcoLogicoDefaultviewView.estrategiaProvider.array}"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider tipoParticipanteProvider = null;
	private static final String[][] TIPOPARTICIPANTEPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TipoParticipanteProvider.rowType}", "java.lang.String"},
		{"#{TipoParticipanteProvider.rowVariable}", "tipoParticipante"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider cicloProvider = null;
	private static final String[][] CICLOPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{CicloProvider.rowType}", "caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub$Ciclo"},
		{"#{CicloProvider.rowVariable}", "ciclo"},
	};
	private transient com.webmethods.caf.faces.data.object.ListTableContentProvider objetivosXactividadProvider = null;
	private static final String[][] OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{ObjetivosXactividadProvider.rowType}", "java.lang.String"},
		{"#{ObjetivosXactividadProvider.rowVariable}", "objetivosXactividad"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct leeTablaTipAct = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider6 = null;
	private static final String[][] LEETABLATIPACT_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipAct.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipAct.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipAct.autoRefresh}", "true"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria leeTablaCategoria = null;
	private static final String[][] SOLUCIONPROVIDER6_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider6.rowVariable}", "solucion"},
		{"#{solucionProvider6.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider6.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaTipAct.result.leeTablaTipActResponse.rtabla.solucion}"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider7 = null;
	private static final String[][] LEETABLACATEGORIA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaCategoria.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaCategoria.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaCategoria.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER7_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider7.rowVariable}", "solucion"},
		{"#{solucionProvider7.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider7.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaCategoria.result.leeTablaCategoriaResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea leeTablaArea = null;
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider8 = null;
	private static final String[][] LEETABLAAREA_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaArea.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaArea.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaArea.autoRefresh}", "true"},
	};
	private static final String[][] SOLUCIONPROVIDER8_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider8.rowVariable}", "solucion"},
		{"#{solucionProvider8.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider8.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaArea.result.leeTablaAreaResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel leeTablaNivel = null;
	private static final String[][] LEETABLANIVEL_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaNivel.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaNivel.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaNivel.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider9 = null;
	private static final String[][] SOLUCIONPROVIDER9_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider9.rowVariable}", "solucion"},
		{"#{solucionProvider9.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider9.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaNivel.result.leeTablaNivelResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar leeTablaTipoPar = null;
	private static final String[][] LEETABLATIPOPAR_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaTipoPar.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaTipoPar.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaTipoPar.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider10 = null;
	private static final String[][] SOLUCIONPROVIDER10_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider10.rowVariable}", "solucion"},
		{"#{solucionProvider10.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider10.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider10.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaTipoPar.result.leeTablaTipoParResponse.rtabla.solucion}"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos leeTablaObjetivos = null;
	private static final String[][] LEETABLAOBJETIVOS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaObjetivos.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaObjetivos.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaObjetivos.autoRefresh}", "true"},
	};
	private transient com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider solucionProvider11 = null;
	private static final String[][] SOLUCIONPROVIDER11_PROPERTY_BINDINGS = new String[][] {
		{"#{solucionProvider11.rowVariable}", "solucion"},
		{"#{solucionProvider11.valueBinding}", "#{solucion.valor}"},
		{"#{solucionProvider11.labelBinding}", "#{solucion.valor}"},
		{"#{solucionProvider11.array}", "#{GeneraMarcoLogicoDefaultviewView.leeTablaObjetivos.result.leeTablaObjetivosResponse.rtabla.solucion}"},
	};
	private java.lang.String propertyTipoProyecto;

//	@ManagedProperty(value = "#{GeneraMarcoLogicoDefaultviewView.generaMarcoLogico.tipoProyecto}")
	private java.lang.String propertyPYT;
	private static final String[][] LEETABLAMODELOS_PROPERTY_BINDINGS = new String[][] {
		{"#{leeTablaModelos.authCredentials.authenticationMethod}", "1"},
		{"#{leeTablaModelos.authCredentials.requiresAuth}", "true"},
		{"#{leeTablaModelos.autoRefresh}", "true"},
	};
	private transient caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getMLogico = null;
	private static final String[][] GETMLOGICO_PROPERTY_BINDINGS = new String[][] {
		{"#{GetMLogico.authCredentials.authenticationMethod}", "1"},
		{"#{GetMLogico.authCredentials.requiresAuth}", "true"},
		{"#{GetMLogico.autoRefresh}", "false"},
	};
	private static final String[][] ACTIONRECUPERAR_PROPERTY_BINDINGS = new String[][] {
		{"#{GeneraMarcoLogicoDefaultviewView.getMLogico.parameters.getMLogico.getMLogico.entrada.tipoDocumento}", "#{GeneraMarcoLogicoDefaultviewView.generaMLogico_1.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1.nombrePro}"},
		{"#{GeneraMarcoLogicoDefaultviewView.getMLogico.refresh}", null},
		{"#{GeneraMarcoLogicoDefaultviewView.generaMLogico_1.parameters.generaMLogico_1.generaMLogico_1.marcoLogicoV1}", "#{GeneraMarcoLogicoDefaultviewView.getMLogico.result.getMLogicoResponse.marcoLogicoV1}"},
	};
	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
			//caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo alafa;
			//alafa.setOsupuestos(param);
			String alfa = this.getGeneraMarcoLogico().getTipoProyecto();
			this.setPropertyPYT(alfa);
			if (alfa.length()>1)
			{
				this.getGeneraMLogico_1().getParameters().getGeneraMLogico_1().getGeneraMLogico_1().getMarcoLogicoV1().setNombrePro(alfa);
				String nil = this.actionRecuperar();
			}
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	public caf.war.fcmpcPortales.generamarcologico.GeneraMarcoLogico getGeneraMarcoLogico()  {
		if (generaMarcoLogico == null) {
		    generaMarcoLogico = (caf.war.fcmpcPortales.generamarcologico.GeneraMarcoLogico)resolveExpression("#{GeneraMarcoLogico}");
		}
		return generaMarcoLogico;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1 getGeneraMLogico_1()  {
		if (generaMLogico_1 == null) {
		    generaMLogico_1 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.GeneraMLogico_1)resolveExpression("#{GeneraMLogico_1}");
		}
	
	    resolveDataBinding(GENERAMLOGICO_1_PROPERTY_BINDINGS, generaMLogico_1, "generaMLogico_1", false, false);
		return generaMLogico_1;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivoProvider()  {
		if (objetivoProvider == null) {
		    objetivoProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivoProvider}");
		}
	
	    resolveDataBinding(OBJETIVOPROVIDER_PROPERTY_BINDINGS, objetivoProvider, "objetivoProvider", false, false);
		return objetivoProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosEspecificosProvider()  {
		if (objetivosEspecificosProvider == null) {
		    objetivosEspecificosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosEspecificosProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSESPECIFICOSPROVIDER_PROPERTY_BINDINGS, objetivosEspecificosProvider, "objetivosEspecificosProvider", false, false);
		return objetivosEspecificosProvider;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getOsupuestosProvider()  {
		if (osupuestosProvider == null) {
		    osupuestosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{OsupuestosProvider}");
		}
	
	    resolveDataBinding(OSUPUESTOSPROVIDER_PROPERTY_BINDINGS, osupuestosProvider, "osupuestosProvider", false, false);
		return osupuestosProvider;
	}

	public void setOsupuestosProvider(com.webmethods.caf.faces.data.object.ListTableContentProvider osupuestosProvider)  {
		this.osupuestosProvider = osupuestosProvider;
	}

	public String actionCuenta() {
	    // TODO: implement java method
	   caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo) this.getObjetivoProvider().getCurrentRow();
	   String [] todos = (String[]) this.getOsupuestosProvider().getArray();
	   elemento.setOsupuestos(todos);
	   this.getObjetivoProvider().setCurrentRow(elemento);
	   this.getOsupuestosProvider().setArray(new String[0]);
	   this.getSupuestos1().setVisible(false);
	  // error(elemento.getOindicador());
		return null;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos getLeeTablaModelos()  {
		if (leeTablaModelos == null) {
		    leeTablaModelos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamodelos_wsd.LeeTablaModelos)resolveExpression("#{LeeTablaModelos}");
		}
	
	    resolveDataBinding(LEETABLAMODELOS_PROPERTY_BINDINGS, leeTablaModelos, "leeTablaModelos", false, false);
		return leeTablaModelos;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider()  {
		if (solucionProvider == null) {
		    solucionProvider = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER_PROPERTY_BINDINGS, solucionProvider, "solucionProvider", false, false);
		return solucionProvider;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo getLeeTablaObjetivo()  {
		if (leeTablaObjetivo == null) {
		    leeTablaObjetivo = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivo_wsd.LeeTablaObjetivo)resolveExpression("#{LeeTablaObjetivo}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVO_PROPERTY_BINDINGS, leeTablaObjetivo, "leeTablaObjetivo", false, false);
		return leeTablaObjetivo;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider2()  {
		if (solucionProvider2 == null) {
		    solucionProvider2 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider2}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER2_PROPERTY_BINDINGS, solucionProvider2, "solucionProvider2", false, false);
		return solucionProvider2;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis getLeeTablaKpis()  {
		if (leeTablaKpis == null) {
		    leeTablaKpis = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablakpis_wsd.LeeTablaKpis)resolveExpression("#{LeeTablaKpis}");
		}
	
	    resolveDataBinding(LEETABLAKPIS_PROPERTY_BINDINGS, leeTablaKpis, "leeTablaKpis", false, false);
		return leeTablaKpis;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider3()  {
		if (solucionProvider3 == null) {
		    solucionProvider3 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider3}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER3_PROPERTY_BINDINGS, solucionProvider3, "solucionProvider3", false, false);
		return solucionProvider3;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV getLeeTablaMV()  {
		if (leeTablaMV == null) {
		    leeTablaMV = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablamv_wsd.LeeTablaMV)resolveExpression("#{LeeTablaMV}");
		}
	
	    resolveDataBinding(LEETABLAMV_PROPERTY_BINDINGS, leeTablaMV, "leeTablaMV", false, false);
		return leeTablaMV;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider4()  {
		if (solucionProvider4 == null) {
		    solucionProvider4 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider4}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER4_PROPERTY_BINDINGS, solucionProvider4, "solucionProvider4", false, false);
		return solucionProvider4;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente getLeeTablaComponente()  {
		if (leeTablaComponente == null) {
		    leeTablaComponente = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacomponente_wsd.LeeTablaComponente)resolveExpression("#{LeeTablaComponente}");
		}
	
	    resolveDataBinding(LEETABLACOMPONENTE_PROPERTY_BINDINGS, leeTablaComponente, "leeTablaComponente", false, false);
		return leeTablaComponente;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider5()  {
		if (solucionProvider5 == null) {
		    solucionProvider5 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider5}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER5_PROPERTY_BINDINGS, solucionProvider5, "solucionProvider5", false, false);
		return solucionProvider5;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEspecificosProvider()  {
		if (especificosProvider == null) {
		    especificosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EspecificosProvider}");
		}
	
	    resolveDataBinding(ESPECIFICOSPROVIDER_PROPERTY_BINDINGS, especificosProvider, "especificosProvider", false, false);
		return especificosProvider;
	}

	public String actionRegistraIndicadores() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos [] todos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos[]) this.getEspecificosProvider().getArray();
		  elemento.setEspecificos(todos);
		  this.getObjetivosEspecificosProvider().setCurrentRow(elemento);
		  this.getEspecificosProvider().setArray(new caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos[0]);
	    
		return null;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getRsupuestosProvider()  {
		if (rsupuestosProvider == null) {
		    rsupuestosProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{RsupuestosProvider}");
		}
	
	    resolveDataBinding(RSUPUESTOSPROVIDER_PROPERTY_BINDINGS, rsupuestosProvider, "rsupuestosProvider", false, false);
		return rsupuestosProvider;
	}

	public String actionGuardaSupuestos() {
	    // TODO: implement java method
		caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos) this.getEspecificosProvider().getCurrentRow();
		   String [] todos = (String[]) this.getRsupuestosProvider().getArray();
		 //  int a = this..getRowIndex();
		  // error("Este es el valor="+Integer.toString(a));
		   elemento.setRsupuestos(todos);
		   this.getEspecificosProvider().setCurrentRow(elemento);
		   this.getRsupuestosProvider().setArray(new String[0]);
		return null;
	}

	/**
	 * Action Event Handler for the control with id='button'
	 */
	public String button_action() {
	    // TODO: perform your action logic here
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		   String [] todos = (String[]) this.getRsupuestosProvider().getArray();
		   int a = this.getObjetivosEspecificosProvider().getRowIndex();
		  // error("Este es el valor="+Integer.toString(a));
		 //  elemento.getEspecificos()[this.getObjetivosEspecificosProvider().getRowIndex()].setRsupuestos(todos);
		   this.getObjetivoProvider().setCurrentRow(elemento);
		   this.getOsupuestosProvider().setArray(new String[0]);
	    return null;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getEstrategiaProvider()  {
		if (estrategiaProvider == null) {
		    estrategiaProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{EstrategiaProvider}");
		}
	
	    resolveDataBinding(ESTRATEGIAPROVIDER_PROPERTY_BINDINGS, estrategiaProvider, "estrategiaProvider", false, false);
		return estrategiaProvider;
	}

	public String actionGuardaActividad() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia [] todos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia[]) this.getEstrategiaProvider().getArray();
		  elemento.setEstrategia(todos);
		  this.getObjetivosEspecificosProvider().setCurrentRow(elemento);
		  this.getEstrategiaProvider().setArray(new caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia[0]);
	    
		return null;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getTipoParticipanteProvider()  {
		if (tipoParticipanteProvider == null) {
		    tipoParticipanteProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{TipoParticipanteProvider}");
		}
	
	    resolveDataBinding(TIPOPARTICIPANTEPROVIDER_PROPERTY_BINDINGS, tipoParticipanteProvider, "tipoParticipanteProvider", false, false);
		return tipoParticipanteProvider;
	}

	public String actionGuardaParticipante() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
		   String [] todos = (String[]) this.getTipoParticipanteProvider().getArray();
		   int a = this.getObjetivosEspecificosProvider().getRowIndex();
		  // error("Este es el valor="+Integer.toString(a));
		 //  elemento.getEspecificos()[this.getObjetivosEspecificosProvider().getRowIndex()].setRsupuestos(todos);
		   elemento.setTipoParticipante(todos);
		   this.getEstrategiaProvider().setCurrentRow(elemento);
		   this.getTipoParticipanteProvider().setArray(new String[0]);
		return null;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getCicloProvider()  {
		if (cicloProvider == null) {
		    cicloProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{CicloProvider}");
		}
	
	    resolveDataBinding(CICLOPROVIDER_PROPERTY_BINDINGS, cicloProvider, "cicloProvider", false, false);
		return cicloProvider;
	}

	public String actionGuardaCiclo() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo [] todos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo[]) this.getCicloProvider().getArray();
		  elemento.setCiclo(todos);
		  this.getEstrategiaProvider().setCurrentRow(elemento);
		  this.getCicloProvider().setArray(new caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo[0]);
	    
		return null;
	}

	public com.webmethods.caf.faces.data.object.ListTableContentProvider getObjetivosXactividadProvider()  {
		if (objetivosXactividadProvider == null) {
		    objetivosXactividadProvider = (com.webmethods.caf.faces.data.object.ListTableContentProvider)resolveExpression("#{ObjetivosXactividadProvider}");
		}
	
	    resolveDataBinding(OBJETIVOSXACTIVIDADPROVIDER_PROPERTY_BINDINGS, objetivosXactividadProvider, "objetivosXactividadProvider", false, false);
		return objetivosXactividadProvider;
	}

	public String actionGuardaObjetivo() {
	    // TODO: implement java method
		caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
		   String [] todos = (String[]) this.getObjetivosXactividadProvider().getArray();
		   elemento.setObjetivosXactividad(todos);
		   this.getEstrategiaProvider().setCurrentRow(elemento);
		   this.getObjetivosXactividadProvider().setArray(new String[0]);
	    
		return null;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct getLeeTablaTipAct()  {
		if (leeTablaTipAct == null) {
		    leeTablaTipAct = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipact_wsd.LeeTablaTipAct)resolveExpression("#{LeeTablaTipAct}");
		}
	
	    resolveDataBinding(LEETABLATIPACT_PROPERTY_BINDINGS, leeTablaTipAct, "leeTablaTipAct", false, false);
		return leeTablaTipAct;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider6()  {
		if (solucionProvider6 == null) {
		    solucionProvider6 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider6}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER6_PROPERTY_BINDINGS, solucionProvider6, "solucionProvider6", false, false);
		return solucionProvider6;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria getLeeTablaCategoria()  {
		if (leeTablaCategoria == null) {
		    leeTablaCategoria = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablacategoria_wsd.LeeTablaCategoria)resolveExpression("#{LeeTablaCategoria}");
		}
	
	    resolveDataBinding(LEETABLACATEGORIA_PROPERTY_BINDINGS, leeTablaCategoria, "leeTablaCategoria", false, false);
		return leeTablaCategoria;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider7()  {
		if (solucionProvider7 == null) {
		    solucionProvider7 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider7}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER7_PROPERTY_BINDINGS, solucionProvider7, "solucionProvider7", false, false);
		return solucionProvider7;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea getLeeTablaArea()  {
		if (leeTablaArea == null) {
		    leeTablaArea = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaarea_wsd.LeeTablaArea)resolveExpression("#{LeeTablaArea}");
		}
	
	    resolveDataBinding(LEETABLAAREA_PROPERTY_BINDINGS, leeTablaArea, "leeTablaArea", false, false);
		return leeTablaArea;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider8()  {
		if (solucionProvider8 == null) {
		    solucionProvider8 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider8}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER8_PROPERTY_BINDINGS, solucionProvider8, "solucionProvider8", false, false);
		return solucionProvider8;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel getLeeTablaNivel()  {
		if (leeTablaNivel == null) {
		    leeTablaNivel = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablanivel_wsd.LeeTablaNivel)resolveExpression("#{LeeTablaNivel}");
		}
	
	    resolveDataBinding(LEETABLANIVEL_PROPERTY_BINDINGS, leeTablaNivel, "leeTablaNivel", false, false);
		return leeTablaNivel;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider9()  {
		if (solucionProvider9 == null) {
		    solucionProvider9 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider9}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER9_PROPERTY_BINDINGS, solucionProvider9, "solucionProvider9", false, false);
		return solucionProvider9;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar getLeeTablaTipoPar()  {
		if (leeTablaTipoPar == null) {
		    leeTablaTipoPar = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablatipopar_wsd.LeeTablaTipoPar)resolveExpression("#{LeeTablaTipoPar}");
		}
	
	    resolveDataBinding(LEETABLATIPOPAR_PROPERTY_BINDINGS, leeTablaTipoPar, "leeTablaTipoPar", false, false);
		return leeTablaTipoPar;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider10()  {
		if (solucionProvider10 == null) {
		    solucionProvider10 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider10}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER10_PROPERTY_BINDINGS, solucionProvider10, "solucionProvider10", false, false);
		return solucionProvider10;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos getLeeTablaObjetivos()  {
		if (leeTablaObjetivos == null) {
		    leeTablaObjetivos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.leetablaobjetivos_wsd.LeeTablaObjetivos)resolveExpression("#{LeeTablaObjetivos}");
		}
	
	    resolveDataBinding(LEETABLAOBJETIVOS_PROPERTY_BINDINGS, leeTablaObjetivos, "leeTablaObjetivos", false, false);
		return leeTablaObjetivos;
	}

	public com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider getSolucionProvider11()  {
		if (solucionProvider11 == null) {
		    solucionProvider11 = (com.webmethods.caf.faces.data.object.BoundPropertiesSelectItemGroupProvider)resolveExpression("#{SolucionProvider11}");
		}
	
	    resolveDataBinding(SOLUCIONPROVIDER11_PROPERTY_BINDINGS, solucionProvider11, "solucionProvider11", false, false);
		return solucionProvider11;
	}

	public java.lang.String getPropertyTipoProyecto()  {
		
		return propertyTipoProyecto;
	}

	public void setPropertyTipoProyecto(java.lang.String propertyTipoProyecto)  {
		this.propertyTipoProyecto = propertyTipoProyecto;
	}

	public String actionInvoca() {
	    // TODO: implement java method
		if (this.getPropertyTipoProyecto().length()>1)
		{
			this.log("Dentro de los procesos en el if de asignacion de nombre proyecto");
			this.getGeneraMLogico_1().getParameters().getGeneraMLogico_1().getGeneraMLogico_1().getMarcoLogicoV1().setNombrePro(this.getPropertyTipoProyecto());
		}
		this.log("previo al General.Refresh()");
		this.getGeneraMLogico_1().refresh();
	    
		return null;
	}

	public java.lang.String getPropertyPYT()  {
		
		return propertyPYT;
	}

	public void setPropertyPYT(java.lang.String propertyPYT)  {
		this.propertyPYT = propertyPYT;
	}

	/**
	 * Action Event Handler for the control with id='button1'
	 */
	public String button1_action() {
	    // TODO: perform your action logic here
		
	    error("Este es el valor="+this.getPropertyPYT());
	 
	    return null;
	}

	public caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico getGetMLogico()  {
		if (getMLogico == null) {
		    getMLogico = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.getmlogico_wsd.GetMLogico)resolveExpression("#{GetMLogico}");
		}
	
	    resolveDataBinding(GETMLOGICO_PROPERTY_BINDINGS, getMLogico, "getMLogico", false, false);
		return getMLogico;
	}

	public String actionRecuperar() {
	    resolveDataBinding(ACTIONRECUPERAR_PROPERTY_BINDINGS, this, "actionRecuperar.this", true, false);
	    caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo[] elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo[]) this.getGeneraMLogico_1().getParameters().getGeneraMLogico_1().getGeneraMLogico_1().getMarcoLogicoV1().getObjetivo();
	    this.getObjetivoProvider().setArray(elemento); 
	    caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos[] elemento2 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos[]) this.getGeneraMLogico_1().getParameters().getGeneraMLogico_1().getGeneraMLogico_1().getMarcoLogicoV1().getObjetivosEspecificos();
	    this.getObjetivosEspecificosProvider().setArray(elemento2);
		return null;
	}

	public String actionSupuestos1() {
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Objetivo) this.getObjetivoProvider().getCurrentRow();
		    this.getOsupuestosProvider().setArray(elemento.getOsupuestos()); 
	    // TODO: implement java method
		  //  this.getSupuestos1().setVisible(true);
	    
		return null;
	}
	public String actionSupuestos2() {
	//	caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos objetivo = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos) this.getEspecificosProvider().getCurrentRow();
		 this.getRsupuestosProvider().setArray(elemento.getRsupuestos());
	//	 this.getOsupuestosProvider().setArray(elemento.getOsupuestos()); 
	    // TODO: implement java method
		  //  this.getSupuestos1().setVisible(true);
	    
		return null;
	}

	/**
	 * Getter method for the control with id='defaultForm:asyncTable:supuestos1'
	 */
	public com.webmethods.caf.faces.component.panel.BaseHideablePanel getSupuestos1()  {
		return (com.webmethods.caf.faces.component.panel.BaseHideablePanel)findComponentInRoot("defaultForm:asyncTable:supuestos1");
	}

	/**
	 * Getter method for the control with id='defaultForm:asyncTable:supuestos1'
	 */
	public com.webmethods.caf.faces.component.panel.BaseHideablePanel getSupuestos1_1()  {
		return (com.webmethods.caf.faces.component.panel.BaseHideablePanel)findComponentInRoot("defaultForm:asyncTable:supuestos1");
	}

	public String actionManejoIndica() {
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos [] todos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Especificos[]) elemento.getEspecificos();
		 this.getEspecificosProvider().setArray(todos);
		//  elemento.setEspecificos(todos);
		 
	    // TODO: implement java method
	    
		return null;
	}

	public String actionRestauraActividad() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.ObjetivosEspecificos) this.getObjetivosEspecificosProvider().getCurrentRow();
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia [] todos = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia[]) elemento.getEstrategia();
		 this.getEstrategiaProvider().setArray(todos);
		//  elemento.setEspecificos(todos);
	    
		return null;
	}

	public String actionRestauraElementos() {
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
		   String [] todos = (String[]) elemento.getTipoParticipante();
		   this.getTipoParticipanteProvider().setArray(todos);;
		   caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo[] ciclos =elemento.getCiclo();
		   this.getCicloProvider().setArray(ciclos);
		   String [] todos2 = (String[]) elemento.getObjetivosXactividad();
		   this.getObjetivosXactividadProvider().setArray(todos2);
	    
		return null;
	}

	public String actionGuardarMultiples() {
	    // TODO: implement java method
		 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
		   String [] todos = (String[]) this.getTipoParticipanteProvider().getArray();
		   int a = this.getObjetivosEspecificosProvider().getRowIndex();
		  // error("Este es el valor="+Integer.toString(a));
		 //  elemento.getEspecificos()[this.getObjetivosEspecificosProvider().getRowIndex()].setRsupuestos(todos);
		   elemento.setTipoParticipante(todos);
		   this.getEstrategiaProvider().setCurrentRow(elemento);
		   this.getTipoParticipanteProvider().setArray(new String[0]);
		   
		   caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento2 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
			 caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo [] todos2 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo[]) this.getCicloProvider().getArray();
			  elemento2.setCiclo(todos2);
			  this.getEstrategiaProvider().setCurrentRow(elemento2);
			  this.getCicloProvider().setArray(new caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Ciclo[0]);
		 
			  caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia elemento3 = (caf.war.fcmpcPortales.wsclient.sfcmpc.services.generamlogico_1_wsd.SFCMPCServicesGeneraMLogico_1_WSDStub.Estrategia) this.getEstrategiaProvider().getCurrentRow();
			   String [] todos3 = (String[]) this.getObjetivosXactividadProvider().getArray();
			   elemento.setObjetivosXactividad(todos3);
			   this.getEstrategiaProvider().setCurrentRow(elemento3);
			   this.getObjetivosXactividadProvider().setArray(new String[0]);
		   
		   
	    
		return null;
	}
	
}