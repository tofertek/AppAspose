/**
 * 
 */
package com.tofertek.aspose;

import com.aspose.words.Document;
import com.aspose.words.FontSettings;

/**
 * @author chris
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		String dataDir = "documents/";

		// Load the document from disk.
		Document doc;
		try {
			doc = new Document(dataDir + "memo.docx");
			// Save the document in PDF format.
			String outputFilePath = dataDir + "output.pdf";
			FontSettings fs = new FontSettings();
			String[] fontsFolders = { "/Library/Fonts", "/Applications/Microsoft Word.app/Contents/Resources" };
			fs.setFontsFolders(fontsFolders, true);
			doc.setFontSettings(fs);
			doc.save(outputFilePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
