/**
 * 
 */
package caf.war.fcmpcPortales;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author veztm
 *
 */
@ManagedBean(name = "FcmpcPortales")
@ApplicationScoped
@DTManagedBean(displayName = "fcmpcPortales", beanType = BeanType.APPLICATION)
public class FcmpcPortales extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public FcmpcPortales()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "fcmpcPortales" );
	}
}