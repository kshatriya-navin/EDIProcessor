package com.nuagesync.edi.convertor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nuagesync.edi.definition.BEGDefinition;
import com.nuagesync.edi.definition.CloseRule;
import com.nuagesync.edi.definition.Elements;

public class EDIParser {

	static BEGDefinition begDef;
	static FileWriter myWriter;
	
	public static BEGDefinition getBEGIdentifier(String fileName) {
		File file = null;
		if(fileName.contains("ISA")) {
			file = new File("src/main/resources/definition/ISA.def");
		}else {
			file = new File("src/main/resources/definition/BEG.def");
		}
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			begDef = mapper.readValue(file, BEGDefinition.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return begDef;
	}
	
	public static File parse(MultipartFile ediFile) throws IOException {
		String newFileName = ediFile.getOriginalFilename().split("\\.")[0];
		
		File file = new File("C:\\Users\\nk671137\\nuagesync\\files\\"+newFileName+".json");
		file.createNewFile();
		
		myWriter = new FileWriter(file);
	    myWriter.write("{");
	    
		BufferedReader bfr = new BufferedReader(new InputStreamReader(ediFile.getInputStream()));
		String readLine = bfr.readLine();
		
		if(readLine != null) {
			System.out.println("{");
			String[] split = readLine.split("\\*");
			String string = split[split.length-1];
			split[split.length-1] = string.split("~")[0];
			merge(split, getElementsMap(begDef.getElements()), true);
			readLine = bfr.readLine();
			split = readLine.split("\\*");
			string = split[split.length-1];
			split[split.length-1] = string.split("~")[0];
			CloseRule closeRule = begDef.getCloseRule();
			if(closeRule != null) {
				merge(split, getElementsMap(begDef.getCloseRule().getElements()), false);
			}
			myWriter.write("}");
		}
		bfr.close();
		myWriter.close();
		return file;
	}
	
	private static void merge(String[] split, Map<String, String> map, boolean first) throws IOException {
		DecimalFormat format = new DecimalFormat("00");
		String name= split[0];
		for(int index=1; index < split.length; index++) {
			String string = map.get(name+format.format(index));
			if(!first){
				myWriter.write(",");
			}
			myWriter.write("\""+string+"\": \""+split[index]+"\"");
			first=false;
		}
	}

	private static Map<String, String> getElementsMap(List<Elements> elements) {
		Map<String, String> map = new HashMap<>();
		for(Elements element : elements) {
			map.put(element.getValue(), element.getName());
		}
		return map;
	}
}
