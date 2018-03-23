package kr.co.bit.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FunctionEX {

	public List<Student> read(File file) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		List<Student> list = new ArrayList<Student>();
		String str = "";

		while (true) {
			str = br.readLine();

			if (str == null) {
				break;
			}
			Student student = new Student(str.substring(0, 6), str.substring(6, 10), str.substring(10, 13),
					str.substring(13, 16), str.substring(16, 19), str.substring(19, 22), str.substring(22, 25),
					str.substring(25, 28), str.substring(28, 29), str.substring(29, 30), str.substring(30, 31));
			list.add(student);

		}
		return list;
	}

	public void problem01(List<Student> list) {
		
	}

	public void problem02() {

	}

	public void problem03() {

	}

	public void problem04() {

	}

}
