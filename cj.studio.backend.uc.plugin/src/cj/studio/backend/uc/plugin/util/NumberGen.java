package cj.studio.backend.uc.plugin.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class NumberGen {

	public static String gen() {// 00190506155043,00为固定，19是年，0506是月日，61550时分秒，43是随机两位
		String no = "";
		no = String.format("00%s", no);
		SimpleDateFormat format = new SimpleDateFormat("yyMMddHHmmss");
		no = String.format("%s%s", no, format.format(new Date(System.currentTimeMillis())));
		int v = new Random().nextInt(10);
		no = String.format("%s%s", no, Math.abs(v));
		v = new Random().nextInt(10);
		no = String.format("%s%s", no, Math.abs(v));
		return no;
	}
	public static void main(String...strings) {
		System.out.println(gen());
	}
}
