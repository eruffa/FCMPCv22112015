package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.webmethods.caf.faces.bean.BaseViewBean;

public class FileUploader extends BaseViewBean {
	private static final long serialVersionUID = 1L;

	public static final String uploadFile(String fileName, byte[] content) throws IOException{
		String path = "C:\\ListaPreciosPilkington\\ArchivosSubidosConCaf\\" + fileName; //getRealPath("/")+"pilkington/"+fileName;
		System.out.println("Path planilla excel: " + path);
	    File f = new File(path);
		FileUtils.writeByteArrayToFile(f, content);
		
		return path;
	}

}
