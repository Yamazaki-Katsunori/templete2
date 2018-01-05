package com.internousdev.ecsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	/**
	 * 現在時刻取得メゾット
	 *
	 * @return String
	 */
	public String getDate() {

		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		return simpleDateFormat.format(date);
	}

}
