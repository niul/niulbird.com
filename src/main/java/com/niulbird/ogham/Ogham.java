package com.niulbird.ogham;

public class Ogham {

	public static String getOgham(String alphaStr) {
		String result = "";
		
		result = result.concat(new String(new char[] {OghamCharset.EITE.getOghamChar()}));
		
		OghamCharset[] oghamCharsets = OghamCharset.values();
		
		for (int i = 0; i < alphaStr.length(); i++) {
			boolean match = false;
			String val;
			if (i != alphaStr.length()-1)
				val = alphaStr.substring(i, i+2);
			else
				val = alphaStr.substring(i, i+1);
			
			for (OghamCharset oghamCharset : oghamCharsets) {
				if (oghamCharset.getAlphaChar().equalsIgnoreCase(val)) {
					result = result.concat(new String(new char[] {oghamCharset.getOghamChar()}));
					match = true;
					i++;
				}
			}
			if (!match) {
				for (OghamCharset oghamCharset : oghamCharsets) {
					if (oghamCharset.getAlphaChar().equalsIgnoreCase(val.substring(0, 1))) {
						result = result.concat(new String(new char[] {oghamCharset.getOghamChar()}));
					}
				}
			}
		}
		result = result.concat(new String(new char[] {OghamCharset.EITE_THUA.getOghamChar()}));
		
		return result;
	}
}