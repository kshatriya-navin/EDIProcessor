package com.nuagesync.edi.convertor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import io.xlate.edi.stream.EDIInputFactory;
import io.xlate.edi.stream.EDIStreamException;
import io.xlate.edi.stream.EDIStreamReader;

public class JsonBuilder {

	public static void getJsonFile(File ediFile) throws EDIStreamException, IOException {

		EDIInputFactory factory = EDIInputFactory.newFactory();
		// Obtain Stream to the EDI document to read.
		InputStream stream = new FileInputStream(ediFile);

		EDIStreamReader reader = factory.createEDIStreamReader(stream);
		while (reader.hasNext()) {
			System.out.println(reader.next());
		}
		/*
		 * while (reader.hasNext()) { switch (reader.next()) { case START_INTERCHANGE:
		 * Retrieve the standard - "X12" or "EDIFACT" String standard =
		 * reader.getStandard(); String[] version = reader.getVersion();
		 * 
		 * System.out.println("Standard " + standard); System.out.println("Version " +
		 * version); break;
		 * 
		 * case START_SEGMENT: // Retrieve the segment name - e.g. "ISA" (X12) or "UNB"
		 * (EDIFACT) String segmentName = reader.getText();
		 * System.out.println("segment name: " + segmentName); break;
		 * 
		 * case END_SEGMENT: break;
		 * 
		 * case START_COMPOSITE: break;
		 * 
		 * case END_COMPOSITE: break;
		 * 
		 * case ELEMENT_DATA: // Retrieve the value of the current element String data =
		 * reader.getText(); System.out.println("Data: " + data); break; case
		 * ELEMENT_DATA_BINARY: break; case ELEMENT_DATA_ERROR: break; case
		 * ELEMENT_OCCURRENCE_ERROR: break; case END_GROUP: break; case END_INTERCHANGE:
		 * break; case END_LOOP: break; case END_TRANSACTION: break; case SEGMENT_ERROR:
		 * break; case START_GROUP: break; case START_LOOP: break; case
		 * START_TRANSACTION: break; default: break; } }
		 * 
		 * reader.close(); stream.close();
		 */
	}

//	public static void main(String[] args) throws EDIStreamException, IOException {
//		File f = new File("C:\\Work-mine\\edi-to-json\\EDI\\BEG.edi");
//		getJsonFile(f);
//	}
}
