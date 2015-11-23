/**
 * 
 */
package caf.war.CMPC.upload;

/**
 * @author simbius
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "Upload")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "Upload", beanType = BeanType.PORTLET)
public class Upload  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.CMPC.Cmpc cmpc = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Upload() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.CMPC.Cmpc getCmpc()  {
		if (cmpc == null) {
		    cmpc = (caf.war.CMPC.Cmpc)resolveExpression("#{Cmpc}");
		}
		return cmpc;
	}
}