package com.k2js.exceptionlearning.examples;

import java.io.IOException;

public class Ex14 {
	void m() throws IOException {

	}

	public static void main(String[] args) {
		Ex14 e = new Ex14() {
			void m() throws IOException {

			}
		};
	}
}
