package com.educaciencia.fileReader.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorFileReader {

	public static void main(String[] args) {
		String path = "C:\\DocumentoTXT\\";
		String arquivo = "Documento2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path + arquivo))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
