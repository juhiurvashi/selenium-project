package com.k2js.seleniumBasics.openbrowser;

public class TakeValue_FromEnv {
	public static void main(String[] args) {
		String bname = System.getenv("bn");
		System.out.println(bname);
		String runmode = System.getenv("rm");
		System.out.println(runmode);
	}

}
