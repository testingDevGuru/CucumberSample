package com.aps.testing.stepDefinitions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

public class XMLToDbVerificationHelper {

	public String runBat(String Shell)
			throws Exception {
		try {
			String target = new String(Shell);
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(target);
			proc.waitFor();
			StringBuffer output = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
			return output.toString();
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return null;
	}

}
