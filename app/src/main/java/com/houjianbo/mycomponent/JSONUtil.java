package com.houjianbo.mycomponent;

import com.alibaba.fastjson.JSON;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtil {
	
	public static <T> T toObject(JSONObject json, Class<T> clazz) {
		return JSON.parseObject(json.toString(), clazz);
	}

	public static <T> T toObject(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}

	public static JSONObject fromObject(Object object) {

		try {

			String jsonString = JSON.toJSONString(object);

			return new JSONObject(jsonString);

		} catch (JSONException e) {
			return new JSONObject();
		}
	}

}
