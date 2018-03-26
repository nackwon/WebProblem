package kr.co.bit.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		int[] nums = new int[2];
		List<int[]> arrList = new ArrayList<int[]>();
		for (int i = 0; i < list.size(); i++) {

			if ("A".equals(list.get(i).getArchivement()) && "B".equals(list.get(i).getArchivement())) {
				int sum = Integer.parseInt(list.get(i).getE_score().trim())
						+ Integer.parseInt(list.get(i).getK_score().trim());
				nums[0] = Integer.parseInt(list.get(i).getNo());
				nums[1] = sum;
				arrList.add(nums);
			}
		}
		Arrays.sort(arrList.get(nums[1]));

		System.out.println(arrList.get(4));
	}

	public void problem02() {

	}

	public int problem03(List<Student> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (Integer.parseInt(list.get(i).getScore().trim()) > 150) {
				int score = archivementScore(list);
				int result = score + Integer.parseInt(list.get(i).getE_score().trim());

				sum += result;
			}
		}
		return sum;
	}

	public int problem04(List<Student> list, String code) {

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (code.equals(list.get(i).getRegion_code())) {
				int score = teacherScore(list);
				int result = score + Integer.parseInt(list.get(i).getK_score().trim());
				if (result > 50)
					count++;
				score = 0;
			}
		}
		return count;
	}

	public int archivementScore(List<Student> list) {

		int score = 0;

		for (int i = 0; i < list.size(); i++) {
			if ("A".equals(list.get(i).getArchivement())) {
				score = 5;
			} else if ("B".equals(list.get(i).getArchivement())) {
				score = 15;
			} else {
				score = 20;
			}
		}

		return score;
	}

	public int teacherScore(List<Student> list) {

		int score = 0;
		for (int i = 0; i < list.size(); i++) {
			if ("A".equals(list.get(i).getTeacher())) {
				score = 10;
			} else if ("B".equals(list.get(i).getTeacher())) {
				score = 15;
			} else {
				score = 20;
			}
		}
		return score;
	}
}
